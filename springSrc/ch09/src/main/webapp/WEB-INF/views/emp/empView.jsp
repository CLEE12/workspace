<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp" %>
<!DOCTYPE html><html><head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title></head><body>
<table><caption>사원정보 상세</caption>
	<tr><th>사번</th><td>${emp.empno}</td></tr>
	<tr><th>이름</th><td>${emp.ename}</td></tr>
	<tr><th>업무</th><td>${emp.job}</td></tr>
	<tr><th>관리자사번</th><td>${emp.mgr}</td></tr>	
	<tr><th>입사일</th><td>${emp.hiredate}</td></tr>
	<tr><th>급여</th><td>${emp.sal}</td></tr>
	<tr><th>보너스</th><td>${emp.comm}</td></tr>
	<tr><th>부서코드</th><td>${emp.deptno}</td></tr>	
</table>
<button onclick="location.href='deptList.do'">부서목록</button>
<button onclick="location.href='empList.do?deptno=${emp.deptno}'">
	직원목록</button>
<button onclick="location.href='empUpdate.do?empno=${emp.empno}'">
	수정</button>
<button onclick="location.href='empDelete.do?empno=${emp.empno}&deptno=${emp.deptno}'">
	삭제</button>
</body>
</html>