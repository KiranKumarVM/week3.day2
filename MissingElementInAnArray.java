package week3.day2;
//Here is the input
		//int[] arr = {1,2,3,4,7,6,8};

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

// Sort the array	
		
//int[] arr = {1,2,3,4,7,6,8};

		// loop through the array (start i from arr[0] till the length of the array)

			// check if the iterator variable is not equal to the array values respectively
			
				// print the number
				
				// once printed break the iteration
				
				
		
public class MissingElementInAnArray {

	public static void main(String[] args) {
		Set<Integer> set= new LinkedHashSet<Integer>();
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		set.add(7);
		set.add(6);
		set.add(8);
		System.out.println(set);
		List<Integer>list=new ArrayList<Integer>();
		list.addAll(set);
		Collections.sort(list);
		for(int i=1; i<=list.size(); i++) {
			if(list.get(i-1) == i) 
				continue;
				else
				System.out.println(i);
			    break;
				
			}
		}
		
}
