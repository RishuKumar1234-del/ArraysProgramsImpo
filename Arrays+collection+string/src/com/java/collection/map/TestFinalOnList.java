package com.java.collection.map;

import java.util.ArrayList;
import java.util.List;

public class TestFinalOnList {

	public static void main(String[] args) {
		 final List<Integer> list=new ArrayList<Integer>(9);
		 for(int i=0;i<=10;i++) {
			 list.add(i);
		 }
		 System.out.println(list);

	}

}
