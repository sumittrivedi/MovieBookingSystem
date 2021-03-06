package com.epam.moviebooking.viewcontroller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.epam.moviebooking.entity.MovieEntity;
import com.epam.moviebooking.service.MovieService;
import com.epam.moviebooking.webservices.restclient.MovieRestClient;

@Controller
public class MovieController {
	
	@Autowired
	private MovieRestClient movieRestClient;
	@Autowired
	private MovieService movieService;
	@Autowired
	private AdminController adminController;
	
	@GetMapping(value = "movie")
	public ModelAndView getMovie(@RequestParam("locationChoice") String locationChoice,HttpSession session )
	{
		ModelAndView mv = new ModelAndView();
		session.setAttribute("locationChoice", locationChoice);
		List<MovieEntity> movieList = movieRestClient.movieByLocation(locationChoice);
		mv.addObject("movieList", movieList);
		mv.setViewName("movie");
		return mv;
	}
	
	@PostMapping(value = "addMovie")
	public ModelAndView addMovie(@RequestParam String movieName,@RequestParam int theatreId) 
	{
		movieService.addMovie(movieName,theatreId);
		return adminController.movieDetails();
	}
	
	@PostMapping(value = "updateMovie")
	public ModelAndView updateMovie(@RequestParam int movieId, @RequestParam String movieName,@RequestParam int theatreId)
	{
		movieService.updateMovie(movieId,movieName,theatreId);
		return adminController.movieDetails();
	}
	@PostMapping(value = "deleteMovie")
	public ModelAndView deleteMovie(@RequestParam int movieId)
	{
		movieService.deleteMovie(movieId);
		return adminController.movieDetails();
	}
}
