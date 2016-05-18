<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>
<%@ include file="sessionCheck.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html><head><meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title></head><body>
<table border="1">
	<tr><th>회원정보 수정</th><td>
		<button onclick="location.href='updateForm.do'">수정</button>
	</td></tr>
	<tr><th>회원탈퇴</th><td>
		<button onclick="location.href='delete.do'">탈퇴</button>
	</td></tr>
	<tr><th>로그아웃</th><td>
		<button onclick="location.href='logout.do'">로그아웃</button>
	</td></tr>
</table>
</body>
</html>