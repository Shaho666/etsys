package com.etsys.core.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

import com.etsys.core.service.SignInService;
import com.etsys.orm.mapper.TbStudentMapper;
import com.etsys.orm.mapper.TbTeacherMapper;
import com.etsys.orm.pojo.TbStudent;
import com.etsys.orm.pojo.TbStudentExample;
import com.etsys.orm.pojo.TbTeacher;
import com.etsys.orm.pojo.TbTeacherExample;
import com.etsys.orm.pojo.TbTeacherExample.Criteria;

@Service
public class SignInServiceImpl implements SignInService {

	@Autowired
	private TbTeacherMapper teacherMapper;

	@Autowired
	private TbStudentMapper studentMapper;

	@Value("${TEACHER_USER_TOKEN}")
	private String TEACHER_USER_TOKEN;

	@Override
	public TbTeacher teacherSignIn(String teacherId, String teacherPassword) {

		TbTeacherExample example = new TbTeacherExample();

		Criteria criteria = example.createCriteria();
		criteria.andTeacherIdEqualTo(teacherId);
		criteria.andTeacherPasswordEqualTo(DigestUtils.md5DigestAsHex(teacherPassword.getBytes()));

		TbTeacher tbteacher = null;
		List<TbTeacher> list = teacherMapper.selectByExample(example);
		if (list != null && list.size() > 0) {
			tbteacher = list.get(0);
			tbteacher.setTeacherPassword(null);
		}

		return tbteacher;
	}

	@Override
	public TbStudent studentSignIn(String studentId, String studentPassword) {

		TbStudentExample example = new TbStudentExample();

		com.etsys.orm.pojo.TbStudentExample.Criteria criteria = example.createCriteria();
		criteria.andStuIdEqualTo(studentId);
		criteria.andStuPasswordEqualTo(DigestUtils.md5DigestAsHex(studentPassword.getBytes()));

		TbStudent student = null;
		List<TbStudent> list = studentMapper.selectByExample(example);
		if (list != null && list.size() > 0) {
			student = list.get(0);
			student.setStuPassword(null);
		}

		return student;
	}

}
