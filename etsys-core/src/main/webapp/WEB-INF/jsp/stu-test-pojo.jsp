<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
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
<script type="text/javascript" src="/js/commons.js"></script>
<script type="text/javascript">
	$(document).ready(function() {
		$("#finish").click(function() {
			$.ajaxSetup({
			    contentType : 'application/json;charset=utf-8'
		    });
			var content = "[";
			$("#select form").each(function() {
				var jsonUnit = SerializeToJson.formToJson($(this).serialize());
				content += jsonUnit + ",";
			});
			content = content.substr(0, content.length - 1);
			content += "]";
			var json = {};
			json.tpId = 0;
			json.tpType = 1000;
			json.tpState = 2;
			json.stuId = "${sessionScope.student.stuId}";
			json.courseId = "${courseId}";
			json.testId = "${testId}";
			json.tpContent = content;
			json = JSON.stringify(json);
			$.post('/testPaper/submitPaper', json, function(data) {
				if (data.status == 200) {
					alert("success");
				}
			});
		});
	});
</script>
</head>
<body class="skin-black">
	<jsp:include page="up-side.jsp"></jsp:include>
	<div class="wrapper row-offcanvas row-offcanvas-left">

		<jsp:include page="stu-left-side.jsp"></jsp:include>

		<aside class="right-side"> <section class="content">
		<div id="con-center" class="row"
			style="margin-bottom: 5px; height: 650px; overflow: auto;">
			<div style="padding: 20px 200px 10px;">
				<p>选择题</p>
				<div id="select">
					<c:forEach items="${quesList1000 }" var="question" begin="0"
						end="${fn:length(quesList1000) - 1 }" varStatus="status">
						<form action="">
							<input name="questionId" type="hidden" value="${question.queId }">
							<select name="content">
								<option></option>
								<option>A</option>
								<option>B</option>
								<option>C</option>
								<option>D</option>
							</select>
						</form>
						<br>
				    ${question.queContent }
				    <br>
					</c:forEach>
				</div>
				<br>
				<p>填空题</p>
				<c:forEach items="${quesList1001 }" var="question">
				    ${question.queContent }<br>
					<input type="text" name="blank">
					<br>
				</c:forEach>
				<br>
				<p>判断题</p>
				<c:forEach items="${quesList1002 }" var="question">
					<select name="judge">
						<option></option>
						<option value="1">对</option>
						<option value="0">错</option>
					</select>
					<br>
				    ${question.queContent }<br>
				</c:forEach>
				<br>
				<p>简答题</p>
				<c:forEach items="${quesList1003 }" var="question">
				    ${question.queContent }<br>
					<textarea name="desc" rows="5" cols="80"></textarea>
					<br>
				</c:forEach>
				<br>
				<p>论述与分析题</p>
				<c:forEach items="${quesList1004 }" var="question">
				    ${question.queContent }<br>
					<textarea name="proc" rows="5" cols="80"></textarea>
					<br>
				</c:forEach>
			</div>
			<div align="center" style="padding: 20px 200px 10px;">
				<button id="finish">提交试卷</button>
			</div>
		</div>
		</section> </aside>
		<!-- /.right-side -->

	</div>
</body>
</html>