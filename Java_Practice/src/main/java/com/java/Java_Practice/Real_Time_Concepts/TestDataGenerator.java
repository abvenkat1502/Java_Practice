package com.java.Java_Practice.Real_Time_Concepts;


import java.util.Random;

public class TestDataGenerator {
	
	String fNameIs;

	Random random = new Random();
	//Generate Numbers
	public int generateNumber() {
		return random.nextInt(1, 100001);
	}
	
	//Generate First Name
	String fNames[] = {"Arun", "Bala", "Kumar", "Ravi", "Suresh"};
	public String generateFirstName() {
		int ind = random.nextInt(fNames.length);
		return fNameIs = fNames[ind];
	}
	
	//Generate Last Name
	String lNames[] = {"Kumar", "Raj", "Sharma", "Krishnan", "Prakash"};
	public String generateLastName() {
		int ind = random.nextInt(lNames.length);
		return lNames[ind];
	}
	
	//Generate Email
	public String generateEmail(){
		return fNameIs + generateNumber() + "@test.com";
	}	
	
	//Generate Mobile Number
	String num[] = {"6", "7", "8", "9"};
	public String generateMobileNumber() {
		int prefixIndex = random.nextInt(num.length);
		int mobileNumber =  100000000 +  random.nextInt(900000000);
		return num[prefixIndex] + mobileNumber;
	}
	
	//Generate Password
	String upperAlphabets = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	String lowerAlphabets = "abcdefghijklmnopqrstuvwxyz";
	String numbers = "0123456789";
	String specialChars = "!@#$%^&*()_+-=[]{}|;:',.<>?/`~";
	String allCharacters = upperAlphabets + lowerAlphabets + numbers + specialChars;

	
	public String generatePassword() {
		
		int passwordLength = random.nextInt(8,13);
		
		StringBuilder password = new StringBuilder();

	    password.append(upperAlphabets.charAt(random.nextInt(upperAlphabets.length())));
	    password.append(lowerAlphabets.charAt(random.nextInt(lowerAlphabets.length())));
	    password.append(numbers.charAt(random.nextInt(numbers.length())));
	    password.append(specialChars.charAt(random.nextInt(specialChars.length())));
	    
	    while (password.length() < passwordLength) {
			password.append(allCharacters.charAt(random.nextInt(allCharacters.length())));
		}
	    
	    return password.toString();
	}
	
	
	public static void main(String[] args) {
		
		TestDataGenerator tdg = new TestDataGenerator();
		
		//Generate Number
        for (int i = 0; i < 5; i++) {
        	int numGenrator1 = tdg.generateNumber();
    		System.out.println(numGenrator1);
		}
        
        //First Name
        for (int i = 0; i < 5; i++) {
        	String firstName = tdg.generateFirstName();
    		System.out.println(firstName);
		}
		
        //Last Name
        for (int i = 0; i < 5; i++) {
        	String lastName = tdg.generateLastName();
    		System.out.println(lastName);
		}
        
       //Email
        for (int i = 0; i < 5; i++) {
        	String email = tdg.generateEmail();
    		System.out.println(email);
		}
        
        //Mobile Number
        String mob =  tdg.generateMobileNumber();
        System.out.println(mob);
        System.out.println("pwd Is : " + tdg.generatePassword());
	}

}
