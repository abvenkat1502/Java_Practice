package com.java.Java_Practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class JavaWorkouts {

	String myName = "venkatesh";
	String rev_Name = "";
	String rem_Duplicate_Char = "";
	String myName_Vowels = "";

	public void task1() {
		// Reverse a String
		for (int i = myName.length() - 1; i >= 0; i--) {
			rev_Name = rev_Name + myName.toUpperCase().charAt(i);
		}

		// Remove Duplicates
		for (int i = 0; i < rev_Name.length(); i++) {
			char ch = rev_Name.charAt(i);

			if (rem_Duplicate_Char.indexOf(ch) == -1) {
				rem_Duplicate_Char = rem_Duplicate_Char + ch;
			}

		}

		// Get Vowels count
		int A = 0, E = 0, I = 0, O = 0, U = 0;
		for (int i = 0; i < myName.length(); i++) {

			char ch = myName.toUpperCase().charAt(i);

			if (ch == 'A') {
				myName_Vowels = myName_Vowels + ch;
				A++;
			} else if (ch == 'E') {
				myName_Vowels = myName_Vowels + ch;
				E++;
			} else if (ch == 'I') {
				myName_Vowels = myName_Vowels + ch;
				I++;
			} else if (ch == 'O') {
				myName_Vowels = myName_Vowels + ch;
				O++;
			} else if (ch == 'U') {
				myName_Vowels = myName_Vowels + ch;
				U++;
			}

		}

		// Print OutPut
		System.out.println("My Name : " + myName);
		System.out.println("Reverse Name : " + rev_Name);
		System.out.println("Duplicate Character Removed : " + rem_Duplicate_Char);
		System.out.println("My Name of Vowels : " + myName_Vowels);
		System.out.println("A Count Is - " + A);
		System.out.println("E Count Is - " + E);
		System.out.println("I Count Is - " + I);
		System.out.println("O Count Is - " + O);
		System.out.println("U Count Is - " + U);
	}

	public void task2() {

		String greeting = "AaaA";
		greeting = greeting.toUpperCase();
		Integer totalVowelsCount = 0;

		// Reverse
		String reverseString = new StringBuilder(greeting).reverse().toString();

		// Remove Duplicates
		Set<Character> removeDuplicate = new LinkedHashSet<>();
		for (Character character : greeting.toCharArray()) {
			removeDuplicate.add(character);
		}
		// Covert Set to String Builder
		StringBuilder noDuplicates = new StringBuilder();
		for (Character character : removeDuplicate) {
			noDuplicates.append(character);
		}

		// Get Vowles
		Map<Character, Integer> vowlesCount = new HashMap<>();
		Set<Character> vowles = Set.of('A', 'E', 'I', 'O', 'U');

		for (Character character : greeting.toCharArray()) {
			if (vowles.contains(character)) {
				totalVowelsCount++;
				vowlesCount.put(character, vowlesCount.getOrDefault(character, 0) + 1);
			}
		}

		// OUT PUT
		System.out.println("Given String : " + greeting);
		System.out.println("Reverse a String : " + reverseString);
		System.out.println("Removed Duplicate Charater : " + noDuplicates);
		System.out.println("-----Vowels Count -----");
		System.out.println("Total Vowels Count : " + totalVowelsCount);
		for (Character character : vowles) {
			System.out.println("Count of " + character + ":" + vowlesCount.getOrDefault(character, 0));
		}

	}

	public void task3() {

		String finalString = "";
		String data = "((4,5,99),(4,8),((9,4),((7,1)(1,2),(((5,3))";

		List<Character> numbersSet = new LinkedList<Character>();
		List<Character> odd = new LinkedList<>();
		List<Character> even = new LinkedList<>();

		// Retrive Numeric values
		for (Character iterable_element : data.toCharArray()) {

			if (Character.isDigit(iterable_element)) {
				// System.out.println(iterable_element);
				numbersSet.add(iterable_element);
			}
		}

		// Split values (a,b)
		int i = 1;
		for (Character character : numbersSet) {
			if ((i % 2) != 0) {
				odd.add(character);
			} else {
				even.add(character);
			}
			i++;
		}

		// Result
		for (int j = 0; j < odd.size(); j++) {

			if (finalString.isEmpty()) {
				finalString = finalString + '(' + odd.get(j) + ',' + even.get(j) + "),";
			} else {

				finalString = finalString + '(' + odd.get(j) + ',' + even.get(j) + "),";
			}

		}

		System.out.println(odd);
		System.out.println(even);
		System.out.println("Final String is : " + finalString);

	}

	public void task4() {

		String data = "((4556,5,8),((908,7),(4,84),((921,4),((7,1567),(1,2),(((5,3))";
		String[] words = data.split(",");
		List<String> numbersSet = new LinkedList<String>();
		List<String> odd = new LinkedList<>();
		List<String> even = new LinkedList<>();
		String finalString = "";
		String result;

		for (String word : words) {
			numbersSet.add(word.replaceAll("\\D", ""));

		}

		// Split values (a,b)
		int i = 1;
		for (String value : numbersSet) {
			if ((i % 2) != 0) {
				odd.add(value);
			} else {
				even.add(value);
			}
			i++;
		}

		// Result
		for (int j = 0; j < odd.size(); j++) {

			if (finalString.isEmpty()) {
				finalString = finalString + '(' + odd.get(j) + ',' + even.get(j) + "),";
			} else {

				finalString = finalString + '(' + odd.get(j) + ',' + even.get(j) + "),";
			}

		}

		result = finalString.substring(0, finalString.length() - 1);

		System.out.println(odd);
		System.out.println(even);
		System.out.println("Result is : " + result);

	}

	public void task5() {

		String data = "((4556,5),((908,7),(4,84),((921,4),((7,1567),(1,2),(((5,3))";
		String[] words = data.split(",");

		List<String> numbers = new ArrayList<>();

		// Extract numbers
		for (String word : words) {
			String num = word.replaceAll("\\D", "");
			if (!num.isEmpty()) {
				numbers.add(num);
			}
		}

		StringBuilder result = new StringBuilder();

		// Pair numbers (a,b)
		for (int i = 0; i < numbers.size() - 1; i += 2) {
			result.append("(").append(numbers.get(i)).append(",").append(numbers.get(i + 1)).append("),");
		}

		// Remove last comma
		if (result.length() > 0) {
			result.setLength(result.length() - 1);
		}

		System.out.println("Result is : " + result.toString());
	}

	public void task6() {
		String actualData = "(1,2)(),((45,21,66),((_+*23,56,8,90))),(67,42)";
		StringBuffer datas = new StringBuffer(actualData);
		for (int i = 0; i < datas.length(); i++) {
			System.out.println(i + ":" + datas.charAt(i));
			if (i == 0) {
				if (datas.charAt(i) != '(') {
					datas.delete(i, i + 1);
					i = 0;
				}
			} else {

				if (datas.charAt(i - 1) == '(' && !Character.isDigit(datas.charAt(i))) {
					datas.delete(i, i + 1);
					i = 0;
				} else if (Character.isDigit(datas.charAt(i - 1)) && !Character.isDigit(datas.charAt(i))
						&& datas.charAt(i) != ',' && datas.charAt(i) != ')') {
					datas.delete(i, i + 1);
					i = 0;
				} else if (datas.charAt(i - 1) == ',' && !Character.isDigit(datas.charAt(i))
						&& datas.charAt(i) != '(') {
					datas.delete(i, i + 1);
					i = 0;
				} else if (datas.charAt(i - 1) == ')' && datas.charAt(i) != ',') {
					datas.delete(i, i + 1);
					i = 0;
				}
			}
		}

		System.out.println("6 Result is : " + datas);

	}

	public void task7() {

		String data = "(1,2)(),((45,21,66,77,88dfgdfgdfgdfg),((_+*23,56,8,90))),(67,42)";
		StringBuilder result = new StringBuilder();
		char pre = '\0';

		for (int i = 0; i < data.length(); i++) {
			char ch = data.charAt(i);

			if (ch == '(') {
				if (pre == '\0' || pre == ',') {
					result.append(ch);
					pre = ch;
				}

			} else if (Character.isDigit(ch)) {
				if (pre == '(' || Character.isDigit(pre) || pre == ',') {
					result.append(ch);
					pre = ch;
				}

			} else if (ch == ',') {
				if (Character.isDigit(pre) || pre == ')') {
					result.append(ch);
					pre = ch;
				}

			} else if (ch == ')') {
				if (Character.isDigit(pre)) {
					result.append(ch);
					pre = ch;
				}
			}
		}

		System.out.println("7 Result is : " + result);

	}

	public static void main(String[] args) {
		JavaWorkouts workOuts = new JavaWorkouts();
		workOuts.task6();
		workOuts.task7();
	}

}
