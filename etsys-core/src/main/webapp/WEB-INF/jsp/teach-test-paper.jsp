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
		</tr>
		<c:forEach items="${courseList }" var="course">
			<td><a
				href="/testPaper/getTobeckecked">${course.courseId }</a></td>
			<td>${course.courseName }</td>
			<td>${course.courseTime }</td>
		</c:forEach>
	</table>
</body>
</html>