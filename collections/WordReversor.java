package com.practise.collections;

import java.util.Scanner;

//word reversor -->>this method takes a string sentence as input 
//and return a string in which each word in the sentence is reversed while maintaining original word oder 
public class WordReversor {
	String sentence;
	
	public WordReversor(String sentence) {
		super();
		this.sentence = sentence;
	}

	public static void main(String[] args) {
		
	Scanner sc=new Scanner(System.in);
	System.out.println("Please enter senetence");
	
	String sentence=sc.nextLine();
	
	String wordreversor=reverseWordsInSentence(sentence);
	System.out.println("Reverse order of the statement is : "+ wordreversor);
	
	}
	
	public static String reverseWordsInSentence(String sentence) {
		
		//To check if the sentence is null--return invlaid
		if(sentence==null) {
			return "Invalid";
		}
		//To check if the sentence is empty--return empty
		if(sentence.equals("")) {
			return "";
		}
		//create StringBuilder to hold reversed sentence
		StringBuilder reverseSentence=new StringBuilder();
		//split senetence into words using the split method and loop through each word in the  words array
		for(String word:sentence.split(" ")) {
			//for each word create a stringbbuilder and reverse  the word
			//append the reversed word, followed by a space, to the reversed senetence
			StringBuilder reverseword=new StringBuilder(word).reverse();
			reverseSentence.append(reverseword).append(" ");
		}
		//after reversing all words, trim the trailining space and return  reversed senetence 
		return reverseSentence.toString().trim();
		
	}
	

}
