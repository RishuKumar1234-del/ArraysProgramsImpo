package com.java.arrays.operationsonelements;

public class MergeSorting {
	int[] array;
	int length;
	int[] tempArr;

	public static void main(String[] args) {
		int[] inputArr = { 20, 30, 15, 43, 18, 10 };
		System.out.println("the original array is: ");
		printArr(inputArr);
		System.out.println("\nsorted array is:");
		new MergeSorting().sort(inputArr);
		printArr(inputArr);

	}
	
	public static void printArr(int[] ar) {
		
		for(int num:ar) {
			System.out.print(num + " ");
		}
	}
     
	public void sort(int[] arr) {
		length=arr.length;
		array=arr;
		tempArr= new int[length];
    
		divideArr(0, length-1);
	}

	public void divideArr(int li,int hi) {
		if(li<=hi) {
			int mi=(li+hi)/2;
			divideArr(li, mi);
			divideArr(mi, hi);
			MergeArr(li, mi, hi);
		}

	}

	public void MergeArr(int li,int mi,int hi) {
		
		for(int i=li;i<=hi;i++) {
			tempArr[i]=array[i];
		}
		int i=li,j=mi+1,k=li;
		while(i<=mi && j<=hi) {
			if(tempArr[i]<=tempArr[j]) {
				array[k]=tempArr[i];
				i++;
			}
			else {
				array[k]=tempArr[j];
				j++;
			}
			k++;
		}
		while(i<=mi) {
			array[k]=tempArr[i];
			k++;
			i++;
		}

	}

}
