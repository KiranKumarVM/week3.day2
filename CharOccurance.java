package week3.day2;
//Check number of occurrences of a char (eg 'e') in a String

			// declare and initialize a variable count to store the number of occurrences
			
			// convert the string into char array
				
			//get the length of the array
				
			// traverse from 0 till the array length 
				
				// Check the char array has the particular char in it 
			
				// if is has increment the count
					 
				
				// print the count out of the loop
public class CharOccurance {

	public static void main(String[] args) {
		String str = "welcome to chennai";
		int count=0;
		char ch= 'e';
		char[] cs = str.toCharArray();
		int len = cs.length;
		for(int i=0; i<len;i++) {
			if(cs[i] == ch)	{
				count++;
			}			
		}
       System.out.println(ch+ " is Presented in "+count+ " number of times");
	}

}
