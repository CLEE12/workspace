<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="ch15.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		String id = request.getParameter("id");
		String pass = request.getParameter("pass");
		LoginCheck lc = new LoginCheck();
		int result = lc.check(id, pass);
		if (result == 1) {
	%>
	<h2>메뉴</h2>
	1. 환경보호
	<p>2. 세계평화
	<p>3. 국가발전
	<p>
		<%
			} else {
		%>
		아이디 또는 암호가 다릅니다
	<p>
		<a href="loginCheck1.html">다시 입력하기</a>
		<%
			}
		%>
	
</body>
</html>