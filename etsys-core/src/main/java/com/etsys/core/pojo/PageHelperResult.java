package com.etsys.core.pojo;

import java.util.List;

public class PageHelperResult<T> {

	private List<T> resultList;
	
	private long total;

	public List<T> getResultList() {
		return resultList;
	}

	public void setResultList(List<T> resultList) {
		this.resultList = resultList;
	}

	public long getTotal() {
		return total;
	}

	public void setTotal(long total) {
		this.total = total;
	}
	
}
