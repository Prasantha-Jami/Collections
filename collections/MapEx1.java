package com.practise.collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class MapEx1 {
	public static void main(String[] args) {
		//hashmap
		HashMap<String, Integer>hashmap=new HashMap<>();
		hashmap.put("Z", 5);
		hashmap.put("A", 16);
		hashmap.put("F", 25);
		hashmap.put("L", 250);
		System.out.println(hashmap);//does not care about insertion and sorting--hashmap
		//Linkedhashmap
		LinkedHashMap<String, Integer>likedhashmap=new LinkedHashMap<>();
		
		likedhashmap.put("Z", 5);
		likedhashmap.put("A", 16);
		likedhashmap.put("F", 25);
		likedhashmap.put("L", 250);
		
		System.out.println(likedhashmap);//it stores about insertion order
		
		//Treemap
		TreeMap<String, Integer>treemap=new TreeMap<>();
		treemap.put("Z", 5);
		treemap.put("A", 16);
		treemap.put("F", 25);
		treemap.put("L", 250);
		System.out.println(treemap);///It would be  sorted based on key
		
		

	}

}
