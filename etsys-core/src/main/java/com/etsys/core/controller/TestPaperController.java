package com.etsys.core.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

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
import com.etsys.core.service.QuestionBankService;
import com.etsys.core.service.ScoreService;
import com.etsys.core.service.TemplateService;
import com.etsys.core.service.TestPaperService;
import com.etsys.core.service.TestService;
import com.etsys.core.utils.PaperStrategyUtil;
import com.etsys.orm.pojo.TbQuestionBankWithBLOBs;
import com.etsys.orm.pojo.TbTemplate;
import com.etsys.orm.pojo.TbTemplateEntry;
import com.etsys.orm.pojo.TbTest;
import com.etsys.orm.pojo.TbTestPaper;

@Controller
@RequestMapping("/testPaper")
public class TestPaperController {

	@Autowired
	private TestPaperService testPaperService;

	@Autowired
	private ScoreService scoreService;

	@Autowired
	private QuestionBankService questionBankService;

	@Autowired
	private TemplateService templateService;

	@Autowired
	private TestService testService;

	@RequestMapping("/getChecked")
	public String getPaperCheckedBy(@RequestParam("courseId") String courseId,
			@RequestParam("studentId") String studentId, @RequestParam("returnPage") String returnPage,
			ModelMap modelMap) {

		List<TbTestPaper> list = testPaperService.getByCourseAndStudent(courseId, studentId);
		modelMap.put("testPaper", list.get(0));

		return returnPage;
	}

	@RequestMapping("/check")
	public JsonResult checkPaper(@RequestBody TbTestPaper testPaper) {

		try {

			/* 在此处填入合适的代码 */

			return JsonResult.ok();

		} catch (Exception e) {
			e.printStackTrace();
			return JsonResult.build(500, ExceptionUtil.getStackTrace(e));
		}
	}

	@RequestMapping("/generate")
	public String generateTestPaper(@RequestParam("testId") String testId, ModelMap modelMap) {

		TbTest test = testService.getTestById(testId);
		List<TbTemplateEntry> templateEntries = templateService.getEntries(test.getTemplateId());

		modelMap.put("courseId", test.getCourseId());
		modelMap.put("testId", testId);

		List<TbQuestionBankWithBLOBs> questions = null;

		for (TbTemplateEntry tbTemplateEntry : templateEntries) {

			questions = new ArrayList<TbQuestionBankWithBLOBs>();

			int count = questionBankService.countByTypeDegreeAndCourse(tbTemplateEntry.getTemType(),
					test.getTestDegree(), test.getCourseId());

			List<Integer> list = PaperStrategyUtil.generateRandomStrategy(tbTemplateEntry.getTemNum(), count);
			if (list != null && list.size() > 0) {
				for (Integer integer : list) {
					TbQuestionBankWithBLOBs question = questionBankService.getByCourseDegreeAndType(test.getCourseId(),
							test.getTestDegree(), integer, tbTemplateEntry.getTemType());
					questions.add(question);
				}
				modelMap.put("quesList" + tbTemplateEntry.getTemType(), questions);
			}

		}

		return "stu-test-pojo";
	}

	@RequestMapping("/submitPaper")
	@ResponseBody
	public JsonResult submitPaper(@RequestBody TbTestPaper testPaper) {

		try {
			testPaper.setTpId("tp" + IdUtils.genItemId());
			testPaperService.insertTestPaper(testPaper);
		} catch (Exception e) {
			e.printStackTrace();
			return JsonResult.build(500, ExceptionUtil.getStackTrace(e));
		}

		return JsonResult.ok();
	}

}
