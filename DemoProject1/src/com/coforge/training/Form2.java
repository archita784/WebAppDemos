package com.coforge.training;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Form
 */
@WebServlet("/form2")
public class Form2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out =response.getWriter();
		out.print("welcome to user app");
		
		String uname = request.getParameter("username");
		String cname = request.getParameter("cityname");
		Integer sal = Integer.parseInt(request.getParameter("salary"));
		Long mnum = Long.parseLong(request.getParameter("Mnumber"));
		String languag[] = request.getParameterValues("Language");
		String[] hobb = request.getParameterValues("Hobbies");

		request.setAttribute("username", uname);
		request.setAttribute("city", cname);
		request.setAttribute("salary", sal);
		request.setAttribute("mobile", mnum);
		request.setAttribute("Language", languag);
		request.setAttribute("hobbies", hobb);
		
		
		  RequestDispatcher rd=request.getRequestDispatcher("final.jsp");
		  rd.forward(request, response); 
		  //rd.include(request, response);
		 
		//response.sendRedirect("success.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
