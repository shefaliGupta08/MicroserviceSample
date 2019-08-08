package com.example.Movie_Catalog_Service.Controller;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.Movie_Catalog_Service.Model.Movie;
import com.example.Movie_Catalog_Service.Model.Rating;
import com.example.Movie_Catalog_Service.Model.catalogItem;

@RestController
@RequestMapping("/catalog")
public class MovieCatalogResource {
	
	@RequestMapping("/{userId}")
	public List<catalogItem> getCatalog(@PathVariable("userId")String userId) {
		
		RestTemplate restTemplate = new RestTemplate();
		//restTemplate.getForObject("http://localhost:8081/movie/101", Movie.class);
		
		List<Rating> ratings = Arrays.asList(new Rating(1011, 3), 
				                             new Rating(1021, 4), 
				                             new Rating(1031, 5));
		
		return ratings.stream().map(rating -> { Movie movie = restTemplate.getForObject("http://localhost:8081/movie/" + rating.getMovieId(), Movie.class);
			
		return new catalogItem(movie.getName(), "description", rating.getRating());
		
		})
				
		.collect(Collectors.toList());
				
		//return Collections.singletonList(new catalogItem("Transformer", "GoodMovie", 4));
		
		
		
		
	}

}
