package com.etsys.core.service;

import com.etsys.core.entity.Instructor;

public interface SignUpService {

	public Instructor getInstructor(String instructorId, String password);
	
}
