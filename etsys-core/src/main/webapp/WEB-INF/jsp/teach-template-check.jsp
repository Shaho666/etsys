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
</head>
<body class="skin-black">
	<jsp:include page="up-side.jsp"></jsp:include>
	<div class="wrapper row-offcanvas row-offcanvas-left">

		<jsp:include page="left-side-template.jsp"></jsp:include>

		<aside class="right-side"> <section class="content">
		<div id="con-center" class="row" style="margin-bottom: 5px;height:650px; overflow:auto">
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
				<p class="text-danger">该门课程的试题模板信息如下：</p>
				<table class="table table-hover">
					<thead>
						<tr class="warning">
							<th>模板编号</th>
							<th>课程编号</th>
							<th>教师编号</th>
							<th>创建时间</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${templates }" var="template">
							<tr class="success">
								<td><a href="/template/getByTemplateId/${template.temId }">${template.temId }</a></td>
								<td>${template.courseId }</td>
								<td>${template.teacherId }</td>
								<td><fmt:formatDate value="${template.created }"/></td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</div>

			<%-- <div style="padding: 20px 200px 10px;">
				<form action="/template/test">
					<div>
						<br> 模板编号：<input name="temId" type="text" readonly="readonly"
							value="${template.temId }"> <br><br> 试题类型: <select
							class="combobox" name="temType">
							<option value="1000">选择题</option>
							<option value="1001">填空题</option>
							<option value="1002">判断题</option>
							<option value="1003">简答题</option>
							<option value="1004">论述与分析题</option>
						</select><br> <br> 试题数量：<input type="text" name="temNum">
						<br> <br> 每题分值：<input type="text" name="temScore">
					</div>
				</form>
			</div> --%>


		</div>
		</section> </aside>
	</div>
</body>
</html>