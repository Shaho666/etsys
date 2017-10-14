package com.etsys.core.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.etsys.core.service.QuestionBankService;
import com.etsys.orm.mapper.TbQuestionBankMapper;
import com.etsys.orm.pojo.TbQuestionBank;
import com.etsys.orm.pojo.TbQuestionBankExample;
import com.etsys.orm.pojo.TbQuestionBankExample.Criteria;
import com.etsys.orm.pojo.TbQuestionBankWithBLOBs;
import com.github.pagehelper.PageHelper;

@Service
public class QuestionBankServiceImpl implements QuestionBankService {

	@Autowired
	private TbQuestionBankMapper questionBankMapper;

	@Override
	public List<TbQuestionBank> getQuestionBank(String courseId) {

		TbQuestionBankExample example = new TbQuestionBankExample();

		Criteria criteria = example.createCriteria();
		criteria.andCourseIdEqualTo(courseId);

		List<TbQuestionBank> list = questionBankMapper.selectByExample(example);
		if (list != null && list.size() > 0) {
			return list;
		}

		return null;
	}

	@Override
	public Integer deleteBankEntryById(String questionBankId) {

		/* 在此处填入合适的代码 */

		return null;
	}

	@Override
	public Integer deleteBankByCourseId(String courseId) {

		/* 在此处填入合适的代码 */

		return null;
	}

	@Override
	public Integer updateBankEntry(TbQuestionBank questionBank) {

		/* 在此处填入合适的代码 */

		return null;
	}

	@Override
	public Integer insertBankEntry(TbQuestionBankWithBLOBs questionBank) {

		int result = questionBankMapper.insert(questionBank);

		return result;
	}

	@Override
	public TbQuestionBankWithBLOBs getQuestionBankById(String questionBankId) {

		TbQuestionBankWithBLOBs question = questionBankMapper.selectByPrimaryKey(questionBankId);

		return question;
	}

	@Override
	public TbQuestionBankWithBLOBs getByCourseDegreeAndType(String courseId, Integer degree, Integer seqNum,
			Integer type) {

		TbQuestionBankExample example = new TbQuestionBankExample();

		Criteria criteria = example.createCriteria();
		criteria.andCourseIdEqualTo(courseId);
		criteria.andQueDegreeEqualTo(degree);
		criteria.andQueTypeEqualTo(type);

		PageHelper.startPage(seqNum, 1);
		List<TbQuestionBankWithBLOBs> list = questionBankMapper.selectByExampleWithBLOBs(example);
		if (list != null && list.size() > 0) {
			list.get(0).setQueAnswer(null);
			return list.get(0);
		}

		return null;
	}

	@Override
	public Integer countByTypeDegreeAndCourse(int type, int degree, String courseId) {

		TbQuestionBankExample example = new TbQuestionBankExample();

		Criteria criteria = example.createCriteria();
		criteria.andQueTypeEqualTo(type);
		criteria.andQueDegreeEqualTo(degree);
		criteria.andCourseIdEqualTo(courseId);

		int count = questionBankMapper.countByExample(example);

		return count;
	}

}
