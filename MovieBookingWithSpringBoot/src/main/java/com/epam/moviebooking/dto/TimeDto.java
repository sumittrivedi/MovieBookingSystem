package com.epam.moviebooking.dto;

import java.time.LocalTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "showtiming")
public class TimeDto {
<<<<<<< HEAD
	
=======
>>>>>>> ff05cef73f99839d37d18a6c1961ffb3fd51d4ea
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int timeId;
	LocalTime time;
<<<<<<< HEAD
	
=======
>>>>>>> ff05cef73f99839d37d18a6c1961ffb3fd51d4ea
	public int getTimeId() {
		return timeId;
	}
	public void setTimeId(int timeId) {
		this.timeId = timeId;
	}
	public LocalTime getTime() {
		return time;
	}
	public void setTime(LocalTime time) {
		this.time = time;
	}

}
