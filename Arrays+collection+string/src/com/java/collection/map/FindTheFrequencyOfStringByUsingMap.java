package com.java.collection.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FindTheFrequencyOfStringByUsingMap {

	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
		System.out.println("enter any words");
		String word=scn.nextLine();
		HashMap<Character, Integer> hm= new HashMap<Character, Integer>();
		char[] cw=word.toCharArray();
		for(char c:cw) {
			if(hm.containsKey(c)) {
				hm.put(c, hm.get(c)+1);
			}
			else {
				hm.put(c, 1);
			}
		}
		for(Map.Entry<Character,Integer> me:hm.entrySet()) {
			System.out.println(me.getKey() + " : " +me.getValue());
		}

	}

}
