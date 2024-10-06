package com.java.arrays.operationsonelements;

public class InsertAnelementIntoArray {

	public static void main(String[] args) {
		int[] ar= {10,20,30};
		int element=15;
		int pos=2;
		
		System.out.println("the original array is ");
		for(int n:ar) {
			 
			System.out.print(n + " ");
		}
		
		System.out.println("\n\nthe new  array is ");
		
		insertElementIntoArray(ar, element, pos);
		
		System.out.println("\n\nthe new  array without removing the element is ");
		
		insertElementIntoArray(ar, element, pos);

	}
	
	public static void insertElementIntoArray(int[] arr,int element,int position) {
		for(int i=arr.length-1;i>position-1;i--) {
			arr[i]=arr[i-1];
			
		}
		arr[position-1]=element;
		
		for(int i=0;i<arr.length;i++) {
			 
			System.out.print(arr[i] + " ");
		}

	}
	
	
	public static void insertElementWithoutRemovingElement(int[] arr,int element,int position) {
		int[] temparr=new int[arr.length+1];
		for(int i=0;i<temparr.length;i++) {
			temparr[i]=arr[i-1];
		}
		System.out.println("the temporary array is: ");
		
		for(int i=0;i<temparr.length;i++) {
			System.out.print(temparr[i] + " ");
		}
		
		System.out.println();
		
		
		
	}
	
	
}
