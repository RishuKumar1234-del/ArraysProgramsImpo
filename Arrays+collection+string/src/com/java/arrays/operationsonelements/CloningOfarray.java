package com.java.arrays.operationsonelements;

import java.util.Scanner;

public class CloningOfarray {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int size=scan.nextInt();
		int orignal[]=new int[size];
		int cloned[]=new int[size];
		System.out.println("Enter the elements of original array ");
		for(int i=0;i<size;i++) {
			orignal[i]=scan.nextInt();
		}
		System.out.println("the original array is: ");
		
		for(int i=0;i<size;i++) {
			System.out.print(orignal[i] + " ");
		}
		System.out.println("\nEnter the  cloned array ");
		for(int i=0;i<size;i++) {
			       cloned[i]=orignal[i];
			System.out.print(cloned[i] +" ");
		}

	}

}
