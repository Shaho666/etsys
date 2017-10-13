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
<link href="/css/bootstrap-datetimepicker.min.css" rel="stylesheet"
	media="screen">
<script type="text/javascript" src="/js/jquery-2.1.1.js"></script>
<script type="text/javascript" src="/js/bootstrap.min.js"></script>
<script src="/js/jquery-ui-1.10.3.min.js" type="text/javascript"></script>
<script type="text/javascript" src="/js/commons.js"></script>
<script type="text/javascript" src="/js/bootstrap-datetimepicker.js"
	charset="UTF-8"></script>
<script type="text/javascript" src="/js/bootstrap-datetimepicker.fr.js"
	charset="UTF-8"></script>
<script type="text/javascript">
	$('.form_datetime').datetimepicker({
		//language:  'fr',
		weekStart : 1,
		todayBtn : 1,
		autoclose : 1,
		todayHighlight : 1,
		startView : 2,
		forceParse : 0,
		showMeridian : 1
	});
	$('.form_date').datetimepicker({
		language : 'fr',
		weekStart : 1,
		todayBtn : 1,
		autoclose : 1,
		todayHighlight : 1,
		startView : 2,
		minView : 2,
		forceParse : 0
	});
	$('.form_time').datetimepicker({
		language : 'fr',
		weekStart : 1,
		todayBtn : 1,
		autoclose : 1,
		todayHighlight : 1,
		startView : 1,
		minView : 0,
		maxView : 1,
		forceParse : 0
	});
	$(document).ready(function() {
		$("#create").click(function() {
			var json = SerializeToJson.formToJson($("form").serialize());
			json = json.replace("+", "T");
			alert(json)
			$.ajaxSetup({
				contentType : 'application/json;charset=utf-8'
			});
			$.post('/test/createTest', json, function(data) {
				if (data.status == 200) {
					alert("success")
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

		<jsp:include page="left-side-test-paper.jsp"></jsp:include>

		<aside class="right-side"> <section class="content">
		<div id="con-center" class="row"
			style="margin-bottom: 5px; height: 650px; overflow: auto">
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
				<form action="">
					<div class="panel panel-primary">
						<div class="panel-heading">发布考试信息</div>
						<div class="panel-body">
							选择模板：<select class="combobox" name="temId">
								<c:forEach items="${templates }" var="template">
									<option value="${template.temId }">${template.temId }</option>
								</c:forEach>
							</select><br> <br> 考试时间： <input name="created"
								value="2017-10-13 10:00:00"> <br> <br> 课程编号：<input
								name="courseId" type="text" value="${course.courseId }"
								readonly="readonly"><br> <br> 教师编号：<input
								name="teacherId" type="text"
								value="${sessionScope.teacher.teacherId }"><br> <br>
						</div>
					</div>
				</form>
				<br>
				<button id="create" class="btn btn-success btn-sm">提交</button>
			</div>

		</div>
		</section> </aside>
	</div>
</body>
</html>