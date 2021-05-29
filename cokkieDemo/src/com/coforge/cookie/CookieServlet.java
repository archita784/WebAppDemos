package com.coforge.cookie;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CookieServlet
 */
@WebServlet("/cookieServlet")
public class CookieServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String name=request.getParameter("username");
		Cookie cookie=new Cookie("uname", name);
		Cookie cookie1=new Cookie("msg1","Welcometojsp" );
		Cookie cookie2=new Cookie("msg2","Welcometojava");
		Cookie cookie3=new Cookie("msg3","Welcometopython");
		
		
		response.addCookie(cookie);
		response.addCookie(cookie1);
		response.addCookie(cookie2);
		response.addCookie(cookie3);
	
	RequestDispatcher dispatcher=request.getRequestDispatcher("success.jsp");
	dispatcher.include(request, response);
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
