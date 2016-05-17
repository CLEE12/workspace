<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>세션만들기</h2>
	<%
		session.setAttribute("id", "kim");
		session.setAttribute("pass", "bob");
	%>
	세션을 만들었습니다
	<p>
		<a href="useSession.jsp">세션보기</a>
</body>
</html>