package com.coforge.model;

public class Address {
	String City;
	String State;
	
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	@Override
	public String toString() {
		return "Address [City=" + City + ", State=" + State + "]";
	}

}
