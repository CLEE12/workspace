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
	<h2>구구단</h2>
	<table border="1" width="100%" bgcolor="#C8FFFF">
		<tr bgcolor="#FFFFC2">
			<c:forTokens var="i" items="2,3,4,5,6,7,8,9" delims=",">
				<th>${i }단</th>
			</c:forTokens>
		</tr>
		<tr>
			<c:forTokens var="i" items="2,3,4,5,6,7,8,9" delims=",">
				<c:if test="${i%2==0 }">
					<td>
				</c:if>
				<c:if test="${i%2==1 }">
					<td bgcolor="#FFC19E">
				</c:if>
				<c:forTokens var="j" items="1,2,3,4,5,6,7,8,9" delims=",">
				${i } * ${j } = ${i*j }<br>
				</c:forTokens>
				</td>
			</c:forTokens>
		</tr>
	</table>
</body>
</html>