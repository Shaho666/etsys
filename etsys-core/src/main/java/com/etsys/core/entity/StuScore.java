package com.etsys.core.entity;

import com.etsys.orm.pojo.TbScore;

public class StuScore extends TbScore {

	private String courseName;

	public StuScore() {
		// TODO Auto-generated constructor stub
	}
	
	public StuScore(TbScore score) {
		
		this.setScoId(score.getScoId());
		
		this.setScoMark(score.getScoMark());
		
		this.setScoType(score.getScoType());
		
		this.setStuId(score.getStuId());
		
		this.setTestId(score.getTestId());
		
	}
	
	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	
}
