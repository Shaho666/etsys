package com.etsys.core.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.etsys.core.service.ScoreService;
import com.etsys.core.service.TestPaperService;
import com.etsys.orm.pojo.TbScore;
import com.etsys.orm.pojo.TbTestPaper;

@Controller
@RequestMapping("/score")
public class ScoreController {

	@Autowired
	private ScoreService scoreService;
	
	@Autowired
	private TestPaperService testPaperService;

	@RequestMapping("/getbyStuAndCourse")
	public String getScoreBy(@RequestParam String studentId, @RequestParam String courseId, ModelMap modelMap) {

		List<TbScore> list = scoreService.getScore(studentId, courseId);
		modelMap.put("courseId", courseId);
		modelMap.put("score", list.get(0));

		return "teach-score-entry";
	}

	@RequestMapping("/getByStudent/{studentId}")
	public String getbyStudent(@PathVariable String studentId, ModelMap modelMap) {
		
		List<TbScore> scores = new ArrayList<TbScore>();
		
		List<TbTestPaper> list = testPaperService.getByStudent(studentId);
		for (TbTestPaper tbTestPaper : list) {
			TbScore score = scoreService.getByTestPaper(tbTestPaper.getTpId());
			scores.add(score);
		}
		
		modelMap.put("scores", scores);
		
		return null;
	}
	
}
