<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
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
	$(document).ready(function() {
		$(":button").click(function() {

			var json = SerializeToJson.formToJson($("form").serialize());

			$.ajaxSetup({
				contentType : 'application/json;charset=utf-8'
			});
			$.post('/signUp/regist', json, function(data) {
				if (data.status == 200) {
					alert("注册成功！");
					location.href = "/signIn/showPage";
				} else {
					alert("错误编号:" + data.status + "\n请稍后重试或联系站点管理员");
					location.href = "/signUp/showPage";
				}
			});
		});
	});
	/* var check = {
		inputcheck : function() {
			//不能为空检查
			if ($("#regName").val() == "") {
				alert("用户名不能为空");
				$("#regName").focus();
				return false;
			}
			if ($("#pwd").val() == "") {
				alert("密码不能为空");
				$("#pwd").focus();
				return false;
			}
			if ($("#phone").val() == "") {
				alert("手机号不能为空");
				$("#phone").focus();
				return false;
			}
			//密码检查
			if ($("#pwd").val() != $("#pwdRepeat").val()) {
				alert("确认密码和密码不一致，请重新输入！");
				$("#pwdRepeat").select();
				$("#pwdRepeat").focus();
				return false;
			}
			return true;
		}
	} */
</script>
</head>
<body>
	<div style="padding: 120px 600px 10px;">
		<form class="form-horizontal" role="form">
		    <p class="text-danger" align="center">教师身份验证信息确认</p><br>
			<div class="form-group">
				<label class="col-sm-2 control-label">教工编号</label>
				<div class="col-sm-10">
					<input class="form-control" id="disabledInput" type="text"
						value="${instructor.instructorId }" name="instructorId" readonly="readonly">
				</div>
			</div>
			<div class="form-group">
				<label class="col-sm-2 control-label">教师姓名</label>
				<div class="col-sm-10">
					<input class="form-control" id="disabledInput" type="text"
						value="${instructor.instructorName }" name="instructorName" readonly="readonly">
				</div>
			</div>
			<div class="form-group">
				<label class="col-sm-2 control-label">职称</label>
				<div class="col-sm-10">
					<input class="form-control" id="disabledInput" type="text"
						value="${instructor.instructorPlace }" name="instructorPlace" readonly="readonly">
				</div>
			</div>
			<div class="form-group">
				<label class="col-sm-2 control-label">年龄</label>
				<div class="col-sm-10">
					<input class="form-control" id="disabledInput" type="text"
						value="${instructor.instructorAge }" name="instructorAge" readonly="readonly">
				</div>
			</div>
			<div class="form-group">
				<label class="col-sm-2 control-label">电话号码</label>
				<div class="col-sm-10">
					<input class="form-control" id="disabledInput" type="text"
						value="${instructor.instructorTel }" name="instructorTel" readonly="readonly">
				</div>
			</div>
			<div class="form-group">
				<label class="col-sm-2 control-label">邮箱</label>
				<div class="col-sm-10">
					<input class="form-control" id="disabledInput" type="text"
						value="${instructor.instructorEmail }" name="instructorEmail" readonly="readonly">
				</div>
			</div>
			<br>
			<input type="button" id="teacherRegistBtn" value="确认无误？点我注册"
				class="btn btn-primary btn-sm btn-block">
		</form>
	</div>
</body>
</html>