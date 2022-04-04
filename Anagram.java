package week3.day2;

import java.util.Arrays;

/*
	 * Pseudo Code
	  
	 *Declare a String 
		String text1 = "stops";
	 *Declare another String
		String text2 = "potss"; 
	 * a) Check length of the strings are same then (Use A Condition)
	 * b) Convert both Strings in to characters
	 * c) Sort Both the arrays
	 * d) Check both the arrays has same value
	 * 
	 */
public class Anagram {

	public static void main(String[] args) {
		String text1 = "stops";
		String text2 = "potss";
		
		int l1 = text1.length();
		int l2 = text2.length();
		if(l1 == l2)
			System.out.println("Equal length");
		else 
			System.out.println("Length not equal");
		
		char[] t1 = text1.toCharArray();
		char[] t2 = text2.toCharArray();
		
		Arrays.sort(t1);
		Arrays.sort(t2);
		System.out.println(t1);
		System.out.println(t2);
	
		for(int i=0; i<t1.length;i++) {
			if(t1[i]!=t2[i]) 
			{
				System.out.println("not Same Array");
				return;
	
			}
		
		}
		System.out.println("Same array");
	}}