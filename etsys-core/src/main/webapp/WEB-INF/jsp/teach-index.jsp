<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link href="/css/bootstrap.min.css" rel="stylesheet">
<link href="/css/ionicons.css" rel="stylesheet">
<link href="/css/morris.css" rel="stylesheet">
<link href="/css/font-awesome.css" rel="stylesheet">
<link href="/css/jquery-jvectormap-1.2.2.css" rel="stylesheet">
<link href="/css/datepicker3.css" rel="stylesheet">
<link href="/css/daterangepicker-bs3.css" rel="stylesheet">
<link href="/css/all.css" rel="stylesheet" type="text/css" />
<link href="/css/style.css" rel="stylesheet" type="text/css" />

<link href="/css/responsive.css" rel="stylesheet">
<script type="text/javascript" src="/js/jquery-1.7.min.js"></script>
<script type="text/javascript" src="/js/bootstrap.min.js"></script>
<script src="/js/jquery.min.js" type="text/javascript"></script>
<script src="/js/jquery-ui-1.10.3.min.js" type="text/javascript"></script>
<script src="/js/daterangepicker.js" type="text/javascript"></script>
<script src="/js/chart.js" type="text/javascript"></script>
<script src="/js/icheck.min.js" type="text/javascript"></script>
<script src="/js/fullcalendar.js" type="text/javascript"></script>
<script src="/js/app.js" type="text/javascript"></script>
<script src="/js/dashboard.js" type="text/javascript"></script>

