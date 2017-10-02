package com.etsys.core.service;

import com.etsys.orm.pojo.TbTeacherCourse;

public interface TeacherCourseService {

	public boolean getIfTeacherHasRecords(String teacherId);
	
	public void syncRecords(String teacherId);
	
	public Integer insertTeacherCourse(TbTeacherCourse teacherCourse);
	
}
