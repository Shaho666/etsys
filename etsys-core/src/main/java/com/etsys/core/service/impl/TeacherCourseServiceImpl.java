package com.etsys.core.service.impl;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

import com.etsys.commons.pojo.JsonResult;
import com.etsys.commons.utils.HttpClientUtil;
import com.etsys.commons.utils.JsonUtils;
import com.etsys.core.pojo.Course;
import com.etsys.core.pojo.Student;
import com.etsys.core.service.TeacherCourseService;
import com.etsys.orm.mapper.TbCourseMapper;
import com.etsys.orm.mapper.TbStudentMapper;
import com.etsys.orm.mapper.TbTeacherCourseMapper;
import com.etsys.orm.pojo.TbCourse;
import com.etsys.orm.pojo.TbStudent;
import com.etsys.orm.pojo.TbTeacherCourse;
import com.etsys.orm.pojo.TbTeacherCourseExample;
import com.etsys.orm.pojo.TbTeacherCourseExample.Criteria;

@Service
public class TeacherCourseServiceImpl implements TeacherCourseService {

	@Value("${EDUCATION_ADMIN_BASE_URL}")
	private String EDUCATION_ADMIN_BASE_URL;

	@Value("${EDUCATION_ADMIN_COURSE_RECORD_URL}")
	private String EDUCATION_ADMIN_COURSE_RECORD_URL;

	@Value("${EDUCATION_ADMIN_STUDENT_URL}")
	private String EDUCATION_ADMIN_STUDENT_URL;

	@Autowired
	private TbTeacherCourseMapper teacherCourseMapper;

	@Autowired
	private TbCourseMapper courseMapper;
	
	@Autowired
	private TbStudentMapper studentMapper;

	@Override
	public boolean getIfTeacherHasRecords(String teacherId) {

		TbTeacherCourseExample example = new TbTeacherCourseExample();

		Criteria criteria = example.createCriteria();
		criteria.andTeacherIdEqualTo(teacherId);

		List<TbTeacherCourse> list = teacherCourseMapper.selectByExample(example);

		if (list != null && list.size() > 0) {
			return true;
		}

		return false;
	}

	@Override
	public void syncRecords(String teacherId) {

		List<TbTeacherCourse> teacherCourses = new ArrayList<TbTeacherCourse>();

		String courseJson = HttpClientUtil
				.doGet(EDUCATION_ADMIN_BASE_URL + EDUCATION_ADMIN_COURSE_RECORD_URL + teacherId);
		String courseJsonData = (String) JsonResult.format(courseJson).getData();
		List<Course> courseList = JsonUtils.jsonToList(courseJsonData, Course.class);
		for (Course course : courseList) {

			TbCourse tbCourse = new TbCourse();

			tbCourse.setCourseId(course.getCourseId());
			tbCourse.setCourseName(course.getCourseName());
			tbCourse.setCourseTime((int) Math.round(course.getCourseDuration()));

			try {
				courseMapper.insert(tbCourse);
			} catch (Exception e) {
				e.printStackTrace();
			}

		}

		for (Course course : courseList) {

			Map<String, String> params = new Hashtable<String, String>();
			params.put("instructorId", teacherId);
			params.put("courseId", course.getCourseId());

			String stuJson = HttpClientUtil.doPost(EDUCATION_ADMIN_BASE_URL + EDUCATION_ADMIN_STUDENT_URL, params);
			String stuJsonData = (String) JsonResult.format(stuJson).getData();
			List<Student> stuList = JsonUtils.jsonToList(stuJsonData, Student.class);
			for (Student student : stuList) {
				
				TbStudent tbStudent = new TbStudent();
				tbStudent.setStuId(student.getStudentId());
				tbStudent.setStuClass(student.getClassName());
				tbStudent.setStuName(student.getStudentName());
				tbStudent.setStuPassword(DigestUtils.md5DigestAsHex(student.getStudentId().getBytes()));
				
				try {
					studentMapper.insert(tbStudent);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}

			for (Student student : stuList) {

				TbTeacherCourse teacherCourse = new TbTeacherCourse();

				teacherCourse.setTeacherId(teacherId);
				teacherCourse.setCourseId(course.getCourseId());
				teacherCourse.setStudentId(student.getStudentId());

				teacherCourses.add(teacherCourse);
			}

		}

		for (TbTeacherCourse tbTeacherCourse : teacherCourses) {
			try {
				teacherCourseMapper.insert(tbTeacherCourse);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	@Override
	public Integer insertTeacherCourse(TbTeacherCourse teacherCourse) {
		
		int result = teacherCourseMapper.insert(teacherCourse);
		
		return result;	
	}

}
