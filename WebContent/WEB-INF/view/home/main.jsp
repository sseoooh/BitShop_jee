<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%System.out.println("home/main.jsp진입"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div>
		<img src="<%=application.getContextPath() %>/resources/img/ny-3.gif" alt="" />
	</div>
	<h1> 메 뉴 </h1>
	<a href="member.do">회원관리</a>
	<a href="account.do">계좌관리</a>
	<a href="article.do">게시판</a>
	<a href="admin.do">관리자</a>
	<form action="home.do">
	<input type="hidden" name="action" value="logout"/><br />
	<input type="submit" id="btn" value="로그아웃"/>
	</form>
</body>
</html>