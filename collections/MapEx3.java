package com.practise.collections;

import java.util.HashMap;
import java.util.Map;



public class MapEx3 {
	public static void main(String[] args) {
		
		String str=" This is an awesome occasion. "
				+ "This has never happened before This";
		//Find number of each characters in the string
		Map<Character,Integer>occurance=new HashMap<>();
		char[] charcters=str.toCharArray();
		//Get the characters
		for(char character: charcters) {
			Integer integer=occurance.get(charcters);
			//If charcter not present assign to 1
			if(integer==null) {
				occurance.put(character, 1);
			}
			else
			{
				occurance.put(character, integer+1);
			}
			
		}
		System.out.println(occurance);
		
		//Find number of words in the string
		Map<String,Integer>Stringoccurance=new HashMap<>();
		String[] words=str.split(" ");
		for(String word:words) {
			
			Integer integer=Stringoccurance.get(word);
			if(integer==null) {
				Stringoccurance.put(word, 1);
			}
			else
			{
				Stringoccurance.put(word,integer+1);
			}
		}
		
		System.out.println(Stringoccurance);
	}
	
	

}
