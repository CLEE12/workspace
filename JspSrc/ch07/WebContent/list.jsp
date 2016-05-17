<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="java.util.*,ch07.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	${ value =[20, 17, 30, 2, 9, 23]}
	<br> 작은순서 : ${ minSort=value.stream().sorted().toList() }
	<br> 큰순서 : ${maxSort=value.stream()
	.sorted((x,y)-> x<y?1:-1).toList() }
	<p>
		<%
			List<Member> list = new ArrayList<>();
			list.add(new Member("이순신", 23));
			list.add(new Member("강감찬", 18));
			list.add(new Member("을지문덕", 45));
			list.add(new Member("양만춘", 21));
			request.setAttribute("list", list);
		%>
		작은 순서 : ${minageMan=list.stream()
	.sorted((m1,m2)->m1.age.compareTo(m2.age)).toList() }<br>
		큰순서 : ${maxageMan=list.stream()
	.sorted((m1,m2)->m2.age.compareTo(m1.age)).toList() }<br>
		작은 순서 : ${minMan=list.stream()
	.sorted((m1,m2)->m1.name.compareTo(m2.name)).toList() }<br>
		큰순서 : ${maxMan=list.stream()
	.sorted((m1,m2)->m2.name.compareTo(m1.name)).toList() }<br>
		${maxageMan }
</body>
</html>