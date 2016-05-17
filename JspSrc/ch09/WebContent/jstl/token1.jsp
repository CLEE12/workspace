<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>사자의 생일</h2>
	<c:forTokens var="an" items="오리, 토끼, 늑대, 지렁이" delims=",">
		<!-- delims가 토큰을 어디서 끊어 주는지 결정 한다. -->
	${an }<br>
	</c:forTokens>
</body>
</html>