package com.etsys.core.controller;

import java.util.ArrayList;
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
import com.etsys.commons.utils.JsonUtils;
import com.etsys.core.entity.StuAnswer;
import com.etsys.core.pojo.TpContentEntry;
import com.etsys.core.service.QuestionBankService;
import com.etsys.core.service.ScoreService;
import com.etsys.core.service.TemplateService;
import com.etsys.core.service.TestPaperService;
import com.etsys.core.service.TestService;
import com.etsys.core.utils.PaperStrategyUtil;
import com.etsys.orm.pojo.TbQuestionBankWithBLOBs;
import com.etsys.orm.pojo.TbScore;
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

	@RequestMapping("/showJudgePage")
	public String showJudgePage() {

		return "teach-test-paper-judge";
	}

	@RequestMapping("/getChecked")
	public String getPaperCheckedBy(@RequestParam("courseId") String courseId,
			@RequestParam("studentId") String studentId, @RequestParam("returnPage") String returnPage,
			ModelMap modelMap) {

		List<TbTestPaper> list = testPaperService.getByCourseAndStudent(courseId, studentId);
		modelMap.put("testPaper", list.get(0));

		return returnPage;
	}

	@RequestMapping("/checkPaper")
	public String checkPaper(@RequestParam String studentId, @RequestParam String courseId, @RequestParam String testId,
			@RequestParam Integer state, ModelMap modelMap) {

		try {
			
			List<StuAnswer> questions = null;

			List<TbTestPaper> testPapers = testPaperService.getByStudentCourseTestAndState(studentId, courseId, testId,
					state);
			for (TbTestPaper tbTestPaper : testPapers) {
				String content = tbTestPaper.getTpContent();

				List<TpContentEntry> list = JsonUtils.jsonToList(content, TpContentEntry.class);
				questions = new ArrayList<>();
				for (TpContentEntry tpContentEntry : list) {
					String questionId = tpContentEntry.getQuestionId();
					TbQuestionBankWithBLOBs question = questionBankService.getQuestionBankById(questionId);
					StuAnswer stuAnswer = new StuAnswer(question);
					stuAnswer.setStuAnswer(tpContentEntry.getContent());
					questions.add(stuAnswer);
				}
				modelMap.put("quesList" + tbTestPaper.getTpType(), questions);
			}

			TbTest test = testService.getTestById(testId);
			List<TbTemplateEntry> entries = templateService.getEntries(test.getTemplateId());
			for (TbTemplateEntry tbTemplateEntry : entries) {
				modelMap.put("tp" + tbTemplateEntry.getTemType(), tbTemplateEntry.getTemScore());
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		modelMap.put("studentId", studentId);
		modelMap.put("courseId", courseId);
		modelMap.put("testId", testId);
		
		return "teach-test-paper-judge";
	}

	@RequestMapping("/showSuccessPage")
	public String showSuccessPage() {

		return "redirect:/stu-test-success";
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

	@RequestMapping("/submitPaperObjective")
	@ResponseBody
	public JsonResult submitPaperSelect(@RequestBody TbTestPaper testPaper) {

		try {

			testPaper.setTpId("tp" + IdUtils.genItemId());
			testPaper.setTpState(4);
			testPaperService.insertTestPaper(testPaper);

			TbScore score = new TbScore();

			score.setScoId("sco" + IdUtils.genItemId());
			score.setStuId(testPaper.getStuId());
			score.setTestId(testPaper.getTestId());

			TbTest test = testService.getTestById(testPaper.getTestId());
			TbTemplateEntry templateEntry = templateService.getEntryByIdAndType(test.getTemplateId(),
					testPaper.getTpType());

			double scoreUnit = 0.0;

			String content = testPaper.getTpContent();
			List<TpContentEntry> list = JsonUtils.jsonToList(content, TpContentEntry.class);

			for (TpContentEntry tpContentEntry : list) {
				TbQuestionBankWithBLOBs question = questionBankService
						.getQuestionBankById(tpContentEntry.getQuestionId());
				if (question.getQueAnswer().equals(tpContentEntry.getContent())) {
					scoreUnit += templateEntry.getTemScore();
				}
			}

			score.setScoMark(scoreUnit);
			score.setScoType(testPaper.getTpType());

			scoreService.insertScore(score);
			return JsonResult.ok();

		} catch (Exception e) {
			e.printStackTrace();
			return JsonResult.build(500, ExceptionUtil.getStackTrace(e));
		}

	}

	@RequestMapping("/submitPaperSubjective")
	@ResponseBody
	public JsonResult submitPaperSubjective(@RequestBody TbTestPaper testPaper) {

		try {

			testPaper.setTpId("tp" + IdUtils.genItemId());
			testPaperService.insertTestPaper(testPaper);
			return JsonResult.ok();

		} catch (Exception e) {
			e.printStackTrace();
			return JsonResult.build(500, ExceptionUtil.getStackTrace(e));
		}

	}

}
