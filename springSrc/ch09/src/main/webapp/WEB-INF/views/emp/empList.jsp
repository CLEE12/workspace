<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html><head><meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title></head><body>
<h2>직원 목록</h2>
부서 : ${dept.dname}(${dept.deptno}) 근무지 : ${dept.loc }
<table>
	<tr><th>사번</th><th>이름</th><th>업무</th>
		<th>입사일</th><th>급여</th></tr>
<c:if test="${not empty list }">
	<c:forEach var="emp" items="${list }">
		<tr><td>${emp.empno}</td><td>
			<a href="empView.do?empno=${emp.empno}">${emp.ename}</a></td>
			<td>${emp.job }</td><td>${emp.hiredate }</td>
			<td>${emp.sal }</td></tr>
</c:forEach></c:if>
<c:if test="${empty list }">
	<tr><td colspan="5">직원이 아무도 없네 ! 대박사건 ㅋㅋ</td></tr>
</c:if>
</table>
<button onclick="location.href='deptList.do'">부서 목록</button>
<button onclick="location.href='insertEmp.do?deptno=${dept.deptno}'">직원정보입력</button>
</body>
</html>