package com.etsys.core.service;

import java.util.List;

import com.etsys.orm.pojo.TbQuestionBank;

public interface QuestionBankService {

	public List<TbQuestionBank> getQuestionBank(String courseId);
	
	public Integer deleteBankEntryById(String questionBankId);
	
	public Integer deleteBankByCourseId(String courseId);
	
	public Integer updateBankEntry(TbQuestionBank questionBank);
	
}
