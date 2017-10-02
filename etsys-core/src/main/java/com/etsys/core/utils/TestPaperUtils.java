package com.etsys.core.utils;

import com.etsys.core.pojo.TestPaperTemplate;
import com.etsys.orm.pojo.TbTestPaper;

public class TestPaperUtils {

	private TestPaperUtils() {
		
	}
	
	public static TbTestPaper generateTestPaper(TestPaperTemplate template) {
		
		return new TbTestPaper();
	}
	
}
