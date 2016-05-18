<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html><head><meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title></head><body>
<form:form action="memberEntry.do" method="post" 
		modelAttribute="member">
	<spring:hasBindErrors name="member"><font color="red">
		<c:forEach var="error" items="${errors.globalErrors }">
			<spring:message code="${error.code}"></spring:message>
		</c:forEach></font>
	</spring:hasBindErrors>
	<table>
		<caption><h2>회원가입</h2></caption>
		<tr><th>아이디</th><td><form:input path="id"/><font color="red">
			<form:errors path="id"></form:errors></font></td></tr>
		<tr><th>암호</th><td><form:input path="passwd"/><font color="red">
			<form:errors path="passwd"></form:errors></font></td></tr>
		<tr><th>이름</th><td><form:input path="name"/><font color="red">
			<form:errors path="name"></form:errors></font></td></tr>
		<tr><th>주소</th><td><form:input path="address"/><font color="red">
			<form:errors path="address"></form:errors></font></td></tr>
		<tr><th>전화</th><td><form:input path="tel"/><font color="red">
			<form:errors path="tel"></form:errors></font></td></tr>
		<tr><td colspan="2"><input type="submit" value="확인"> </td>
	</table>
</form:form>
</body>
</html>