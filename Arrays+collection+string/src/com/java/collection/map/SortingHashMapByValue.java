package com.java.collection.map;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SortingHashMapByValue {

	public static void main(String[] args) {
		Map<Character, String> friendsWithGrade=new HashMap<Character, String>();
		friendsWithGrade.put('A', "Nishanr");
		friendsWithGrade.put('B', "Simran");
		friendsWithGrade.put('C', "Sangam");
		friendsWithGrade.put('D', "Beauty");
		friendsWithGrade.put('E', "Amresh");
		
		
		//sorting map by value and traversing by for each method of java8
		System.out.println("++++++++++++++++++++  sorting by value  ++++++++++++++++++++++");
		friendsWithGrade.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(e->{
			System.out.println(e.getKey() + " : " +e.getValue());
		});
		
		//sorting by key and traversing by for each method of java8
		System.out.println("++++++++++++++++++++  sorting by key  ++++++++++++++++++++++");
		friendsWithGrade.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(e->{
			System.out.println(e.getKey()+ " : " +e.getValue());
		});
		
		////sorting by value and traversing by collect() method of java8
		
		//friendsWithGrade.entrySet().stream().sorted(Map.Entry.comparingByValue()).collect(Collectors.toMap(null, null))
		

	}

}
