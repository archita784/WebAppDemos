package com.movieapp.main;



import com.movieapp.exceptions.IDNotFoundException;
import com.movieapp.model.Movie;
import com.movieapp.service.MovieService;
import com.movieapp.service.MovieServiceImpl;

public class Admin {
	public static void main(String[] args) {
		//Movie movie = new Movie("Harry Potter",1,"English","Scifi","kids scifi drama ","chris columbus","Daniel Radcliffe",190,5);
		MovieService service = new MovieServiceImpl();
		//service.addMovie(movie);
	
		/*
		 * try { service.deleteMovie(8); } catch (IDNotFoundException e) {
		 * System.out.println(e.getMessage()); }
		 */
		try {
			service.updateMovie(1, 4);
		} catch (IDNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}
	

}
