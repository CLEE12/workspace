<%@page import="java.util.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>좋아하는 과일</h2>
	${fruit[0] } ${fruit[1] } ${fruit[2] } ${fruit[3] }
	<h2>좋아하는 과일</h2>
	<%
		List<String> fruit = (List) request.getAttribute("fruit");
		for (String f : fruit) {
			out.println(f + "");
		}
	%>
</body>
</html>