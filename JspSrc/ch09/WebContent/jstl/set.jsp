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
	<c:set var="a" value="7"></c:set>
	<c:set var="b" value="5" />
	<h3>사칙연산</h3>
	덧셈 : ${a } + ${b } = ${a+b }
	<p>뺄셈 : ${a } - ${b } = ${a-b }
	<p>곱셈 : ${a } * ${b } = ${a*b }
	<p>나눗셈: ${a } / ${b } = ${a/b }
	<p>
</body>
</html>