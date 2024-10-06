package com.java.arrays.operationsonelements;

import java.util.Arrays;

public class ClosestElementOfArray {
	
	
	public static void main(String[] args) {
		int []ar= {4,6,1,8};
		int n=ar.length;
		int target=9;
		System.out.println("the closest element to " +target +" is: " +findclosestElement(ar, n, target));
		
	}
	
	public static int findclosestElement(int[] ar,int n,int target) {
		int left=0,right=n-1;
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

}
