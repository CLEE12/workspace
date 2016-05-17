<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	2^1 =
	<%=power(2, 1)%><br> 2^2 =
	<%=power(2, 2)%><br> 2^3 =
	<%=power(2, 3)%><br> 2^4 =
	<%=power(2, 4)%><br> 2^5 =
	<%=power(2, 5)%><br>
	<%!//method는 선언부에서 만든다 즉 선언부는 멤버변수와 메소드 사용
	int power(int x, int y) {
		int result = 1;
		for (int i = 1; i <= y; i++) {
			result *= x;
		}
		return result;
	}%>
</body>
</html>