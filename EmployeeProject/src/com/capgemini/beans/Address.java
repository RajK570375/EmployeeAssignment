package com.capgemini.beans;

public class Address {

	private String Add_Line;
	private Country country;
	
	public Address(String add_Line, Country country) {
		super();
		Add_Line = add_Line;
		this.country = country;
	}
	
	public String getAdd_Line() {
		return Add_Line;
	}
	public void setAdd_Line(String add_Line) {
		Add_Line = add_Line;
	}
	public Country getCountry() {
		return country;
	}
	public void setCountry(Country country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return  Add_Line + "\nCountry: " + country + "";
	}
	
}
