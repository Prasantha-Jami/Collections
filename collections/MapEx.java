package com.practise.collections;

import java.lang.System.Logger;
import java.util.HashMap;
import java.util.Map;

public class MapEx {
	public static void main(String[] args) {
		//Logger logger = LoggerFactory.getLogger(MapEx.class);
		
		Map<String, Integer>map=Map.of("A",5,"B",4,"E",7);
		System.out.println(map);
		Map<String,Integer> map1 = new HashMap<>(map);
		System.out.println(map1);
		//map1.putAll(map);
		map1.put("T", 9);
		System.out.println(map1);
		System.out.println(map1.get("E"));
		System.out.println(map1.containsKey("F"));
		System.out.println(map1.containsValue(4));
		System.out.println(map1.keySet());
		
	}

}
