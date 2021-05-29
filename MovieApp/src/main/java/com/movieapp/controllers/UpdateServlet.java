package com.movieapp.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.movieapp.exceptions.IDNotFoundException;
import com.movieapp.service.MovieService;
import com.movieapp.service.MovieServiceImpl;

/**
 * Servlet implementation class UpdateServlet
 */
@WebServlet("/updatServlet")
public class UpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int movieId=Integer.parseInt(request.getParameter("movieId"));
		int rating=Integer.parseInt(request.getParameter("rating"));
		MovieService service=new MovieServiceImpl();
		
		try {
			service.updateMovie(movieId,rating);
			
		}catch(IDNotFoundException e) {
			e.printStackTrace();
		}
		
		
		RequestDispatcher rd=request.getRequestDispatcher("admin.jsp");
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
