package com.practise.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ArrayLists {
	public static void main(String[] args) {
		List<String>words=List.of("cat","Rat","Bat");//immutable list--we can't add value to this words list
				System.out.println(words.size());
				System.out.println(words.indexOf("cat"));
				//ArrayList,LinkedList,Vector---mutable lists--we can add values to the list
				List<String>wordsArrayList=new ArrayList<String>(words);
				//we can add single element, add element to specific position add a list to existing list
				System.out.println(wordsArrayList);
				System.out.println(wordsArrayList.add("Lion"));
				wordsArrayList.add(3,"Elephant");
		System.out.println(wordsArrayList);
				System.out.println(wordsArrayList);
				List<String>newList=List.of("yak","zebra");
				//wordsArrayList.addAll(newList);
				wordsArrayList.addAll(3,newList);
				System.out.println(wordsArrayList);
				wordsArrayList.set(6,"Rabbit");
				System.out.println(wordsArrayList);
				//delete elements by uisng 2 ways 1. index and specifying element directly
				wordsArrayList.remove(3);
				wordsArrayList.remove("Rabbit");
				System.out.println(wordsArrayList);
				System.out.println(wordsArrayList);
	}

}
