<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="java.sql.*" errorPage="DBError.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		int dno = Integer.getInteger(request.getParameter("dno"));
		String dname = request.getParameter("dname");
		String phone = request.getParameter("phone");
		String Position = request.getParameter("Position");
		String driver = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://127.0.0.1:3306/test";
		String sql = String.format("update division set dname='%s', phone='%s', Position='%s'" + "where dno=%s",
				dname, phone, Position, dno);
		Class.forName(driver);
		Connection conn = DriverManager.getConnection(url, "root", "mysql");
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, dname);
		pstmt.setString(2, phone);
		pstmt.setString(3, Position);
		pstmt.setInt(4, dno);
		int result = pstmt.executeUpdate(sql);
		pstmt.close();
		conn.close();
	%>
	<script type="text/javascript">
		alert("수정 성공");
		location.href = "mysqlUpdateSelect.jsp"
	</script>

</body>
</html>