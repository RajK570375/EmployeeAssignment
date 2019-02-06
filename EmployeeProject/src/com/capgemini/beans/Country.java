package com.capgemini.beans;

public class Country {

	private String name;
	private City city;
	
	public Country(String name, City country) {
		super();
		this.name = name;
		this.city = country;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public City getCountry() {
		return city;
	}
	public void setCountry(City country) {
		this.city = country;
	}

	@Override
	public String toString() {
		
		return  name + "\nCity: " + city + "";
	}
	
	
}
