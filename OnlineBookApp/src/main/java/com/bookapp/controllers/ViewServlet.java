package com.bookapp.controllers;

import java.io.IOException;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bookapp.exception.IDNotfoundException;

import com.bookapp.model.Book;
import com.bookapp.service.BookService;
import com.bookapp.service.BookServiceImpl;

/**
 * Servlet implementation class ViewServlet
 */
@WebServlet("/viewServlet")
public class ViewServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ViewServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Integer BookId=Integer.parseInt(request.getParameter("bookid"));
		BookService service=new BookServiceImpl();
		
		Book book = null;
	    

		try {
			
			 book=service.getBookById(BookId);
		} catch ( IDNotfoundException e) {
			e.printStackTrace();
			
		}
		if(book==null) {
			
		}
		
		request.setAttribute("book", book);
		
		RequestDispatcher rd=request.getRequestDispatcher("view.jsp");
		rd.forward(request, response);
		
		}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
