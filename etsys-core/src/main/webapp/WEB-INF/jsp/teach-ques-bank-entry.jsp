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
<script type="text/javascript" src="/js/commons.js"></script>
<script type="text/javascript">
	$(document).ready(function() {
		$("#add").click(function() {
			
		});
	});
</script>
</head>
<body class="skin-black">
	<jsp:include page="up-side.jsp"></jsp:include>
	<div class="wrapper row-offcanvas row-offcanvas-left">

		<jsp:include page="left-side-ques-bank.jsp"></jsp:include>

		<aside class="right-side"> <section class="content">
		<div id="con-center" class="row" style="margin-bottom: 5px;">
			<div style="padding: 20px 200px 10px;">
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
			<div style="padding: 20px 200px 10px;">
				<a href="/questionBank/showPojoPage/${course.courseId }" class="btn btn-primary btn-sm">增加题目</a>
			</div>
			<div style="padding: 20px 200px 10px;">
				<p class="text-danger">该门课程的题库信息如下：</p>
				<table class="table table-hover">
					<thead>
						<tr class="warning">
							<th>题目编号</th>
							<th>题目类型</th>
							<th>题目难度</th>
							<th>题目状态</th>
							<th>课程编号</th>
							<th>题目内容</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${questionBank }" var="entry">
						    <tr class="success">
						        <td>${entry.queId }</td>
						        <td>${entry.queType }</td>
						        <td>${entry.queDegree }</td>
						        <td>${entry.queState }</td>
						        <td>${entry.courseId }</td>
						        <td><a href="#">查看</a></td>
						    </tr>
						</c:forEach>
					</tbody>
				</table>
			</div>
			
		</div>
		</section> </aside>
	</div>
</body>
</html>