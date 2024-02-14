package com.practise.collections;

import java.util.TreeMap;

public class TreeMapEx {
	public static void main(String[] args) {
		TreeMap<String, Integer>treemap=new TreeMap<>();
		treemap.put("F", 25);
		treemap.put("Z", 5);
		treemap.put("L", 250);
		treemap.put("A", 15);
		treemap.put("B", 25);
		treemap.put("G", 30);
		System.out.println(treemap);//{A=15, B=25, F=25, G=30, L=250, Z=5}
		System.out.println(treemap.higherKey("G"));//L return> G
		System.out.println(treemap.ceilingKey("G"));// G return >=G
		System.out.println(treemap.lowerKey("B"));//A return <B
		System.out.println(treemap.floorKey("B"));//B return<=B
		System.out.println(treemap.keySet());//[A, B, F, G, L, Z]
		System.out.println(treemap.firstEntry());//A=15
		System.out.println(treemap.lastEntry());//Z=5
		System.out.println(treemap.subMap("B", "Z"));//{B=25, F=25, G=30, L=250} return from B to <Z
		System.out.println(treemap.subMap("B", true, "Z", true));//{B=25, F=25, G=30, L=250, Z=5} returns from B to Z(including z)
	}

}
