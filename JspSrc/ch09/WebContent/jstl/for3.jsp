<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="#191919">
	<h2>
		<font color="#B7B7B7">구구단</font>
	</h2>
	<font color="#B7B7B7">
		<table border="1" width="100%" bgcolor="#353535">
			<tr bgcolor="#353535">
				<c:forEach var="i" begin="2" end="9">
					<th>${i }단</th>
				</c:forEach>
			</tr>
			<tr>
				<c:forEach var="i" begin="2" end="9">
					<td><c:forEach var="j" begin="1" end="9">
			${i } * ${j } = ${i*j }<br>
						</c:forEach></td>
				</c:forEach>
		</table>
</body>
</html>