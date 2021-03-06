package com.epam.moviebooking.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="locationdetails")
public class LocationEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="LocationID")
	private int locationId;
	
	@Column(name="LocationName")
	private String locationName;
	
	public LocationEntity(){	
	}

	public LocationEntity(int locationId, String locationName) {
		super();
		this.locationId = locationId;
		this.locationName = locationName;
	} 

	public int getLocationId() {
		return locationId;
	}

	public void setLocationId(int locationId) {
		this.locationId = locationId;
	}

	public String getLocationName() {
		return locationName;
	}

	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}
	
	@Override
	public String toString() {
		return "LocationDto [locationId=" + locationId + ", locationName=" + locationName + "]";
	}
	

}
