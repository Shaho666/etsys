/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2017-10-02 02:23:11 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("<meta name=\"description\" content=\"\">\r\n");
      out.write("<meta name=\"author\" content=\"\">\r\n");
      out.write("<title>欢迎来到etsys</title>\r\n");
      out.write("<link href=\"/css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("<link href=\"/css/animate.min.css\" rel=\"stylesheet\">\r\n");
      out.write("<link href=\"/css/font-awesome.min.css\" rel=\"stylesheet\">\r\n");
      out.write("<link href=\"/css/lightbox.css\" rel=\"stylesheet\">\r\n");
      out.write("<link href=\"/css/main.css\" rel=\"stylesheet\">\r\n");
      out.write("<link id=\"css-preset\" href=\"/css/preset1.css\" rel=\"stylesheet\">\r\n");
      out.write("<link href=\"/css/responsive.css\" rel=\"stylesheet\">\r\n");
      out.write("<script type=\"text/javascript\" src=\"/js/jquery-1.7.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"/js/bootstrap.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"/js/jquery.inview.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"/js/wow.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"/js/mousescroll.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"/js/smoothscroll.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"/js/jquery.countTo.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"/js/lightbox.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"/js/main.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<!--/head-->\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\t<!--.preloader-->\r\n");
      out.write("\t<div class=\"preloader\">\r\n");
      out.write("\t\t<i class=\"fa fa-circle-o-notch fa-spin\"></i>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!--/.preloader-->\r\n");
      out.write("\r\n");
      out.write("\t<header id=\"home\">\r\n");
      out.write("\t<div class=\"main-nav\">\r\n");
      out.write("\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t<div class=\"navbar-header\">\r\n");
      out.write("\t\t\t\t<button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\"\r\n");
      out.write("\t\t\t\t\tdata-target=\".navbar-collapse\">\r\n");
      out.write("\t\t\t\t\t<span class=\"sr-only\">Toggle navigation</span> <span\r\n");
      out.write("\t\t\t\t\t\tclass=\"icon-bar\"></span> <span class=\"icon-bar\"></span> <span\r\n");
      out.write("\t\t\t\t\t\tclass=\"icon-bar\"></span>\r\n");
      out.write("\t\t\t\t</button>\r\n");
      out.write("\t\t\t\t<a class=\"navbar-brand\" href=\"#\"> <!-- <h1>\r\n");
      out.write("\t\t\t\t\t\t<img class=\"img-responsive\" src=\"/images/logo.png\" alt=\"logo\">\r\n");
      out.write("\t\t\t\t\t</h1> -->\r\n");
      out.write("\t\t\t\t\t<h1 style=\"color: white; font-size: 35px\">etsys</h1>\r\n");
      out.write("\t\t\t\t</a>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"collapse navbar-collapse\">\r\n");
      out.write("\t\t\t\t<ul class=\"nav navbar-nav navbar-right\">\r\n");
      out.write("\t\t\t\t\t<li class=\"scroll active\"><a href=\"#home\">主页</a></li>\r\n");
      out.write("\t\t\t\t\t<li class=\"scroll\"><a href=\"#services\">服务</a></li>\r\n");
      out.write("\t\t\t\t\t<li class=\"scroll\"><a href=\"#about-us\">关于我们</a></li>\r\n");
      out.write("\t\t\t\t\t<li class=\"scroll\"><a href=\"#team\">团队</a></li>\r\n");
      out.write("\t\t\t\t\t<li class=\"scroll\"><a href=\"#blog\">博客</a></li>\r\n");
      out.write("\t\t\t\t\t<li class=\"scroll\"><a href=\"#contact\">联系我们</a></li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!--/#main-nav--> </header>\r\n");
      out.write("\t<!--/#home-->\r\n");
      out.write("\t<section id=\"services\">\r\n");
      out.write("\t<div class=\"container\">\r\n");
      out.write("\t\t<div class=\"heading wow fadeInUp\" data-wow-duration=\"1000ms\"\r\n");
      out.write("\t\t\tdata-wow-delay=\"300ms\">\r\n");
      out.write("\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t<div class=\"text-center col-sm-8 col-sm-offset-2\">\r\n");
      out.write("\t\t\t\t\t<h2>欢迎来到etsys在线考试一站式服务</h2>\r\n");
      out.write("\t\t\t\t\t<p>本站长期致力于为各大高校提供在线测试系统，只在为创造更快捷/更高效/更方便的在线测试环境，保证数据的安全和稳定传输。\r\n");
      out.write("\t\t\t\t\t\t相比传统的体系结构而言，本站更加侧重于上百人同时上机测试时性能优化的解决方案设计。</p>\r\n");
      out.write("\t\t\t\t\t<br>\r\n");
      out.write("\t\t\t\t\t<div id=\"entrance\" style=\"padding: 0px 130px 10px;\">\r\n");
      out.write("\t\t\t\t\t\t<a href=\"/signUp/showTeacherPrePage\"><input type=\"button\"\r\n");
      out.write("\t\t\t\t\t\t\tid=\"teacher\" value=\"我是老师 \"\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"btn btn-danger btn-sm btn-block\"></a> <br> \r\n");
      out.write("\t\t\t\t\t\t<a href=\"/signIn/showStuPrePage\">\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"button\" id=\"student\" value=\"我是学生\"\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"btn btn-warning btn-sm btn-block\">\r\n");
      out.write("\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"text-center our-services\">\r\n");
      out.write("\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t<div class=\"col-sm-4 wow fadeInDown\" data-wow-duration=\"1000ms\"\r\n");
      out.write("\t\t\t\t\tdata-wow-delay=\"300ms\">\r\n");
      out.write("\t\t\t\t\t<div class=\"service-icon\">\r\n");
      out.write("\t\t\t\t\t\t<!-- <i class=\"fa fa-calendar\"></i> -->\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"service-info\">\r\n");
      out.write("\t\t\t\t\t\t<h3>教师学生管理</h3>\r\n");
      out.write("\t\t\t\t\t\t<p>教师提供教职工账号，结合本校教务系统的数据进行验证，方可注册入本系统。学生信息可由教师导入。</p>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"col-sm-4 wow fadeInDown\" data-wow-duration=\"1000ms\"\r\n");
      out.write("\t\t\t\t\tdata-wow-delay=\"450ms\">\r\n");
      out.write("\t\t\t\t\t<div class=\"service-icon\">\r\n");
      out.write("\t\t\t\t\t\t<!-- <i class=\"fa fa-umbrella\"></i> -->\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"service-info\">\r\n");
      out.write("\t\t\t\t\t\t<h3>在线考试模板</h3>\r\n");
      out.write("\t\t\t\t\t\t<p>教师可根据实际情况，为每一次考试生成试题模板，包括题目难度/数量/种类/分值，可多次重复使用。</p>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"col-sm-4 wow fadeInDown\" data-wow-duration=\"1000ms\"\r\n");
      out.write("\t\t\t\t\tdata-wow-delay=\"550ms\">\r\n");
      out.write("\t\t\t\t\t<div class=\"service-icon\">\r\n");
      out.write("\t\t\t\t\t\t<!-- <i class=\"fa fa-cloud\"></i> -->\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"service-info\">\r\n");
      out.write("\t\t\t\t\t\t<h3>试题难度设定</h3>\r\n");
      out.write("\t\t\t\t\t\t<p>创建试题模板时，系统可根据要求的难度来自动生成试卷，参照每小题的难度系数来完成。</p>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"col-sm-4 wow fadeInUp\" data-wow-duration=\"1000ms\"\r\n");
      out.write("\t\t\t\t\tdata-wow-delay=\"650ms\">\r\n");
      out.write("\t\t\t\t\t<div class=\"service-icon\">\r\n");
      out.write("\t\t\t\t\t\t<!-- <i class=\"fa fa-coffee\"></i> -->\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"service-info\">\r\n");
      out.write("\t\t\t\t\t\t<h3>快速查询成绩</h3>\r\n");
      out.write("\t\t\t\t\t\t<p>每门课程在教师批改完成之后，学生和教师可以随时查看每一次考试的成绩，永久有效。</p>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"col-sm-4 wow fadeInUp\" data-wow-duration=\"1000ms\"\r\n");
      out.write("\t\t\t\t\tdata-wow-delay=\"750ms\">\r\n");
      out.write("\t\t\t\t\t<div class=\"service-icon\">\r\n");
      out.write("\t\t\t\t\t\t<!-- <i class=\"fa fa-bitbucket\"></i> -->\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"service-info\">\r\n");
      out.write("\t\t\t\t\t\t<h3>试卷在线批改</h3>\r\n");
      out.write("\t\t\t\t\t\t<p>主观题部分为教师提供评分操作页面，教师根据试题的参考答案灵活批改，简单易用。</p>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"col-sm-4 wow fadeInUp\" data-wow-duration=\"1000ms\"\r\n");
      out.write("\t\t\t\t\tdata-wow-delay=\"850ms\">\r\n");
      out.write("\t\t\t\t\t<div class=\"service-icon\">\r\n");
      out.write("\t\t\t\t\t\t<!-- <i class=\"fa fa-gift\"></i> -->\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"service-info\">\r\n");
      out.write("\t\t\t\t\t\t<h3>高效生成试卷</h3>\r\n");
      out.write("\t\t\t\t\t\t<p>多人同时在线考试时，考虑到性能问题，本站采取技术手段来尽可能保障站点不拥堵。</p>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t</section>\r\n");
      out.write("\t<!--/#services-->\r\n");
      out.write("\r\n");
      out.write("\t<footer id=\"footer\">\r\n");
      out.write("\t<div class=\"footer-top wow fadeInUp\" data-wow-duration=\"1000ms\"\r\n");
      out.write("\t\tdata-wow-delay=\"300ms\">\r\n");
      out.write("\t\t<div class=\"container text-center\">\r\n");
      out.write("\t\t\t<div class=\"footer-logo\">\r\n");
      out.write("\t\t\t\t<!-- <a href=\"#\"><img class=\"img-responsive\"\r\n");
      out.write("\t\t\t\t\tsrc=\"/images/logo.png\" alt=\"\"></a> -->\r\n");
      out.write("\t\t\t\t<h1 style=\"color: white; font-size: 50px\">etsys</h1>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"social-icons\">\r\n");
      out.write("\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t<li><a class=\"envelope\" href=\"#\"> <!-- <i class=\"fa fa-envelope\"> -->\r\n");
      out.write("\t\t\t\t\t\t\t</i>\r\n");
      out.write("\t\t\t\t\t</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a class=\"twitter\" href=\"#\"> <!-- <i class=\"fa fa-twitter\"></i> -->\r\n");
      out.write("\t\t\t\t\t</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a class=\"dribbble\" href=\"#\"> <!-- <i class=\"fa fa-dribbble\"></i> -->\r\n");
      out.write("\t\t\t\t\t</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a class=\"facebook\" href=\"#\"> <!-- <i class=\"fa fa-facebook\"></i> -->\r\n");
      out.write("\t\t\t\t\t</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a class=\"linkedin\" href=\"#\"> <!-- <i class=\"fa fa-linkedin\"></i> -->\r\n");
      out.write("\t\t\t\t\t</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a class=\"tumblr\" href=\"#\"> <!-- <i\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"fa fa-tumblr-square\"></i> -->\r\n");
      out.write("\t\t\t\t\t</a></li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div class=\"footer-bottom\">\r\n");
      out.write("\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t<div class=\"col-sm-6\">\r\n");
      out.write("\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\tCopyright &copy; 2016.etsys All rights reserved.<a target=\"_blank\"\r\n");
      out.write("\t\t\t\t\t\t\thref=\"#\"></a>\r\n");
      out.write("\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"col-sm-6\">\r\n");
      out.write("\t\t\t\t\t<p class=\"pull-right\"></p>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t</footer>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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
