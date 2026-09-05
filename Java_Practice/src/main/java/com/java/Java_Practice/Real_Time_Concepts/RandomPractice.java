package com.java.Java_Practice.Real_Time_Concepts;

import java.util.Random;

public class RandomPractice {

	public static void main(String[] args) {
		
		Random random = new Random();
		//int num = 100 + random.nextInt(900);
		 int passwordLength = random.nextInt(8, 13);
		System.out.println(passwordLength);
		

	}

}
