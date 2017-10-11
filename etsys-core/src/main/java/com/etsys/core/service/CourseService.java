package com.etsys.core.service;

import java.util.List;

import com.etsys.orm.pojo.TbCourse;

public interface CourseService {

	public List<TbCourse> getCoursesByTeacherId(String teacherId);
	
	public List<TbCourse> getCoursesByStudentId(String studentId);
	
	public Integer insertCourse(TbCourse tbCourse);
	
	public TbCourse getCourseById(String courseId);
	
}
