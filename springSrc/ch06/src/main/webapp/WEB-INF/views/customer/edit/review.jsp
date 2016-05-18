<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html><head><meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title></head><body>
<form action="" method="post">
<table border="1">
	<caption><h2>확인화면</h2></caption>
	<tr><th>이름</th><td>${editCustomer.name }</td></tr>
	<tr><th>주소</th><td>${editCustomer.address }</td></tr>
	<tr><th>이메일</th><td>${editCustomer.email }</td></tr>
	<tr><td><button type="submit" 
			name="_event_confirmed">갱신</button></td>
		<td><button type="submit"
			name="_event_revise">재입력</button></td></tr>
</table>
</form>
</body>
</html>