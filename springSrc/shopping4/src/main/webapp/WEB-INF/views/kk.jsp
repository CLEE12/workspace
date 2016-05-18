<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html><head><meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title></head><body>
<form:form action="userEntry.do" method="post" modelAttribute="user">
	<spring:hasBindErrors name="user"><font color="red">
		<c:forEach var="error" items="${errors.globalErrors}">
			<spring:message code="${error.code}"></spring:message>
		</c:forEach>		
	</font></spring:hasBindErrors>
<table border="1">
	<caption><h2>회원 등록 대박</h2></caption>
	<tr><th>아이디</th><td><form:input path="userId"/>
		<font color="red"><form:errors path="userId"/></font></td></tr>
	<tr><th>암호</th><td><form:password path="password"/>
		<font color="red"><form:errors path="password"/></td></tr>
	<tr><th>이름</th><td><form:input path="userName"/>
		<font color="red"><form:errors path="userName"/></td></tr>
	<tr><th>우편번호</th><td><form:input path="postCode"/>
		<font color="red"><form:errors path="postCode"/></td></tr>
	<tr><th>주소</th><td><form:input path="address"/>
		<font color="red"><form:errors path="address"/></td></tr>
	<tr><th>이메일</th><td><form:input path="email"/>
		<font color="red"><form:errors path="email"/></td></tr>
	<tr><th>직업</th><td><form:select path="job">
		<form:option value="수강생" label="수강생"></form:option>
		<form:option value="가수" label="가수"></form:option>
		<form:option value="개그맨" label="개그맨"></form:option>
		<form:option value="조폭" label="조폭"></form:option>
	</form:select></td></tr>
	<tr><th>생년월일</th><td><form:input path="birthday"/>
		<font color="red"><form:errors path="birthday"/></td></tr>
	<tr><td colspan="2"><input type="submit" value="확인">
</table>
</form:form>
</body>
</html>