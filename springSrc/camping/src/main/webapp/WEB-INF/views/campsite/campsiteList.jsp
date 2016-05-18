<%@ page contentType="text/html;charset=UTF-8"%>
<%@ include file="../header.jsp" %>
<%@ include file="../mainHeader.jsp" %>
<body>
<!--WRAP-->
<section id="wrap">
	<!--HGROUP-->
	<div class="hgroup"><h1 id="b">캠핑장</h1></div>
	<!--/HGROUP-->
	<form action="selectedcampsite.html" method="post" >		
		<table class="write_table">
		<caption class="skip">캠핑장 선택</caption>
		<col style="width:500px"><col>
		<thead>
			<tr><th scope="row">지도</th>	<th scope="row">비고</th>	</tr>
		</thead>
		<tbody>
		<tr>	
			<td align="center">			
			<c:choose>
				<c:when test="${empty picUrl}">
					<img alt="map" src="images/map.jpg" width="200px" >
				</c:when>
				<c:when test="${not empty picUrl}">
					<img alt="map" src="images/${picUrl }" width="200px" >
				</c:when>
			</c:choose>	
			</td>				
			<td><select name="locCode">
					<option value="100">전체</option>
					<option value="0">서울</option><option value="1">경기도</option>
					<option value="2">강원도</option><option value="3">충청도</option>
					<option value="4">전라도</option><option value="5">경상도</option>
					<option value="6">제주도</option>
				</select>				
				<input type="submit" value="검색">
			</td>							
		</tr>			
		</tbody>
		</table>	
		<!-- CONTENT -->
		<br/><br/>
		<!--SUBHEAD-->
		<div class="hgroup"><h1 id="b">캠핑장 리스트</h1></div>
		<!--/SUBHEAD-->
		<c:set var="num" value="${pb.num }" />
		<table class="list_table">
		<caption class="skip">게시판</caption>	
			<col style="width:30px"><col style="width:100px">
			<col style="width:80px"><col style="width:120px">		
			<col style="width:100px"><col style="width:60px"><col>	
		<thead>
		<tr>
			<th scope="col">번호</th>	<th scope="col">이미지</th>
			<th scope="col">이름</th>	<th scope="col">주소</th>
			<th scope="col">연락처</th><th scope="col">예약</th>
			<th scope="col">홈페이지</th>
		</tr>
		</thead>
		<tbody>
		<c:forEach var="campsite" items="${campSiteList }">
			<tr onMouseOver="background='#FFFF99'"onMouseOut="background=''">		
				<td>${num }</td>
				<td><img alt="상세이미지" width="100px" height="100px" src="admin/upload/${campsite.picUrl }" ></td>	
				<td>${campsite.sName }</td>
				<td>${campsite.address}</td>
				<td>${campsite.phone }</td>	
				<td><c:choose>
					<c:when test="${campsite.reservation == 1 }">예약완료</c:when>
					<c:otherwise>예약가능</c:otherwise>
				</c:choose></td>
				<td  class="al"><a href="http://${campsite.home }">${campsite.home}</a></td>		
			</tr>
		<c:set var="num" value="${num -1 }" />
		</c:forEach>
		</tbody>
		</table>		
		<!--페이징-->
		<p class="paging">
			<c:forEach var="i" begin="${pb.firstPage }" end="${pb.lastPage }">
				<c:if test="${i <= pb.totalPage }">
					<input type="hidden" name="currentPage" value="${i}" />
					<a href="campsiteList.html?currentPage=${i }">${i }</a>
				</c:if>
			</c:forEach>	
		</p>
		<!--/페이징-->		
		<!-- CONTENT -->
	</form>
</section>	
</body>
</html>