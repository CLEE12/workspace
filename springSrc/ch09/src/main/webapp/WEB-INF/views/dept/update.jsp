<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp" %>
<!DOCTYPE html>
<html><head><meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title></head><body>
<form action="update.do" method="post">
	<input type="hidden" name="deptno" value="${dept.deptno}">
<table><caption>부서정보 수정</caption>
	<tr><th>부서코드</th><td>${dept.deptno}</td></tr>
	<tr><th>부서명</th><td><input type="text" name="dname"
		required="required" value="${dept.dname}"></td></tr>
	<tr><th>근무지</th><td><input type="text" name="loc"
		required="required" value="${dept.loc}"></td></tr>
	<tr><td colspan="2"><input type="submit" value="확인"></td></tr>	
</table></form>
</body>
</html>