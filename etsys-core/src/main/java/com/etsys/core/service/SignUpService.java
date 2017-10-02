package com.etsys.core.service;

import com.etsys.core.pojo.Instructor;

public interface SignUpService {

	public Instructor getInstructor(String instructorId, String password);
	
}
