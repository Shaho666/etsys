package com.etsys.core.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.etsys.core.service.TestService;
import com.etsys.orm.mapper.TbTeacherCourseMapper;
import com.etsys.orm.mapper.TbTestMapper;
import com.etsys.orm.pojo.TbTeacherCourse;
import com.etsys.orm.pojo.TbTeacherCourseExample;
import com.etsys.orm.pojo.TbTeacherCourseExample.Criteria;
import com.etsys.orm.pojo.TbTest;
import com.etsys.orm.pojo.TbTestExample;

@Service
public class TestServiceImpl implements TestService {

	@Autowired
	private TbTestMapper testMapper;
	
	@Autowired
	private TbTeacherCourseMapper teacherCourseMapper;
	
	@Override
	public Integer insertTest(TbTest test) {
		
		int result = testMapper.insert(test);
		
		return result;
	}

	@Override
	public Integer deleteTest(TbTest test) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer updateTest(TbTest test) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TbTest> getByTeacherAndCourse(String teacherId, String courseId) {
		
		TbTestExample example = new TbTestExample();
		
		com.etsys.orm.pojo.TbTestExample.Criteria criteria = example.createCriteria();
		criteria.andCourseIdEqualTo(courseId);
		criteria.andTeacherIdEqualTo(teacherId);
		
		List<TbTest> list = testMapper.selectByExample(example);
		
		return list;
	}

	@Override
	public List<TbTest> getByStudentAndCourse(String studentId) {
		
		TbTeacherCourseExample example = new TbTeacherCourseExample();
		
		Criteria criteria = example.createCriteria();
		criteria.andStudentIdEqualTo(studentId);
		
		List<TbTest> tests = new ArrayList<TbTest>();
		
		List<TbTeacherCourse> list = teacherCourseMapper.selectByExample(example);
		for (TbTeacherCourse tbTeacherCourse : list) {
			TbTestExample example2 = new TbTestExample();
			com.etsys.orm.pojo.TbTestExample.Criteria criteria2 = example2.createCriteria();
			criteria2.andCourseIdEqualTo(tbTeacherCourse.getCourseId());
			List<TbTest> list2 = testMapper.selectByExample(example2);
			tests.add(list2.get(0));
		}
		
		return tests;
	}

	@Override
	public TbTest getTestById(String testId) {
		
		TbTest test = testMapper.selectByPrimaryKey(testId);
		
		return test;
	}

}
