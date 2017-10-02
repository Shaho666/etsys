package com.etsys.core.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.etsys.core.service.QuestionTypeService;
import com.etsys.orm.mapper.TbQuestionTypeMapper;

@Service
public class QuestionTypeServiceImpl implements QuestionTypeService {

	@Autowired
	private TbQuestionTypeMapper questionTypeMapper;

	@Override
	public String getTypeById(Integer typeId) {

		/* 在此处填写合适的代码 */

		return null;
	}

	@Override
	public Integer getIdByName(String typeName) {

		/* 在此处填写合适的代码 */

		return null;
	}

}
