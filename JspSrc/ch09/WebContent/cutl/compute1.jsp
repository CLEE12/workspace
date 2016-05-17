<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="u" tagdir="/WEB-INF/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>제곱 구하기</h2>
	<u:compute end="10" var="num" start="5">
	${num }의 제곱 ${num*num }<br>
	</u:compute>
	<h2>세제곱 구하기</h2>
	<u:compute end="20" var="num" start="11">
	${num }의 세제곱 ${num*num*num }<br>
	</u:compute>
</body>
</html>