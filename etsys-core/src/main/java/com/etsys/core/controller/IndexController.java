package com.etsys.core.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.etsys.core.service.IndexService;

@Controller
public class IndexController {

	@Autowired
	private IndexService indexService;
	
	@RequestMapping("/")
	public String showIndex(ModelMap modelMap) {
		
		String decorator = indexService.decorateIndex();
		modelMap.put("decorator", decorator);
		
		return "index";
	}
	
	@RequestMapping("/{pageName}")
	public String showPage(@PathVariable String pageName) {
		
		return pageName;
	}
	
}
