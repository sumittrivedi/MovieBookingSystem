package com.epam.moviebooking.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.epam.moviebooking.entity.TicketBookingEntity;
import com.epam.moviebooking.repository.TicketBookingRepository;

@Service
public class TicketBookingService {
	
	@Autowired
	TicketBookingRepository ticketBookingRepository; 
	
	public TicketBookingEntity setTicketBookingDetails(TicketBookingEntity dto)
	{
		return ticketBookingRepository.save(dto);
	}

}
