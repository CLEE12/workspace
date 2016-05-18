<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp" %>
<!DOCTYPE html>
<html><head><meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	$(function() {
		$('#empnoChk').click(function(){
			if ($('#empno').val()=="") {
				alert('사번을 입력하고 중복체크 하세요');
				$('#empno').focus(); return false;
			}
			var sendData="empno="+$('#empno').val();
			$.post("empnoChk.do",sendData,function(data){
				alert(data);  
			});
			return false;
		});
	});
</script></head><body>
<form action="insertEmp.do" method="post">
<table><caption>사원정보 입력</caption>
	<tr><th>사번</th><td><input type="number" maxlength="4" 
		required="required" name="empno" id="empno">
		<button id="empnoChk">중복체크</button>
		</td></tr>
	<tr><th>이름</th><td><input type="text" name="ename" 
		required="required"></td></tr>
	<tr><th>업무</th><td><input type="text" name="job" 
		required="required"></td></tr>
	<tr><th>관리자사번</th><td><select name="mgr">
	<c:forEach var="emp" items="${list }">
		<option value="${emp.empno }">${emp.ename }</option>
	</c:forEach>	
	</select></td></tr>
	<tr><th>입사일</th><td><input type="date" name="hiredate" 
		required="required"></td></tr>
	<tr><th>급여</th><td><input type="number" name="sal" 
		required="required"></td></tr>
	<tr><th>보너스</th><td><input type="number" name="comm" 
		required="required"></td></tr>
	<tr><th>부서코드</th><td><input type="number" name="deptno"
		value="${deptno}" readonly="readonly"></td></tr>
	<tr><td colspan="2"><input type="submit" value="확인"></td></tr>
</table></form></body></html>