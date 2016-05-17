<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="ch13.*,java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link type="text/css" rel="stylesheet" href="comm.css">
</head>
<body>
	<table border="1">
		<caption>강지수 게시판입니다^^)/</caption>
		<tr>
			<th>번호</th>
			<th>제목</th>
			<th>작성자</th>
			<th>이메일</th>
			<th>조회수</th>
			<th>IP</th>
			<th>작성일</th>
		</tr>
		<%
			int rowPerPage = 10;
			int pagePerBlock = 10;
			String pageNum = request.getParameter("pageNum");
			if (pageNum == null || pageNum.equals("null") || pageNum.equals(""))
				pageNum = "1";
			int nowPage = Integer.parseInt(pageNum);
			BoardDao bd = BoardDao.getInstance();
			int total = bd.selectTotal();
			int totalPage = (int) Math.ceil((double) total / rowPerPage);
			int startRow = (nowPage - 1) * rowPerPage + 1;
			int endRow = startRow + rowPerPage - 1;
			int totalBlk = (int) Math.ceil((double) totalPage / pagePerBlock);
			int startPage = (nowPage - 1) / 10 * 10 + 1;
			int endPage = startPage + pagePerBlock - 1;
			if (endPage > totalPage)
				endPage = totalPage;
			total = total - startRow + 1;
			List<Board> list = bd.selectList(startRow, endRow);
			if (list != null) {
				for (Board brd : list) {
		%>
		<tr>
			<td><%=total--%></td>
			<%
				if (brd.getDel_yn().equals("y")) {
							out.println("<td colspan='7'>삭제된 글입니다</td></tr>");
						} else {
			%>
			<td>
				<%
					if (brd.getRe_level() > 0) {
									int w = brd.getRe_level() * 10;
				%> <img alt="" src="images/level.gif"
				width="<%=w%>" height="10"> <img alt="" src="images/re.gif">
				<%
					}
				%> <a href="view.jsp?num=<%=brd.getNum()%>&pageNum=<%=nowPage%>">
					<%=brd.getSubject()%></a> <%
 	if (brd.getReadcount() > 20)
 					out.println("<img src='images/hot.gif'>");
 %>
			</td>
			<td><a href="mailto:<%=brd.getEmail()%>"> <%=brd.getWriter()%></a></td>
			<td><%=brd.getEmail()%></td>
			<td><%=brd.getReadcount()%></td>
			<td><%=brd.getIp()%></td>
			<td><%=brd.getReg_date()%></td>
		</tr>
		<%
			}
				}
			} else {
		%>
		<tr>
			<td colspan="7">데이터가 없습니다</td>
		</tr>
		<%
			}
		%>
	</table>
	<div align="center">
		<%
			if (startPage > pagePerBlock) {
		%>
		<a href="list.jsp?pageNum=<%=startPage - pagePerBlock%>">[이전] </a>
		<%
			}
			for (int i = startPage; i <= endPage; i++) {
		%>
		<a href="list.jsp?pageNum=<%=i%>">[<%=i%>]
		</a>
		<%
			}
			if (totalPage > endPage) {
		%>
		<a href="list.jsp?pageNum=<%=startPage + pagePerBlock%>"> [다음]</a>
		<%
			}
		%>
		<br>
		<button onclick="location.href='writeForm.jsp?pageNum=<%=pageNum%>'">글쓰기</button>
	</div>
</body>
</html>


