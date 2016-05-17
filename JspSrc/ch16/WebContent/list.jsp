<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
		<c:set var="tot" value="${total }" />
		<c:if test="${list !=null }">
			<c:forEach var="brd" items="${list }">
				<tr>
					<td>${tot}</td>
					<c:if test="${brd.del_yn=='y'}">
						<td colspan='7'>삭제된 글입니다</td>
				</tr>
		</c:if>
		<c:if test="${brd.del_yn != 'y' }">
			<td><c:if test="${brd.re_level > 0 }">
					<c:set var="w" value="${brd.re_level*10}"></c:set>
					<img alt="" src="images/level.gif" width="${w }" height="10">
					<img alt="" src="images/re.gif">
				</c:if> <a href="view.do?num=${brd.num}&pageNum=${nowPage}">
					${brd.subject}</a> <c:if test="${brd.readcount > 20 }">
					<img src='images/hot.gif'>
				</c:if></td>
			<td><a href="mailto:${brd.email}"> ${brd.writer}</a></td>
			<td>${brd.email}</td>
			<td>${brd.readcount}</td>
			<td>${brd.ip}</td>
			<td>${brd.reg_date}</td>
			</tr>
		</c:if>
		<c:set var="tot" value="${tot - 1 }"></c:set>

		</c:forEach>
		</c:if>
		<c:if test="${empty list }">
			<tr>
				<td colspan="7">데이터가 없습니다</td>
			</tr>
		</c:if>
	</table>
	<div align="center">
		<c:if test="${startPage > pagePerBlock}">
			<a href="list.do?pageNum=${startPage-pagePerBlock}">[이전] </a>
		</c:if>
		<c:forEach var="i" begin="${startPage }" end="${endPage }">
			<a href="list.do?pageNum=${i}">[${i}]</a>
		</c:forEach>
		<c:if test="${totalPage > endPage }">
			<a href="list.do?pageNum=${startPage+pagePerBlock}"> [다음]</a>
		</c:if>
		<br>
		<button onclick="location.href='writeForm.do?pageNum=${pageNum}'">글쓰기</button>
	</div>
</body>
</html>
