package com.etsys.core.entity;

import com.etsys.orm.pojo.TbTest;

public class StuTest extends TbTest {

	private Boolean finished;

	public StuTest() {
		// TODO Auto-generated constructor stub
	}
	
	public StuTest(TbTest test) {
		
		this.setTestId(test.getTestId());
		
		this.setTestDegree(test.getTestDegree());
		
		this.setTemplateId(test.getTemplateId());
		
		this.setTeacherId(test.getTeacherId());
		
		this.setCreated(test.getCreated());
		
		this.setCourseId(test.getCourseId());
		
	}
	
	public Boolean getFinished() {
		return finished;
	}

	public void setFinished(Boolean finished) {
		this.finished = finished;
	}
	
}
