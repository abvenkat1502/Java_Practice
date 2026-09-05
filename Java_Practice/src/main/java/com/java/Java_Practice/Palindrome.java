package com.java.Java_Practice;

public class Palindrome {

	public static void main(String[] args) {
		String actualName = "A man a plan a canal Panama";
		actualName = actualName.replace(" ", "").toUpperCase();
		String reverseName = new StringBuffer(actualName).reverse().toString();
		System.out.println(reverseName);
		
		if(actualName.equals(reverseName)) {
			System.out.println(actualName + " is Palindrome");
		}else {
			System.out.println(actualName + " is not Palindrome");
		}

	}

}
