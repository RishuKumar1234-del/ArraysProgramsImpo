package com.java.collection.map;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class FillAndRemoveTheElementIntoOrFromMap {

	public static void main(String[] args) {
		//basic approach
		Map<Integer, String> map=new HashMap<Integer, String>();
		map.put(1, "Nishant");
		map.put(2, "Sachin");
		map.put(3, "Krishna");
		map.put(4, "Amresh");
		map.put(3, "sohan");
		System.out.println("number of keys in map are: " +map.size());
		System.out.println("Input : ");
		for(Map.Entry<Integer, String> me:map.entrySet()) {
			System.out.println(me.getKey() + " : " +me.getValue());
		}
		
	//System.out.println("number of keys in map are: " +map.entrySet().size());
	System.out.println("Output :  ");
	for(int i=0;i<map.size();i++) {
		
		
		if(map.containsValue("sohan")) {
			map.remove(3);
		}
	}
	
	for(Map.Entry<Integer, String> me: map.entrySet()) {
		System.out.println(me.getKey() + " : " + me.getValue());
	}
	
	Map<Integer,String> synchronizedMap = Collections.synchronizedMap(map);
	System.out.println("the synchronized hash map");
	for(Map.Entry<Integer, String> me:synchronizedMap.entrySet()) {
		
		System.out.println(me.getKey() + " : " +me.getValue());
	}
	
	

	

	}

}
