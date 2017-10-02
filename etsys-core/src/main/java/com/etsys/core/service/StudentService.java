package com.etsys.core.service;

import java.util.List;

import com.etsys.orm.pojo.TbStudent;

public interface StudentService {

	public Integer insertStudent(TbStudent student);
	
	public List<TbStudent> getByCourseAndTeacher(String teacherId, String courseId);
	
}
