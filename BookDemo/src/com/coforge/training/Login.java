package com.coforge.training;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Login
 */
@WebServlet("/login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
String [] userList= {"Jhon","Helen","Monk","Kathy"};
		
		String name=request.getParameter("username");
		String password=request.getParameter("password");
		
		
		/*
		 * request.setAttribute("username", name); request.setAttribute("password",
		 * password);
		 */
		
		boolean nameflag=false;
		for(String uname:userList) {
			if(uname.equals(name)&& password.equals("admin123")) {
				nameflag=true;
			}
		}
		if(nameflag) {
			HttpSession session=request.getSession();
			session.setAttribute("username", name);
			RequestDispatcher rd =request.getRequestDispatcher("success.jsp");
			rd.forward(request, response);
			
		}
		else {
			response.sendRedirect("index.jsp");
		}
	
	
	
	
	
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}
