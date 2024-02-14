package com.practise.collections;

import java.util.HashSet;
import java.util.Set;

public class CollectionSetEx {
	public static void main(String[] args) {
		Set<String>fruits=Set.of("Apple","Banana","papaya");
		System.out.println(fruits);
		HashSet<String>fruiteshs=new HashSet<>(fruits);
		fruiteshs.add("Mango");
		System.out.println(fruiteshs);
		fruiteshs.add("Mango");
		System.out.println(fruiteshs.add("Mango"));//set does not have duplicate values and it can't add values based on specific position
	}

}
