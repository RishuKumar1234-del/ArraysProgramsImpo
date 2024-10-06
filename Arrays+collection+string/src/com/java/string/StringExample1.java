package com.java.string;

import java.util.Scanner;

public class StringExample1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
//		System.out.println("Enter any line");
//		String line = scan.nextLine();

//		// 1.capitalizing Each word
//		System.out.println(capitalizeEachWord(line) + " ");
//
//		// 2.count total number of words in a sentence
//		System.out.println("\ntotal number of words: " + countWordsOfLine(line));
//		System.out.println("\nall words in the given line is: ");
//
//		// 3.extracting all the words from a sentence
//		extractAllTheWords(line);
		
		//4.common letters between two strings
		
		
	//	System.out.println(findCommonLettersInTwoStrings("abcd", "bdeg"));
		
		//5. remove all white spaces
		System.out.println(removeAllWhiteSpaces());

	}

	// 1.
	public static String capitalizeEachWord(String s) {
		String[] st = s.toLowerCase().split("\\s");
		String res = " ";
		for (String w : st) {
			String first = w.substring(0, 1);
			String afterFirst = w.substring(1);
			res = res + first.toUpperCase() + afterFirst + " ";

		}

		return res + " ";

	}

	// 2.
	public static void extractAllTheWords(String sent) {

		String[] words = sent.split("\\s");
		for (String w : words) {
			System.out.print(w + " , ");
		}

	}

	// 3.
	public static int countWordsOfLine(String line) {

		String[] w = line.split("\\s");
		int totalwords = w.length;
		return totalwords;
	}

	// 4
	public static int findCommonLettersInTwoStrings(String str1, String str2){
		int ans = 0;

		for (int i = 0; i < str1.length(); i++) 
		{
	         for (int j = 0; j < str2.length(); j++) {
			int k = 0;
			while ((i + k) < str1.length() && (j + k) < str2.length() 
					&& str1.charAt(i + k) == str2.charAt(j + k)) 
			{
				k = k + 1;
			}

			ans = Math.max(ans, k);
		   }
		}
	      return ans;
	  }
	
	//5. remove all white spaces
	public static String removeAllWhiteSpaces() {
		
		String str="m y " +" name is "  +" "  + " rahul";
		str=str.trim();
		
		String removespaceInMiddle=str.replaceAll("\\s", " ");
		
		//return str;
		return removespaceInMiddle;
	}

}
