package com.etsys.core.service.impl;

import java.util.Hashtable;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.etsys.commons.pojo.JsonResult;
import com.etsys.commons.utils.HttpClientUtil;
import com.etsys.commons.utils.JsonUtils;
import com.etsys.core.pojo.Instructor;
import com.etsys.core.service.SignUpService;

@Service
public class SignUpServiceImpl implements SignUpService {

	@Value("${EDUCATION_ADMIN_BASE_URL}")
	private String EDUCATION_ADMIN_BASE_URL;

	@Value("${EDUCATION_ADMIN_INSTRUCTOR_URL}")
	private String EDUCATION_ADMIN_INSTRUCTOR_URL;
	
	@Override
	public Instructor getInstructor(String instructorId, String instructorPassword) {

		Map<String, String> param = new Hashtable<String, String>();
		param.put("instructorId", instructorId);
		param.put("instructorPassword", instructorPassword);

		String json = HttpClientUtil.doPost(EDUCATION_ADMIN_BASE_URL + EDUCATION_ADMIN_INSTRUCTOR_URL, param);

		if (!StringUtils.isBlank(json)) {

			JsonResult result = JsonResult.format(json);
			String jsonData = (String) result.getData();

			Instructor instructor = JsonUtils.jsonToPojo(jsonData, Instructor.class);

			return instructor;
		}

		return null;
	}

}
