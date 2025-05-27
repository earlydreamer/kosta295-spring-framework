<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<h1> Exception </h1>

	msg = ${errMsg}<br>
	class = ${errClass}<br>
	code = ${statusCode}<br>

	
	<a href="${pageContext.request.contextPath}/ex03_exception.html" >홈으로</a>
	
	
	
</body>
</html>