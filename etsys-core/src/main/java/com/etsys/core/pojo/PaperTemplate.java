package com.etsys.core.pojo;

import java.util.List;

import com.etsys.orm.pojo.TbTemplate;
import com.etsys.orm.pojo.TbTemplateEntry;

public class PaperTemplate {

	private TbTemplate template;
	
	private List<TbTemplateEntry> entries;

	public TbTemplate getTemplate() {
		return template;
	}

	public void setTemplate(TbTemplate template) {
		this.template = template;
	}

	public List<TbTemplateEntry> getEntries() {
		return entries;
	}

	public void setEntries(List<TbTemplateEntry> entries) {
		this.entries = entries;
	}
	
}
