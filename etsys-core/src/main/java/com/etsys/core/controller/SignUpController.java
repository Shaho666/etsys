package com.etsys.core.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.util.DigestUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.etsys.commons.pojo.JsonResult;
import com.etsys.commons.utils.ExceptionUtil;
import com.etsys.core.entity.Instructor;
import com.etsys.core.service.SignUpService;
import com.etsys.core.service.TeacherService;
import com.etsys.orm.pojo.TbTeacher;

/**
 * 注册功能 前端控制器
 * 
 * @author Administrator
 *
 */
@Controller
@RequestMapping("/signUp")
public class SignUpController {

	@Autowired
	private SignUpService singUpService;

	@Autowired
	private TeacherService teacherService;
	
	@RequestMapping("/showPage")
	public String showSignUpPage() {

		return "sign-up";
	}

	@RequestMapping("/showTeacherPrePage")
	public String showTeachPre() {
		
		return "teach-pre";
	}
	
	@RequestMapping(value = "/validate", method = RequestMethod.POST)
	public String validateTeacher(@RequestParam("teacherId") String teacherId,
			@RequestParam("password") String password, ModelMap modelMap) {

		Instructor instructor = singUpService.getInstructor(teacherId, password);
		modelMap.put("instructor", instructor);

		return "sign-up-check";
	}

	@RequestMapping(value = "/regist", method = RequestMethod.POST)
	@ResponseBody
	public JsonResult registTeacher(@RequestBody Instructor instructor) {

		try {
			
			TbTeacher teacher = new TbTeacher();
			teacher.setTeacherId(instructor.getInstructorId());
			teacher.setTeacherName(instructor.getInstructorName());
			teacher.setTeacherPassword(DigestUtils.md5DigestAsHex(instructor.getInstructorId().getBytes()));

			teacherService.insertTbTeacher(teacher);
			
			return JsonResult.ok();
			
		} catch (Exception e) {
			e.printStackTrace();
			return JsonResult.build(500, ExceptionUtil.getStackTrace(e));
		}
	}

}
