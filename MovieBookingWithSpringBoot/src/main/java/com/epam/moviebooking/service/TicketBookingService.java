package com.epam.moviebooking.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.epam.moviebooking.dto.TicketBookingDto;
import com.epam.moviebooking.repository.TicketBookingRepository;

@Service
public class TicketBookingService {
	
	@Autowired
	TicketBookingRepository ticketBookingRepository; 
	
<<<<<<< HEAD
	public TicketBookingDto setTicketBookingDetails(TicketBookingDto dto)
	{
		return ticketBookingRepository.save(dto);
=======
	public void setTicketBookingDetails(TicketBookingDto dto)
	{
		ticketBookingRepository.save(dto);
>>>>>>> ff05cef73f99839d37d18a6c1961ffb3fd51d4ea
	}

}
