package com.etsys.core.controller;

import java.util.ArrayList;
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
import com.etsys.commons.utils.ExceptionUtil;
import com.etsys.commons.utils.IdUtils;
import com.etsys.core.entity.StuScore;
import com.etsys.core.service.CourseService;
import com.etsys.core.service.ScoreService;
import com.etsys.core.service.TestPaperService;
import com.etsys.core.service.TestService;
import com.etsys.orm.pojo.TbCourse;
import com.etsys.orm.pojo.TbScore;
import com.etsys.orm.pojo.TbTest;
import com.etsys.orm.pojo.TbTestPaper;

@Controller
@RequestMapping("/score")
public class ScoreController {

	@Autowired
	private ScoreService scoreService;

	@Autowired
	private TestPaperService testPaperService;

	@Autowired
	private TestService testService;

	@Autowired
	private CourseService courseService;

	@RequestMapping("/getbyStuAndCourse")
	public String getScoreBy(@RequestParam String studentId, @RequestParam String courseId, ModelMap modelMap) {

		List<TbScore> list = scoreService.getScore(studentId, courseId);
		modelMap.put("courseId", courseId);
		modelMap.put("score", list.get(0));

		return "teach-score-entry";
	}

	@RequestMapping("/getByStudent/{studentId}")
	public String getByStudent(@PathVariable String studentId, ModelMap modelMap) {

		List<StuScore> scores = new ArrayList<>();

		List<TbScore> list = scoreService.getByStudentAndState(studentId, 1000);
		for (TbScore tbScore : list) {
			TbTest test = testService.getTestById(tbScore.getTestId());
			TbCourse course = courseService.getCourseById(test.getCourseId());
			StuScore score = new StuScore(tbScore);
			score.setCourseName(course.getCourseName());
			scores.add(score);
		}

		modelMap.put("scores", scores);
		return "stu-score";
	}

	@RequestMapping("/insertScore")
	@ResponseBody
	public JsonResult insertScore(@RequestBody TbScore score) {

		try {

			score.setScoId("sco" + IdUtils.genItemId());
			scoreService.insertScore(score);

			TbTest test = testService.getTestById(score.getTestId());
			TbTestPaper testPaper = testPaperService.getTestPaperEntryUnique(score.getScoType(), score.getStuId(),
					test.getCourseId(), score.getTestId());
			testPaper.setTpState(4);

			testPaperService.updateTestPaper(testPaper);

			return JsonResult.ok();
		} catch (Exception e) {
			e.printStackTrace();
			return JsonResult.build(500, ExceptionUtil.getStackTrace(e));
		}
	}

	@RequestMapping("/getByTestAndStudent")
	public String getByTestAndStudent(@RequestParam String testId, @RequestParam String studentId,
			@RequestParam String returnPage, ModelMap modelMap) {

		List<TbScore> scores = scoreService.getByTestAndStudent(testId, studentId);

		modelMap.put("scores", scores);
		return returnPage;
	}

}
