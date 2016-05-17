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
		String name = request.getParameter("name");
		String hobby = request.getParameter("hobby");
		String addr = request.getParameter("addr");
	%>
	<h2>회원 정보</h2>
	이름 :
	<%=name%><p>
		취미 :
		<%=hobby%>
	<p>
		주소 :
		<%=addr%>
</body>
</html>