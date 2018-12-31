<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%
   String id = request.getParameter("id");
   String name = request.getParameter("name");
   String pass = request.getParameter("pass");
   String ssn = request.getParameter("ssn");
   String year = ssn.substring(0, 2);
   String month = ssn.substring(2, 4);
   String day = ssn.substring(4, 6);
   String gender = request.getParameter("gender");
   String bmires = request.getParameter("bmires");
   String res ="";
   String weight = request.getParameter("weight");
   double w = Double.parseDouble(weight);
   String height = request.getParameter("height");
   double h = Double.parseDouble(height);
   double bmiresres = w/((h*h)/10000);
   String bmirestotal ="";
   
  
   char ch = ssn.charAt(7);
   switch(ch){
   	case '1' : case '3' :
	   res = "남자";
	   break;
	case '2' : case '4' :
	   res = "여자";
	   break;
	case '5' : case '6' :
	   res = "외국인";
		break;
	default : res = "잘못입력하셨습니다";
   }
   
   if(bmiresres>40){
	   bmirestotal = "고도비만";
   }else if(bmiresres>35){
	   bmirestotal = "중등도비만";
   }else if(bmiresres>30){
	   bmirestotal = "경도비만";
   }else if(bmiresres>25){
	   bmirestotal = "과체중";
   }else if(bmiresres>18.5){
	   bmirestotal = "정상";
   }else if(bmiresres<18.4){
	   bmirestotal = "저체중";
   }
   %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h3>가입한 ID : <%=id %></h3><br />
<h3>이 름 :<%= name %></h3><br />
<h3>가입한 비번 : ********</h3><br />
<h3>생년월일 : <%=year %> 년 <%= month%> 월 <%=day%>일생</h3><br />
<h3>성 별 : <%=res %></h3><br />
<h3>BMI : <%= bmirestotal %></h3><br />
<a href="login-form.jsp">로그인으로 이동</a><br />
<a href="../index.jsp">홈으로 이동</a><br />
</body>
</html>