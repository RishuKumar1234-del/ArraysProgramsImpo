package com.java.string;

import java.util.HashMap;
import java.util.Map;

public class CountDuplicateCharOfString {

	public static void main(String[] args) {
		String str="successful";
		
		System.out.println("reversing the string by using map");
		findDuplicateusingMap(str);
		
		System.out.println("\nreversing the string by using array");
		findDuplicateusingArray(str);
		
//		Map<String, Integer> hm= new HashMap<String, Integer>();
//		hm.put("rishu",32);
//		hm.put("ranjeet", 35);
//		System.out.println("\n");
//		System.out.println(hm.get("rishu"));
		

	}
	
	//aproach-1
	public static void findDuplicateusingMap(String s) {
		
		char[] c=s.toLowerCase().toCharArray();
		HashMap<Character, Integer> hm=new HashMap<Character, Integer>();
		for(char c1:c) {
			if(hm.containsKey(c1)) {
				hm.put(c1, hm.get(c1)+1);
			}
			else {
				hm.put(c1, 1);
			}
			
		}
		
		for(Map.Entry<Character, Integer> me:hm.entrySet()) {
			System.out.println(me.getKey() + " : " +me.getValue());
		}
		
		
	}
	
	//aproach-2:
	
	public static void findDuplicateusingArray(String str) {
		int count=0;
		char[] c=str.toLowerCase().toCharArray();
		System.out.println("duplicate elements are");
		for(int i=0;i<str.length()-1;i++) {
			for(int j=i+1;j<str.length();j++) {
				if(c[i]==c[j]) {
					count++;
					System.out.print(c[i] +" "  );
					
				}
			}
		}
	}

}
