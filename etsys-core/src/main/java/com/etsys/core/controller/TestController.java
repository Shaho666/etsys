package com.etsys.core.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.etsys.core.service.CourseService;
import com.etsys.core.service.TeacherService;
import com.etsys.core.service.TestService;
import com.etsys.orm.pojo.TbCourse;
import com.etsys.orm.pojo.TbTeacher;
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
	
}
