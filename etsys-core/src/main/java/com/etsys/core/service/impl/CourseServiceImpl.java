package com.etsys.core.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.etsys.core.service.CourseService;
import com.etsys.orm.mapper.TbCourseMapper;
import com.etsys.orm.mapper.TbTeacherCourseMapper;
import com.etsys.orm.pojo.TbCourse;
import com.etsys.orm.pojo.TbTeacherCourse;

@Service
public class CourseServiceImpl implements CourseService {

	@Autowired
	private TbCourseMapper courseMapper;

	@Autowired
	private TbTeacherCourseMapper teacherCourseMapper;

	@Override
	public List<TbCourse> getCoursesByTeacherId(String teacherId) {

		/* 在此处填写合适的代码 */

		return null;
	}

	@Override
	public Integer insertCourse(TbCourse tbCourse) {

		/* 在此处填写合适的代码 */

		return null;
	}

	@Override
	public List<TbCourse> getCoursesByStudentId(String studentId) {

		/* 在此处填写合适的代码 */

		return null;
	}

}
