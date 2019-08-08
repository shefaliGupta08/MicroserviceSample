package com.example.Movie_Info_Service.Controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Movie_Info_Service.Model.Movie;

@RestController
@RequestMapping("/movie")
public class MovieController {
	
	@RequestMapping("/{movieId}")
	public Movie getMovieInfo(@PathVariable("movieId")int movieId)
	{
		return new Movie(101, "Alpha");
		
		
	}

}
