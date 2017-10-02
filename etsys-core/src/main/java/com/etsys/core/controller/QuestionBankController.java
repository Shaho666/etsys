package com.etsys.core.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.etsys.core.service.QuestionBankService;
import com.etsys.orm.pojo.TbQuestionBank;

@Controller
@RequestMapping("/questionBank")
public class QuestionBankController {

	@Autowired
	private QuestionBankService questionBankService;

	@RequestMapping("/getBankByCourse/{courseId}")
	public String getQuestionBankBy(@PathVariable String courseId, ModelMap modelMap) {

		/* 在此处填入合适的代码 */

		return "teach-ques-bank";
	}

	@RequestMapping("/deleteBankEntryById")
	public String deleteBankEntryById(@RequestParam("questionBankId") String questionBankId,
			@RequestParam("courseId") String courseId) {

		/* 在此处填入合适的代码 */

		return "redirect:/questionBank/getBankByCourse/" + courseId;
	}

	@RequestMapping("/deleteBankByCourseId/{courseId}")
	public String deleteBankByCourseId(@PathVariable String courseId) {

		/* 在此处填入合适的代码 */

		return "redirect:/questionBank/getBankByCourse/" + courseId;
	}

	@RequestMapping("/updateBankEntry")
	public String updateBankEntry(@RequestBody TbQuestionBank questionBank) {

		/* 在此处填入合适的代码 */

		return "redirect:/questionBank/getBankByCourse/" + questionBank.getCourseId();
	}

}
