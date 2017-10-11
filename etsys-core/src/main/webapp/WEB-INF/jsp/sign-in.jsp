<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="/css/bootstrap.min.css">
<script type="text/javascript" src="/js/jquery-2.1.1.js"></script>
<script type="text/javascript" src="/js/bootstrap.min.js"></script>
<script type="text/javascript" src="/js/commons.js"></script>
<script type="text/javascript">
	$(document).ready(function() {
		$(":button").click(function() {

			var json = SerializeToJson.formToJson($("form").serialize());

			$.ajaxSetup({
				contentType : 'application/json;charset=utf-8'
			});
			$.post('/signIn/teacherSignIn', json, function(data) {
				if (data.status == 200) {
					location.href = "/signIn/showTeacherIndex";
				} else {
					alert("错误编号:" + data.status + "\n请稍后重试或联系站点管理员")
				}
			});
		});
	});
</script>
</head>
<body>
	<div style="padding: 200px 600px 10px;">
		<form action="/signIn/teacherSignIn" method="post"
			class="bs-example bs-example-form" role="form">
			<h4 align="center">登录</h4>
			<div class="input-group">
				<span class="input-group-addon">登录用户名</span> <input name="teacherId"
					type="text" value="ins315927474" class="form-control"
					placeholder="twitterhandle" />
			</div>
			<br>
			<div class="input-group">
				<span class="input-group-addon">登录密码</span> <input name="teacherPassword"
					type="password" value="ins315927474" class="form-control"
					placeholder="twitterhandle" />
			</div>
			<br>
			<br>
			<div id="submitBtn">
				<input class="btn btn-success btn-sm btn-block" type="button"
					value="点我登录" />
			</div>
		</form>
	</div>
</body>
</html>