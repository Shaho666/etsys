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
		<div id="con-center" class="row"
			style="margin-bottom: 5px; height: 650px; overflow: auto">
			<div style="padding: 20px 200px 10px;">
				<table class="table table-hover">
					<thead>
						<tr class="warning">
							<th>题型</th>
							<th>得分</th>
						</tr>
					</thead>
					<c:set var="mark" value="0.0"></c:set>
					<tbody>
						<c:forEach items="${scores }" var="score">
							<tr class="success">

								<td><c:if test="${score.scoType == 1000 }">选择题</c:if>
								<c:if test="${score.scoType == 1001 }">填空题</c:if>
								<c:if test="${score.scoType == 1002 }">判断题</c:if>
								<c:if test="${score.scoType == 1003 }">简答题</c:if>
								<c:if test="${score.scoType == 1004 }">分析与论述题</c:if></td>
								<td>${score.scoMark }</td>

							</tr>
						</c:forEach>
					</tbody>
				</table>
				<br>
			</div>

		</div>
		</section>
		
		</aside>
		<!-- /.right-side -->

	</div>
</body>
</html>