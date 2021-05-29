package com.movieapp.controllers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.movieapp.exceptions.MovieNotFoundException;
import com.movieapp.model.Movie;
import com.movieapp.service.MovieService;
import com.movieapp.service.MovieServiceImpl;

/**
 * Servlet implementation class Search
 */
@WebServlet("/search")
public class Search extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Search() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String choice=request.getParameter("choice");
		MovieService service=new MovieServiceImpl();
		List<Movie> movieList=new ArrayList<>();

		try {
			
			 movieList=service.getMovieByChoice(choice);
		} catch (MovieNotFoundException e) {
			e.printStackTrace();
			
		}
		
		if (movieList.isEmpty()) {
			request.setAttribute("message", "No MovieFound");
		}
		request.setAttribute("movieList", movieList);
		RequestDispatcher rd=request.getRequestDispatcher("home.jsp");
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
