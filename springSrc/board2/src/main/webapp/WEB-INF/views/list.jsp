<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<%@ include file="header.jsp" %>
<!DOCTYPE html><html><head><meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title></head><body>
<table border="1"><caption>게시판 목록</caption>
	<tr><th width="40">번호</th><th width="60">제목</th>
		<th width="30">작성자</th><th width="50">이메일</th>
		<th width="40">조회수</th><th>IP</th><th width="90">작성일</th></tr>
<c:set var="no" value="${pb.no}"></c:set>
<c:forEach var="brd" items="${list}">
<c:if test="${brd.del_yn!='y'}">
	<tr><td>${no}</td><td>
			<c:if test="${brd.re_step>0}">
				<img alt="" src="images/level.gif" height="10"
					width="${brd.re_step*10}">
				<img alt="" src="images/re.gif">
			</c:if>	
			<a href="view.do?num=${brd.num}&pageNum=${pb.currentPage}">
				${brd.subject}</a>		
			<c:if test="${brd.readcount >30}">
				<img alt="" src="images/hot.gif">
			</c:if></td>
		<td>${brd.writer}</td><td>${brd.email}</td>
		<td>${brd.readcount }</td><td>${brd.ip}</td>
		<td>${brd.reg_date}</td></tr>
</c:if>
<c:if test="${brd.del_yn=='y' && keyword==null}">
	<tr><td>${no}</td><td colspan="6">삭제된 글입니다</td></tr>
</c:if>
<c:set var="no" value="${no - 1}"></c:set>
</c:forEach></table>
<div align="center">
	<c:if test="${pb.startPage > pb.pagePerBlock }">
		<a href="list.do?pageNum=${pb.endPage-pb.pagePerBlock}">[이전]</a> 
	</c:if>
	<c:forEach var="i" begin="${pb.startPage}" end="${pb.endPage}">
		<c:if test="${keyword==null }">
			<a href="list.do?pageNum=${i}">${i}</a>
		</c:if>
		<c:if test="${keyword!=null }">
			<a href="list.do?pageNum=${i}&search=${search}&keyword=${keyword}">${i}</a>
		</c:if>
	</c:forEach>
	<c:if test="${pb.totPage > pb.endPage}">
		<a href="list.do?pageNum=${pb.startPage+pb.pagePerBlock}">[다음]</a> 
	</c:if>
</div>
<a href="writeForm.do?pageNum=1">글쓰기</a><br>
<form action="list.do">
	<select name="search">
		<c:if test="${keyword != null}">
			<option value="${search }">
				<c:if test="${search=='writer' }">작성자</c:if>
				<c:if test="${search=='subject' }">제목</c:if>
				<c:if test="${search=='content' }">내용</c:if>
			</option>
		</c:if>
		<option value="subject">제목</option>
		<option value="writer">작성자</option>
		<option value="content">내용</option>
	</select>
	<input type="search" name="keyword" value="${keyword }">
	<input type="submit" value="확인">
</form>
</body>
</html>