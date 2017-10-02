package com.etsys.core.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.etsys.commons.pojo.JsonResult;
import com.etsys.commons.utils.HttpClientUtil;
import com.etsys.commons.utils.JsonUtils;
import com.etsys.core.pojo.Course;
import com.etsys.core.service.CourseService;
import com.etsys.orm.pojo.TbCourse;

@Controller
@RequestMapping("/course")
public class CourseController {

	@Autowired
	private CourseService courseService;

	@Value("${EDUCATION_ADMIN_BASE_URL}")
	private String EDUCATION_ADMIN_BASE_URL;

	@Value("${EDUCATION_ADMIN_COURSE_RECORD_URL}")
	private String EDUCATION_ADMIN_COURSE_RECORD_URL;

	@RequestMapping("/getByTeacherId")
	public String getCoursesByTeacherId(@RequestParam("teacherId") String teacherId,
			@RequestParam("returnPage") String returnPage, ModelMap modelMap) {

		/* 在此处填写合适的代码 */

		return returnPage;
	}
	
	@RequestMapping("/getByStudentId")
	public String getCoursesByStudentId(@RequestParam("studentId") String studentId,
			@RequestParam("returnPage") String returnPage, ModelMap modelMap) {

		/* 在此处填写合适的代码 */

		return returnPage;
	}

	public String syncByTeacherId(@PathVariable String teacherId) {

		String courseJson = HttpClientUtil
				.doGet(EDUCATION_ADMIN_BASE_URL + EDUCATION_ADMIN_COURSE_RECORD_URL + teacherId);
		String courseJsonData = (String) JsonResult.format(courseJson).getData();
		List<Course> courseList = JsonUtils.jsonToList(courseJsonData, Course.class);
		for (Course course : courseList) {

			TbCourse tbCourse = new TbCourse();

			tbCourse.setCourseId(course.getCourseId());
			tbCourse.setCourseName(course.getCourseName());
			tbCourse.setCourseTime((int) Math.round(course.getCourseDuration()));

			try {
				courseService.insertCourse(tbCourse);
			} catch (Exception e) {
				e.printStackTrace();
			}

		}

		return "redirect:/course/getByTeacherId/" + teacherId;
	}

}
