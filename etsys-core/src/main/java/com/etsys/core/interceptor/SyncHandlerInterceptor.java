package com.etsys.core.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.etsys.core.service.TeacherCourseService;
import com.etsys.orm.pojo.TbTeacher;

public class SyncHandlerInterceptor implements HandlerInterceptor {

	@Autowired
	private TeacherCourseService teacherCourseService;

	@Override
	public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {

	}

	@Override
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3)
			throws Exception {

		TbTeacher teacher = (TbTeacher) arg0.getSession().getAttribute("teacher");
		String teacherId = teacher.getTeacherId();
		
		teacherCourseService.syncRecords(teacherId);

	}

	@Override
	public boolean preHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2) throws Exception {

		return true;
	}

}
