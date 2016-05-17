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
		/* request.setCharacterEncoding("utf-8") */
		//이걸 사용하려는 경우 person.html form에 method="post"를 추가하고
		//밑에 name있는 String을 삭제하면 대체로 사용할 수 있다.
		String name = request.getParameter("name");
		String addr = request.getParameter("addr");
	%>
	<%=name%>님
	<%=addr%>에 사시는 군요.
</body>
</html>