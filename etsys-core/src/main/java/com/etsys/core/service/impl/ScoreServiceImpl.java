package com.etsys.core.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.etsys.core.service.ScoreService;
import com.etsys.orm.mapper.TbScoreMapper;
import com.etsys.orm.pojo.TbScore;

@Service
public class ScoreServiceImpl implements ScoreService {

	@Autowired
	private TbScoreMapper scoreMapper;
	
	@Override
	public List<TbScore> getScore(String studentId, String courseId) {
		
		/*在此处填入合适的代码*/
		
		return new ArrayList<>();
	}

}
