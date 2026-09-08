package com.java.Java_Practice.Real_Time_Concepts;

public class TestUser {
	
	//Varibales
	private String firstName;
	private String lastName;
	private String email;
	private String mobile;
	private String password;
	
	//Constructor
	public TestUser(String firstName, String lastName, String email,String mobile, String password){
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.mobile = mobile;
		this.password = password;
	}
	
	//Getters
	public String getFirstName() {
		return this.firstName;
	}
	public String getLastName() {
		return this.lastName;
	}
	public String getEmail() {
		return this.email;
	}
	public String getMobile() {
		return this.mobile;
	}
	public String getPassword() {
		return this.password;
	}
	
	//Setters
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	//Details Display
	@Override
	public String toString() {
		return "User First Name : " + firstName + "\n" +
			   "User Last Name : " + lastName + "\n" +
			   "User Email : " + email + "\n" +
			   "User Mobile Number : " + mobile + "\n" +
			   "User Password : " + password + "\n";
	}
}
