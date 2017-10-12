package com.etsys.core.controller;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.util.DigestUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.etsys.commons.pojo.JsonResult;
import com.etsys.commons.utils.ExceptionUtil;
import com.etsys.commons.utils.HttpClientUtil;
import com.etsys.commons.utils.JsonUtils;
import com.etsys.core.pojo.Student;
import com.etsys.core.service.StudentService;
import com.etsys.core.service.TeacherCourseService;
import com.etsys.orm.pojo.TbStudent;
import com.etsys.orm.pojo.TbTeacherCourse;

@Controller
@RequestMapping("/student")
public class StudentController {

	@Autowired
	private StudentService studentService;

	@Autowired
	private TeacherCourseService teacherCourseService;

	@Value("${EDUCATION_ADMIN_BASE_URL}")
	private String EDUCATION_ADMIN_BASE_URL;

	@Value("${EDUCATION_ADMIN_STUDENT_URL}")
	private String EDUCATION_ADMIN_STUDENT_URL;

	@RequestMapping(value = "/pushStudent", method = RequestMethod.POST)
	public JsonResult pushStudentRecords(@RequestBody List<TbStudent> students) {

		try {

			for (TbStudent tbStudent : students) {
				studentService.insertStudent(tbStudent);
			}

			return JsonResult.ok();

		} catch (Exception e) {
			e.printStackTrace();
			return JsonResult.build(500, ExceptionUtil.getStackTrace(e));
		}
	}

	@RequestMapping(value = "/getByCourseAndTeacher", method = RequestMethod.GET)
	public String getStuByCourseAndTeacher(@RequestParam("teacherId") String teacherId,
			@RequestParam("courseId") String courseId, @RequestParam("returnPage") String returnPage,
			ModelMap modelMap) {

		List<TbStudent> students = studentService.getByCourseAndTeacher(teacherId, courseId);
		modelMap.put("students", students);
		modelMap.put("courseId", courseId);

		return returnPage;
	}

	public String syncByTeacherAndCourse(@RequestParam("teacherId") String teacherId,
			@RequestParam("courseId") String courseId) {

		List<TbTeacherCourse> teacherCourses = new ArrayList<TbTeacherCourse>();

		Map<String, String> params = new Hashtable<String, String>();
		params.put("instructorId", teacherId);
		params.put("courseId", courseId);

		String stuJson = HttpClientUtil.doPost(EDUCATION_ADMIN_BASE_URL + EDUCATION_ADMIN_STUDENT_URL, params);
		String stuJsonData = (String) JsonResult.format(stuJson).getData();
		List<Student> stuList = JsonUtils.jsonToList(stuJsonData, Student.class);

		for (Student student : stuList) {

			TbStudent tbStudent = new TbStudent();
			tbStudent.setStuId(student.getStudentId());
			tbStudent.setStuClass(student.getClassName());
			tbStudent.setStuName(student.getStudentName());
			tbStudent.setStuPassword(DigestUtils.md5DigestAsHex(student.getStudentId().getBytes()));

			try {
				studentService.insertStudent(tbStudent);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		for (Student student : stuList) {

			TbTeacherCourse teacherCourse = new TbTeacherCourse();

			teacherCourse.setTeacherId(teacherId);
			teacherCourse.setCourseId(courseId);
			teacherCourse.setStudentId(student.getStudentId());

			teacherCourses.add(teacherCourse);
		}

		for (TbTeacherCourse tbTeacherCourse : teacherCourses) {
			try {
				teacherCourseService.insertTeacherCourse(tbTeacherCourse);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return "redirect:/student/getByCourseAndTeacher?teacherId=" + teacherId + "&courseId=" + courseId;
	}

}
