package week3.day2;

import java.util.ArrayList;
import java.util.List;

/* a) Declare An array for {3,2,11,4,6,7};	 
* b) Declare another array for {1,2,8,4,9,7};
* c) Declare for loop iterator from 0 to array length
* d) Declare a nested for another array from 0 to array length
* e) Compare Both the arrays using a condition statement

*  f) Print the first array (shoud match item in both arrays)
*/
public class FindIntersection {

	public static void main(String[] args) {
		List<Integer>arr1=new ArrayList<Integer>();
        arr1.add(3);
        arr1.add(2);
        arr1.add(11);
        arr1.add(4);
        arr1.add(6);
        arr1.add(7);
        
        List<Integer>arr2= new ArrayList<Integer>();
        arr2.add(1);
        arr2.add(2);
        arr2.add(8);
        arr2.add(4);
        arr2.add(9);
        arr2.add(7);
        
        for(int i=0; i<arr1.size();i++) {
        	for(int j=0; j<arr2.size(); j++) {
        	if(arr1.get(i)==arr2.get(j)) {
        		System.out.println("Same value is"+arr1.get(i));
        	}
        }
	}

	}}
