package com.practise.collections;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/*find unique charcater in ascending order*/
public class SetEx2 {
	public static void main(String[] args) {
		List<Character>characters=List.of('A','Z','A','B','Z','F');
		Set<Character>treeSet=new TreeSet<>(characters);
		System.out.println("TreeSet" +treeSet);
	}

}
