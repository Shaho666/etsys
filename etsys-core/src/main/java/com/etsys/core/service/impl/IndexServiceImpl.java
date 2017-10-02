package com.etsys.core.service.impl;

import org.springframework.stereotype.Service;

import com.etsys.core.service.IndexService;

@Service
public class IndexServiceImpl implements IndexService {

	@Override
	public String decorateIndex() {
		
		return "Index is decorating...";
	}

}
