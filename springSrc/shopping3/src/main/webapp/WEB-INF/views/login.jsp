<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>
<!DOCTYPE html> 
<html><head><meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title></head><body><h2>로그인</h2>
<form:form method="post" action="login.do" modelAttribute="user">
	<spring:hasBindErrors name="user"><font color="red">
		<c:forEach var="error" items="${errors.globalErrors}">
			<spring:message code="${error.code}"/>
		</c:forEach>		
	</font></spring:hasBindErrors>
<table>
	<tr><th>아이디</th><td><form:input path="userId"/>
		<font color="red">
		<form:errors path="userId"></form:errors></font></td></tr>
	<tr><th>암호</th><td><form:password path="password"/>
		<font color="red">
		<form:errors path="password"></form:errors></font></td></tr>
	<tr><td colspan="2"><input type="submit" value="확인"></td>	
</table></form:form>
</body></html>