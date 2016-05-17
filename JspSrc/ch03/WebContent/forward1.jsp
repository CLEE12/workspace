<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		int num1 = Integer.parseInt(request.getParameter("num1"));
		int num2 = Integer.parseInt(request.getParameter("num2"));
		request.setAttribute("add", num1 + num2);
		request.setAttribute("min", num1 - num2);
		request.setAttribute("mul", num1 * num2);
		request.setAttribute("div", num1 / num2);
		RequestDispatcher rd = request.getRequestDispatcher("result1.jsp");
		// rd.forward(request, response);
		rd.include(request, response);
	%>
	전달 되나
</body>
</html>