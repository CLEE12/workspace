<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>
<!DOCTYPE html>
<html><head><meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style type="text/css">
	span { color: red; }
</style>
</head><body>
<form action="memberEntry.do" method="post" >
	<c:if test="${msg != null}">
		<span>${msg }</span></c:if>
	<table>
		<caption><h2>회원가입</h2></caption>
		<tr><th>아이디</th><td><input type="text" name="id"
			required="required"/></td></tr>
		<tr><th>암호</th><td><input type="password" name="passwd"
			required="required"/></td></tr>
		<tr><th>이름</th><td><input type="text" name="name"
			required="required"/></td></tr>
		<tr><th>주소</th><td><input type="text" name="address"
			required="required"/></td></tr>
		<tr><th>전화</th><td><input type="tel" name="tel"
			required="required" pattern="\d{2,3}-\D{3,4}-\d{4}"
			title="전화번호는 숫자 2,3 - 3,4 - 4입니다"/></td></tr>
		<tr><td colspan="2"><input type="submit" value="확인"></td>
	</table>
</form>
</body>
</html>