<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<%
	int num = Integer.parseInt(request.getAttribute("num").toString());
	String color = "";
	String[] col = { "red", "orange", "green", "blue" };
	switch (num) {
	case 0:
		color = "빨강";
		break;
	case 1:
		color = "주황";
		break;
	case 2:
		color = "초록";
		break;
	case 3:
		color = "파랑";
		break;
	}
	String msg = "당신이 선택한 색은 " + color + "입니다";
%>
<body bgcolor="<%=col[num]%>">
	<font size="6" color="white"><%=msg%></font>
</body>
</html>