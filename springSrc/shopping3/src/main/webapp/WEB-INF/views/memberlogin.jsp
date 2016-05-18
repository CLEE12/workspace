<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html><head><meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title></head><body>
<h2>멤버 로그인</h2>
<form:form action="memberlogin.do" method="post" modelAttribute="member">
	<spring:hasBindErrors name="member"><font color="red">
		<c:forEach var="error" items="${errors.globalErrors }">
			<spring:message code="${error.code}"/>
		</c:forEach>	
	</font></spring:hasBindErrors>
	<table border="1">
		<tr><th>아이디</th><td><form:input path="id"/><font color="red">
			<form:errors path="id"></form:errors></font></td></tr>
		<tr><th>암호</th><td><form:password path="passwd"/><font color="red">
			<form:errors path="passwd"></form:errors></font></td></tr>
		<tr><td colspan="2"><input type="submit" value="확인"></td></tr>
	</table>
</form:form>
</body>
</html>