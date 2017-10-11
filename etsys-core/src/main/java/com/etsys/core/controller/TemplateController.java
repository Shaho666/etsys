package com.etsys.core.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.etsys.commons.pojo.JsonResult;
import com.etsys.commons.utils.IdUtils;
import com.etsys.core.service.CourseService;
import com.etsys.core.service.TemplateService;
import com.etsys.orm.pojo.TbCourse;
import com.etsys.orm.pojo.TbTemplate;
import com.etsys.orm.pojo.TbTemplateEntry;

@Controller
@RequestMapping("/template")
public class TemplateController {

	@Autowired
	private CourseService courseService;
	
	@Autowired
	private TemplateService templateService;
	
	@RequestMapping("/getByTeacherAndCourse")
	public String getTemplatesBy(@RequestParam String teacherId, @RequestParam String courseId, ModelMap modelMap) {

		List<TbTemplate> templates = templateService.getTemplates(teacherId, courseId);
		modelMap.put("templates", templates);

		return "teach-template";
	}

	@RequestMapping("/getByTemplateId/{templateId}")
	public String getTemplateEntriesBy(@PathVariable String templateId, ModelMap modelMap) {
		
		List<TbTemplateEntry> entries = templateService.getEntries(templateId);
		modelMap.put("entries", entries);
		
		return "teach-template-entry";
	}
	
	@RequestMapping("/showPojoPage")
	public String showPojoPage(@RequestParam String courseId, @RequestParam String teacherId, ModelMap modelMap) {
		
		TbTemplate template = new TbTemplate();
		
		template.setTemId("tem" + IdUtils.genItemId());
		template.setCourseId(courseId);
		template.setTeacherId(teacherId);
		template.setCreated(new Date());
		
		templateService.insertTemplateInfo(template);
		
		TbCourse course = courseService.getCourseById(courseId);
		modelMap.put("course", course);
		modelMap.put("template", template);
		
		return "teach-template-pojo";
	}
	
	@RequestMapping("/insertTemplateEntry")
	@ResponseBody
	public JsonResult insertTemplateEntry(@RequestBody TbTemplateEntry templateEntry) {
		
		templateService.insertTemplateEntry(templateEntry);
		
		return JsonResult.ok();
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
