<%@page import="java.util.Random"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
Random random = new Random();

String account = "";
account = (random.nextInt(8999)+1001)+"-"+(random.nextInt(8999)+1001);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>계좌번호 : <%= account %></h1><br />
	<a href="../index.jsp">홈으로</a><br />
	<a href="main.jsp">계좌만드는곳으로</a>
</body>
</html>