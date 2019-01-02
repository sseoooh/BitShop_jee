package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import command.Command;

/**
 * Servlet implementation class ArticleController
 */
@WebServlet("/article.do")
public class ArticleController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
System.out.println("---article서블릿로 진입----");
		
		String action = request.getParameter("action");
		switch((action == null) ? "move" : action){
		case "move" :
			System.out.println(action);
			System.out.println("액션이 이동");
			Command.move(request, response, "article/main");
			break;
		
		}
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
