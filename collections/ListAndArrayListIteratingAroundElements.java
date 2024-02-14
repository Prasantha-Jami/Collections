package com.practise.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListAndArrayListIteratingAroundElements {
	public static void main(String[] args) {
		List<String> words = List.of("Elephant", "Bat", "cat");
		// for loop
		for (int i = 0; i < words.size(); i++) {
			System.out.println(words.get(i));
		}
		// enhanced loop
		for (String word : words) {
			System.out.println(word);
		}
		Iterator iteratorwords = words.iterator();
		while (iteratorwords.hasNext()) {
			System.out.println(iteratorwords.next());
		}

		// what kind of operations we use what kind of loops

		List<String> wordsAl = new ArrayList<>(words);
		// enahnaced loop--we want to get the words which are ending with"at"
		for (String word : wordsAl) {
			if (word.endsWith("at")) {
				System.out.println(word);
			}
		}
		//if we wanted to delete the word which is ending with "at".
		for(String word:wordsAl) {
			if(word.endsWith("at")) {
				wordsAl.remove(word);
				System.out.println(wordsAl);
				//when we are using enhanced loop, in the middle of the loop, it is not recommended to made modifications,especially deletions from the list. because we are removig word from that specificlist and it might chnage how itertaion happens
			}
		}
		
		//if we wanted to delete the word which is ending with "at".
		Iterator<String>iterator=wordsAl.iterator();
		while(iterator.hasNext()) {
			if(iterator.next().endsWith("at")) {
				iterator.remove();
				System.out.println(wordsAl);
			}
		}
	}
}
