<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="ch13.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		request.setCharacterEncoding("utf-8");
	%>
	<jsp:useBean id="board" class="ch13.Board"></jsp:useBean>
	<jsp:setProperty property="*" name="board" />
	<%
		String pageNum = request.getParameter("pageNum");
		String ip = request.getRemoteAddr();
		board.setIp(ip);
		BoardDao bd = BoardDao.getInstance();
		int result = bd.insert(board);
		if (result > 0)
			response.sendRedirect("list.jsp?pageNum=" + pageNum);
		else {
	%>
	<script type="text/javascript">
		alert("잘해 !");
		history.go(-1);
	</script>
	<%
		}
	%>
</body>
</html>