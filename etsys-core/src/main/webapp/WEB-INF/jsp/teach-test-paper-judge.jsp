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
	$(document).ready(
			function() {
				$("#finish").click(
						function() {
							$.ajaxSetup({
								contentType : 'application/json;charset=utf-8'
							});

							var flag = true;

							var stuId = "${studentId}";
							var courseId = "${courseId}";
							var testId = "${testId}";

							var jsonBlank = SerializeToJson.serializeScore(
									testId, stuId, 1001, "#blank form");
							var jsonDesc = SerializeToJson.serializeScore(
									testId, stuId, 1003, "#desc form");
							var jsonProc = SerializeToJson.serializeScore(
									testId, stuId, 1004, "#proc form");

							$.post('/score/insertScore',
									jsonBlank, function(data) {
										if (data.status != 200) {
											flag = false;
										}
									});
							$.post('/score/insertScore',
									jsonDesc, function(data) {
										if (data.status != 200) {
											flag = false;
										}
									});
							$.post('/score/insertScore',
									jsonProc, function(data) {
										if (data.status != 200) {
											flag = false;
										}
									});
							
							if (flag == true) {
								alert("批改成功！")
								location.href = '/test/getByTeacherId?teacherId=${sessionScope.teacher.teacherId}&courseId=${courseId}&returnPage=teach-test-detail-judge';
							}

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
			style="margin-bottom: 5px; height: 650px; overflow: auto;">
			<div style="padding: 20px 200px 10px;">
				<p>填空题</p>
				<div id="blank">
					<c:if test="${not empty quesList1001 }">
					    <c:forEach items="${quesList1001 }" var="question">
						    <label>得分：</label>
						    <form action="">
							    <select name="count">
								    <c:forEach var="i" begin="0" end="${tp1001 }" varStatus="status">
									    <option value="${status.index }">${status.index }</option>
								    </c:forEach>
							    </select>（本题满分：${tp1001 }）
						    </form>
						    <p>题目描述：${question.queContent }</p>
						    <p>参考答案：${question.queAnswer }</p>
						    <p>学生答案：${question.stuAnswer }</p>
						    <br>
					    </c:forEach>
					</c:if>
					<c:if test="${empty quesList1001 }">填空题批改完成</c:if>
				</div>
				<br>
				<p>简答题</p>
				<div id="desc">
					<c:if test="${not empty quesList1003 }">
					    <c:forEach items="${quesList1003 }" var="question">
						    <label>得分：</label>
						        <form action="">
							    <select name="count">
								    <c:forEach var="i" begin="0" end="${tp1003 }" varStatus="status">
									    <option value="${status.index }">${status.index }</option>
								    </c:forEach>
							    </select>（本题满分：${tp1003 }）
						    </form>
						    <p>题目描述：${question.queContent }</p>
						    <p>参考答案：${question.queAnswer }</p>
						    <p>学生答案：${question.stuAnswer }</p>
						    <br>
					    </c:forEach>
					</c:if>
					<c:if test="${empty quesList1003 }">简答题批改完成</c:if>
				</div>
				<br>
				<p>论述与分析题</p>
				<div id="proc">
					<c:if test="${not empty quesList1004 }">
					    <c:forEach items="${quesList1004 }" var="question">
						    <label>得分：</label>
						    <form action="">
							    <select name="count">
								    <c:forEach var="i" begin="0" end="${tp1004 }" varStatus="status">
									    <option value="${status.index }">${status.index }</option>
								    </c:forEach>
							    </select>（本题满分：${tp1004 }）
						    </form>
						    <p>题目描述：${question.queContent }</p>
						    <p>参考答案：${question.queAnswer }</p>
						    <p>学生答案：${question.stuAnswer }</p>
						    <br>
					    </c:forEach>
					</c:if>
					<c:if test="${empty quesList1004 }">分析与论述题批改完成</c:if>
				</div>
			</div>
			<div align="center" style="padding: 20px 200px 10px;">
				<c:if test="${not empty quesList1004 }"><button id="finish">确认提交批改</button></c:if>
			</div>
		</div>
		</section> </aside>
		<!-- /.right-side -->

	</div>
</body>
</html>