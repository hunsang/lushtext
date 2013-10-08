<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
 <c:forEach var="cityList" items="${cityList}" varStatus="status">
					<c:out value="${cityList.getName()}"/>
					<c:out value="${cityList.getCountryCode()}"/>
 </c:forEach>
</body>
</html>
