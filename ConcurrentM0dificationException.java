package com.isha.javabasics;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ConcurrentM0dificationException {

	public static void main(String args[]) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("user1",6);
		map.put("user2",7);
		map.put("user3",8);
		map.put("user4",9);
		map.put("user5",10);
		//System.out.println(map);
		
		Iterator<String> itr = map.keySet().iterator();
		
		while(itr.hasNext()) {
			System.out.println(map.get(itr.next()));
			map.put("user6", 11);
		}
	}
	
	
}
