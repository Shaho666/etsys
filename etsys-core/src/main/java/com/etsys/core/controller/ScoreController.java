package com.etsys.core.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.etsys.core.service.ScoreService;
import com.etsys.orm.pojo.TbScore;

@Controller
@RequestMapping("/score")
public class ScoreController {

	@Autowired
	private ScoreService scoreService;

	@RequestMapping("/getbyStuAndCourse")
	public String getScoreBy(@RequestParam String studentId, @RequestParam String courseId, ModelMap modelMap) {

		List<TbScore> list = scoreService.getScore(studentId, courseId);
		modelMap.put("courseId", courseId);
		modelMap.put("score", list.get(0));

		return "teach-score-entry";
	}

}
