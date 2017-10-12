package com.etsys.core.service.impl;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.etsys.core.service.ScoreService;
import com.etsys.orm.mapper.TbScoreMapper;
import com.etsys.orm.mapper.TbTestPaperMapper;
import com.etsys.orm.pojo.TbScore;
import com.etsys.orm.pojo.TbTestPaper;
import com.etsys.orm.pojo.TbTestPaperExample;
import com.etsys.orm.pojo.TbTestPaperExample.Criteria;

@Service
public class ScoreServiceImpl implements ScoreService {

	@Autowired
	private TbScoreMapper scoreMapper;
	
	@Autowired
	private TbTestPaperMapper testPaperMapper;

	@Override
	public List<TbScore> getScore(String studentId, String courseId) {

		TbTestPaperExample example = new TbTestPaperExample();

		Criteria criteria = example.createCriteria();
		criteria.andStuIdEqualTo(studentId);
		criteria.andCourseIdEqualTo(courseId);

		List<TbScore> scores = new ArrayList<TbScore>();

		List<TbTestPaper> list = testPaperMapper.selectByExample(example);
		for (TbTestPaper tbTestPaper : list) {
			TbScore score = scoreMapper.selectByPrimaryKey(tbTestPaper.getTpId());
			scores.add(score);
		}

		Set<TbScore> courseSet = new HashSet<TbScore>(scores);
		scores = new ArrayList<>(courseSet);
		
		return scores;
	}

}
