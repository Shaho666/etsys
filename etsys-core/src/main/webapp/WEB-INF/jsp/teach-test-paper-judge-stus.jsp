<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link href="/css/bootstrap.min.css" rel="stylesheet">
<link href="/css/font-awesome.css" rel="stylesheet">
<link href="/css/style.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="/js/jquery-2.1.1.js"></script>
<script type="text/javascript" src="/js/bootstrap.min.js"></script>
<script src="/js/jquery-ui-1.10.3.min.js" type="text/javascript"></script>
</head>
<body class="skin-black">

	<jsp:include page="up-side.jsp"></jsp:include>
	<div class="wrapper row-offcanvas row-offcanvas-left">

		<jsp:include page="left-side-test-paper.jsp"></jsp:include>

		<aside class="right-side"> <section class="content">
		<div id="con-center" class="row"
			style="margin-bottom: 5px; height: 650px; overflow: auto">
			<div style="padding: 0px 200px 10px;">
				<p class="text-danger">该门课程信息如下：</p>
				<table class="table table-hover">
					<thead>
						<tr class="warning">
							<th>课程编号</th>
							<th>课程名称</th>
							<th>课程时长</th>
						</tr>
					</thead>
					<tbody>
						<tr class="success">
							<td>${course.courseId }</td>
							<td>${course.courseName }</td>
							<td>${course.courseTime }</td>
						</tr>
					</tbody>
				</table>
			</div>
			<!-- <div style="padding: 0px 200px 10px;" align="left">
				<form action="/data-sync">
					<input class="btn btn-primary btn-sm" type="submit"
						value="数据有误？点我刷新">
				</form>
			</div> -->
			<div style="padding: 20px 200px 10px;">
				<p class="text-danger">该门考试信息如下：</p>
				<table class="table table-hover">
					<thead>
						<tr class="warning">
							<th>考试编号</th>
							<th>考试时间</th>
							<th>课程编号</th>
							<th>教师编号</th>
							<th>模板引用</th>
						</tr>
					</thead>
					<tbody>
						<tr class="success">
							<td><a href="#">${test.testId }</a></td>
							<td><fmt:formatDate value="${test.created }" type="both" /></td>
							<td>${test.courseId }</td>
							<td>${test.teacherId }</td>
							<td>${test.templateId }</td>
						</tr>
					</tbody>
				</table>
				<br>
			</div>
			<div style="padding: 0px 200px 10px;">
				<table class="table table-hover">
					<thead>
						<tr>
							<th>学生编号</th>
							<th>学生姓名</th>
							<th>所在班级</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${students }" var="student">
							<tr>
								<td><a
									href="/testPaper/checkPaper?studentId=${student.stuId }&courseId=${course.courseId }&testId=${test.testId }&state=2">${student.stuId }</a></td>
								<td>${student.stuName }</td>
								<td>${student.stuClass }</td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
				<br>
				<%-- <div align="center">
					<ul class="pagination">
					    
						<li><a href="#">&laquo;</a></li>
						<c:forEach var="i" begin="1" end="${total / 10 }"
							varStatus="status">
							<li><a
								href="/student/getByCourseAndTeacher?teacherId=${sessionScope.teacher.teacherId }&courseId=${course.courseId }&returnPage=teach-stus-check&pageNum=${status.count}">${status.count}</a></li>
						</c:forEach>
						<li><a href="#">&raquo;</a></li>
					</ul>
				</div> --%>
				<br>
			</div>
		</div>
		</section> </aside>
		<!-- /.right-side -->

	</div>
</body>
</html>