package com.java.Java_Practice.Real_Time_Concepts;

public class TestDataMain {

	
	public static void main(String[] args) {
		
		UserOperations userOpe = new UserOperations();
		userOpe.createUsers(2);
		userOpe.printUsers();
		String searchMailIs =  userOpe.getUserEmail(0);
		userOpe.searchEmail(searchMailIs);
							
		
		/*
		TestDataGenerator testGen = new TestDataGenerator();
		
		List<TestUser> users = new ArrayList<TestUser>();
		
		//obj & data insert and print details
		for (int i = 0; i < 5; i++) {
			TestUser testUser = new TestUser(testGen.generateFirstName(), 
					                         testGen.generateLastName(), 
					                         testGen.generateEmail(), 
					                         testGen.generateMobileNumber(), 
					                         testGen.generatePassword()
					                         );
			users.add(testUser);
		}
		
		for(TestUser user : users) {
			System.out.println(user);
		}
		*/
	}
	

}
