package com.epam.moviebooking.webservices.restcontroller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.epam.moviebooking.entity.TimeEntity;
import com.epam.moviebooking.service.TimeService;

@RestController
public class TimeRestController {
	
	@Autowired
	private TimeService timeService;
	
	@GetMapping(value = "restTime",produces = {MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<List<TimeEntity>> getTime(@RequestParam String dateChoice)
	{
		LocalDate date = LocalDate.parse(dateChoice);
		List<TimeEntity> timeList = timeService.getTime(date);
		return new ResponseEntity<>(timeList, HttpStatus.OK);
	}
	
	@GetMapping(value = "restTimeDetails",produces = {MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<List<TimeEntity>> timeDetails()
	{
		List<TimeEntity> timeList = timeService.timeDetails();
		return new ResponseEntity<>(timeList, HttpStatus.OK);
	}
}
