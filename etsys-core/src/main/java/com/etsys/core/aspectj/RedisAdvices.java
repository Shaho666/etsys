package com.etsys.core.aspectj;

import org.apache.commons.lang3.StringUtils;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.etsys.commons.utils.JsonUtils;
import com.etsys.core.dao.JedisClient;
import com.etsys.orm.pojo.TbQuestionBankWithBLOBs;

@Component
@Aspect
public class RedisAdvices {

	@Autowired
	private JedisClient jedisClient;

	@Around("execution(* com.etsys.core.service.QuestionBankService.getByCourseDegreeAndType(..))")
	public TbQuestionBankWithBLOBs around(ProceedingJoinPoint joinPoint) {

		TbQuestionBankWithBLOBs question = null;

		Object[] args = joinPoint.getArgs();
		StringBuilder strbuf = new StringBuilder();
		for (Object object : args) {
			strbuf.append(object.toString());
		}

		try {
			
			String json = jedisClient.get(strbuf.toString());
			
			if (!StringUtils.isBlank(json)) {
				question = JsonUtils.jsonToPojo(json, TbQuestionBankWithBLOBs.class);
				if (question != null) {
					return question;
				}
			}
			
		} catch (Exception e1) {
			e1.printStackTrace();
		}

		try {

			question = (TbQuestionBankWithBLOBs) joinPoint.proceed();

		} catch (Throwable e) {
			e.printStackTrace();
		}

		try {

			jedisClient.set(strbuf.toString(), JsonUtils.objectToJson(question));
			jedisClient.expire(strbuf.toString(), 600);

		} catch (Exception e) {
			e.printStackTrace();
		}

		return question;
	}

}
