<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>회원가입</h2>
	<form action="member.jsp">
		이름 : <input type="text" name="name" required="required">
		<p>
			취미 : <input type="text" name="hobby" required="required">
		<p>
			주소 : <input type="text" name="addr" required="required">
		<p>
			<input type="submit" value="확인">
	</form>
</body>
</html>