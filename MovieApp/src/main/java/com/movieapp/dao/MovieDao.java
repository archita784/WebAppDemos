package com.movieapp.dao;

import java.util.List;

import com.movieapp.model.Movie;

public interface MovieDao {
	void addOneMovie(Movie movie);
	int updateOneMovie(int movieId,int rating) ;
	int deleteOneMovie(int movieId);
	List<Movie> findAllMovies();
	List<Movie> findMovieByChoice(String choice) ;
	Movie findMovieById(int movieId) ;
	

}
