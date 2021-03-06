package com.etsys.core.controller;

import java.util.Date;
import java.util.Iterator;
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

		TbCourse course = courseService.getCourseById(courseId);

		List<TbTemplate> templates = templateService.getTemplate(teacherId, courseId);
		Iterator<TbTemplate> templatesIter = templates.iterator();
		while (templatesIter.hasNext()) {
			TbTemplate template = templatesIter.next();
			List<TbTemplateEntry> list = templateService.getEntries(template.getTemId());
			if (list == null || list.size() == 0) {
				templateService.deleteTemplateInfo(template);
				templatesIter.remove();
			}
		}

		modelMap.put("templates", templates);
		modelMap.put("course", course);

		return "teach-template-check";
	}

	@RequestMapping("/getByTemplateId")
	public String getTemplateEntriesBy(@RequestParam String templateId, @RequestParam String courseId,
			ModelMap modelMap) {

		TbCourse course = courseService.getCourseById(courseId);

		List<TbTemplateEntry> entries = templateService.getEntries(templateId);
		modelMap.put("entries", entries);
		modelMap.put("course", course);

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
	public JsonResult insertTemplateEntry(@RequestBody List<TbTemplateEntry> templateEntry) {

		try {
			
			for (TbTemplateEntry tbTemplateEntry : templateEntry) {
				templateService.insertTemplateEntry(tbTemplateEntry);
			}

			return JsonResult.ok();
			
		} catch (Exception e) {
			e.printStackTrace();
			return JsonResult.build(500, ExceptionUtil.getStackTrace(e));
		}
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
