<%@page import="ch11.MemberDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" errorPage="../DBError.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link href="../cookMember/comm.css" type="text/css" rel="stylesheet">
</head>
<body>
	<h2>메인</h2>
	<%
		String id = (String) session.getAttribute("id");
		if (id == null || id == "")
			response.sendRedirect("loginForm.html");
		MemberDao md = new MemberDao();
		String name = md.select(id);
	%>
	<%=name%>님 환영합니다
	<p>
		<button onclick="location.href='logout.jsp'">로그 아웃</button>
</body>
</html>