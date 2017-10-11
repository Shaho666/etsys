<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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
<script type="text/javascript">
	$(document).ready(function() {
		$(":button").click(function() {
			$(":button").attr({"disabled":"disabled"});
			$.get('/teacherCourse/sync', function(data) {
				alert("更新成功！");
				$(":button").removeAttr("disabled");
			});
		});
	});
</script>
</head>
<body class="skin-black">
	<jsp:include page="up-side.jsp"></jsp:include>
	<div class="wrapper row-offcanvas row-offcanvas-left">
		<jsp:include page="left-side.jsp"></jsp:include>
		<aside class="right-side"> <section class="content">
		<div id="con-center" class="row" style="margin-bottom: 5px;">
			<div style="padding: 80px 300px 10px;">
				<p class="text-muted">如果您认为现有数据和实际情况不相符，请点击下面的按钮重新加载。</p>
				<p class="text-muted">加载数据过程中可能时间较长，请耐心等待，谢谢！</p>
				<div style="padding: 50px 500px 20px 0px;">
					<form action="/teacherCourse/sync">
						<input class="btn btn-sm btn-success btn-block" type="button"
							value="数据有误？点我刷新">
					</form>
				</div>
			</div>
		</div>
		</section> </aside>
	</div>
</body>
</html>