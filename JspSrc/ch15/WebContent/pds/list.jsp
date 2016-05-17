<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="comm.css">
</head>
<body>
	<table>
		<caption>자료실</caption>
		<tr>
			<th>아이디</th>
			<th>파일명</th>
			<th>길이</th>
			<th>설 명</th>
			<th>보기</th>
		</tr>
		<c:forEach var="pi" items="${list }">
			<tr>
				<td>${pi.id }</td>
				<td>${pi.fileName }</td>
				<td>${pi.fileSize}</td>
				<td>${pi.description}</td>
				<td><a href="../upload/${pi.fileName }">보기</a></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>