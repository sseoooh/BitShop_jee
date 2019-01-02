package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oracle.jrockit.jfr.RequestDelegate;

import command.Command;

/**
 * Servlet implementation class MemberController
 */
@WebServlet("/member.do")
public class MemberController extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("멤버서블릿으로 들어옴!!");
		String action = request.getParameter("action");
		
		/*
		 * 밑에꺼 줄이면 switch((action == null) ? "move": action) 이렇게된다
		 */
		if(action == null) {
			action = "move";
		}else {
			action = "login";
		}
		switch(action) {
		
		case "login":
		
			System.out.println("---액션이 로그인---");
			String id = request.getParameter("id");
			String pass = request.getParameter("pass");
			if(id.equals("test") && pass.equals("test")) {
				/*RequestDispatcher rd = request.getRequestDispatcher(Command.VIEW+"member/main"+Command.JSP);
				rd.forward(request, response);*/
				Command.move(request, response, "home/main");
			}else {
				//RequestDispatcher rd = request.getRequestDispatcher("/index.jsp");
				//request.getRequestDispatcher("/index.jsp")
				//.forward(request, response);
				Command.move(request, response, "index");
			}
			System.out.println("아이디: "+ id);
			System.out.println("비번: "+ pass);
			
			break;
		case "move" :
			System.out.println(action);
			System.out.println("액션이 무브");
			Command.move(request, response, "member/main");
			//RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/view/member/main.jsp");
			//rd.forward(request, response);
			break;
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
