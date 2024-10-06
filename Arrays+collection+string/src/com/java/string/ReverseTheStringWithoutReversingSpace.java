package com.java.string;

public class ReverseTheStringWithoutReversingSpace {
	 int count=0;

	public static void main(String[] args) {
		String str="my name is do select";
		ReverseTheStringWithoutReversingSpace rswrs=new ReverseTheStringWithoutReversingSpace();
		rswrs.reverseStringWithoutReversingspace(str);
		System.out.println();

	}
	
	public void reverseStringWithoutReversingspace(String str) {
		this.count=0;

		String[] s1=str.split("\\s");
		for(String w:s1) {
           StringBuilder rev=new StringBuilder(w).reverse();
			
			System.out.print(rev + " ");
			this.count++;
		}
		
		System.out.println("\nthe total reversed word: " +this.count);
		
		
	}

}
