package com.java.arrays.operationsonelements;




public class AllBasicOperationsOfArray {

	public static void main(String[] args) {
		int[] arr= {2,5,4,3,1};
		System.out.println("original array is: ");
		printArray(arr);
		
		System.out.println("\nsorted array is ");
		sortingArray(arr);
		printArray(arr);
		System.out.println("\nsum of the element is: " +sumOfelement(arr));
		System.out.println("\nminimum element is: " +minimumElement(arr));
		
		System.out.println("\nmaximum element is: " +maximumElement(arr));
		System.out.println("\neven elements are: ");
		evenNumbers(arr);
		System.out.println("\nodd numbers are: " );
		oddNumbers(arr);
		

	}
	//Normal sorting an array
	public static int[] sortingArray(int[]ar) {
		
		for(int i=0;i<ar.length;i++) {
			for(int j=i+1;j<ar.length;j++) {
				if(ar[i]>ar[j]) {
					int temp=ar[i];
					ar[i]=ar[j];
					ar[j]=temp;
				}
				
			}
		}
		
		return ar;
	}
	
	//printing array
	public static void printArray(int[] ar) {
		
		for(int i=0;i<ar.length;i++) {
			System.out.print(ar[i] + " ");
		}
	}
	
	//sum of element
	public static int sumOfelement(int[] ar) {
		int sum=0;
		sortingArray(ar);
		for(int i=0;i<ar.length;i++) {
			sum=sum+ar[i];
		}
		return sum;
	}
	
	//minimum element
	public static int minimumElement(int[] ar) {
		int min=ar[0];
		for(int i=0;i<ar.length;i++) {
			if(min>ar[i]) {
				min=ar[i];
			}
		}
		return min;
	}
	//maximum element
	public static int maximumElement(int[] ar) {
		int max=ar[0];
		for(int i=0;i<ar.length;i++) {
			if(ar[i]>max) {
				max=ar[i];
			}
		}
		return max;
	}
	//all even element
	public static void evenNumbers(int[] ar) {
		for(int i=0;i<ar.length;i++) {
			if(ar[i]%2==0) {
				System.out.print(ar[i] + " ");
			}
		}
	}
	
	//odd numbers are
	public static void oddNumbers(int[] ar) {
		for(int i=0;i<ar.length;i++) {
			if(ar[i]%2!=0) {
				System.out.print(ar[i] + " ");
			}
		}
	}
}
