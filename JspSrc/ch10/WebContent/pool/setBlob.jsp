<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" errorPage="../DBError.jsp"
	import="java.sql.*,javax.sql.*,javax.naming.*,java.io.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		String ct = application.getRealPath("/pool/testImage.jpg");
		String sql = "insert into test values('aa',?)";
		File file = new File(ct);
		InputStream is = new FileInputStream(file);
		int size = (int) file.length();
		Context ctx = new InitialContext();
		DataSource ds = (DataSource) ctx.lookup("java:comp/env/jdbc/OracleDB");
		Connection conn = ds.getConnection();
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setBinaryStream(1, is, size);
		int result = pstmt.executeUpdate();
		is.close();
		pstmt.close();
		conn.close();
		if (result > 0)
			out.println("입력 성공");
		else
			out.println("입력 실패");
	%>
</body>
</html>