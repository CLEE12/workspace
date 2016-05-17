<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>1부터 100까지 합 : ${sum }</h3>

	<%-- <%
String sum = request.getAttribute("sum").toString();
%>
<%=sum %> --%>

	<%=request.getAttribute("sum")%>
</body>
</html>