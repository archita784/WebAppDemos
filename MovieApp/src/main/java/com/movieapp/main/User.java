package com.movieapp.main;



import com.movieapp.exceptions.IDNotFoundException;
import com.movieapp.exceptions.MovieNotFoundException;
import com.movieapp.model.Movie;
import com.movieapp.service.MovieService;
import com.movieapp.service.MovieServiceImpl;

public class User {
	public static void main(String[] args) {
		MovieService service= new MovieServiceImpl();
		service.getAllMovies().forEach(System.out::println);
		try {
			service.getMovieByChoice("Anime").forEach(System.out::println);
		} catch (MovieNotFoundException e) {
			System.out.println(e.getMessage());
		}
		 try { 
			  Movie movie=service.getMovieById(8);
				System.out.println(movie);
		  
		  }catch(IDNotFoundException e)
		 { System.out.println(e.getMessage()); }
		 
	}
}
