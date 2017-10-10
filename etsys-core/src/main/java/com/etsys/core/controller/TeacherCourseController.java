package com.etsys.core.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/teacherCourse")
public class TeacherCourseController {

	@RequestMapping("/sync")
	public String syncRecords() {
		
		return "forward:/signIn/showTeacherIndex";
	}
	
}
