<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html><head><meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title></head><body>
<h2>전 직원 목록</h2>
<table>
	<tr><th>사번</th><th>이름</th><th>업무</th>
		<th>입사일</th><th>급여</th><th>부서코드</th>
		<th>부서명</th><th>근무지</th></tr>
<c:forEach var="emp" items="${list }">
		<tr><td>${emp.empno}</td><td>${emp.ename}</td>
			<td>${emp.job }</td><td>${emp.hiredate}</td>
			<td>${emp.sal }</td><td>${emp.deptno}</td>
			<td>${emp.dname}</td><td>${emp.loc }</td></tr>
</c:forEach>
</table>
<button onclick="location.href='deptList.do'">부서 목록</button>
</body>
</html>