<%@page import="java.util.HashMap"%>
<%@page import="java.util.Map"%>
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
		Map<String, String> addr = new HashMap<>();
		addr.put("kang", "과천");
		addr.put("kim", "김포");
		addr.put("lee", "이천");
		addr.put("choi", "강남");
		request.setAttribute("addr", addr);
		RequestDispatcher rd = request.getRequestDispatcher("addrResult.jsp");
		rd.forward(request, response);
	%>
</body>
</html>