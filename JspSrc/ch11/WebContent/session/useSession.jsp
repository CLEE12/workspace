<%@page import="java.util.Enumeration"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%><!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		String id = session.getAttribute("id").toString();
		String pass = session.getAttribute("pass").toString();
	%>
	세션 id :
	<%=id%><p>
		세션 pass :
		<%=pass%>
	<p>
		<%
			Enumeration et = session.getAttributeNames();
			while (et.hasMoreElements()) {
				String key = (String) et.nextElement();
				String value = (String) session.getAttribute(key);
				out.println("key : " + key + "<br>");
				out.println("값 : " + value + "<p>");
			}
		%>
	
</body>
</html>