package com.example.Rating_Data_Service.Controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Rating_Data_Service.Model.Rating;

@RestController
@RequestMapping("/ratingsdata")
public class RatingDataController {
	
	
	@RequestMapping("/{movieId}")
	public Rating getRating(@PathVariable ("movieId") int movieId)
	{
		return new Rating(movieId, 4);
		
		
		
	}
	

}
