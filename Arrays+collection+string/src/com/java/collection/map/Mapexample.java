package com.java.collection.map;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.UUID;

public class Mapexample {

	public static void main(String[] args) {
		Map<String, Integer> employee=new  HashMap<String, Integer>();
		employee.put("Math", 98);
		employee.put("Data structure", 85);
		employee.put("java", 95);
		employee.put("os", 67);
		employee.put("networking", 80);
		
//		 if(employee.containsKey("Data structure")) {
//			 System.out.println(employee.get("Data structure"));
//			
//		 }
//		 
//		 if(employee.containsKey("java")) {
//			 System.out.println(employee.get("java"));
//		 }
		 
		 if(employee.containsKey("Math")) {
			 System.out.println(employee.getOrDefault("physics", 7000));
		 }
		
		
	
		
//		TreeMap<String, Integer> tm=new TreeMap<String, Integer>();
//		tm.putAll(employee);
//		tm.forEach((a,b)->{
//			System.out.println(b+ " ");
//		});
		 
		 
		 
//		
//		System.out.println("++++++++++++++++++++++++++++");
//		
//	  employee.entrySet().stream().sorted((a,b)->a.getValue().compareTo(b.getValue())).forEach(e->{
//		  System.out.println(e.getKey() + " => " +e.getValue());
//	  });
	  
		

	}

}
