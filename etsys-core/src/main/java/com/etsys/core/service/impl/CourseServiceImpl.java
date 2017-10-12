package com.etsys.core.service.impl;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.etsys.core.service.CourseService;
import com.etsys.orm.mapper.TbCourseMapper;
import com.etsys.orm.mapper.TbTeacherCourseMapper;
import com.etsys.orm.pojo.TbCourse;
import com.etsys.orm.pojo.TbTeacherCourse;
import com.etsys.orm.pojo.TbTeacherCourseExample;
import com.etsys.orm.pojo.TbTeacherCourseExample.Criteria;

@Service
public class CourseServiceImpl implements CourseService {

	@Autowired
	private TbCourseMapper courseMapper;

	@Autowired
	private TbTeacherCourseMapper teacherCourseMapper;

	@Override
	public List<TbCourse> getCoursesByTeacherId(String teacherId) {

		TbTeacherCourseExample example = new TbTeacherCourseExample();

		example.setDistinct(true);
		Criteria criteria = example.createCriteria();
		criteria.andTeacherIdEqualTo(teacherId);

		List<TbCourse> courses = new ArrayList<TbCourse>();

		List<TbTeacherCourse> list = teacherCourseMapper.selectByExample(example);
		for (TbTeacherCourse tbTeacherCourse : list) {
			TbCourse course = courseMapper.selectByPrimaryKey(tbTeacherCourse.getCourseId());
			courses.add(course);
		}

		Set<TbCourse> courseSet = new HashSet<TbCourse>(courses);
		courses = new ArrayList<>(courseSet);

		return courses;
	}

	@Override
	public Integer insertCourse(TbCourse tbCourse) {

		int result = courseMapper.insert(tbCourse);

		return result;
	}

	@Override
	public List<TbCourse> getCoursesByStudentId(String studentId) {

		TbTeacherCourseExample example = new TbTeacherCourseExample();

		example.setDistinct(true);
		Criteria criteria = example.createCriteria();
		criteria.andStudentIdEqualTo(studentId);

		List<TbCourse> courses = new ArrayList<TbCourse>();

		List<TbTeacherCourse> list = teacherCourseMapper.selectByExample(example);
		for (TbTeacherCourse tbTeacherCourse : list) {
			TbCourse course = courseMapper.selectByPrimaryKey(tbTeacherCourse.getCourseId());
			courses.add(course);
		}

		Set<TbCourse> courseSet = new HashSet<TbCourse>(courses);
		courses = new ArrayList<>(courseSet);

		return courses;
	}

	@Override
	public TbCourse getCourseById(String courseId) {

		TbCourse course = courseMapper.selectByPrimaryKey(courseId);

		return course;
	}

}
