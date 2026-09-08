package com.java.Java_Practice;

public class Reverse_Each_Word {

	public static void main(String[] args) {
		String input = "Java Selenium Test";
		String output = "";
		String result = "";
		String[] word =  input.split(" ");
		for (String str : word) {
			output = new StringBuffer(str).reverse().toString();
			result = result + output + " ";
		}
		
		System.out.println(result.trim());
		

	}

}
