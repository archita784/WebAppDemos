package com.movieapp.model;

public class Movie {
	private String title;
	private int movieId;
	private String language;
	private String genre;
	private String discription;
	private String director;
	private String actor;
	private int duration;
	private int rating;
	public Movie(String title, int movieId, String language, String genre, String discription, String director,
			String actor, int duration, int rating) {
		super();
		this.title = title;
		this.movieId = movieId;
		this.language = language;
		this.genre = genre;
		this.discription = discription;
		this.director = director;
		this.actor = actor;
		this.duration = duration;
		this.rating = rating;
	}
	public Movie() {
		super();
		
	}
	@Override
	public String toString() {
		return "Movie [title=" + title + ", movieId=" + movieId + ", language=" + language + ", genre=" + genre
				+ ", discription=" + discription + ", director=" + director + ", actor=" + actor + ", duration="
				+ duration + ", rating=" + rating + "]";
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getMovieId() {
		return movieId;
	}
	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getDiscription() {
		return discription;
	}
	public void setDiscription(String discription) {
		this.discription = discription;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public String getActor() {
		return actor;
	}
	public void setActor(String actor) {
		this.actor = actor;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}

}
