package com.java.Java_Practice.Real_Time_Concepts;

public class TestDataMain {

	
	public static void main(String[] args) {
		
		UserOperations userOpe = new UserOperations();
		
		//Create User
		userOpe.createUsers(5);
		//userOpe.printUsers();
		TestUser user =  userOpe.getUser(0);
		System.out.println("User is : " + user);
		
		/*
		//Search user using mail id
		String searchMailIs =  userOpe.getUserEmail(1);
		TestUser userIs = userOpe.searchEmail(searchMailIs);
		
		
		//update user details
		if (userIs != null) {
			System.out.println("===== Before Update =====");
			System.out.println("First Name : " + userIs.getFirstName());
			System.out.println("Last Name : " + userIs.getLastName());
			System.out.println("Email : " + userIs.getEmail());
			System.out.println("Password : " + userIs.getPassword());
			
			//Updating
			userOpe.updateUserDetails(userIs, "Litton", "Dash", "litton@test.com", "1234567890", "Litton@123" );
			
			System.out.println("===== After Update =====");
			System.out.println("First Name : " + userIs.getFirstName());
			System.out.println("Last Name : " + userIs.getLastName());
			System.out.println("Email : " + userIs.getEmail());
			System.out.println("Password : " + userIs.getPassword());
			
			System.out.println("===== Entire User details =====");
			userOpe.printUsers();
		} else {
			System.out.println("User Not Found");
		}
		
		
		//Delete User
			if (userIs != null) {
				System.out.println("===== Before Delete =====");
				userOpe.getUserCount();
				userOpe.printUsers();
				
				//Deleting
				userOpe.deleteUser(userIs);
				
				System.out.println("===== After Delete =====");
				userOpe.getUserCount();
				userOpe.printUsers();
				
			} else {
				System.out.println("User Not Found");
			}
			*/
			
	}
	

}
