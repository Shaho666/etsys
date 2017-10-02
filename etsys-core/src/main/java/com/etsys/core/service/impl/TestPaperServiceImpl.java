package com.etsys.core.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.etsys.core.service.TestPaperService;
import com.etsys.orm.mapper.TbTestPaperMapper;
import com.etsys.orm.pojo.TbTestPaper;

@Service
public class TestPaperServiceImpl implements TestPaperService {

	@Autowired
	private TbTestPaperMapper testPaperMapper;
	
	@Override
	public List<TbTestPaper> getByCourseAndClass(String courseId, String className) {
		
		/* 在此处填入合适的代码 */
		
		return new ArrayList<>();
	}

	@Override
	public Integer updateTestPaper(TbTestPaper testPaper) {
		
		/* 在此处填入合适的代码 */
		
		return 0;
	}

	@Override
	public Integer insertTestPaper(TbTestPaper testPaper) {
		
		/* 在此处填入合适的代码 */
		
		return 0;
	}
	

}
