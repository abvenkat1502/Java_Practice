package com.java.Java_Practice.Real_Time_Concepts;
import java.util.ArrayList;
import java.util.List;

import com.java.Java_Practice.Real_Time_Concepts.TestDataGenerator;
import com.java.Java_Practice.Real_Time_Concepts.TestUser;

public class UserOperations {
	
	//User Creation
	private List<TestUser> users = new ArrayList<TestUser>();
	public void createUsers(int userCount) {

		TestDataGenerator testGen = new TestDataGenerator();
			//obj & data insert and print details
			for (int i = 0; i < userCount; i++) {
				TestUser testUser = new TestUser(
						testGen.generateFirstName(), 
						testGen.generateLastName(), 
                        testGen.generateEmail(), 
                        testGen.generateMobileNumber(), 
                        testGen.generatePassword());
						                         
				users.add(testUser);
			}
				
	}
	
	
	
	//User Print
	public void printUsers() {
		for(TestUser user : users) {
			System.out.println(user);
		}
	}
	
	
	public String getUserEmail(int index) {
	    return users.get(index).getEmail();
	}
	
	//Search User using email	
	public TestUser searchEmail(String userMail) {
		Boolean mailExist = false;
		String mailId = "";
		String firstName = "";
		String lastName = "";
		
		for(TestUser user : users) {
			if(user.getEmail().equals(userMail)) {
				firstName = user.getFirstName();
				lastName = user.getLastName();
				mailId = user.getEmail();
				mailExist = true;
				//System.out.println("Captured Mail User Name : " + user.getFirstName() + " " +  user.getLastName());
			}
		}
		
		//Display User Details
		if(mailExist) {
			System.out.println("User Found");
			System.out.println("Name : " + firstName + " " +  lastName);
			System.out.println("Email : " + mailId);
		}else {
			System.out.println("User Not Found");
		}
		return null;
	}
}
