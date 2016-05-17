<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="ch12.*,java.util.*"%>
<%@ include file="sessionChk.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="comm.css">
</head>
<body>
	<table border="1">
		<caption>회원 목록</caption>
		<tr>
			<th>아이디</th>
			<th>이름</th>
			<th>주소</th>
			<th>전화</th>
			<th>등록일</th>
		</tr>
		<%
			int rowPerPage = 10;
			int pagePerBlock = 10;
			String pageNum = request.getParameter("pageNum");
			if (pageNum == null || pageNum.equals("null") || pageNum.equals(""))
				pageNum = "1";
			int nowPage = Integer.parseInt(pageNum);
			MemberDao md = MemberDao.getInstance();
			int total = md.selectTotal();
			int totalPage = (int) Math.ceil((double) total / rowPerPage);
			int startRow = (nowPage - 1) * rowPerPage + 1;
			int endRow = startRow + rowPerPage - 1;
			int totalBlk = (int) Math.ceil((double) totalPage / pagePerBlock);
			int startPage = (nowPage - 1) / 10 * 10 + 1;
			int endPage = startPage + pagePerBlock - 1;
			if (endPage > totalPage)
				endPage = totalPage;
			List<Member> list = null;
			if (id != null && id.equals("master")) {
				list = md.selectList(startRow, endRow);
				for (Member mem : list) {
		%>
		<tr>
			<td><%=mem.getId()%></td>
			<td><%=mem.getName()%></td>
			<td><%=mem.getAddress()%></td>
			<td><%=mem.getTel()%></td>
			<td><%=mem.getReg_date()%></td>
		</tr>
		<%
			}
				out.println("</table>");
			} else {
		%>
		<script type="text/javascript">
			alert("권한이없습니다");
			history.go(-1);
		</script>
		<%
			}
		%>
	
</body>
<div align="center">
	<%
		if (startPage > pagePerBlock) {
	%>
	<a href="selectList.jsp?pageNum=<%=startPage - pagePerBlock%>">[이전] </a>
	<%
		}
		for (int i = startPage; i <= endPage; i++) {
	%>
	<a href="selectList.jsp?pageNum=<%=i%>">[<%=i%>]
	</a>
	<%
		}
		if (totalPage > endPage) {
	%>
	<a href="selectList.jsp?pageNum=<%=startPage + pagePerBlock%>"> [다음]</a>
	<%
		}
	%>
</div>
</html>