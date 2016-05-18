<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html><head><meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title></head><body>
<table>
	<caption><h2>회원가입 성공</h2></caption>
	<tr><th>아이디</th><td>${member.id }</td></tr>
	<tr><th>암호</th><td>${member.passwd }</td></tr>
	<tr><th>이름</th><td>${member.name }</td></tr>
	<tr><th>주소</th><td>${member.address }</td></tr>
	<tr><th>전화</th><td>${member.tel }</td></tr>
	<tr><th>등록일</th><td>
		<fmt:formatDate value="${member.reg_date }" /></td></tr>
</table>
</body>
</html>