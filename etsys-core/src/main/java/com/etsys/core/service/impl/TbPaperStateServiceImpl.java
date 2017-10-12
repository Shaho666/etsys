package com.etsys.core.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.etsys.core.service.TbPaperStateService;
import com.etsys.orm.mapper.TbPaperStateMapper;
import com.etsys.orm.pojo.TbPaperState;
import com.etsys.orm.pojo.TbPaperStateExample;
import com.etsys.orm.pojo.TbPaperStateExample.Criteria;

public class TbPaperStateServiceImpl implements TbPaperStateService {

	@Autowired
	private TbPaperStateMapper paperStateMapper;

	@Override
	public String getStatusNameById(Integer statusId) {

		TbPaperStateExample example = new TbPaperStateExample();

		Criteria criteria = example.createCriteria();
		criteria.andPsIdEqualTo(statusId);

		List<TbPaperState> list = paperStateMapper.selectByExample(example);
		if (list != null && list.size() > 0) {
			return list.get(0).getPsName();
		}

		return null;
	}

	@Override
	public Integer getStatusIdByName(String statusName) {

		TbPaperStateExample example = new TbPaperStateExample();

		example.setDistinct(true);
		Criteria criteria = example.createCriteria();
		criteria.andPsNameEqualTo(statusName);
		
		List<TbPaperState> list = paperStateMapper.selectByExample(example);
		if (list != null && list.size() > 0) {
			return list.get(0).getPsId();
		}

		return null;
	}

}
