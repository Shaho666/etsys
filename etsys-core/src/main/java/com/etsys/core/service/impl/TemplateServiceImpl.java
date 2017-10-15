package com.etsys.core.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.etsys.core.service.TemplateService;
import com.etsys.orm.mapper.TbTemplateEntryMapper;
import com.etsys.orm.mapper.TbTemplateMapper;
import com.etsys.orm.pojo.TbTemplate;
import com.etsys.orm.pojo.TbTemplateEntry;
import com.etsys.orm.pojo.TbTemplateEntryExample;
import com.etsys.orm.pojo.TbTemplateEntryExample.Criteria;
import com.etsys.orm.pojo.TbTemplateExample;

@Service
public class TemplateServiceImpl implements TemplateService {

	@Autowired
	private TbTemplateMapper templateMapper;

	@Autowired
	private TbTemplateEntryMapper templateEntryMapper;

	@Override
	public List<TbTemplate> getTemplate(String teacherId, String courseId) {

		TbTemplateExample example = new TbTemplateExample();

		com.etsys.orm.pojo.TbTemplateExample.Criteria criteria = example.createCriteria();
		criteria.andCourseIdEqualTo(courseId);
		criteria.andTeacherIdEqualTo(teacherId);

		List<TbTemplate> list = templateMapper.selectByExample(example);
		if (list != null && list.size() > 0) {
			return list;
		}

		return null;
	}

	@Override
	public void insertTemplateInfo(TbTemplate template) {

		templateMapper.insert(template);

	}

	@Override
	public void insertTemplateEntry(TbTemplateEntry templateEntry) {

		templateEntryMapper.insert(templateEntry);

	}

	@Override
	public void updateTemplateInfo(TbTemplate template) {

		/* 在此处填入合适的代码 */

	}

	@Override
	public void updateTemplateEntry(TbTemplateEntry templateEntry) {

		/* 在此处填入合适的代码 */

	}

	@Override
	public void deleteTemplateInfo(TbTemplate template) {

		/* 在此处填入合适的代码 */

	}

	@Override
	public void deleteTemplateEntry(TbTemplateEntry templateEntry) {

		/* 在此处填入合适的代码 */

	}

	@Override
	public List<TbTemplateEntry> getEntries(String templateId) {

		TbTemplateEntryExample example = new TbTemplateEntryExample();

		Criteria criteria = example.createCriteria();
		criteria.andTemIdEqualTo(templateId);

		List<TbTemplateEntry> list = templateEntryMapper.selectByExample(example);
		if (list != null && list.size() > 0) {
			return list;
		}

		return list;
	}

	@Override
	public TbTemplate getTemplateById(String templateId) {

		TbTemplate template = templateMapper.selectByPrimaryKey(templateId);

		return template;
	}

	@Override
	public TbTemplateEntry getEntryByIdAndType(String templateId, Integer type) {

		TbTemplateEntryExample example = new TbTemplateEntryExample();

		Criteria criteria = example.createCriteria();
		criteria.andTemIdEqualTo(templateId);
		criteria.andTemTypeEqualTo(type);

		List<TbTemplateEntry> list = templateEntryMapper.selectByExample(example);
		if (list != null && list.size() > 0) {
			return list.get(0);
		}

		return null;
	}

}