</head>
<body class="skin-black">

	<header class="header"> <a href="/" class="logo">
		etsys-home </a> <!-- Header Navbar: style can be found in header.less --> <nav
		class="navbar navbar-static-top" role="navigation"> <!-- Sidebar toggle button-->
	<a href="#" class="navbar-btn sidebar-toggle" data-toggle="offcanvas"
		role="button"> <span class="sr-only">Toggle navigation</span> <span
		class="icon-bar"></span> <span class="icon-bar"></span> <span
		class="icon-bar"></span>
	</a>
	<div class="navbar-right">
		<ul class="nav navbar-nav">
			<!-- Messages: style can be found in dropdown.less-->
			<li class="dropdown messages-menu"><a href="#"
				class="dropdown-toggle" data-toggle="dropdown"> <i
					class="fa fa-envelope"></i> <span class="label label-success">4</span>
			</a>
				<ul class="dropdown-menu">
					<li class="header">You have 4 messages</li>
					<li>
						<!-- inner menu: contains the actual data -->
						<ul class="menu">
							<li>
								<!-- start message --> <a href="#">
									<div class="pull-left">
										<img src="img/26115.jpg" class="img-circle" alt="User Image" />
									</div>
									<h4>Support Team</h4>
									<p>Why not buy a new awesome theme?</p> <small
									class="pull-right"><i class="fa fa-clock-o"></i> 5 mins</small>
							</a>
							</li>
							<!-- end message -->
							<li><a href="#">
									<div class="pull-left">
										<img src="img/26115.jpg" class="img-circle" alt="user image" />
									</div>
									<h4>Director Design Team</h4>
									<p>Why not buy a new awesome theme?</p> <small
									class="pull-right"><i class="fa fa-clock-o"></i> 2
										hours</small>
							</a></li>
							<li><a href="#">
									<div class="pull-left">
										<img src="img/avatar.png" class="img-circle" alt="user image" />
									</div>
									<h4>Developers</h4>
									<p>Why not buy a new awesome theme?</p> <small
									class="pull-right"><i class="fa fa-clock-o"></i> Today</small>
							</a></li>
							<li><a href="#">
									<div class="pull-left">
										<img src="img/26115.jpg" class="img-circle" alt="user image" />
									</div>
									<h4>Sales Department</h4>
									<p>Why not buy a new awesome theme?</p> <small
									class="pull-right"><i class="fa fa-clock-o"></i>
										Yesterday</small>
							</a></li>
							<li><a href="#">
									<div class="pull-left">
										<img src="img/avatar.png" class="img-circle" alt="user image" />
									</div>
									<h4>Reviewers</h4>
									<p>Why not buy a new awesome theme?</p> <small
									class="pull-right"><i class="fa fa-clock-o"></i> 2 days</small>
							</a></li>
						</ul>
					</li>
					<li class="footer"><a href="#">See All Messages</a></li>
				</ul></li>
			<li class="dropdown tasks-menu"><a href="#"
				class="dropdown-toggle" data-toggle="dropdown"> <i
					class="fa fa-tasks"></i> <span class="label label-danger">9</span>
			</a>
				<ul class="dropdown-menu">
					<li class="header">You have 9 tasks</li>
					<li>
						<!-- inner menu: contains the actual data -->
						<ul class="menu">
							<li>
								<!-- Task item --> <a href="#">
									<h3>
										Design some buttons <small class="pull-right">20%</small>
									</h3>
									<div class="progress progress-striped xs">
										<div class="progress-bar progress-bar-success"
											style="width: 20%" role="progressbar" aria-valuenow="20"
											aria-valuemin="0" aria-valuemax="100">
											<span class="sr-only">20% Complete</span>
										</div>
									</div>
							</a>
							</li>
							<!-- end task item -->
							<li>
								<!-- Task item --> <a href="#">
									<h3>
										Create a nice theme <small class="pull-right">40%</small>
									</h3>
									<div class="progress progress-striped xs">
										<div class="progress-bar progress-bar-danger"
											style="width: 40%" role="progressbar" aria-valuenow="20"
											aria-valuemin="0" aria-valuemax="100">
											<span class="sr-only">40% Complete</span>
										</div>
									</div>
							</a>
							</li>
							<!-- end task item -->
							<li>
								<!-- Task item --> <a href="#">
									<h3>
										Some task I need to do <small class="pull-right">60%</small>
									</h3>
									<div class="progress progress-striped xs">
										<div class="progress-bar progress-bar-info" style="width: 60%"
											role="progressbar" aria-valuenow="20" aria-valuemin="0"
											aria-valuemax="100">
											<span class="sr-only">60% Complete</span>
										</div>
									</div>
							</a>
							</li>
							<!-- end task item -->
							<li>
								<!-- Task item --> <a href="#">
									<h3>
										Make beautiful transitions <small class="pull-right">80%</small>
									</h3>
									<div class="progress progress-striped xs">
										<div class="progress-bar progress-bar-warning"
											style="width: 80%" role="progressbar" aria-valuenow="20"
											aria-valuemin="0" aria-valuemax="100">
											<span class="sr-only">80% Complete</span>
										</div>
									</div>
							</a>
							</li>
							<!-- end task item -->
						</ul>
					</li>
					<li class="footer"><a href="#">View all tasks</a></li>
				</ul></li>
			<!-- User Account: style can be found in dropdown.less -->
			<li class="dropdown user user-menu"><a href="#"
				class="dropdown-toggle" data-toggle="dropdown"> <i
					class="fa fa-user"></i> <span>Jane Doe <i class="caret"></i></span>
			</a>
				<ul class="dropdown-menu dropdown-custom dropdown-menu-right">
					<li class="dropdown-header text-center">Account</li>

					<li><a href="#"> <i class="fa fa-clock-o fa-fw pull-right"></i>
							<span class="badge badge-success pull-right">10</span> Updates
					</a> <a href="#"> <i class="fa fa-envelope-o fa-fw pull-right"></i>
							<span class="badge badge-danger pull-right">5</span> Messages
					</a> <a href="#"><i class="fa fa-magnet fa-fw pull-right"></i> <span
							class="badge badge-info pull-right">3</span> Subscriptions</a> <a
						href="#"><i class="fa fa-question fa-fw pull-right"></i> <span
							class="badge pull-right">11</span> FAQ</a></li>

					<li class="divider"></li>

					<li><a href="#"> <i class="fa fa-user fa-fw pull-right"></i>
							Profile
					</a> <a data-toggle="modal" href="#modal-user-settings"> <i
							class="fa fa-cog fa-fw pull-right"></i> Settings
					</a></li>

					<li class="divider"></li>

					<li><a href="#"><i class="fa fa-ban fa-fw pull-right"></i>
							Logout</a></li>
				</ul></li>
		</ul>
	</div>
	</nav> </header>
	<div class="wrapper row-offcanvas row-offcanvas-left">
		<!-- Left side column. contains the logo and sidebar -->
		<aside class="left-side sidebar-offcanvas"> <!-- sidebar: style can be found in sidebar.less -->
		<section class="sidebar"> <!-- Sidebar user panel -->
		<div class="user-panel">
			<div class="pull-left image">
				<img src="/images/profile.jpg" class="img-circle" alt="User Image" />
			</div>
			<div class="pull-left info">
				<p>您好, ${sessionScope.teacher.teacherName }老师</p>

				<!-- <a href="#"><i class="fa fa-circle text-success"></i> Online</a> -->
			</div>
		</div>
		<!-- search form -->
		<form action="#" method="get" class="sidebar-form">
			<div class="input-group">
				<input type="text" name="q" class="form-control"
					placeholder="Search..." /> <span class="input-group-btn">
					<button type='submit' name='seach' id='search-btn'
						class="btn btn-flat">
						<i class="fa fa-search"></i>
					</button>
				</span>
			</div>
		</form>
		<!-- /.search form --> <!-- sidebar menu: : style can be found in sidebar.less -->

		<!-- get starting ... -->
		<ul class="sidebar-menu">
			<li class="active"><a onclick="loadPage('/course/getByTeacherId?teacherId=${sessionScope.teacher.teacherId }&returnPage=teach-courses')" href="#"> <!-- <i class="fa fa-dashboard"></i> -->
					<span>我的课程</span>
			</a></li>
			<li><a onclick="loadPage('/course/getByTeacherId?teacherId=${sessionScope.teacher.teacherId }&returnPage=teach-stus')" href="#"> <!-- <i class="fa fa-gavel"></i> --> <span>我的学生</span>
			</a></li>

			<li><a onclick="loadPage('/course/getByTeacherId?teacherId=${sessionScope.teacher.teacherId }&returnPage=teach-template')" href="#"> <!-- <i class="fa fa-globe"></i> --> <span>我的模板</span>
			</a></li>

			<li><a onclick="loadPage('/course/getByTeacherId?teacherId=${sessionScope.teacher.teacherId }&returnPage=teach-stu-score')" href="#"> <!-- <i class="fa fa-glass"></i> --> <span>学生成绩</span>
			</a></li>

			<li><a onclick="loadPage('/course/getByTeacherId?teacherId=${sessionScope.teacher.teacherId }&returnPage=teach-test-paper')" href="#"> <!-- <i class="fa fa-glass"></i> --> <span>批改试卷</span>
			</a></li>

			<li><a onclick="loadPage('/course/getByTeacherId?teacherId=${sessionScope.teacher.teacherId }&returnPage=teach-ques-bank')" href="#"> <!-- <i class="fa fa-glass"></i> --> <span>题库设置</span>
			</a></li>

		</ul>
		</section> <!-- /.sidebar --> </aside>
		<!-- <div class="copyrights">
			Collect from <a href="http://www.cssmoban.com/">免费网站模板</a>
		</div> -->

		<aside class="right-side"> <!-- Main content --> <section
			class="content">

		<div id="con-center" class="row" style="margin-bottom: 5px;">

		</div>

		<!-- row end --> </section><!-- /.content -->
		<!-- <div class="footer-main">
			Copyright &copy etsys, 2017. More Details <a
				href="#" target="#" title="#">etsys</a>
		</div> -->
		</aside>
		<!-- /.right-side -->

	</div>
	<!-- ./wrapper -->
	<script type="text/javascript">
	    function loadPage(url) {
	    	$("#con-center").load(url);
	    }
	    function load(url, data){
	        //alert($(url).attr("href"));
	        $.ajaxSetup({cache: false });
	        $("#content").load($(url).attr("href")+ " #content ", data, function(result){
	            //alert(result);
	            //将被加载页的JavaScript加载到本页执行
	            $result = $(result); 
	            $result.find("script").appendTo('#content');
	        });

	    }
	</script>
</body>
</html>