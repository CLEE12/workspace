<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html><head><meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title></head><body>
<h2>직원정보</h2>
<table border="1">
	<tr><th>사번</th><th>이름</th><th>업무</th><th>급여</th></tr>
<c:forEach var="emp" items="${list }">
	<tr><td>${emp.empno}</td>
		<td><a href="empDetail.do?empno=${emp.empno}">
			${emp.ename}</a></td>
		<td>${emp.job}</td><td>${emp.sal}</td></tr>
</c:forEach>
</table>
</body>
</html>