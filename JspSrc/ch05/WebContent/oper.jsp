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
		try {
			int num1 = Integer.parseInt(request.getParameter("num1"));
			int num2 = Integer.parseInt(request.getParameter("num2"));
			int add = num1 + num2;
			int min = num1 - num2;
			int mul = num1 * num2;
			double div = (double) num1 / num2; //(double)을 입력안하면 div에 입력받는 값은 int이다.
	%>
	<h2>두수의 연산</h2>
	덧셈 :
	<%=num1%>+<%=num2%>
	=<%=add%><p>
		뺄셈 :
		<%=num1%>-<%=num2%>
		=<%=min%>
	<p>
		곱셈 :
		<%=num1%>*<%=num2%>
		=<%=mul%>
	<p>
		나눗셈 :
		<%=num1%>/<%=num2%>
		=<%=div%>
	<p>

		<%
			} catch (NumberFormatException e) {
				out.print("숫자를 입력하세요.");
			} catch (ArithmeticException e) {
				out.println("0으로 나눌 수 없습니다.");
			}
		%>
	
</body>
</html>