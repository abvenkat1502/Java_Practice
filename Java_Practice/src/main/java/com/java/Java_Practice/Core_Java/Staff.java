package com.java.Java_Practice.Core_Java;

//Constructor
public class Staff {
	String name;
	int age;
	String gender;
	String dd;
	
	public Staff(String name, int age, String gender) {
		this.name = name;
		this.age = age;
		this.gender	= gender;
		System.out.println("Staff Name is : " + this.name);
		System.out.println("Staff Age is : " + this.age);
		System.out.println("Staff Gender is : " + this.gender);
	}

	public static void main(String[] args) {
		Staff sf1 = new Staff("User1", 20, "Male");
		Staff sf2 = new Staff("User2", 21, "Female");

	}

}
