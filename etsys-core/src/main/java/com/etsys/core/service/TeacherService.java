package com.etsys.core.service;

import com.etsys.orm.pojo.TbTeacher;

public interface TeacherService {

	public Integer insertTbTeacher(TbTeacher teacher);
	
	public TbTeacher getTbteacher(TbTeacher teacher);
	
	public TbTeacher getByTeacherId(String teacherId);
	
}
