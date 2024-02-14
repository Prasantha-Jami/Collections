package com.practise.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListAndArrayListsSorting {
	public static void main(String[] args) {
		List<Integer>numbers=List.of(13,2,4,56,8,0,11);
		List<Integer>numbers1=new ArrayList<>(numbers);
		Collections.sort(numbers1);//sorting
		System.out.println(numbers1);
	}
	

}
