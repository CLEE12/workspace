<%@page import="ch12.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="sessionChk.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="mem" class="ch12.Member"></jsp:useBean>
	<jsp:setProperty property="*" name="mem" />
	<%
		MemberDao md = MemberDao.getInstance();
		int result = md.update(mem);
		if (result > 0) {
	%>

	<script type="text/javascript">
		alert("수정 완료");
		location.href = "main.jsp";
	</script>

	<%
		} else {
	%>

	<script type="text/javascript">
		alert("너 알파고지?");
		history.go(-1);
	</script>

	<%
		}
	%>
</body>
</html>