package com.etsys.core.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.etsys.core.service.TestService;
import com.etsys.orm.mapper.TbTestMapper;
import com.etsys.orm.pojo.TbTest;

@Service
public class TestServiceImpl implements TestService {

	@Autowired
	private TbTestMapper testMapper;
	
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
		// TODO Auto-generated method stub
		return null;
	}

}
