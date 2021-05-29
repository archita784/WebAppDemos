package com.coforge.training;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Form
 */
@WebServlet("/form")
public class Form extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String uname = request.getParameter("username");
		String cname = request.getParameter("cityname");
		Integer sal = Integer.parseInt(request.getParameter("salary"));
		Long mnum = Long.parseLong(request.getParameter("Mnumber"));
		String languag[] = request.getParameterValues("Language");
		String[] hobb = request.getParameterValues("Hobbies");

		PrintWriter out = response.getWriter();
		out.print("<html><body>");
		out.print("<b>Welcome " + uname + "</b><br>");
		out.print("<b>From " + cname + "</b><br>");
		out.print("<b>Income " + sal + "</b><br>");
		out.print("<b>Contact at " + mnum + "</b><br>");
		out.print("<b>Knows " + "</b>");

		for (String langa : languag) {
			out.print("<b>" + langa + "<b>");

		}
		out.print("<br><b>Hobbies are " + "</b>");
		if (hobb != null)
			for (String hobby : hobb) {
				out.print("<b>" + hobby + "," + "<b>");

			}

		out.print("</body></html>");
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
