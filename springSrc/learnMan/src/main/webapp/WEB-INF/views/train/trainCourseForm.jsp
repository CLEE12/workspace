<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html><html><head><meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="comm.css">
<style type="text/css">th, td { padding: 10px;	}</style>
</head><body>
<table border="1"><caption>훈련과정 등록</caption>
<tr><th>과정년도</th><td><input type="number" name="year"></td>
	<th>회차</th><td><label for="m1">1차</label>
		<input type="radio" name="th" value="1" id="m1">
		<label for="m2">2차</label>
		<input type="radio" name="th" value="2" id="m2"></td></tr>
<tr><th>장소</th><td><input type="text" name="place"></td>
	<th>훈련과정명</th><td><input type="text" name="name"></td></tr>
<tr><th>훈련일수</th><td><input type="number" name="trainDate"></td>
<th>훈련일수</th><td><input type="number" name="trainDuration"></td>
<tr><th>훈련시작일</th><td><input type="date" name="startDate"></td>	
	<th>훈련종료일</th><td><input type="date" name="endDate"></td></tr>
<tr><th>정원</th><td><input type="number" name="quota"></td>
	<th>등록인원</th><td><input type="number" name="enroll"></td></tr>
</table>
</body>
</html>