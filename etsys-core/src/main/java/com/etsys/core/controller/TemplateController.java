package com.etsys.core.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.etsys.core.service.TemplateService;

@Controller
@RequestMapping("/template")
public class TemplateController {

	@Autowired
	private TemplateService templateService;
	
	@RequestMapping("/getByTeacherAndCourse")
	public String getTemplatesBy(@RequestParam String teacherId, @RequestParam String courseId, ModelMap modelMap) {

		/* 在此处填写合适的代码 */

		return "teach-template";
	}

	@RequestMapping("/insertTemplate")
	public String insertTemplate(@RequestParam String teacherId, @RequestParam String courseId) {

		/* 在此处填写合适的代码 */
		
		return "redirect:/template/getByTeacherAndCourse?teacherId=" + teacherId + "&courseId=" + courseId;
	}
	
	@RequestMapping("/updateTemplate")
	public String updateTemplate(@RequestParam String teacherId, @RequestParam String courseId) {

		/* 在此处填写合适的代码 */
		
		return "redirect:/template/getByTeacherAndCourse?teacherId=" + teacherId + "&courseId=" + courseId;
	}
	
	@RequestMapping("/deleteTemplate")
	public String deleteTemplate(@RequestParam String teacherId, @RequestParam String courseId) {

		/* 在此处填写合适的代码 */
		
		return "redirect:/template/getByTeacherAndCourse?teacherId=" + teacherId + "&courseId=" + courseId;
	}

}
