package com.etsys.core.pojo;

import com.etsys.orm.pojo.TbQuestionBankWithBLOBs;

public class StuAnswer extends TbQuestionBankWithBLOBs {

	private String stuAnswer;

	public StuAnswer() {
		
	}
	
	public StuAnswer(TbQuestionBankWithBLOBs question) {
		
		this.setCourseId(question.getCourseId());
		
		this.setQueAnswer(question.getQueAnswer());
		
		this.setQueContent(question.getQueContent());
		
		this.setQueDegree(question.getQueDegree());

		this.setQueId(question.getQueId());
		
		this.setQueState(question.getQueState());
		
		this.setQueType(question.getQueType());
		
	}
	
	public String getStuAnswer() {
		return stuAnswer;
	}

	public void setStuAnswer(String stuAnswer) {
		this.stuAnswer = stuAnswer;
	}
	
}
