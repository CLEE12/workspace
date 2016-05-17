<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="java.sql.*" errorPage="../DBError.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border="1">
		<caption>
			<h2>직원정보</h2>
		</caption>
		<tr>
			<th>사번</th>
			<th>이름</th>
			<th>업무</th>
			<th>급여</th>
		</tr>
		<%
			String driver = "com.mysql.jdbc.Driver";
			String url = "jdbc:mysql://127.0.0.1:3306/test?useSSL=false";
			String sql = "select * from personal";
			Class.forName(driver);
			Connection conn = DriverManager.getConnection(url, "root", "mysql");
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				int pno = rs.getInt("pno");
				String pname = rs.getString("pname");
				String job = rs.getString("job");
				int pay = rs.getInt("pay");
				out.println("<tr><td>" + pno + "</td><td>" + pname + "</td>");
				out.println("<td>" + job + "</td><td>" + pay + "</td></tr>");
			}
			rs.close();
			stmt.close();
			conn.close();
		%>
	</table>
</body>
</html>