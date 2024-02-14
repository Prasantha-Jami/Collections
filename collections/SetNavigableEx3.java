package com.practise.collections;

import java.util.Set;
import java.util.TreeSet;

public class SetNavigableEx3  {
	public static void main(String[] args) {
		TreeSet<Integer>numbers=new TreeSet<>(Set.of(12,34,54,65,99));
		//System.out.println(numbers);
		System.out.println(numbers.floor(34));
		System.out.println(numbers.lower(34));
		System.out.println(numbers.ceiling(34));
		System.out.println(numbers.ceiling(36));
		System.out.println(numbers.higher(54));
		System.out.println(numbers.subSet(54, 65));
		System.out.println(numbers.subSet(34, 65));
		System.out.println(numbers.subSet(54, true, 65, true));
		System.out.println(numbers.headSet(100));
		System.out.println(numbers.tailSet(65));
	}

}
