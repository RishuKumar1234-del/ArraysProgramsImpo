package com.java.collection.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SortHashMapByValue {

	public static void main(String[] args) {
		
		HashMap<String, Integer> myfriends=new HashMap<String, Integer>();
		myfriends.put("Rishu", 30);
		myfriends.put("Ranjeet", 28);
		myfriends.put("Sunil", 42);
		myfriends.put("vikram", 25);
		
		LinkedHashMap<String, Integer> sortemp = myfriends.entrySet().stream().
				sorted(Map.Entry.comparingByValue()).collect(Collectors.toMap(Map.Entry::getKey, 
				Map.Entry::getValue,(e1,e2)->e1,LinkedHashMap::new));
		
		sortemp.forEach((a,b)->{
			System.out.println(a + " : " +b);
		});

	}
	


}
