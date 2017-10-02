package com.etsys.core.service;

import com.etsys.orm.pojo.TbStudent;
import com.etsys.orm.pojo.TbTeacher;

public interface SignInService {

	public TbTeacher teacherSignIn(String teacherId, String teacherPassword);
	
	public TbStudent studentSignIn(String studentId, String studentPassword);

}
