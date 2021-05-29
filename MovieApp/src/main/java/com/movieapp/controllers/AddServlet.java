package com.movieapp.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.movieapp.model.Movie;
import com.movieapp.service.MovieService;
import com.movieapp.service.MovieServiceImpl;

/**
 * Servlet implementation class AddServlet
 */
@WebServlet("/addServlet")
public class AddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String title=request.getParameter("title");
		Integer MovieId=Integer.parseInt(request.getParameter("movieId"));
		String language=request.getParameter("language");
		String genre=request.getParameter("genre");
		String discription=request.getParameter("discription");
		String director=request.getParameter("director");
		String actor=request.getParameter("actor");
		Integer duration=Integer.parseInt(request.getParameter("duration"));
		Integer rating=Integer.parseInt(request.getParameter("rating"));
		
	Movie movie=new Movie();
	movie.setTitle(title);
	movie.setMovieId(MovieId);
	movie.setLanguage(language);
	movie.setGenre(genre);
	movie.setDiscription(discription);
	movie.setDirector(director);
	movie.setActor(actor);
	movie.setDuration(duration);
	movie.setRating(rating);
	
	
	MovieService service=new MovieServiceImpl();
	service.addMovie(movie);
	
	RequestDispatcher requestDispatcher=request.getRequestDispatcher("admin.jsp");
	requestDispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
