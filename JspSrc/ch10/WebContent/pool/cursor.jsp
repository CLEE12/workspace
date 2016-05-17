<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="java.sql.*, javax.naming.*, javax.sql.*"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		Context ctx = new InitialContext();
		DataSource ds = (DataSource) ctx.lookup("java:comp/env/jdbc/OracleDB");
		Connection conn = ds.getConnection();
		String sql = "select * from dept";
		PreparedStatement pstmt = conn.prepareStatement(sql, ResultSet.TYPE_SCROLL_SENSITIVE,
				ResultSet.CONCUR_READ_ONLY);
		ResultSet rs = pstmt.executeQuery();

		rs.last();
		out.println("부서코드 : " + rs.getInt(1) + "<br>");
		out.println("부서명 : " + rs.getString(2) + "<p>");
		rs.first();
		out.println("부서코드 : " + rs.getInt(1) + "<br>");
		out.println("부서명 : " + rs.getString(2) + "<p>");
		rs.absolute(3);
		out.println("부서코드 : " + rs.getInt(1) + "<br>");
		out.println("부서명 : " + rs.getString(2) + "<p>");
		rs.close();
		pstmt.close();
		conn.close();
	%>

</body>
</html>