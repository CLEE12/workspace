<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="sessionChk.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="comm.css">
</head>
<body>
	<h2><%=id%>님 환영합니다
	</h2>
	<table border="1">
		<tr>
			<th>정보수정</th>
			<th><button onclick="location.href='updateForm.jsp'">수정</button></th>
		<tr>
			<th>회원탈퇴</th>
			<th><button onclick="location.href='deleteForm.jsp'">탈퇴</button></th>
		<tr>
			<th>회원목록</th>
			<th><button onclick="location.href='selectList.jsp'">목록</button></th>
		<tr>
			<th>로그아웃</th>
			<th><button onclick="location.href='logout.jsp'">종료</button></th>
	</table>
</body>
</html>