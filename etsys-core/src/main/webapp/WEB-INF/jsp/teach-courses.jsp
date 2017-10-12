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

		<jsp:include page="left-side.jsp"></jsp:include>

		<aside class="right-side"> <section class="content">
		<div id="con-center" class="row" style="margin-bottom: 5px;">
			<div style="padding: 20px 200px 10px;">
				<table name="course" class="table table-hover">
						<thead>
							<tr>
								<th>课程编号</th>
								<th>课程名称</th>
								<th>课程时长</th>
							</tr>
						</thead>
						<tbody>
							<c:forEach items="${courseList }" var="course">
								<tr>
									<td>${course.courseId }</td>
									<td>${course.courseName }</td>
									<td>${course.courseTime }</td>
								</tr>
							</c:forEach>
						</tbody>
					</table>
				<br>
			</div>
		</div>
		</section>
		<div style="padding: 0px 500px 10px;">
			<form action="/data-sync">
				<input class="btn btn-info btn-block" type="submit"
					value="数据有误？点我刷新">
			</form>
		</div>
		</aside>
		<!-- /.right-side -->

	</div>
</body>
</html>