package com.etsys.core.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.etsys.core.service.QuestionTypeService;
import com.etsys.orm.mapper.TbQuestionTypeMapper;
import com.etsys.orm.pojo.TbQuestionType;
import com.etsys.orm.pojo.TbQuestionTypeExample;
import com.etsys.orm.pojo.TbQuestionTypeExample.Criteria;

@Service
public class QuestionTypeServiceImpl implements QuestionTypeService {

	@Autowired
	private TbQuestionTypeMapper questionTypeMapper;

	@Override
	public String getTypeById(Integer typeId) {

		TbQuestionTypeExample example = new TbQuestionTypeExample();

		Criteria criteria = example.createCriteria();
		criteria.andQtIdEqualTo(typeId);

		List<TbQuestionType> list = questionTypeMapper.selectByExample(example);

		if (list != null && list.size() > 0) {
			return list.get(0).getQtName();
		}

		return null;
	}

	@Override
	public Integer getIdByName(String typeName) {

		TbQuestionTypeExample example = new TbQuestionTypeExample();

		Criteria criteria = example.createCriteria();
		criteria.andQtNameEqualTo(typeName);

		List<TbQuestionType> list = questionTypeMapper.selectByExample(example);

		if (list != null && list.size() > 0) {
			return list.get(0).getQtId();
		}

		return null;
	}

}
