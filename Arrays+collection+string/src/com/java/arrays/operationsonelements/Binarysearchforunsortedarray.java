package com.java.arrays.operationsonelements;

public class Binarysearchforunsortedarray {
	int[] array;
	int length;
	int[] temparr;

	public static void main(String[] args) {
		int[] inputarr= {2,3,1,5,0,4,17,11};
		System.out.println("the original array is: ");
		printarray(inputarr);
		System.out.println("the sorted array is: ");
		Binarysearchforunsortedarray bse=new Binarysearchforunsortedarray();
		bse.sort(inputarr);
		printarray(inputarr);
		//binary search logic
		int target =17;
		int li=0;
		int hi=inputarr.length-1;
		int mi=(li+hi)/2;
		while(li<=hi) {
			if(inputarr[mi]==target) {
				System.out.println("the element is present at " + mi +"th position");
			}
			else if (target>inputarr[mi]) {
				li=mi+1;
				
			}
			else {
				hi=mi-1;
			}
			mi=(li+hi)/2;
		}

	}
	public static void printarray(int[] ar) {
		for(int num:ar) {
			System.out.print(num + " ");
			
		}
		
		System.out.println();
	}
	
	public void sort(int[] ar) {
		length=ar.length;
		array=ar;
		temparr=new int[length];
		divideArr(0, length-1);
	}
	
	public void divideArr(int li,int hi) {
		if(li<=hi) {
			int mi=(li+hi)/2;
			divideArr(li, mi);
			divideArr(mi, hi);
			mergeArr(li, mi, hi);
		}
	}
	
	public void mergeArr(int li,int mi,int hi) {
		for(int i=li;i<=hi;i++) {
			temparr[i]=array[i];
		}
		int i=li,j=mi+1,k=li;
		while(i<=mi && j<=hi) {
			if(temparr[i]<=temparr[j]) {
				array[k]=temparr[i];
				i++;
			}
			else {
				array[k]=temparr[j];
				j++;
			}
			k++;
		}
		while(i<=mi) {
			array[k]=temparr[i];
			i++;
			k++;
		}
	}

}
