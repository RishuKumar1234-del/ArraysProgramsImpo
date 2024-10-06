package com.java.arrays.operationsonelements;

public class BinarysearchforsortedArr {

	public static void main(String[] args) {
		int[] inputarr= {2,7,9,12,17,23};
		int searchitem=17;
		System.out.println("the original array is: ");
		printArray(inputarr);
		System.out.println("the search item is ");
		searchItemBinarysearch(inputarr, searchitem);

	}
	
	public static void printArray(int[] ar) {
		for(int i=0;i<ar.length;i++) {
			System.out.print(ar[i] +" ");
		}
		System.out.println();
	}
	
	public static void searchItemBinarysearch(int[] ar,int item) {
		int li=0;
		int hi=ar.length-1;
		int mi=(li+hi)/2;
		
		while(li<=hi) {
			if(item==ar[mi]) {
				System.out.println("the item is present at  " +mi + "th position");
				break;
			}
			else if(item>ar[mi]) {
				li=mi+1;
			}
			else {
				hi=mi-1;
			}
			mi=(li+hi)/2;
		}
		
		if(li>hi) {
			System.out.println("element not found");
		}
		
	}

}
