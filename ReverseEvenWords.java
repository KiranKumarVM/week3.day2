package week3.day2;

import java.util.Arrays;

//Build a logic to reverse the even position words (output: I ma a erawtfos tester
		/* Pseudo Code:
		 
		 * Declare the input as Follow
	      		String test = "I am a software tester"; 
		a) split the words and have it in an array
		b) Traverse through each word (using loop)
		c) find the odd index within the loop (use mod operator)
		
		d)split the words and have it in an array
		
		e)print the even position words in reverse order using another loop (nested loop)
		f) Convert words to character array if the position is even else print the word as it is(concatenate space at the end).
		 
	*/
public class ReverseEvenWords {

	public static void main(String[] args) {
		String test = "I am a software tester";
		String outputString="";
		String[] spt = test.split(" ");
		System.out.println(Arrays.toString(spt));
		int splitArrayLength=spt.length;
		System.out.println("Array Length "+splitArrayLength);
		for(int i=0; i<splitArrayLength; i++) {
			if(i%2 !=0){
				char[] charArray=spt[i].toCharArray();
				String word="";
				for(int k=charArray.length-1;k>=0;k--) {
					word=word +charArray[k];
				}
				outputString = outputString+ " " + word;
			}
			else {
				outputString = outputString+" " + spt[i];
			}
		if(i<spt.length-1) {
			outputString = outputString + " ";
		}

	}
		System.out.println(outputString);
	}}
