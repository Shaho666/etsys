package com.etsys.core.service;

import java.util.List;

import com.etsys.orm.pojo.TbTemplate;
import com.etsys.orm.pojo.TbTemplateEntry;

public interface TemplateService {

	public List<TbTemplate> getTemplate(String teacherId, String courseId);
	
	public List<TbTemplateEntry> getEntries(String templateId);

	public void insertTemplateInfo(TbTemplate template);

	public void insertTemplateEntry(TbTemplateEntry templateEntry);

	public void updateTemplateInfo(TbTemplate template);

	public void updateTemplateEntry(TbTemplateEntry templateEntry);
	
	public void deleteTemplateInfo(TbTemplate template);

	public void deleteTemplateEntry(TbTemplateEntry templateEntry);

}
