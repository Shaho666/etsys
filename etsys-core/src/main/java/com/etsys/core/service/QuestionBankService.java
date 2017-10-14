package com.etsys.core.service;

import java.util.List;

import com.etsys.orm.pojo.TbQuestionBank;
import com.etsys.orm.pojo.TbQuestionBankWithBLOBs;

public interface QuestionBankService {

	public List<TbQuestionBank> getQuestionBank(String courseId);

	public Integer deleteBankEntryById(String questionBankId);

	public Integer deleteBankByCourseId(String courseId);

	public Integer updateBankEntry(TbQuestionBank questionBank);

	public Integer insertBankEntry(TbQuestionBankWithBLOBs questionBank);

	public TbQuestionBankWithBLOBs getQuestionBankById(String questionBankId);

	public TbQuestionBankWithBLOBs getByCourseDegreeAndType(String courseId, Integer degree, Integer seqNum,
			Integer type);
	
	public Integer countByTypeDegreeAndCourse(int type, int degree, String courseId);

}
