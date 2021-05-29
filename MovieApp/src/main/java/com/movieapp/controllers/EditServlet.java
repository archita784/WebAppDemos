package com.movieapp.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.movieapp.exceptions.IDNotFoundException;
import com.movieapp.model.Movie;
import com.movieapp.service.MovieService;
import com.movieapp.service.MovieServiceImpl;

/**
 * Servlet implementation class EditServlet
 */
@WebServlet("/editServlet")
public class EditServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int movieid=Integer.parseInt(request.getParameter("movieId"));
		MovieService service=new MovieServiceImpl();
		Movie movie=null;
		try {
			movie=service.getMovieById((movieid));
			
		}catch(IDNotFoundException e) {
			e.printStackTrace();
		}
		if(movie==null) {
			request.setAttribute("message", "Movie not available");
			RequestDispatcher rd=request.getRequestDispatcher("editMovie.jsp");
			rd.forward(request, response);
			
		}
		request.setAttribute("movie", movie);
		RequestDispatcher rd=request.getRequestDispatcher("updatemovie.jsp");
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
