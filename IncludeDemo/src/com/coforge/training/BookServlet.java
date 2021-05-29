package com.coforge.training;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.coforge.Model.BookDetails;

/**
 * Servlet implementation class BookServlet
 */
@WebServlet("/bookServlet")
public class BookServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	
	response.setContentType("text/html");
	String type=request.getParameter("usertype");
	String category=request.getParameter("category");
	BookDetails details=new BookDetails();
	List<String>bookList=details.findBookByCategory(category);
	PrintWriter out=response.getWriter();
		
	HttpSession session=request.getSession(false);
	if(session!=null)
	{
		out.print("inservlet" + session.getAttribute("username")+"<br>");
		out.print("session Id in bookservlet page"+ session.getId()+"<br>");
		request.setAttribute("bookList", bookList);
		RequestDispatcher dispatcher=request.getRequestDispatcher("final.jsp");
		
	
	dispatcher.forward(request, response);
	}
	else {
		response.sendRedirect("index.jsp");
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
