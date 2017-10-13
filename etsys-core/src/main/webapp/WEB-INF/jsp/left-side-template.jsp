<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<!-- Left side column. contains the logo and sidebar -->
<aside class="left-side sidebar-offcanvas"> <!-- sidebar: style can be found in sidebar.less -->
<section class="sidebar"> <!-- Sidebar user panel -->

<div class="user-panel">
	<div class="pull-left image">
		<img src="/images/profile.jpg" class="img-circle" alt="User Image" />
	</div>
	<div class="pull-left info">
		<p>您好, ${sessionScope.teacher.teacherName }</p>

		<a href="#"><i class="fa fa-circle text-success"></i> Online</a>
	</div>
</div>
<!-- search form -->
<form action="#" method="get" class="sidebar-form">
	<div class="input-group">
		<input type="text" class="form-control"
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
<ul class="sidebar-menu" id="accordion">
	<li><a 
		href="/data-sync"> <i class="fa fa-gavel"></i>
			<span>数据刷新</span>
	</a></li>
	<li><a
		href="/course/getByTeacherId?teacherId=${sessionScope.teacher.teacherId }&returnPage=teach-courses">
			<i class="fa fa-dashboard"></i> <span>我的课程</span>
	</a></li>

	<li><a
		href="/course/getByTeacherId?teacherId=${sessionScope.teacher.teacherId }&returnPage=teach-stus"> <i class="fa fa-gavel"></i> <span>我的学生</span>
	</a></li>

	<li data-toggle="collapse" data-target="#collapseTemplate"><a
		href="#"> <i class="fa fa-globe"></i> <span>我的模板</span>
	</a></li>
	<li id="collapseTemplate" class="collapse in"><a
		href="/course/getByTeacherId?teacherId=${sessionScope.teacher.teacherId }&returnPage=teach-template"> &nbsp;&nbsp;<i class="fa fa-globe"></i> <span>查看模板</span>
	</a><a href="/course/getByTeacherId?teacherId=${sessionScope.teacher.teacherId }&returnPage=teach-template-create"> &nbsp;&nbsp;<i class="fa fa-globe"></i> <span>新增模板</span>
	</a></li>
	<li><a
		href="/course/getByTeacherId?teacherId=${sessionScope.teacher.teacherId }&returnPage=teach-score"> <i class="fa fa-glass"></i> <span>学生成绩</span>
	</a></li>

	<li data-toggle="collapse" data-target="#collapseTestPaper"><a
		href="#"> <i class="fa fa-glass"></i> <span>考试管理</span>
	</a></li>
	<li id="collapseTestPaper" class="collapse"><a onclick=""
		href="/course/getByTeacherId?teacherId=${sessionScope.teacher.teacherId }&returnPage=teach-test-paper">
			&nbsp;&nbsp;<i class="fa fa-globe"></i> <span>发布考试</span>
	</a><a onclick=""
		href="/course/getByTeacherId?teacherId=${sessionScope.teacher.teacherId }&returnPage=teach-test-check">
			&nbsp;&nbsp;<i class="fa fa-globe"></i> <span>查看考试</span>
	</a><a onclick="" href="#"> &nbsp;&nbsp;<i class="fa fa-globe"></i> <span>批改试卷</span>
	</a><a href="#"> &nbsp;&nbsp;<i class="fa fa-globe"></i> <span>试卷回顾</span>
	</a></li>

	<li data-toggle="collapse" data-target="#collapseBank"><a href="/course/getByTeacherId?teacherId=${sessionScope.teacher.teacherId }&returnPage=teach-ques-bank">
			<i class="fa fa-glass"></i> <span>题库设置</span>
	</a></li>
	<%-- <li id="collapseBank" class="collapse"><a onclick="" href="/course/getByTeacherId?teacherId=${sessionScope.teacher.teacherId }&returnPage=teach-ques-bank">
			&nbsp;&nbsp;<i class="fa fa-globe"></i> <span>查看题库</span>
	</a></li> --%>

</ul>
</section> <!-- /.sidebar --> </aside>