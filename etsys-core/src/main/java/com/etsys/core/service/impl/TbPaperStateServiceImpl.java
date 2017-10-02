package com.etsys.core.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.etsys.core.service.TbPaperStateService;
import com.etsys.orm.mapper.TbPaperStateMapper;

public class TbPaperStateServiceImpl implements TbPaperStateService {

	@Autowired
	private TbPaperStateMapper paperStateMapper;
	
	@Override
	public String getStatusNameById(Integer statusId) {
		
		/* 在此处填写合适的代码 */
		
		return null;
	}

	@Override
	public Integer getStatusIdByName(String statusName) {
		
		/* 在此处填写合适的代码 */
		
		return null;
	}

}
