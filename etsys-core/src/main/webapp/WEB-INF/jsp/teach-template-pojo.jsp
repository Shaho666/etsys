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
	    $("#commit").click(function() {
		    var json = "[";
		    $.ajaxSetup({
			    contentType : 'application/json;charset=utf-8'
		    });
		    $("form").each(function() {
			    var jsonUnit = SerializeToJson.formToJson($(this).serialize());
			    json += jsonUnit + ",";
		    });
		    json = json.substr(0,json.length - 1);
		    json += "]";
		    json = json.replace("{\"\"},", "");
		    
		    $.post('/template/insertTemplateEntry', json, function(data) {
			    if (data.status == 200) {
				    location.href = '/course/getByTeacherId?teacherId=' + "${sessionScope.teacher.teacherId }" + '&returnPage=teach-template';
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

		<jsp:include page="left-side-template.jsp"></jsp:include>

		<aside class="right-side"> <section class="content">
		<div id="con-center" class="row" style="margin-bottom: 5px;height:650px; overflow:auto">
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
			<!-- <div style="padding: 20px 200px 10px;">
				<button class="btn btn-primary btn-sm" data-toggle="modal"
					data-target="#myModal">创建试题模板</button>
				<button class="btn btn-primary btn-sm" data-toggle="modal"
					id="check">查看</button>
			</div> -->
			<div style="padding: 20px 200px 10px;">
				<c:forEach var="i" begin="1" end="5" varStatus="status">
					<form action="/template/test">
						<div class="panel panel-info">
							<div class="panel-heading">
								模板编号：<input name="temId" type="text" readonly="readonly"
									value="${template.temId }"> <br>
							</div>
							<div class="panel-body">
								试题类型: <select class="combobox" name="temType">
									<option value="1000">选择题</option>
									<option value="1001">填空题</option>
									<option value="1002">判断题</option>
									<option value="1003">简答题</option>
									<option value="1004">论述与分析题</option>
								</select><br> <br> 试题数量：<input type="text" name="temNum">
								<br> <br> 每题分值：<input type="text" name="temScore">
							</div>
						</div>
					</form>
				</c:forEach>
				<%-- <form action="/template/test">
					<div>
						<br> 模板编号：<input name="temId" type="text" readonly="readonly"
							value="${template.temId }"> <br> <br> 试题类型: <select
							class="combobox" name="temType">
							<option value="1000">选择题</option>
							<option value="1001">填空题</option>
							<option value="1002">判断题</option>
							<option value="1003">简答题</option>
							<option value="1004">论述与分析题</option>
						</select><br> <br> 试题数量：<input type="text" name="temNum">
						<br> <br> 每题分值：<input type="text" name="temScore">
					</div>
				</form> --%>
			</div>
			<div style="padding: 20px 200px 10px;">
				<button class="btn btn-primary btn-sm" id="commit">提交</button>
			</div>



			<div class="modal fade" id="myModal" tabindex="-1" role="dialog"
				aria-labelledby="myModalLabel" aria-hidden="true">
				<div class="modal-dialog">
					<div class="modal-content">
						<div class="modal-header">
							<button type="button" class="close" data-dismiss="modal"
								aria-hidden="true">&times;</button>
							<h4 class="modal-title" id="myModalLabel">创建模板项</h4>
						</div>
						<div id="item" class="modal-body">
							<br> 试题类型: <select class="combobox" name="temType">
								<option value="1000">选择题</option>
								<option value="1001">填空题</option>
								<option value="1002">判断题</option>
								<option value="1003">简答题</option>
								<option value="1004">论述与分析题</option>
							</select><br> <br> 试题数量：<input type="text" name="temNum">
							<br> <br> 每题分值：<input type="text" name="temScore">
							<div id="scores">
								<button type="button" id="score-add">添加分值项</button>
								<button type="button" id="score-del">删除分值项</button>
								<div id="score">
									<br> 题号<input type="text" name="no">分值<input
										type="text" name="unit"><br>
								</div>
							</div>
						</div>
						<div class="modal-footer">
							<button type="button" class="btn btn-default"
								data-dismiss="modal">关闭</button>
							<button type="button" class="btn btn-primary" id="add">提交更改</button>
						</div>
					</div>
					<!-- /.modal-content -->
				</div>
				<!-- /.modal -->
			</div>
		</div>
		</section> </aside>
	</div>
</body>
</html>