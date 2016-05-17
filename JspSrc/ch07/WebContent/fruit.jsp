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
	<%
		List<String> fruit = new ArrayList<>();
		fruit.add("산딸기");
		fruit.add("집딸기");
		fruit.add("판딸기");
		fruit.add("죽은딸기");
		request.setAttribute("fruit", fruit);
		RequestDispatcher rd = request.getRequestDispatcher("fruitResult.jsp");
		rd.forward(request, response);
	%>
</body>
</html>