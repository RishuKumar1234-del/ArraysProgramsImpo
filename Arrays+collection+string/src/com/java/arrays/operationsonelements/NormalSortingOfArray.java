package com.java.arrays.operationsonelements;

import java.util.Arrays;

public class NormalSortingOfArray {
	

	public static void main(String[] args) {
		 int[] ar= {4,1,3,2,5};
		System.out.println("the original array is " +Arrays.toString(ar));
		System.out.println("the sorted array is");
		for(int i=0;i<ar.length;i++) {
			for(int j=i+1;j<ar.length;j++) {
				if(ar[i]<ar[j]) {
					int temp=ar[i];
					ar[i]=ar[j];
					ar[j]=temp;
				}
			}
		}
		
		System.out.println(Arrays.toString(ar));
		
		for(int i=0;i<ar.length;i++) {
			if(i==2) {
				System.out.println("the 3rd highest element is: " +ar[i]);
			}
		}
		

	}
	

}
