<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html><head><meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title></head><body>
<table border="1">
	<caption><h2>고객정보</h2></caption>
	<tr><th>아이디</th><th>이름</th><th>주소</th><th>이메일</th>
		<th>상세</th><th>편집</th></tr>
<c:forEach var="customer" items="${list }">
	<tr><td>${customer.id}</td><td>${customer.name }</td>
		<td>${customer.address }</td><td>${customer.email }</td>
		<td><c:url var="url1" value="/customer/${customer.id}"/>
			<a href="${url1}">상세</a></td>
		<td><c:url var="url2" value="customer/${customer.id}/edit"/>
			<a href="${url2}">편집</a></td>
		</tr>
</c:forEach>	
</table>
</body>
</html>