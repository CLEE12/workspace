<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%-- <%
	String pet = request.getParameter("pet");
%>
당신이 좋아하는 애완동물은 <%=pet %>입니다.<p> --%>
	<h3>EL Language</h3>
	${param.pet }
	<%-- ${param.pet }은 getParemeter값을 가져온다.--%>
</body>
</html>