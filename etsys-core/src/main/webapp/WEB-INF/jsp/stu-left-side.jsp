<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<aside class="left-side sidebar-offcanvas"> <!-- sidebar: style can be found in sidebar.less -->
<section class="sidebar"> <!-- Sidebar user panel -->

<div class="user-panel">
	<div class="pull-left image">
		<img src="/images/profile.jpg" class="img-circle" alt="User Image" />
	</div>
	<div class="pull-left info">
		<p>您好, ${sessionScope.student.stuName }</p>

		<a href="#"><i class="fa fa-circle text-success"></i> Online</a>
	</div>
</div>
<!-- search form -->
<div class="sidebar-form">
	<div class="input-group">
		<input type="text" class="form-control"
			placeholder="Search..." /> <span class="input-group-btn">
			<button type='submit' name='seach' id='search-btn'
				class="btn btn-flat">
				<i class="fa fa-search"></i>
			</button>
		</span>
	</div>
</div>
<!-- /.search form --> <!-- sidebar menu: : style can be found in sidebar.less -->



<!-- get starting ... -->
<ul class="sidebar-menu" id="accordion">
	<li><a
		href="/course/getByStudentId?studentId=${sessionScope.student.stuId }&returnPage=stu-courses">
			<i class="fa fa-dashboard"></i> <span>我的课程</span>
	</a></li>

	<li><a
		href="/test/getByStudent?studentId=${sessionScope.student.stuId }">
			<i class="fa fa-gavel"></i> <span>我的考试信息</span>
	</a></li>
	
	<li><a
		href="/score/getByStudent/${sessionScope.student.stuId }">
			<i class="fa fa-gavel"></i> <span>成绩查询</span>
	</a></li>

</ul>
</section> <!-- /.sidebar --> </aside>