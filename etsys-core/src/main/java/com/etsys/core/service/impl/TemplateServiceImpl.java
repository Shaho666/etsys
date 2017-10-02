package com.etsys.core.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.etsys.core.service.TemplateService;
import com.etsys.orm.mapper.TbTemplateEntryMapper;
import com.etsys.orm.mapper.TbTemplateMapper;
import com.etsys.orm.pojo.TbTemplate;
import com.etsys.orm.pojo.TbTemplateEntry;

@Service
public class TemplateServiceImpl implements TemplateService {

	@Autowired
	private TbTemplateMapper templateMapper;
	
	@Autowired
	private TbTemplateEntryMapper templateEntryMapper;
	
	@Override
	public List<TbTemplate> getTemplates(String teacherId, String courseId) {
		
		/*在此处填入合适的代码*/
		
		return new ArrayList<>();
	}

	@Override
	public void insertTemplateInfo(TbTemplate template) {
		
		/*在此处填入合适的代码*/
		
	}

	@Override
	public void insertTemplateEntry(TbTemplateEntry templateEntry) {
		
		/*在此处填入合适的代码*/
		
	}

	@Override
	public void updateTemplateInfo(TbTemplate template) {
		
		/*在此处填入合适的代码*/
		
	}

	@Override
	public void updateTemplateEntry(TbTemplateEntry templateEntry) {
		
		/*在此处填入合适的代码*/
		
	}

	@Override
	public void deleteTemplateInfo(TbTemplate template) {
		
		/*在此处填入合适的代码*/
		
	}

	@Override
	public void deleteTemplateEntry(TbTemplateEntry templateEntry) {
		
		/*在此处填入合适的代码*/
		
	}
	
}
