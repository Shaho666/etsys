/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2017-10-11 16:16:43 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class left_002dside_002dques_002dbank_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<!-- Left side column. contains the logo and sidebar -->\r\n");
      out.write("<aside class=\"left-side sidebar-offcanvas\"> <!-- sidebar: style can be found in sidebar.less -->\r\n");
      out.write("<section class=\"sidebar\"> <!-- Sidebar user panel -->\r\n");
      out.write("\r\n");
      out.write("<div class=\"user-panel\">\r\n");
      out.write("\t<div class=\"pull-left image\">\r\n");
      out.write("\t\t<img src=\"/images/profile.jpg\" class=\"img-circle\" alt=\"User Image\" />\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div class=\"pull-left info\">\r\n");
      out.write("\t\t<p>您好, ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.teacher.teacherName }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</p>\r\n");
      out.write("\r\n");
      out.write("\t\t<a href=\"#\"><i class=\"fa fa-circle text-success\"></i> Online</a>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("<!-- search form -->\r\n");
      out.write("<form action=\"#\" method=\"get\" class=\"sidebar-form\">\r\n");
      out.write("\t<div class=\"input-group\">\r\n");
      out.write("\t\t<input type=\"text\" name=\"q\" class=\"form-control\"\r\n");
      out.write("\t\t\tplaceholder=\"Search...\" /> <span class=\"input-group-btn\">\r\n");
      out.write("\t\t\t<button type='submit' name='seach' id='search-btn'\r\n");
      out.write("\t\t\t\tclass=\"btn btn-flat\">\r\n");
      out.write("\t\t\t\t<i class=\"fa fa-search\"></i>\r\n");
      out.write("\t\t\t</button>\r\n");
      out.write("\t\t</span>\r\n");
      out.write("\t</div>\r\n");
      out.write("</form>\r\n");
      out.write("<!-- /.search form --> <!-- sidebar menu: : style can be found in sidebar.less -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- get starting ... -->\r\n");
      out.write("<ul class=\"sidebar-menu\" id=\"accordion\">\r\n");
      out.write("\t<li><a href=\"/data-sync\"> <i class=\"fa fa-gavel\"></i> <span>数据刷新</span>\r\n");
      out.write("\t</a></li>\r\n");
      out.write("\t<li><a\r\n");
      out.write("\t\thref=\"/course/getByTeacherId?teacherId=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.teacher.teacherId }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("&returnPage=teach-courses\">\r\n");
      out.write("\t\t\t<i class=\"fa fa-dashboard\"></i> <span>我的课程</span>\r\n");
      out.write("\t</a></li>\r\n");
      out.write("\r\n");
      out.write("\t<li><a\r\n");
      out.write("\t\thref=\"/course/getByTeacherId?teacherId=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.teacher.teacherId }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("&returnPage=teach-stus\">\r\n");
      out.write("\t\t\t<i class=\"fa fa-gavel\"></i> <span>我的学生</span>\r\n");
      out.write("\t</a></li>\r\n");
      out.write("\r\n");
      out.write("\t<li data-toggle=\"collapse\" data-target=\"#collapseTemplate\"><a\r\n");
      out.write("\t\thref=\"#\"> <i class=\"fa fa-globe\"></i> <span>我的模板</span>\r\n");
      out.write("\t</a></li>\r\n");
      out.write("\t<li id=\"collapseTemplate\" class=\"collapse\"><a\r\n");
      out.write("\t\thref=\"/course/getByTeacherId?teacherId=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.teacher.teacherId }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("&returnPage=teach-template\">\r\n");
      out.write("\t\t\t&nbsp;&nbsp;<i class=\"fa fa-globe\"></i> <span>查看模板</span>\r\n");
      out.write("\t</a><a\r\n");
      out.write("\t\thref=\"/course/getByTeacherId?teacherId=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.teacher.teacherId }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("&returnPage=teach-template-create\">\r\n");
      out.write("\t\t\t&nbsp;&nbsp;<i class=\"fa fa-globe\"></i> <span>新增模板</span>\r\n");
      out.write("\t</a></li>\r\n");
      out.write("\t<li><a\r\n");
      out.write("\t\thref=\"/course/getByTeacherId?teacherId=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.teacher.teacherId }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("&returnPage=teach-stu-score\">\r\n");
      out.write("\t\t\t<i class=\"fa fa-glass\"></i> <span>学生成绩</span>\r\n");
      out.write("\t</a></li>\r\n");
      out.write("\r\n");
      out.write("\t<li data-toggle=\"collapse\" data-target=\"#collapseTestPaper\"><a\r\n");
      out.write("\t\thref=\"#\"> <i class=\"fa fa-glass\"></i> <span>管理试卷</span>\r\n");
      out.write("\t</a></li>\r\n");
      out.write("\t<li id=\"collapseTestPaper\" class=\"collapse\"><a onclick=\"\" href=\"#\">\r\n");
      out.write("\t\t\t&nbsp;&nbsp;<i class=\"fa fa-globe\"></i> <span>往年试卷</span>\r\n");
      out.write("\t</a><a href=\"#\"> &nbsp;&nbsp;<i class=\"fa fa-globe\"></i> <span>批改试卷</span>\r\n");
      out.write("\t</a></li>\r\n");
      out.write("\r\n");
      out.write("\t<li data-toggle=\"collapse\" data-target=\"#collapseBank\"><a href=\"#\">\r\n");
      out.write("\t\t\t<i class=\"fa fa-glass\"></i> <span>题库设置</span>\r\n");
      out.write("\t</a></li>\r\n");
      out.write("\t<li id=\"collapseBank\" class=\"collapse in\"><a onclick=\"\"\r\n");
      out.write("\t\thref=\"/course/getByTeacherId?teacherId=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.teacher.teacherId }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("&returnPage=teach-ques-bank\">\r\n");
      out.write("\t\t\t&nbsp;&nbsp;<i class=\"fa fa-globe\"></i> <span>查看题库</span>\r\n");
      out.write("\t</a><a href=\"#\"> &nbsp;&nbsp;<i class=\"fa fa-globe\"></i> <span>新增题库</span>\r\n");
      out.write("\t</a></li>\r\n");
      out.write("\r\n");
      out.write("</ul>\r\n");
      out.write("</section> <!-- /.sidebar --> </aside>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
