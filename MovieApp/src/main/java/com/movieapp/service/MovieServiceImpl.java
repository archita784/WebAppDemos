package com.movieapp.service;

import java.util.List;
import java.util.stream.Collectors;


import com.movieapp.dao.MovieDao;
import com.movieapp.dao.MovieDaoImpl;
import com.movieapp.exceptions.IDNotFoundException;
import com.movieapp.exceptions.MovieNotFoundException;
import com.movieapp.model.Movie;

public class MovieServiceImpl implements MovieService {

	
	MovieDao movieDAO=new MovieDaoImpl();

	@Override
	public void addMovie(Movie movie) {
		movieDAO.addOneMovie(movie);
		
		
	}

	@Override
	public void updateMovie(int movieId, int rating) throws IDNotFoundException {
		movieDAO.updateOneMovie(movieId, rating);
		
	}

	@Override
	public void deleteMovie(int movieId) throws IDNotFoundException {
		movieDAO.deleteOneMovie(movieId);
		
		
	}

	@Override
	public List<Movie> getAllMovies() {
		return movieDAO.findAllMovies().stream().sorted((b1, b2) -> b1.getTitle().compareToIgnoreCase(b2.getTitle()))
				.collect(Collectors.toList());
	}

	@Override
	public List<Movie> getMovieByChoice(String choice) throws MovieNotFoundException {
		List<Movie> movieList = movieDAO.findMovieByChoice(choice);

		if (movieList.isEmpty())
			throw new MovieNotFoundException("movie not found");
		return movieList;
	}

	@Override
	public Movie getMovieById(int movieId) throws IDNotFoundException {
		Movie movie = movieDAO.findMovieById(movieId);
		if (movie == null)
			throw new IDNotFoundException("Invalid Id");
		return movie;
	}
}
