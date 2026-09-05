//Task 1: Remove Duplicate Characters from String

package com.java.Java_Practice;

import java.text.Collator;
import java.util.LinkedHashSet;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Remove_Duplicate_Characters_from_String {
	
	
	public void way1(String contentOfText) {
		contentOfText = contentOfText.toUpperCase();
		String withoutDuplicate = "";
		
		for (int i = 0; i < contentOfText.length(); i++) {
			char ch = contentOfText.charAt(i);
			if(withoutDuplicate.indexOf(ch)== -1) {
				withoutDuplicate = withoutDuplicate + ch;
			}
		}
		
		System.out.println("Given String Is : " + contentOfText);
		System.out.println("Without Duplicate character : " + withoutDuplicate);
	}
	
	public void way2(String contentOfText) {
		contentOfText = contentOfText.toUpperCase();
		LinkedHashSet<Character> result = new LinkedHashSet<>();
		StringBuilder withoutDuplicate = new StringBuilder();
		
		for (Character character : contentOfText.toCharArray()) {
			result.add(character);
		}
		
		for (Character character : result) {
			withoutDuplicate.append(character);
		}
		
		System.out.println("Given String Is : " + contentOfText);
		System.out.println("Without Duplicate character : " + withoutDuplicate);
	}
	
	public void way3() {
		String input = "ccdd";
        IntStream output = input.chars();
        System.out.println(output);
        
       Stream<Character> a =  output.mapToObj( c ->(char) c).distinct();
       System.out.println(a);
        
      Stream<String> b =  a.map(s-> String.valueOf(s));
      System.out.println(b);
       
        String c = 	b.collect(Collectors.joining());

        System.out.println(c);
	}
	
	public static void main(String[] args) {
		Remove_Duplicate_Characters_from_String obj = new Remove_Duplicate_Characters_from_String();
		//obj.way1("AbCABC");
		//obj.way2("AbCABC");
		obj.way3();

	}

}
