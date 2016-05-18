<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>
<!DOCTYPE html>
<html><head><meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style type="text/css"> font { color: red;	} </style>
</head><body>
<form action="userEntry2.do" method="post">
	<font><c:if test="${msg != null }">${msg }</c:if></font>
<table border="1">
	<caption><h2>회원 등록</h2></caption>
	<tr><th>아이디</th><td><input type="text" name="userId" 
		required="required" placeholder="아이디는 필수" /></td></tr>
	<tr><th>암호</th><td><input type="password" name="password"
		required="required"/></td></tr>
	<tr><th>이름</th><td><input type="text" name="userName"
		required="required" placeholder="이름은 중요해"/></td></tr>
	<tr><th>우편번호</th><td><input type="text" name="postCode"
		required="required"/></td></tr>
	<tr><th>주소</th><td><input type="text" name="address"
		required="required"/></td></tr>
	<tr><th>이메일</th><td><input type="email" name="email"
		required="required"/></td></tr>
	<tr><th>직업</th><td><select name="job">
		<option value="수강생" >수강생</option>
		<option value="가수" >가수</option>
		<option value="개그맨">개그맨</option>
		<option value="조폭">조폭</option>
	</select></td></tr>
	<tr><th>생년월일</th><td><input type="date" name="birthday"
		required="required"/></td></tr>
	<tr><td colspan="2"><input type="submit" value="확인">
</table></form>
</body>
</html>