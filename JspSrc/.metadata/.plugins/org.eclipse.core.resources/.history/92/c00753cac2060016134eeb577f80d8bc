<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border="1" bgcolor="#F2FF92" width="100%">
		<caption>
			<h2>구구단</h2>
		</caption>
		<tr bgcolor="cyan">
			<%
				for (int i = 2; i <= 9; i++) {
					out.println("<th>" + i + "단</th>");
				}
				out.println("</tr>");
				for (int i = 1; i <= 9; i++) {
					out.println("<tr>");
					for (int j = 2; j <= 9; j++) {
						if (j % 2 == 0)
							out.println("<td>" + j + " * " + i + " = " + i * j + "</td>");
						else
							out.println("<td bgcolor=#9BFF94>" + j + " * " + i + " = " + i * j + "</td>");
					}
					out.println("</tr>");
				}
			%>
		
	</table>
</body>
</html>