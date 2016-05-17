<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="ch12.*"%>
<%@ include file="sessionChk.jsp"%>
<%
	MemberDao md = MemberDao.getInstance();
	Member mem = md.select(id);
%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="comm.css">
<script type="text/javascript">
	function chk() {
		if (frm.passwd.value != frm.passwd2.value) {
			alert("암호를 다시 입력하세요");
			frm.passwd.value = "";
			frm.passwd2.value = "";
			frm.passwd.focus();
			return false;
		}
		return true;
	}
</script>
</head>
<body>
	<form action="updatePro.jsp" name="frm" onsubmit="return chk()">
		<table border="1">
			<caption>회원가입</caption>
			<tr>
				<th>아이디</th>
				<td><%=id%><input type="hidden" name="id"
					value="<%=mem.getId()%>"></td>
			</tr>
			<tr>
				<th>암호</th>
				<td><input type="password" name="passwd" required="required"
					value="<%=mem.getPasswd()%>"></td>
			</tr>
			<tr>
				<th>암호확인</th>
				<td><input type="password" name="passwd2" required="required"></td>
			</tr>
			<tr>
				<th>이름</th>
				<td><input type="text" name="name" required="required"
					value="<%=mem.getName()%>"></td>
			</tr>
			<tr>
				<th>주소</th>
				<td><input type="text" name="address" required="required"
					value="<%=mem.getAddress()%>"></td>
			</tr>
			<tr>
				<th>전화번호</th>
				<td><input type="text" name="tel" required="required"
					placeholder="xxx-xxxx-xxxx" pattern="\d{2,3}-\d{3,4}-\d{4}"
					value="<%=mem.getTel()%>"></td>
			</tr>
			<tr>
				<td colspan="2" align="center"><input type="submit" value="확인"></td>
			</tr>
		</table>
	</form>
</body>
</html>