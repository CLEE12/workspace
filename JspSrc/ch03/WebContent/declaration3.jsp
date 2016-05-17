<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	1의 3승 =
	<%=power(1)%><br> 2의 3승 =
	<%=power(2)%><br> 3의 3승 =
	<%=power(3)%><br> 4의 3승 =
	<%=power(4)%><br> 5의 3승 =
	<%=power(5)%><br>
	<%!int power(int x) {
		return x * x * x;
	}%>
</body>
</html>