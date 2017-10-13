package com.etsys.core.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.etsys.commons.pojo.JsonResult;
import com.etsys.commons.utils.ExceptionUtil;
import com.etsys.commons.utils.IdUtils;
import com.etsys.core.service.CourseService;
import com.etsys.core.service.TeacherService;
import com.etsys.core.service.TemplateService;
import com.etsys.core.service.TestService;
import com.etsys.orm.pojo.TbCourse;
import com.etsys.orm.pojo.TbTeacher;
import com.etsys.orm.pojo.TbTemplate;
import com.etsys.orm.pojo.TbTest;

@Controller
@RequestMapping("/test")
public class TestController {

	@Autowired
	private TestService testService;

	@Autowired
	private CourseService courseService;

	@Autowired
	private TeacherService teacherService;

	@Autowired
	private TemplateService templateService;

	@RequestMapping("/getByStudent")
	public String getByStudent(@RequestParam String studentId, ModelMap modelMap) {

		List<TbTest> list = testService.getByStudentAndCourse(studentId);

		for (TbTest tbTest : list) {
			TbCourse course = courseService.getCourseById(tbTest.getCourseId());
			TbTeacher teacher = teacherService.getByTeacherId(tbTest.getTeacherId());
			tbTest.setCourseId(course.getCourseName());
			tbTest.setTeacherId(teacher.getTeacherName());
		}

		modelMap.put("tests", list);

		return "stu-test";
	}

	@RequestMapping("/showCreatePage")
	public String showCreatePage(@RequestParam String teacherId, @RequestParam String courseId, ModelMap modelMap) {

		TbCourse course = courseService.getCourseById(courseId);

		List<TbTemplate> templates = templateService.getTemplate(teacherId, courseId);

		modelMap.put("templates", templates);
		modelMap.put("course", course);

		return "teach-test-create";
	}

	@RequestMapping("/createTest")
	@ResponseBody
	public JsonResult createTest(@RequestBody TbTest test) {

		try {
			test.setTestId("test" + IdUtils.genItemId());
			testService.insertTest(test);
		} catch (Exception e) {
			e.printStackTrace();
			return JsonResult.build(500, ExceptionUtil.getStackTrace(e));
		}

		return JsonResult.ok();
	}

	@RequestMapping("/getByTeacherId")
	public String getByTeacherId(@RequestParam String teacherId, @RequestParam String courseId, ModelMap modelMap) {

		TbCourse course = courseService.getCourseById(courseId);
		
		List<TbTest> tests = testService.getByTeacherAndCourse(teacherId, courseId);

		modelMap.put("course", course);
		modelMap.put("tests", tests);

		return "teach-test-detail";
	}

}
