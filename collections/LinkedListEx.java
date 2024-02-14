package com.practise.collections;

import java.util.LinkedList;
import java.util.List;

public class LinkedListEx {
	public static void main(String[] args) {

		List<String> words = List.of("cat", "Rat", "Bat");
		List<String> wordsLinkedList = new LinkedList<String>(words);
		System.out.println(wordsLinkedList.add("Tiger"));
		System.out.println(wordsLinkedList);
	}

}
