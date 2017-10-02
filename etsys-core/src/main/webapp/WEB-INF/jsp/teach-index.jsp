<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="/js/jquery-1.7.min.js"></script>
<script type="text/javascript" src="/js/jquery.cookie.js"></script>
<script type="text/javascript" src="/js/jquery.params.js"></script>
</head>
<body>
<h1>welcome to etsys</h1>
<h1>${sessionScope.teacher }</h1><br>
教师id:${sessionScope.teacher.teacherId }<br>
教师姓名:${sessionScope.teacher.teacherName }<br>
<a href="/course/getByTeacherId?teacherId=${sessionScope.teacher.teacherId }&returnPage=teach-courses">我的课程</a><br>
<a href="/course/getByTeacherId?teacherId=${sessionScope.teacher.teacherId }&returnPage=teach-stus">我的学生</a><br>
<a href="/course/getByTeacherId?teacherId=${sessionScope.teacher.teacherId }&returnPage=teach-template">我的模板</a><br>
<a href="/course/getByTeacherId?teacherId=${sessionScope.teacher.teacherId }&returnPage=teach-stu-score">学生成绩</a><br>
<a href="/course/getByTeacherId?teacherId=${sessionScope.teacher.teacherId }&returnPage=teach-test-paper">批改试卷</a><br>
<a href="/course/getByTeacherId?teacherId=${sessionScope.teacher.teacherId }&returnPage=teach-ques-bank">题库设置</a><br>
</body>
</html>