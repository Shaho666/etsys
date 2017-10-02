<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="/css/bootstrap.min.css">
<script type="text/javascript" src="/js/jquery-1.7.min.js"></script>
<script type="text/javascript" src="bootstrap.min.js"></script>
<script type="text/javascript" src="/js/commons.js"></script>
<script type="text/javascript">
	$(function() {
		$("#submitBtn .input").click(function() {
			$(this).button('loading').delay(1000).queue(function() {
			});
		});
	});
</script>
</head>
<body>
	<div style="padding: 200px 600px 10px;">
		<form action="/signUp/validate/" method="post"
			class="bs-example bs-example-form" role="form">
			<h4 align="center">注册</h4>
			<div class="input-group">
				<span class="input-group-addon">用户名</span> <input id="teacherId"
					name="teacherId" type="text" value="ins133373359"
					class="form-control" placeholder="twitterhandle" />
			</div>
			<br>
			<div class="input-group">
				<span class="input-group-addon">密码</span> <input id="password"
					name="password" type="password" value="123456" class="form-control"
					placeholder="twitterhandle" />
			</div>
			<br> <br>
			<div id="submitBtn">
				<input class="btn btn-success btn-sm btn-block"
					data-loading-text="Loading..." type="submit" value="验证" />
			</div>
		</form>
	</div>
</body>
</html>