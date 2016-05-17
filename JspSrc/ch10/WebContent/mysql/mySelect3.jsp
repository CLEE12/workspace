<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="java.sql.*,java.util.*,ch10.*"
	errorPage="../DBError.jsp"%>
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
		String sql = "select * from personal";
		List<Personal> list = new ArrayList<>();
		Class.forName(driver);
		Connection conn = DriverManager.getConnection(url, "root", "mysql");
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery(sql);
		while (rs.next()) {
			Personal p = new Personal();
			p.setPno(rs.getInt("pno"));
			p.setPname(rs.getString("pname"));
			p.setJob(rs.getString("job"));
			p.setPay(rs.getInt("pay"));
			list.add(p);
		}
		request.setAttribute("list", list);
		rs.close();
		stmt.close();
		conn.close();
	%>
	<jsp:forward page="mySelect3Result.jsp"></jsp:forward>
</body>
</html>