package com.practise.collections;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

class StringComparator implements Comparator<String>{

	@Override
	public int compare(String valueo1, String valueo2) {
		
		return Integer.compare(valueo1.length(), valueo2.length());
	}

}

public class QueueEx {
	public static void main(String[] args) {
		Queue<String>queue=new PriorityQueue< >(new StringComparator());
		queue.addAll(List.of("zebra","Monkey","Cat"));
		System.out.println(queue);
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.offer("Dog"));
		System.out.println(queue.offer("Monkey"));
		System.out.println(queue.offer("Animal"));
		System.out.println(queue.offer("kangaro"));
		System.out.println(queue);
	}

}
