package com.etsys.core.service;

import java.util.List;

import com.etsys.orm.pojo.TbTest;

public interface TestService {

	public Integer insertTest(TbTest test);
	
	public Integer deleteTest(TbTest test);
	
	public Integer updateTest(TbTest test);
	
	public List<TbTest> getByTeacherAndCourse(String teacherId, String courseId);
	
	public List<TbTest> getByStudentAndCourse(String studentId);
	
	public TbTest getTestById(String testId);
	
}
