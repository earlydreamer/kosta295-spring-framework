<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h1>a.do요청 결과</h1>
	Message : ${requestScope.message}
	<br> 취미 :
	<c:forEach items="${hobbies}" var="hobby">
		<input type="checkbox" name=hobby> ${hobby} </c:forEach>
</body>
</html>