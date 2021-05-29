package com.context.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class NextServlet
 */
@WebServlet("/nextServlet")
public class NextServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public NextServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ServletContext context = getServletContext();
		String mailid = context.getInitParameter("mail");
		String msg = context.getInitParameter("message");

		String name = request.getParameter("username");

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print("<b> In  Next servlet</b>");
		out.print("contact us at:" + mailid + "<br>");
		out.print("today\'s  message for you " + name + ": " + msg + "<br>");

		Enumeration<String> allNames = context.getInitParameterNames();
		while (allNames.hasMoreElements()) {
			String conname = allNames.nextElement();
			String convalue = context.getInitParameter(conname);
			out.print(convalue + "<br>");
		}

		

		
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
