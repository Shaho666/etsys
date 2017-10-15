package com.etsys.core.service;

import java.util.List;

import com.etsys.orm.pojo.TbScore;

public interface ScoreService {

	public List<TbScore> getScore(String studentId, String courseId);
	
	public TbScore getByTestPaper(String testId, String studentId);
	
	public Integer insertScore(TbScore score);
	
	public List<TbScore> getByTestAndState(String testId, Integer state);
	
	public List<TbScore> getByTestAndStudent(String testId, String studentId);
	
}
