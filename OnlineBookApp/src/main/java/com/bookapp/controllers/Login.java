package com.bookapp.controllers;

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
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
String [] userList= {"Jhon","Helen","Monk","Kathy"};

		String name=request.getParameter("username");
		String password=request.getParameter("password");
		
		boolean nameflag=false;
		for(String uname:userList) {
			if(uname.equals(name)&& password.equals("admin123")) {
				nameflag=true;
				
				break;
			}
		}
		if(nameflag) {
			HttpSession session=request.getSession();
			session.setAttribute("username", name);
			RequestDispatcher rd =request.getRequestDispatcher("admin.jsp");
			rd.forward(request, response);
		}
		else {
			response.sendRedirect("home.jsp");
		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
