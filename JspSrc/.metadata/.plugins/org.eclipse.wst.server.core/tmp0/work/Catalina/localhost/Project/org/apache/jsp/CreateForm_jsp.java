/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.33
 * Generated at: 2016-04-18 07:49:15 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class CreateForm_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

final java.lang.String _jspx_method = request.getMethod();
if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
return;
}

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

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("<title>Insert title here</title>\n");
      out.write("<link type=\"text/css\" rel=\"stylesheet\" href=\"comm.css\">\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("\tfunction chk() {\n");
      out.write("\t\tif (frm.ID.length < 5) {\n");
      out.write("\t\t\talert(\"아이디는 5자리 이상 15자리 이하로 입력하세요.\");\n");
      out.write("\t\t\tfrm.ID.focus();\n");
      out.write("\t\t\tfrm.ID.value = \"\";\n");
      out.write("\t\t}\n");
      out.write("\t\tif (isNaN(frm.phone.value)) {\n");
      out.write("\t\t\talert(\"전화 번호는 숫자로 입력하세요.\");\n");
      out.write("\t\t\tfrm.phone.focus();\n");
      out.write("\t\t\tfrm.phone.value = \"\";\n");
      out.write("\t\t}\n");
      out.write("\t\tif (frm.password.value != frm.VarifyingPassword.value) {\n");
      out.write("\t\t\talert(\"암호를 맞춰주세요.\");\n");
      out.write("\t\t\tfrm.VarifyingPassword.focus();\n");
      out.write("\t\t\tfrm.VarifyingPassword.value = \"\";\n");
      out.write("\t\t}\n");
      out.write("\t\tif (frm.password.length < 8) {\n");
      out.write("\t\t\talert(\"암호는 8자리 이상 20자리 이하로 입력하세요.\");\n");
      out.write("\t\t\tfrm.password.focus();\n");
      out.write("\t\t\tfrm.password.value = \"\";\n");
      out.write("\t\t}\n");
      out.write("\t\tif (isNaN(frm.phone.value)) {\n");
      out.write("\t\t\talert(\"전화 번호는 숫자로 입력하세요.\");\n");
      out.write("\t\t\tfrm.phone.focus();\n");
      out.write("\t\t\tfrm.phone.value = \"\";\n");
      out.write("\t\t}\n");
      out.write("\t\tfrm.action =\"CreatePro.jsp\";\n");
      out.write("\t}\n");
      out.write("\tfunction emailcheck() {\n");
      out.write("\t\twindow.open(\"emailcheck.jsp?email=\" + frm.email.value, \"\",\n");
      out.write("\t\t\t\t\"width=300 height = 300\");\n");
      out.write("\t}\n");
      out.write("\tfunction IDCheck() {\n");
      out.write("\t\tif (frm.ID.value == \"\") {\n");
      out.write("\t\t\talert(\"아이디를 입력하세요\");\n");
      out.write("\t\t\tfrm.ID.focus();\n");
      out.write("\t\t}\n");
      out.write("\t\telse\n");
      out.write("\t\twindow.open(\"IDCheck.jsp?ID=\" + frm.ID.value, \"\",\"width=300 height = 300\");\n");
      out.write("\t}\n");
      out.write("</script>\n");
      out.write("</head>\n");
      out.write("<link type=\"text/css\" rel=\"stylesheet\" href=\"comm.css\">\n");
      out.write("</head>\n");
      out.write("<body bgcolor=\"gray\">\n");
      out.write("\t<div id=\"Menu1\">\n");
      out.write("\t\t<img alt=\"\" src=\"images/CheckMatelogo.png\" width=\"15%\">\n");
      out.write("\t</div>\n");
      out.write("\t<p id=\"u199-4\">Check-Mate</p>\n");
      out.write("\t<div id=\"u197-9\">\n");
      out.write("\t\t<p>CHECK-MATE is a real time To-Do list what is based on SNS.</p>\n");
      out.write("\t\t<p>Group up and meets up together with our AWESOME service!\n");
      out.write("\t\t<p>\n");
      out.write("\t\t<p id=\"u197-5\">&nbsp;</p>\n");
      out.write("\t\t<p id=\"u197-7\">Present by team SUMIT</p>\n");
      out.write("\t</div>\n");
      out.write("\t<form name=\"frm\" onsubmit=\"return chk(n)\">\n");
      out.write("\t\t\t<table id=\"tableCenter\">\n");
      out.write("\t\t\t\t<tr>\n");
      out.write("\t\t\t\t<td>E-mail</td>\n");
      out.write("\t\t\t\t<td><input type=\"email\" name=\"email\" required=\"required\"\n");
      out.write("\t\t\t\t\tmaxlength=\"30\" placeholder=\"E-Mail\"></td>\n");
      out.write("\t\t\t\t<td>&nbsp; <input type=\"button\" value=\"Redundancy check\"\n");
      out.write("\t\t\t\t\tonclick=\"emailcheck()\" required=\"required\"></td>\n");
      out.write("\t\t\t</tr>\n");
      out.write("\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t<td>아이디</td>\n");
      out.write("\t\t\t\t\t<td><input type=\"text\" name=\"ID\" required=\"required\"\n");
      out.write("\t\t\t\t\t\tmaxlength=\"15\" placeholder=\"아이디\"></td>\n");
      out.write("\t\t\t\t\t<td>&nbsp; <input type=\"button\" value=\"Redundancy check\"\n");
      out.write("\t\t\t\t\t\tonclick=\"IDCheck()\" required=\"required\"></td>\n");
      out.write("\t\t\t\t</tr>\n");
      out.write("\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t<td>이름</td>\n");
      out.write("\t\t\t\t\t<td><input type=\"text\" name=\"name\" required=\"required\"\n");
      out.write("\t\t\t\t\t\tmaxlength=\"20\" placeholder=\"이름\"></td>\n");
      out.write("\t\t\t\t</tr>\n");
      out.write("\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t<td>암호</td>\n");
      out.write("\t\t\t\t\t<td><input type=\"password\" name=\"password\" required=\"required\"\n");
      out.write("\t\t\t\t\t\tmaxlength=\"30\" placeholder=\"암호\"></td>\n");
      out.write("\t\t\t\t</tr>\n");
      out.write("\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t<td>암호 확인</td>\n");
      out.write("\t\t\t\t\t<td><input type=\"password\" name=\"VarifyingPassword\"\n");
      out.write("\t\t\t\t\t\trequired=\"required\" maxlength=\"30\" placeholder=\"암호 확인\"></td>\n");
      out.write("\t\t\t\t</tr>\n");
      out.write("\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t<td>연락처</td>\n");
      out.write("\t\t\t\t\t<td><input type=\"tel\" name=\"phone\" required=\"required\"\n");
      out.write("\t\t\t\t\t\tmaxlength=\"20\" placeholder=\"연락처\"></td>\n");
      out.write("\t\t\t\t</tr>\n");
      out.write("\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t<td colspan=\"2\"><button onclick=\"chk()\">확인</button></td>\n");
      out.write("\t\t\t\t\t<td><button onclick=\"location.href='Cover.jsp'\">돌아가기</button></td>\n");
      out.write("\t\t\t\t</tr>\n");
      out.write("\t\t\t</table>\n");
      out.write("\t</form>\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}