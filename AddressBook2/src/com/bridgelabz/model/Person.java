package com.bridgelabz.model;

import java.io.Serializable;

    public class Person implements Serializable{
	private String firstName;
	private String lastName;
	private String address;
	private String city;
	private String state;
	private String zip;
	private String phone;

//	public Person(String firstName, String lastName, String address,
//			String city, String state, String zip, String phone) {
//		super();
//		this.firstName = firstName;
//		this.lastName = lastName;
//		this.address = address;
//		this.city = city;
//		this.state = state;
//		this.zip = zip;
//		this.phone = phone;
//	}
	@Override
	public String toString() {
		return firstName + "\t\t"+lastName+ "\t\t"+ address + "\t\t" + city +
				"\t\t"+ state + "\t\t" + zip + "\t\t" + phone;
	}	
	
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
}
