package com.java.collection.map;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class PuttingTheArrayElementsIntoMap {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		List<String> myfriends= Arrays.asList("Rishu","Rohan","Forest","city","rishu");
		//putting this list into map
		HashMap<Integer,String> myfriendsmap=new HashMap<Integer, String>();
		for(int i=0;i<myfriends.size();i++) {
			myfriendsmap.put(i, myfriends.get(i));
		}
		System.out.println(myfriendsmap);
       System.out.println("\n\n++++++++++++++++++++++++++++++++++++++");
		
       System.out.println("Enter any words");
		String word=scan.nextLine();
		
		HashMap<Character, Integer> wm=new HashMap<Character, Integer>();
		char[] cw=word.toCharArray();
		
		for(char c:cw ) {
			if(wm.containsKey(c)) {
				wm.put(c, wm.get(c)+1);
			}
			else {
				wm.put(c, 1);
			}
		}
		

			
	
		
		
		
		for(Map.Entry<Character, Integer> l:wm.entrySet()) {
			if(l.getValue()>1) {
				System.out.println(l.getKey() + " : " + l.getValue());
			}
			}
	
			


	}

}
