package com.etsys.core.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

import com.etsys.core.service.TeacherService;
import com.etsys.orm.mapper.TbTeacherMapper;
import com.etsys.orm.pojo.TbTeacher;
import com.etsys.orm.pojo.TbTeacherExample;
import com.etsys.orm.pojo.TbTeacherExample.Criteria;

@Service
public class TeacherServiceImpl implements TeacherService {

	@Autowired
	private TbTeacherMapper teacherMapper;

	@Override
	public Integer insertTbTeacher(TbTeacher teacher) {

		int result = teacherMapper.insert(teacher);

		return result;
	}

	@Override
	public TbTeacher getTbteacher(TbTeacher teacher) {

		TbTeacherExample example = new TbTeacherExample();

		Criteria criteria = example.createCriteria();
		criteria.andTeacherIdEqualTo(teacher.getTeacherId());
		criteria.andTeacherPasswordEqualTo(DigestUtils.md5DigestAsHex(teacher.getTeacherPassword().getBytes()));

		List<TbTeacher> list = teacherMapper.selectByExample(example);
		if (list != null && list.size() > 0) {
			return list.get(0);
		}

		return null;
	}

	@Override
	public TbTeacher getByTeacherId(String teacherId) {
		
		TbTeacher teacher = teacherMapper.selectByPrimaryKey(teacherId);
		
		return teacher;
	}

}
