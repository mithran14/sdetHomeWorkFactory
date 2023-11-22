package mandatoryHoweWork_Nov4thWeek;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

import org.junit.Test;

public class Sdet_CW_Nov19_longestOnes {

	/*
	#pseudocode
	----------

	    // Create a HashMap to store the count of occurrences for each value
	  // Count occurrences of each value in the array
 	 // Check if the counts themselves are unique
 	

	 */

	@Test
	public void longestOnesPositive1()
	{
		int[] arr=new int[] {1,2,2,1,1,3};
		uniqueOccurrences(arr);
	}

	 public static void uniqueOccurrences(int[] arr) {
	    
	        Map<Integer, Integer> countMap = new HashMap<>();
	        Map<Integer, Boolean> seenCounts = new HashMap<>();
	      
	        for (int num : arr) {
	            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
	        }

	        for (int count : countMap.values()) {
	            if (seenCounts.containsKey(count)) {
	             
	                System.out.println(false);
	            } else {
	                seenCounts.put(count, true);
	            }
	        }
	        System.out.println(true);
	    
	    }
	
}


