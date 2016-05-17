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
				int i = 2, j = 1;
				do {
					out.println("<th>" + i + "단</th>");
					i++;
				} while (i <= 9);
				out.println("</tr><tr>");
				i = 2;
				do {
					if (i % 2 == 0)
						out.println("<td>");
					else
						out.println("<td bgcolor=#9BFF94>");
					do {
						out.println(i + " * " + j + " = " + i * j + "<br>");
						j++;
					} while (j <= 9);
					out.println("</td>");
					j = 2;
					i++;
				} while (i <= 9);
				out.println("</tr>");
			%>
		
	</table>
</body>
</html>