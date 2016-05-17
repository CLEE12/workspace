<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" errorPage="../DBError.jsp"
	import="java.sql.*,javax.sql.*,javax.naming.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border="1">
		<caption>
			<h2>부서 리스트</h2>
		</caption>
		<tr>
			<%
				Context ctx = new InitialContext();
				DataSource ds = (DataSource) ctx.lookup("java:comp/env/jdbc/OracleDB");
				Connection conn = ds.getConnection();
				String sql = "select * from dept";
				PreparedStatement pstmt = conn.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery();
				ResultSetMetaData rsmd = rs.getMetaData();
				for (int i = 1; i <= rsmd.getColumnCount(); i++) {
					out.println("<th>" + rsmd.getColumnName(i) + "</th>");
				}
				out.println("</tr>");
				if (rs.next()) {
					do {
						out.println("<tr><td>" + rs.getInt(1) + "</td>");
						out.println("<td>" + rs.getString(2) + "</td>");
						out.println("<td>" + rs.getString(3) + "</td></tr>");
					} while (rs.next());
				} else
					out.println("데이터가 없네");
				rs.close();
				pstmt.close();
				conn.close();
			%>
		
	</table>
</body>
</html>