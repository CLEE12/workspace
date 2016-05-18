<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html><head><meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title></head><body>
<c:if test="${not empty msg }">${msg}</c:if>
<table>
	<caption>부서 목록</caption>
	<tr><th>부서코드</th><th>부서명</th><th>근무지</th>
	<th>수정</th><th>삭제</th></tr>
<c:forEach var="dept" items="${list}">
	<tr><td>${dept.deptno }</td>
		<td><a href="empList.do?deptno=${dept.deptno}">
			${dept.dname }</a></td><td>${dept.loc }</td>
		<td><a href="update.do?deptno=${dept.deptno}">수정</a></td>
		<td><a href="delete.do?deptno=${dept.deptno}">삭제</a></td></tr>
</c:forEach>
</table>
<button onclick="location.href='empListAll.do'">전체직원</button>
<button onclick="location.href='deptInsert.do'">부서입력</button>
</body>
</html>