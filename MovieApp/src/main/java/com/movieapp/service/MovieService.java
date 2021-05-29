package com.movieapp.service;

import java.util.List;

import com.movieapp.exceptions.IDNotFoundException;
import com.movieapp.exceptions.MovieNotFoundException;
import com.movieapp.model.Movie;


public interface MovieService {
	void addMovie(Movie movie);
	void updateMovie(int movieId,int rating) throws IDNotFoundException ;
	void deleteMovie(int movieId) throws IDNotFoundException;
	List<Movie> getAllMovies();
	List<Movie> getMovieByChoice(String choice) throws MovieNotFoundException ;
	Movie getMovieById(int movieId) throws IDNotFoundException;
	

}
