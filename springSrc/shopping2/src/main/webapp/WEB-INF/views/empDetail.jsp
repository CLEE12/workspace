<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html><head><meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title></head><body>
<h2>직원 정보</h2>
<table border="1">
	<tr><th>사번</th><td>${emp.empno}</td></tr>
	<tr><th>이름</th><td>${emp.ename}</td></tr>
	<tr><th>업무</th><td>${emp.job}</td></tr>
	<tr><th>관리자 사번</th><td>${emp.mgr}</td></tr>
	<tr><th>입사일</th><td>${emp.hiredate}</td></tr>
	<tr><th>급여</th><td>${emp.sal}</td></tr>
	<tr><th>보너스</th><td>${emp.comm}</td></tr>
	<tr><th>부서코드</th><td>${emp.deptno}</td></tr>
</table>
<a href="empList.do">목록</a>
</body>
</html>