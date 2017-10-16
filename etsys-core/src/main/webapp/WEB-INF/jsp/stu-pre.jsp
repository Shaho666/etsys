<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link href="/css/bootstrap.min.css" rel="stylesheet">
<link href="/css/animate.min.css" rel="stylesheet">
<link href="/css/font-awesome.min.css" rel="stylesheet">
<link href="/css/lightbox.css" rel="stylesheet">
<link href="/css/main.css" rel="stylesheet">
<link id="css-preset" href="/css/preset1.css" rel="stylesheet">
<link href="/css/responsive.css" rel="stylesheet">
<script type="text/javascript" src="/js/jquery-1.7.min.js"></script>
<script type="text/javascript" src="/js/bootstrap.min.js"></script>
<script type="text/javascript" src="/js/jquery.inview.min.js"></script>
<script type="text/javascript" src="/js/wow.min.js"></script>
<script type="text/javascript" src="/js/mousescroll.js"></script>
<script type="text/javascript" src="/js/smoothscroll.js"></script>
<script type="text/javascript" src="/js/jquery.countTo.js"></script>
<script type="text/javascript" src="/js/lightbox.min.js"></script>
<script type="text/javascript" src="/js/main.js"></script>
</head>
<body>

    <jsp:include page="header.jsp"></jsp:include>

	<!--/#home-->
	<section id="services">
	<div class="container">
		<div class="heading wow fadeInUp" data-wow-duration="1000ms"
			data-wow-delay="300ms">
			<div class="row">
				<div class="text-center col-sm-8 col-sm-offset-2">
					<h2>欢迎来到etsys在线考试一站式服务</h2>
					<p>本站长期致力于为各大高校提供在线测试系统，只在为创造更快捷/更高效/更方便的在线测试环境，保证数据的安全和稳定传输。
						相比传统的体系结构而言，本站更加侧重于上百人同时上机测试时性能优化的解决方案设计。</p>
					<br>
					<div id="entrance" style="padding: 0px 130px 10px;">
						<a class="btn btn-success btn-sm" href="/signIn/showStuPage/">点我登录，查询最新考试信息</a>
					</div>
				</div>
			</div>
		</div>
		
		<div class="text-center our-services">
			<div class="row">
				<div class="col-sm-4 wow fadeInDown" data-wow-duration="1000ms"
					data-wow-delay="300ms">
					<div class="service-icon">
						<div style="padding: 27px 0px 0px 0px;"><i class="fa fa-calendar"></i></div>
					</div>
					<div class="service-info">
						<h3>教师学生管理</h3>
						<p>教师提供教职工账号，结合本校教务系统的数据进行验证，方可注册入本系统。学生信息可由教师导入。</p>
					</div>
				</div>
				<div class="col-sm-4 wow fadeInDown" data-wow-duration="1000ms"
					data-wow-delay="450ms">
					<div class="service-icon">
						<div style="padding: 27px 0px 0px 0px;"><i class="fa fa-umbrella"></i></div>
					</div>
					<div class="service-info">
						<h3>在线考试模板</h3>
						<p>教师可根据实际情况，为每一次考试生成试题模板，包括题目难度/数量/种类/分值，可多次重复使用。</p>
					</div>
				</div>
				<div class="col-sm-4 wow fadeInDown" data-wow-duration="1000ms"
					data-wow-delay="550ms">
					<div class="service-icon">
					    <div style="padding: 27px 0px 0px 0px;"><i class="fa fa-cloud"></i></div>
						
					</div>
					<div class="service-info">
						<h3>试题难度设定</h3>
						<p>创建试题模板时，系统可根据要求的难度来自动生成试卷，参照每小题的难度系数来完成。</p>
					</div>
				</div>
				<div class="col-sm-4 wow fadeInUp" data-wow-duration="1000ms"
					data-wow-delay="650ms">
					<div class="service-icon">
						<div style="padding: 27px 0px 0px 0px;"><i class="fa fa-coffee"></i></div>
					</div>
					<div class="service-info">
						<h3>快速查询成绩</h3>
						<p>每门课程在教师批改完成之后，学生和教师可以随时查看每一次考试的成绩，永久有效。</p>
					</div>
				</div>
				<div class="col-sm-4 wow fadeInUp" data-wow-duration="1000ms"
					data-wow-delay="750ms">
					<div class="service-icon">
						<div style="padding: 27px 0px 0px 0px;"><i class="fa fa-bitbucket"></i></div>
					</div>
					<div class="service-info">
						<h3>试卷在线批改</h3>
						<p>主观题部分为教师提供评分操作页面，教师根据试题的参考答案灵活批改，简单易用。</p>
					</div>
				</div>
				<div class="col-sm-4 wow fadeInUp" data-wow-duration="1000ms"
					data-wow-delay="850ms">
					<div class="service-icon">
						<div style="padding: 27px 0px 0px 0px;"><i class="fa fa-gift"></i></div>
					</div>
					<div class="service-info">
						<h3>高效生成试卷</h3>
						<p>多人同时在线考试时，考虑到性能问题，本站采取技术手段来尽可能保障站点不拥堵。</p>
					</div>
				</div>
			</div>
		</div>
	</div>
	</section>
	<!--/#services-->

	<footer id="footer">
	<div class="footer-top wow fadeInUp" data-wow-duration="1000ms"
		data-wow-delay="300ms">
		<div class="container text-center">
			<div class="footer-logo">
				<!-- <a href="#"><img class="img-responsive"
					src="/images/logo.png" alt=""></a> -->
				<h1 style="color: white; font-size: 50px">etsys</h1>
			</div>
			<div class="social-icons">
				<ul>
					<li><a class="envelope" href="#"> <i class="fa fa-envelope">
							</i>
					</a></li>
					<li><a class="twitter" href="#"> <i class="fa fa-twitter"></i>
					</a></li>
					<li><a class="dribbble" href="#"> <i class="fa fa-dribbble"></i>
					</a></li>
					<li><a class="facebook" href="#"> <i class="fa fa-facebook"></i>
					</a></li>
					<li><a class="linkedin" href="#"> <i class="fa fa-linkedin"></i>
					</a></li>
					<li><a class="tumblr" href="#"> <i
							class="fa fa-tumblr-square"></i>
					</a></li>
				</ul>
			</div>
		</div>
	</div>
	<div class="footer-bottom">
		<div class="container">
			<div class="row">
				<div class="col-sm-6">
					<p>
						Copyright &copy; 2016.etsys All rights reserved.<a target="_blank"
							href="#"></a>
					</p>
				</div>
				<div class="col-sm-6">
					<p class="pull-right"></p>
				</div>
			</div>
		</div>
	</div>
	</footer>
</body>
</html>