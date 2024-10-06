package com.java.arrays.operationsonelements;

public abstract class PracOfClosestElement {

	public static void main(String[] args) {
		int[] ar= {3,1,7,23,11,5};
		int target=15;
		
		 System.out.println("the original array is: ");
		 printAnArray(ar);
		 System.out.println("\nthe closest element to the element " +target +" is: " +findClosestElement(ar, target));

	}
	
	public static int findClosestElement(int[] ar,int target) {
		int left=0;
		int right=ar.length-1;
		while(left<right) {
			if(Math.abs(ar[left]-target)<=Math.abs(ar[right]-target)) {
				right--;
			}
			else {
				left++;
			}
		}
		
		return ar[left];
	}
	
	public static void printAnArray(int[] ar) {
		for(int num:ar) {
			System.out.print(num + " ");
		}
	}

}
