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
<script src="/js/jquery-ui-1.10.3.min.js"></script>
</head>
<body class="skin-black">
	<jsp:include page="up-side.jsp"></jsp:include>
	<div class="wrapper row-offcanvas row-offcanvas-left">

		<jsp:include page="stu-left-side.jsp"></jsp:include>

		<aside class="right-side"> <section class="content">
		<div id="con-center" class="row" style="margin-bottom: 5px;">
			<div style="padding: 20px 200px 10px;">
				<table class="table table-hover">
					<thead>
						<tr class="danger">
							<td>考试时间</td>
							<td>课程名称</td>
							<td>任课教师</td>
							<td>操作</td>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${tests }" var="test">
							<tr class="success">
								<td><fmt:formatDate value="${test.created }" type="both" /></td>
								<td>${test.courseId }</td>
								<td>${test.teacherId }</td>
								<td><a
									href="/testPaper/generate?testId=${test.testId }">进入考试</a></td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</div>
		</div>
		</section> </aside>
		<!-- /.right-side -->

	</div>
</body>
</html>