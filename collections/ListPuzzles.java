package com.practise.collections;

import java.util.ArrayList;
import java.util.List;

public class ListPuzzles {
	public static void main(String[] args) {
		List value=List.of("A",'A',1,1.0);
//		System.out.println(value);
//		System.out.println(value.get(0));
//		System.out.println(value.get(2) instanceof Integer);
		//lists  we can't store primitive
		List<Integer>numbers=List.of(100,101,102,103,104);
		//System.out.println(numbers.indexOf(103));
		List<Integer>numbers1=new ArrayList<>(numbers);
		System.out.println(numbers1.remove(Integer.valueOf(103)));
		System.out.println(numbers1);
	}

}
