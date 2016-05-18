<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html><head><meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title></head><body>
<table border="1">
	<caption><h2>회원 등록성공</h2></caption><tr>
		<th>아이디</th><td>${user.userId }</td></tr>
	<tr><th>암호</th><td>${user.password}</td></tr>
	<tr><th>이름</th><td>${user.userName}</td></tr>
	<tr><th>우편번호</th><td>${user.postCode }</td></tr>
	<tr><th>주소</th><td>${user.address }</td></tr>
	<tr><th>이메일</th><td>${user.email }</td></tr>
	<tr><th>직업</th><td>${user.job }</td></tr>
	<tr><th>생년월일</th><td>
		<fmt:formatDate value="${user.birthday }"/>
	</td></tr>
</table>
</body>
</html>