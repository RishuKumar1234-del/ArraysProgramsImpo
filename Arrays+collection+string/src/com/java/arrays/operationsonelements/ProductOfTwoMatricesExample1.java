package com.java.arrays.operationsonelements;

import java.util.*;

public class ProductOfTwoMatricesExample1 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter rows and columns of first matrix");
		int m=scan.nextInt();
		int n=scan.nextInt();
		int[][] A= new int[m][n];
		System.out.println("enter rows and columns of second matrix");
		int p=scan.nextInt();
		int q=scan.nextInt();
		int[][] B= new int[p][q];
		int[][] C= new int[m][q];
		if(n==p) {
			
			System.out.println("enter the element of first matrix");
			for(int i=0;i<m;i++) {
				for(int j=0;j<n;j++) {
					A[i][j]=scan.nextInt();
				}
				
			}
			
			System.out.println(" The  matrix A is ");
			for(int i=0;i<m;i++) {
				for(int j=0;j<n;j++) {
					System.out.print(A[i][j] + " ");
				}
				System.out.println();
				
			}
			System.out.println();
			System.out.println("enter the element of second matrix");
			for(int i=0;i<p;i++) {
				for(int j=0;j<q;j++) {
					B[i][j]=scan.nextInt();
				}
				
			}
			
			System.out.println(" The  matrix B is ");
			for(int i=0;i<p;i++) {
				for(int j=0;j<q;j++) {
					System.out.print(B[i][j] + " ");
				}
				System.out.println();
				
			}
			
			System.out.println("the resultant matrix is: ");
			for(int i=0;i<m;i++) {
				for(int j=0;j<q;j++) {
					for(int k=0;k<p;k++) {
						C[i][j]+=A[i][k]*B[k][j];
						System.out.print(C[i][j] +" ");
					}
					System.out.println();
				}
				
				
			}
			
			
			
			
		}
		else {
			System.err.println("product of two matrices is not possible");
		}
		

	}

}
