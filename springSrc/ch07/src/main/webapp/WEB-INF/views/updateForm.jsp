<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>
<!DOCTYPE html>
<html><head><meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head><body>
<c:if test="${not empty msg }">
	<script type="text/javascript">alert("${msg}");</script>
</c:if>
<form action="update.do" method="post">
	<input type="hidden" name="id" value="${member.id }">
<table border="1">
	<caption><h2>회원정보 수정</h2></caption>
		<tr><th>암호</th><td><input type="password" name="pass"
		required="required" value="${member.pass }"></td></tr>
	<tr><th>이름</th><td><input type="text" name="name"
		required="required" value="${member.name }"></td></tr>
	<tr><th>전화번호</th><td><input type="tel" name="tel"
		required="required" value="${member.tel }"></td></tr>
	<tr><th>주소</th><td><input type="text" name="addr"
		required="required" value="${member.addr }"></td></tr>
	<tr><th>가입일</th><td>${member.regDate}</td></tr>
	<tr><td colspan="2" align="center">
		<input type="submit" value="확인"></td></tr>
</table></form>
</body>
</html>