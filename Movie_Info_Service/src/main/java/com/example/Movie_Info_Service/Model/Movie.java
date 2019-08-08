package com.example.Movie_Info_Service.Model;

public class Movie {
	
	private int movieId;
	private String name;
	public Movie(int movieId, String name) {
		super();
		this.movieId = movieId;
		this.name = name;
	}
	public int getMovieId() {
		return movieId;
	}
	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Movie [movieId=" + movieId + ", name=" + name + "]";
	}
	
	

}
