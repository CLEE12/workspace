<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>1부터 100까지의 합</h3>
	<%
		int sum = 0;
		for (int i = 1; /* 이건java주석 */ i <= 100; i++) {
			sum += i;
		}
	%>
	<%=sum%>
	<!-- 이건 html주석 합계 : <%=sum%> -->
	<%-- 이건 jsp주석 합계  : <%=sum%> --%>
</body>
</html>