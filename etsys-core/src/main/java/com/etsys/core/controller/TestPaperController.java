package com.etsys.core.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.etsys.commons.pojo.JsonResult;
import com.etsys.commons.utils.ExceptionUtil;
import com.etsys.core.service.ScoreService;
import com.etsys.core.service.TestPaperService;
import com.etsys.core.utils.TestPaperUtils;
import com.etsys.orm.pojo.TbTestPaper;

@Controller
@RequestMapping("/testPaper")
public class TestPaperController {

	@Autowired
	private TestPaperService testPaperService;

	@Autowired
	private ScoreService scoreService;

	@RequestMapping("/getChecked")
	public String getPaperCheckedBy(@RequestParam("courseId") String courseId,
			@RequestParam("studentId") String studentId, @RequestParam("returnPage") String returnPage,
			ModelMap modelMap) {

		List<TbTestPaper> list = testPaperService.getByCourseAndStudent(courseId, studentId);
		modelMap.put("testPaper", list.get(0));

		return returnPage;
	}

	@RequestMapping("/check")
	public JsonResult checkPaper(@RequestBody TbTestPaper testPaper) {

		try {

			/* 在此处填入合适的代码 */

			return JsonResult.ok();

		} catch (Exception e) {
			e.printStackTrace();
			return JsonResult.build(500, ExceptionUtil.getStackTrace(e));
		}
	}

	@RequestMapping("/generate")
	public String generateTestPaper(@RequestParam("studentId") String studentId,
			@RequestParam("courseId") String courseId) {

		TbTestPaper testPaper = TestPaperUtils.generateTestPaper(null);

		/* 在此处填入合适的代码 */

		return "stu-test";
	}

}
