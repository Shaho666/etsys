package com.etsys.core.service;

import java.util.List;

import com.etsys.orm.pojo.TbTestPaper;

public interface TestPaperService {

	public List<TbTestPaper> getByCourseAndStudent(String courseId, String className);
	
	public Integer updateTestPaper(TbTestPaper testPaper);
	
	public Integer insertTestPaper(TbTestPaper testPaper);
	
	public List<TbTestPaper> getByStudent(String studentId);
	
}
