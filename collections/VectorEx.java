package com.practise.collections;

import java.util.List;
import java.util.Vector;

public class VectorEx {
	public static void main(String[] args) {
		List<String> words = List.of("cat", "Rat", "Bat");
		List<String>wordsVector=new Vector<String>(words);
		System.out.println(wordsVector.add("Dog"));
		System.out.println(wordsVector);
	}

}
