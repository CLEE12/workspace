<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="ch12.*"%>
<%@ include file="sessionChk.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		String passwd = request.getParameter("passwd");
		MemberDao md = MemberDao.getInstance();
		int chk = md.loginChk(id, passwd);
		if (chk == 1) {
			int result = md.delete(id);
			if (result > 0) {
				session.invalidate();
	%>
	<script type="text/javascript">
		alert("안뇽히 ...");
		location.href = "main.jsp";
	</script>
	<%
		} else {
	%>
	<script type="text/javascript">
		alert("허걱!!   에러");
		history.go(-1);
	</script>
	<%
		}
		} else {
	%>
	<script type="text/javascript">
		alert("암호가 다릅니다");
		history.go(-1);
	</script>
	<%
		}
	%>
</body>
</html>