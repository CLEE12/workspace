<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="ch11.*" errorPage="../DBError.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="mem" class="ch11.Member"></jsp:useBean>
	<jsp:setProperty property="*" name="mem" />
	<%
		MemberDao md = new MemberDao();
		int result = md.loginChk(mem.getId(), mem.getPassword());
		if (result > 0) {
			Cookie cook = new Cookie("id", mem.getId());
			response.addCookie(cook);
			response.sendRedirect("main.jsp");
		} else if (result == 0) {
	%>
	<script type="text/javascript">
		alert("암호 몰라! 간첩이지");
		history.go(-1);
	</script>
	<%
		} else {
	%>
	<script type="text/javascript">
		alert("누구냐 15년동안 만두만 주고");
		history.go(-1);
	</script>
	<%
		}
	%>
</body>
</html>