package com.java.Java_Practice;

import java.util.Arrays;

public class Find_Second_Largest_Number {

	public static void main(String[] args) {
		int arr[] = {55, 43, 355, 1145, 2};
		
		for (int i = 0; i < arr.length-1; i++) {
			
			for(int j = 0; j < arr.length-1-i; j++) {
			
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		 System.out.println("Array Values are" + Arrays.toString(arr));
		 System.out.println("Second Largest Number " + arr[arr.length-2]);
		
	}

}
