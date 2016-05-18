<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html><html><head><meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="comm.css">
</head><body>
<table border="1"><caption>지원자 등록</caption>
<tr><th>이름</th><td><input type="text" name="name"></td>
	<th>생년월일</th><td><input type="date" name="birthday"></td></tr>
<tr><th>전화</th><td><input type="tel" name="tel"></td>
	<th>비상전화</th><td><input type="tel" name="emerTel"></td></tr>
<tr><th>이메일</th><td colspan="3"><input type="email" name="email"></td></tr>
<tr><th>주소</th><td colspan="3"><input type="text" name="addr" size="50"></td></tr>	
<tr><th>사진</th><td colspan="3"><input type="file" name="photo"></td></tr>
<tr><th>학교</th><td><input type="text" name="school"></td>
	<th>전공</th><td><input type="text" name="major"></td></tr>
<tr><th>졸업일</th><td><input type="date" name="gradDate"></td>
	<th>졸업여부</th><td><label for="m1">졸업</label>
		<input type="radio" name="gradYesNo" id="m1" value="1"> 
		<label for="m2">중퇴</label>
		<input type="radio" name="gradYesNo" id="m2" value="2" >
		<label for="m3">예정</label>
		<input type="radio" name="gradYesNo" id="m3" value="3"></td></tr>
<tr><th>훈련과정코드</th><td colspan="3"><select></select></td></tr>
<tr><td colspan="4"><table><tr><th>자격증</th><th>취득일</th><th>시행처</th></tr>
		<tr><td><input type="text" name="cert1"></td>
			<td><input type="date" name="acq1"></td>
			<td><input type="text" name="issu1"></td></tr>
		<tr><td><input type="text" name="cert2"></td>
			<td><input type="date" name="acq2"></td>
			<td><input type="text" name="issu2"></td></tr>
		<tr><td><input type="text" name="cert3"></td>
			<td><input type="date" name="acq3"></td>
			<td><input type="text" name="issu3"></td></tr>
</table></td></tr>	
<tr><td colspan="4"><table><tr><th>사용가능SW</th><th>수준</th><th>상세</th></tr>
		<tr><td><input type="text" name="useSw1"></td>
			<td><label for="s1">상</label>
				<input type="radio" name="level1" id="s1" value="상"> 
				<label for="s2">중</label>
				<input type="radio" name="level1" id="s2" value="중" >
				<label for="s3">하</label>
				<input type="radio" name="level1" id="s3" value="하"></td>
			<td><input type="text" name="descrip1"></td></tr>
		<tr><td><input type="text" name="useSw2"></td>
			<td><label for="s4">상</label>
				<input type="radio" name="level2" id="s4" value="상"> 
				<label for="s5">중</label>
				<input type="radio" name="level2" id="s5" value="중" >
				<label for="s6">하</label>
				<input type="radio" name="level2" id="s6" value="하"></td>
			<td><input type="text" name="descrip2"></td></tr>
		<tr><td><input type="text" name="useSw3"></td>
			<td><label for="s7">상</label>
				<input type="radio" name="level3" id="s7" value="상"> 
				<label for="s8">중</label>
				<input type="radio" name="level3" id="s8" value="중" >
				<label for="s9">하</label>
				<input type="radio" name="level3" id="s9" value="하"></td>
			<td><input type="text" name="descrip3"></td></tr>
	</table></td></tr>
	<tr><td colspan="4"><table><tr><th>직장명</th><th>근무시작</th><th>근무종료</th>
			<th>직위</th><th>담당업무</th></tr>
		<tr><td><input type="text" name="compName1"></td>
			<td><input type="date" name="fromDate1"></td>
			<td><input type="date" name="toDate1"></td>
			<td><input type="text" name="position1"></td>
			<td><input type="text" name="part1"></td></tr>
		<tr><td><input type="text" name="compName2"></td>
			<td><input type="date" name="fromDate2"></td>
			<td><input type="date" name="toDate2"></td>
			<td><input type="text" name="position2"></td>
			<td><input type="text" name="part2"></td></tr>
		<tr><td><input type="text" name="compName3"></td>
			<td><input type="date" name="fromDate3"></td>
			<td><input type="date" name="toDate3"></td>
			<td><input type="text" name="position3"></td>
			<td><input type="text" name="part3"></td></tr>
		</table></td></tr>
</table>
</body>
</html>