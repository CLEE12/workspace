<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ tag language="java" pageEncoding="UTF-8"%>
<%@ tag body-content="scriptless"%>
<%@ attribute name="var" required="true" rtexprvalue="false"%>
<%@ attribute name="start" required="true" type="java.lang.Integer"%>
<%@ attribute name="end" required="true" type="java.lang.Integer"%>
<%@ variable name-from-attribute="var" alias="num" scope="NESTED"
	variable-class="java.lang.Integer"%>
<%
	for (int i = start; i <= end; i++) {
%>
<c:set var="num" value="<%=i%>"></c:set>
<jsp:doBody />
<%
	}
%>