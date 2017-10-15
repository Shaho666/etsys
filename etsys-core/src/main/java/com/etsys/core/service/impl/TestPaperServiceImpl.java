package com.etsys.core.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.etsys.core.service.TestPaperService;
import com.etsys.orm.mapper.TbTestPaperMapper;
import com.etsys.orm.pojo.TbTestPaper;
import com.etsys.orm.pojo.TbTestPaperExample;
import com.etsys.orm.pojo.TbTestPaperExample.Criteria;

@Service
public class TestPaperServiceImpl implements TestPaperService {

	@Autowired
	private TbTestPaperMapper testPaperMapper;

	@Override
	public List<TbTestPaper> getByCourseAndStudent(String courseId, String className) {

		TbTestPaperExample example = new TbTestPaperExample();

		Criteria criteria = example.createCriteria();
		criteria.andCourseIdEqualTo(courseId);
		criteria.andStuIdEqualTo(className);
		criteria.andTpStateEqualTo(4);

		List<TbTestPaper> list = testPaperMapper.selectByExample(example);
		if (list != null && list.size() > 0) {
			return list;
		}

		return list;
	}

	@Override
	public Integer updateTestPaper(TbTestPaper testPaper) {

		/* 在此处填入合适的代码 */

		return 0;
	}

	@Override
	public Integer insertTestPaper(TbTestPaper testPaper) {

		int result = testPaperMapper.insert(testPaper);

		return result;
	}

	@Override
	public List<TbTestPaper> getByStudent(String studentId) {

		TbTestPaperExample example = new TbTestPaperExample();

		Criteria criteria = example.createCriteria();
		criteria.andStuIdEqualTo(studentId);

		List<TbTestPaper> list = testPaperMapper.selectByExample(example);
		if (list != null && list.size() > 0) {
			return list;
		}

		return null;
	}

	@Override
	public List<TbTestPaper> getByStudentCourseAndTest(String studentId, String courseId, String testId) {
		
		TbTestPaperExample example = new TbTestPaperExample();
		
		Criteria criteria = example.createCriteria();
		criteria.andStuIdEqualTo(studentId);
		criteria.andCourseIdEqualTo(courseId);
		criteria.andTestIdEqualTo(testId);
		
		List<TbTestPaper> list = testPaperMapper.selectByExample(example);
		if (list != null && list.size() > 0) {
			return list;
		}
		
		return null;
	}

}
