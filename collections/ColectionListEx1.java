package com.practise.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class DescendingComparator implements Comparator<Student>{

	@Override
	public int compare(Student s1, Student s2) {
		
		return Integer.compare(s2.getEid(),s1.getEid());
	}
	
}

public class ColectionListEx1 {
	public static void main(String[] args) {
		//sorting objects of specific class
		List<Student>students=List.of(new Student(40,"Ranga"),
				new Student(12,"prasad"),
				new Student(3,"prasantha"));
		ArrayList<Student>StudentsAl=new ArrayList<>(students);
		System.out.println(StudentsAl);
		Collections.sort(StudentsAl);
		System.out.println("Ascending order :"+ StudentsAl);
		//Collections.sort(StudentsAl,new DescendingComparator());
		StudentsAl.sort(new DescendingComparator());
		System.out.println("Descending order : "+StudentsAl);
		
		
		
	}

}
