package com.practise.collections;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter first number to check anagram");
		String str1 = sc.next();
		System.out.println("Please enter second number to check anagram");
		String str2 = sc.next();

		if (areAnagrams(str1, str2)) {
			System.out.println(str1 + " and " + str2 + " are anagrams");

		} else {
			System.out.println(str1 + " and " + str2 + " are not anagrams ");
		}
	}

	public static boolean areAnagrams(String str1, String str2) {

		if (str1 == null || str2 == null) {
			return false;
		}
		if (str1.length() != str2.length()) {
			return false;
		}
		// converting strins to lowercase
		String lowerCase1 = str1.toLowerCase();
		String lowerCase2 = str2.toLowerCase();
		// convertings to new character array

		char[] charArray1 = lowerCase1.toCharArray();
		char[] charArray2 = lowerCase2.toCharArray();

		// sorting array into ascending order

		Arrays.sort(charArray1);
		Arrays.sort(charArray2);

		return Arrays.equals(charArray1, charArray2);

	}
}
