package com.java.Java_Practice;

import java.util.HashMap;
import java.util.Map;

public class Count_Occurrence_Character {
	
	
	
	//Using HashMap
	public void countEachCharacters() {
		String inputData = "Selenium";
		inputData = inputData.toUpperCase();
		Map<Character, Integer> charCount = new HashMap<>();
		for (char value : inputData.toCharArray()) {
			charCount.put(value, charCount.getOrDefault(value, 0)+1);
		}
		
		//output
		charCount.forEach((character,count)->{
			System.out.println(character + "=" + count);
		});
	}

	public static void main(String[] args) {
		Count_Occurrence_Character coc = new Count_Occurrence_Character();
		coc.countEachCharacters();

	}

}
