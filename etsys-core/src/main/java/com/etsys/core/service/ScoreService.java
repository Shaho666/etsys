package com.etsys.core.service;

import java.util.List;

import com.etsys.orm.pojo.TbScore;

public interface ScoreService {

	public List<TbScore> getScore(String studentId, String courseId);
	
}
