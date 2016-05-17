<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<%
	String color = request.getParameter("color");
	String col = "";
	if (color.equals("red"))
		col = "빨강";
	else if (color.equals("orange"))
		col = "주황";
	else if (color.equals("yellow"))
		col = "노랑";
	else
		col = "초록";
	String msg = "당신이 선택한 색은 " + col + "입니다";
%>
<body bgcolor="<%=color%>">
	<font size="6" color="white"><%=msg%></font>
</body>
</html>