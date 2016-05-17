<%@page import="java.net.URLEncoder"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		String value = URLEncoder.encode("주니", "utf-8");
		Cookie cook = new Cookie("id", value);
		response.addCookie(cook);
	%>
	쿠키가 생성됐습니다
	<p>
		<a href="useCookie2.jsp">쿠키보기</a>
</body>
</html>