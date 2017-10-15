package com.etsys.core.service;

import com.etsys.core.pojo.PageHelperResult;
import com.etsys.orm.pojo.TbStudent;

public interface StudentService {

	public Integer insertStudent(TbStudent student);
	
	public PageHelperResult<TbStudent> getByCourseAndTeacher(String teacherId, String courseId, int pageNum, int pageSize);
	
	public TbStudent getStudentById(String studentId);
	
}
