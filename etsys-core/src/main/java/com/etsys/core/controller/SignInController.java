package com.etsys.core.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.etsys.commons.pojo.JsonResult;
import com.etsys.commons.utils.ExceptionUtil;
import com.etsys.core.service.SignInService;
import com.etsys.orm.pojo.TbStudent;
import com.etsys.orm.pojo.TbTeacher;

/**
 * 登录功能 前端控制器
 * 
 * @author Administrator
 *
 */
@Controller
@RequestMapping("/signIn")
public class SignInController {

	@Autowired
	private SignInService singInService;

	@RequestMapping("/showPage")
	public String showSignInPage() {

		return "sign-in";
	}

	@RequestMapping("/showStuPage")
	public String showStuSignInPage() {

		return "stu-sign-in";
	}

	@RequestMapping("/showStuPrePage")
	public String showStudentPre() {

		return "stu-pre";
	}

	@RequestMapping("/showTeacherIndex")
	public String showTeacherIndex() {

		return "teach-index";
	}

	@RequestMapping("/showStuIndex")
	public String showStuIndex() {

		return "stu-index";
	}

	@RequestMapping("/stuSignIn")
	@ResponseBody
	public JsonResult studentSignIn(@RequestBody TbStudent student) {

		return JsonResult.ok();
	}

	@RequestMapping(value = "/teacherSignIn", method = RequestMethod.POST)
	@ResponseBody
	public JsonResult teacherSignIn(@RequestBody TbTeacher teach, HttpSession session) {

		try {

			TbTeacher teacher = singInService.teacherSignIn(teach.getTeacherId(), teach.getTeacherPassword());
			if (teacher == null) {
				throw new Exception();
			}

			session.setAttribute("teacher", teacher);

		} catch (Exception e) {
			e.printStackTrace();
			return JsonResult.build(500, ExceptionUtil.getStackTrace(e));
		}

		return JsonResult.ok();
	}

	@RequestMapping(value = "/studentSignIn", method = RequestMethod.POST)
	@ResponseBody
	public JsonResult studentSignIn(@RequestBody TbStudent student, HttpSession session) {

		try {
			
			TbStudent tbStudent = singInService.studentSignIn(student.getStuId(), student.getStuPassword());
			if (tbStudent == null) {
				throw new Exception();
			}

			session.setAttribute("student", tbStudent);

		} catch (Exception e) {
			e.printStackTrace();
			return JsonResult.build(500, ExceptionUtil.getStackTrace(e));
		}

		return JsonResult.ok();
	}

}
