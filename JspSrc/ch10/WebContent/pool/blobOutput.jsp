<%@page import="javax.sql.DataSource"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" errorPage="../DBError.jsp"
	import="java.sql.*, javax.naming.*, javax.naming.*, java.io.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		String id = request.getParameter("id");
		String sql = "select pic from test where id=?";
		Context ctx = new InitialContext();
		DataSource ds = (DataSource) ctx.lookup("java:comp/env/jdbc/OracleDB");
		Connection conn = ds.getConnection();
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, id);
		ResultSet rs = pstmt.executeQuery();

		if (rs.next()) {
			Blob blob = rs.getBlob(1);
			out.clear();
			out = pageContext.pushBody();
			BufferedOutputStream bos = new BufferedOutputStream(response.getOutputStream());
			InputStream in = blob.getBinaryStream();
			int length = (int) blob.length();
			byte[] buffer = new byte[length];
			while ((length = in.read(buffer)) != -1) {
				bos.write(buffer);
			}
			in.close();
			bos.close();
		}
		rs.close();
		pstmt.close();
		conn.close();
	%>
</body>
</html>