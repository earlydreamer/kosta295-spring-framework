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
<h1>UserDTO 받아왔음</h1>
	id= ${dto.id}<br>
	name= ${dto.name}<br>
	age= ${dto.age}<br>
	addr= ${dto.addr}<br>
	
	${msg}<br>
	${menu}
</body>
</html>