package com.etsys.core.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.etsys.core.service.StudentService;
import com.etsys.orm.mapper.TbStudentMapper;
import com.etsys.orm.mapper.TbTeacherCourseMapper;
import com.etsys.orm.pojo.TbStudent;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private TbStudentMapper studentMapper;
	
	@Autowired
	private TbTeacherCourseMapper teacherCourseMapper;
	
	@Override
	public Integer insertStudent(TbStudent student) {
		
		int result = studentMapper.insert(student);
		
		return result;
	}

	@Override
	public List<TbStudent> getByCourseAndTeacher(String teacherId, String courseId) {
		
		/*在此处填入合适的代码*/
		
		return new ArrayList<>();
	}

}
