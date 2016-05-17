<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="ch07.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		Thermometer th = new Thermometer();
		request.setAttribute("th", th);
	%>
	${th.setTh('강남',7.6) }
	<h2>강남의 온도</h2>
	섭씨 : ${th.getTh('강남') }
	<p>화씨 : ${th.getFarenheit('강남') }
	<p>정보 : ${th.info() }
</body>
</html>