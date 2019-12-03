package com.epam.moviebooking.service;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.epam.moviebooking.dto.ShowDetailsDto;
import com.epam.moviebooking.repository.ShowDetailsRepository;

class ShowDetailsServiceTest {

	@Mock
	private ShowDetailsRepository showDetailsRepository;
	@Mock
	private ShowDetailsDto showDetailsDto;
	@InjectMocks
	private ShowDetailsService showDetailsService;
	
	
	@BeforeEach
	private void init()
	{
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	void getShowId() 
	{
		ShowDetailsDto dto = new ShowDetailsDto();
		dto.setShowId(222);
		dto.setTheatreId(1);
		dto.setDate("2019-11-29");
		dto.setTime("8:00:00");
		when(showDetailsRepository.findByTheatreIdAndDateAndTime(1,"2019-11-29", "8:00:00")).thenReturn(Optional.of(dto));
		assertEquals(showDetailsService.getShowId(1,"2019-11-29", "8:00:00"),222);
	}

}
