<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html><head><meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title></head><body>
<form:form modelAttribute="editCustomer">
<table border="1">
	<caption><h2>입력화면</h2></caption>
	<tr><th>이름</th><td><form:input path="name"/>
		<form:errors path="name"></form:errors></td></tr>
	<tr><th>주소</th><td><form:input path="address"/>
		<form:errors path="address"></form:errors></td></tr>
	<tr><th>이메일</th><td><form:input path="email"/>
		<form:errors path="email"></form:errors></td></tr>
	<tr><td colspan="2"><button name="_event_proceed" 
		value="proceed">다음</button>
</table></form:form>
</body>
</html>