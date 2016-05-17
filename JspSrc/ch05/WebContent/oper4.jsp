<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" errorPage="error.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>두수의 연산</h2>
	<%
		int num1 = Integer.parseInt(request.getParameter("num1"));
		int num2 = Integer.parseInt(request.getParameter("num2"));
		int add = num1 + num2;
		int min = num1 - num2;
		int mul = num1 * num2;
		int div = num1 / num2;
	%>
	덧셈 :
	<%=num1%>
	+
	<%=num2%>
	=
	<%=add%><p>
		뺄셈 :
		<%=num1%>
		-
		<%=num2%>
		=
		<%=min%>
	<p>
		곱셈 :
		<%=num1%>
		*
		<%=num2%>
		=
		<%=mul%>
	<p>
		나눗셈 :
		<%=num1%>
		/
		<%=num2%>
		=
		<%=div%>
	<p>
</body>
</html>