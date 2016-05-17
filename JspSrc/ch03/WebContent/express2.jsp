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
		// 요건 주석
		String name = "설거지";
	%>
	<%-- <%=add %> --%>
	<!-- scriptlet은 순서가 지켜야 한다 -->
	<%
		String add = name + " 에이 설현이여 !~";
	%>
	<%=name%><p>
</body>
</html>