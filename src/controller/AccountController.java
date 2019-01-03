package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import command.Command;

@WebServlet("/account.do")
public class AccountController extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("*** 어카운트 서블릿으로 들어옴 ***");
		String cmd = request.getParameter("cmd");
		String dir = request.getParameter("dir");
		if(dir==null) {
			dir = request.getServletPath();
			String sPath = dir.replace(".do", "");
			dir = sPath.substring(1);
			System.out.println(dir);
			
		}
		
		switch((cmd == null) ? "move": cmd) {
		case "move":
			System.out.println("액션이 이동");
			Command.move(request, response, dir+"/main");
			break;
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}