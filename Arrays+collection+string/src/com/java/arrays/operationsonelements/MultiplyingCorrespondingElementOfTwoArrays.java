package com.java.arrays.operationsonelements;

public class MultiplyingCorrespondingElementOfTwoArrays {

	public static void main(String[] args) {
	     int a1[] = { 2, 5, -2, 10 }; 
	     int a2[] = { 3, -5, 7, 1 }; 
	     System.out.println("the first array is: ");
	     for(int i=0;i<a1.length;i++) {
	    	 System.out.print(a1[i] +" ");
	     }
	     
	     System.out.println("\nthe second array is: ");
	     for(int i=0;i<a1.length;i++) {
	    	 System.out.print(a2[i] +" ");
	     }
	     System.out.println("\nthe resultant array is: ");
	     for(int i=0;i<a1.length;i++) {
	    	 a1[i]=a1[i]*a2[i];
	     }
	     
	     for(int i=0;i<a1.length;i++) {
	    	 System.out.print(a1[i] +" ");
	     }

	}

}
