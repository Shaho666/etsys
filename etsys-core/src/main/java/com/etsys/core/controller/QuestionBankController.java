package com.etsys.core.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.etsys.commons.pojo.JsonResult;
import com.etsys.commons.utils.IdUtils;
import com.etsys.core.service.CourseService;
import com.etsys.core.service.QuestionBankService;
import com.etsys.orm.pojo.TbCourse;
import com.etsys.orm.pojo.TbQuestionBank;
import com.etsys.orm.pojo.TbQuestionBankWithBLOBs;

@Controller
@RequestMapping("/questionBank")
public class QuestionBankController {

	@Autowired
	private QuestionBankService questionBankService;

	@Autowired
	private CourseService courseService;

	@RequestMapping("/getBankByCourse/{courseId}")
	public String getQuestionBankBy(@PathVariable String courseId, ModelMap modelMap) {

		TbCourse course = courseService.getCourseById(courseId);

		List<TbQuestionBank> questionBank = questionBankService.getQuestionBank(courseId);
		modelMap.put("questionBank", questionBank);
		modelMap.put("course", course);

		return "teach-ques-bank-entry";
	}

	@RequestMapping("/showPojoPage/{courseId}")
	public String showPojoPage(@PathVariable String courseId, ModelMap modelMap) {

		TbCourse course = courseService.getCourseById(courseId);
		modelMap.put("course", course);

		return "teach-ques-bank-pojo";
	}

	@RequestMapping("/insertBankEntry")
	@ResponseBody
	public JsonResult insertBankEntry(@RequestBody TbQuestionBankWithBLOBs questionBank) {

		questionBank.setQueId("que" + IdUtils.genItemId());
		questionBank.setQueState(1);

		questionBankService.insertBankEntry(questionBank);

		return JsonResult.ok();
	}

	@RequestMapping("/deleteBankEntryById")
	public String deleteBankEntryById(@RequestParam("questionBankId") String questionBankId,
			@RequestParam("courseId") String courseId) {

		questionBankService.deleteBankByCourseId(questionBankId);

		return "forward:/questionBank/getBankByCourse/" + courseId;
	}

	@RequestMapping("/deleteBankByCourseId/{courseId}")
	public String deleteBankByCourseId(@PathVariable String courseId) {

		List<TbQuestionBank> questionBank = questionBankService.getQuestionBank(courseId);
		for (TbQuestionBank tbQuestionBank : questionBank) {
			questionBankService.deleteBankEntryById(tbQuestionBank.getQueId());
		}

		return "redirect:/questionBank/getBankByCourse/" + courseId;
	}

	@RequestMapping("/updateBankEntry")
	public String updateBankEntry(@RequestBody TbQuestionBank questionBank) {

		questionBankService.updateBankEntry(questionBank);

		return "redirect:/questionBank/getBankByCourse/" + questionBank.getCourseId();
	}

	@RequestMapping("/getEntryById")
	public String getEntryById(@RequestParam String bankEntryId, @RequestParam String courseId, ModelMap modelMap) {

		TbCourse course = courseService.getCourseById(courseId);

		TbQuestionBankWithBLOBs question = questionBankService.getQuestionBankById(bankEntryId);
		modelMap.put("course", course);
		modelMap.put("question", question);

		return "teach-ques-bank-detail";
	}

}
