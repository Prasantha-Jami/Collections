package com.practise.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetEx1 {
	public static void main(String[] args) {
		Set<Integer>numbers=new HashSet<>();//HasSet neither cares about insertion nor sorting order\
		numbers.add(67894);
		numbers.add(6789);
		numbers.add(789);
		numbers.add(89);
		numbers.add(9);
		System.out.println("HashSet" + numbers);
		
		Set<Integer>numbers1=new LinkedHashSet<>();//LinkedHashSet cares about insertion does not worry about sorting order
		numbers1.add(67894);
		numbers1.add(6789);
		numbers1.add(789);
		numbers1.add(89);
		numbers1.add(9);
		System.out.println("LinkedHashSet" + numbers1);
		
		Set<Integer>numbers2=new TreeSet<>(); //TreeSet cares about sorting order doesnot worry about insertion 
		numbers2.add(67894);
		numbers2.add(6789);
		numbers2.add(789);
		numbers2.add(89);
		numbers2.add(9);
		System.out.println("TreeSet" + numbers2);
	}

}
