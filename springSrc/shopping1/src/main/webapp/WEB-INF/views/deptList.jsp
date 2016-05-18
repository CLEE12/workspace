<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html><head><meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="css/comm.css">
</head><body>
<h2>부서정보</h2>
<table border="1">
	<tr><th>부서코드</th><th>부서명</th><th>근무지</th></tr>
<c:forEach var="dept" items="${list }">
	<tr><td>${dept.deptno }</td><td>${dept.dname }</td>
		<td>${dept.loc }</td></tr>
</c:forEach>	
</table>
</body>
</html>