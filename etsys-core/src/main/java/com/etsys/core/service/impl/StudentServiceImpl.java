package com.etsys.core.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.etsys.core.service.StudentService;
import com.etsys.orm.mapper.TbStudentMapper;
import com.etsys.orm.mapper.TbTeacherCourseMapper;
import com.etsys.orm.pojo.TbStudent;
import com.etsys.orm.pojo.TbTeacherCourse;
import com.etsys.orm.pojo.TbTeacherCourseExample;
import com.etsys.orm.pojo.TbTeacherCourseExample.Criteria;

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

		TbTeacherCourseExample example = new TbTeacherCourseExample();
		
		Criteria criteria = example.createCriteria();
		criteria.andTeacherIdEqualTo(teacherId);
		criteria.andCourseIdEqualTo(courseId);
		
		List<TbStudent> students = new ArrayList<TbStudent>();
		
		List<TbTeacherCourse> list = teacherCourseMapper.selectByExample(example);
		for (TbTeacherCourse tbTeacherCourse : list) {
			TbStudent student = studentMapper.selectByPrimaryKey(tbTeacherCourse.getStudentId());
			students.add(student);
		}

		return students;
	}

}
