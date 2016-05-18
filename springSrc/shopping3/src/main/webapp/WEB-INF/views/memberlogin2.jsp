<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>
<!DOCTYPE html>
<html><head><meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title></head><body>
<form action="memberlogin2.do" method="post">
	<c:if test="${not empty msg }">
		<font color="red">${msg }</font>
	</c:if>
<table border="1">
		<caption><h2>로그인</h2></caption>
	<tr><th>아이디</th><td><input type="text" name="id"
		required="required"></td></tr>
	<tr><th>암호</th><td><input type="password" name="passwd"
		required="required"></td></tr>
	<tr><td colspan="2"><input type="submit" value="확인"></td></tr>
</table>
</form>
</body>
</html>