<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	${sessionScope.teacher }
	<table border="1">
		<tr>
			<td>课程编号</td>
			<td>课程名称</td>
			<td>课程时长</td>
			<td>操作</td>
		</tr>
		<c:forEach items="${courseList }" var="course">
			<tr>
				<td><a
					href="/template/getByTeacherAndCourse?teacherId=${sessionScope.teacher.teacherId }&courseId=${course.courseId }">${course.courseId }</a></td>
				<td>${course.courseName }</td>
				<td>${course.courseTime }</td>
				<td><a href="#">修改</a><a href="#">删除</a></td>
			</tr>
		</c:forEach>
	</table>
	<br>
	<h5>创建模板</h5>
	...
	<h5>创建模板</h5>
</body>
</html>