package com.etsys.core.service;

import java.util.List;

import com.etsys.orm.pojo.TbTestPaper;

public interface TestPaperService {

	public List<TbTestPaper> getByCourseAndStudent(String courseId, String className);
	
	public Integer updateTestPaper(TbTestPaper testPaper);
	
	public Integer insertTestPaper(TbTestPaper testPaper);
	
	public List<TbTestPaper> getByStudent(String studentId);
	
	public List<TbTestPaper> getByStudentCourseAndTest(String studentId, String courseId, String testId);
	
	public List<TbTestPaper> getByCourseTestAndType(String courseId, String testId, Integer type);
	
	public List<TbTestPaper> getByStudentCourseTestAndState(String studentId, String courseId, String testId, Integer state);
	
	public TbTestPaper getTestPaperEntryUnique(Integer type, String studentId, String courseId, String testId);
	
}
