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
		$(":button").click(function() {
			var json = SerializeToJson.formToJson($("form").serialize());
			$.ajaxSetup({
				contentType : 'application/json;charset=utf-8'
			});
			$.post('/questionBank/insertBankEntry', json, function(data) {
				if (data.status == 200) {
					location.href = '/questionBank/getBankByCourse/' + "${course.courseId }";
				} else {
					
				}
			});
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
				<p class="text-danger">添加考试模板，该门课程信息如下：</p>
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
				<form action="/template/test">
					<div>
						<br> 题目类型: <select class="combobox" name="queType">
							<option value="1000">选择题</option>
							<option value="1001">填空题</option>
							<option value="1002">判断题</option>
							<option value="1003">简答题</option>
							<option value="1004">论述与分析题</option>
						</select><br> <br> 题目难度: <select class="combobox"
							name="queDegree">
							<option value="1">简单</option>
							<option value="2">较简单</option>
							<option value="3">中等</option>
							<option value="4">较难</option>
							<option value="5">难</option>
						</select><br> <br> 课程编号： <input type="text" readonly="readonly"
							value="${course.courseId }" name="courseId"> <br> <br> 题干描述：
						<textarea rows="5" cols="100" name="queContent"></textarea>
						<br> <br> 答案描述：
						<textarea rows="5" cols="100" name="queAnswer"></textarea>
					</div>
				</form>
			</div>
			<div style="padding: 20px 200px 10px;">
				<button class="btn btn-primary btn-sm">提交</button>
			</div>
		</div>
		</section> </aside>
	</div>
</body>
</html>