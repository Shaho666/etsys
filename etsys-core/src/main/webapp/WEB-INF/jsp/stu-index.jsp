<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>${sessionScope.student }</h1>
<h1>学生id:${sessionScope.student.stuId }</h1>
<a href="/course/getByStudentId?studentId=${sessionScope.student.stuId }&returnPage=stu-courses">我的课程</a><br>
<a href="/course/getByStudentId?studentId=${sessionScope.student.stuId }&returnPage=stu-test">我的考试信息</a><br>
<a href="/course/getByStudentId?studentId=${sessionScope.student.stuId }&returnPage=stu-score">成绩查询</a><br>
</body>
</html>