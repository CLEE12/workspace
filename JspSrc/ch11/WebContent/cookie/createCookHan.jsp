<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="ch11.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		response.addCookie(CookieBox.createCookie("id", "중앙"));
	%>
	쿠키가저장 되었습니다
	<p>
		<a href="useCookHan.jsp">쿠키보기</a>
</body>
</html>