<%@page import="java.util.*,ch07.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	${value=[20, 17, 30, 2, 9, 23]}
	<br> 최소값 : ${value.stream().min().get() }
	<p>

		<%
			List<Member> list = new ArrayList<>();
			list.add(new Member("이순신", 23));
			list.add(new Member("강감찬", 18));
			list.add(new Member("을지문덕", 45));
			list.add(new Member("양만춘", 21));
			request.setAttribute("list", list);
		%>
		${maxAgeMember = list.stream().max((m1,m2) -> m1.age.compareTo(m2.age));''}
		이름 : ${maxAgeMember.get().name }<br> 나이 :
		${maxAgeMember.get().age}세<br>
</body>
</html>