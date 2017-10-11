package com.etsys.core.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.etsys.core.service.QuestionBankService;
import com.etsys.orm.mapper.TbQuestionBankMapper;
import com.etsys.orm.pojo.TbQuestionBank;
import com.etsys.orm.pojo.TbQuestionBankWithBLOBs;

@Service
public class QuestionBankServiceImpl implements QuestionBankService {

	@Autowired
	private TbQuestionBankMapper questionBankMapper;
	
	@Override
	public List<TbQuestionBank> getQuestionBank(String courseId) {
		
		/*在此处填入合适的代码*/
		
		return new ArrayList<>();
	}

	@Override
	public Integer deleteBankEntryById(String questionBankId) {
		
		/*在此处填入合适的代码*/
		
		return null;
	}

	@Override
	public Integer deleteBankByCourseId(String courseId) {
		
		/*在此处填入合适的代码*/
		
		return null;
	}

	@Override
	public Integer updateBankEntry(TbQuestionBank questionBank) {
		
		/*在此处填入合适的代码*/
		
		return null;
	}

	@Override
	public Integer insertBankEntry(TbQuestionBankWithBLOBs questionBank) {
		
		int result = questionBankMapper.insert(questionBank);
		
		return result;
	}

}
