package com.java.Java_Practice.Real_Time_Concepts;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;



public class UserOperations {

	//User Creation
	private List<TestUser> users = new ArrayList<TestUser>();
	public void createUsers(int userCount) {

		TestDataGenerator testGen = new TestDataGenerator();

		//obj & data insert and print details

		Set<String> insertedMail = new HashSet<String>();
		for (int i = 0; i < userCount; i++) {

			String fName = testGen.generateFirstName();
			String mailId = testGen.generateEmail();

				while (insertedMail.contains(mailId)) {
					fName = testGen.generateFirstName();
					mailId = testGen.generateEmail();
					
				}
				
				TestUser testUser = new TestUser(
						fName, 
						testGen.generateLastName(), 
						mailId, 
						testGen.generateMobileNumber(), 
						testGen.generatePassword());
				insertedMail.add(mailId);
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

		for(TestUser user : users) {
			if(user.getEmail().equals(userMail)) {
				return user;
			}
		}
		return null;

	}
	
	public TestUser getUser(int index) {
		
		try {
			return users.get(index);
		} catch (Exception e) {
			System.out.println("User Not Found");
		}
		return null;
		
	}

	//Update user details
	public void updateUserDetails(TestUser user, String firstName, String lastName, String email,String mobile, String password) {
		user.setFirstName(firstName);
		user.setLastName(lastName);
		user.setEmail(email);
		user.setMobile(mobile);
		user.setPassword(password);
	}

	//Delete User
	public void deleteUser(TestUser user) {
		users.remove(user);
	}

	//Get User Count
	public void getUserCount() {
		System.out.println("Total User is : " + users.size());
	}

}
