package com.etsys.core.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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
	public List<TbScore> getScoreBy(@RequestParam String studentId, @RequestParam String courseId) {
		
		/*在此处填入合适的代码*/
		
		return new ArrayList<>();
	}

}
