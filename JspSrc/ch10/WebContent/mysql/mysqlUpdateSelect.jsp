<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="java.sql.*,java.util.*,ch10.*"
	errorPage="DBError.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		String driver = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://127.0.0.1:3306/test?useSSL=false";
		String sql = "select * from division";

		List<Division> list = new ArrayList<>();
		Class.forName(driver);
		Connection conn = DriverManager.getConnection(url, "root", "mysql");
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery(sql);

		while (rs.next()) {
			Division d = new Division();
			d.setDno(rs.getInt(1));
			d.setDname(rs.getString(2));
			d.setPhone(rs.getString(3));
			d.setPosition(rs.getString(4));
			list.add(d);
		}

		rs.close();
		stmt.close();
		conn.close();
		request.setAttribute("list", list);
	%>
	<jsp:forward page="mysqlDeptList.jsp"></jsp:forward>
</body>
</html>