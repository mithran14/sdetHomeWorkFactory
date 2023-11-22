package mandatoryHoweWork_Nov4thWeek;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.junit.Test;

public class Sdet_CW_Nov22_arithmeticTriplets {

	/*
	#pseudocode
	----------
	
	//creating empty Se<Integer> list
	//using for each loop 
	//using if check the list contains a-diff and a-diff *2,yes then increment the count
	//else add the element to the list
	//return count;
	
	
	 // initialize hashmap and count =0;
	  // add the nums value into hashset
	  // using for loop check each value diff value is i the hashset if yes increment the count by 1
	  // return the count



	 */

	@Test
	public void longestOnesPositive1()
	{
		int[] nums=new int[] {0,1,4,6,7,10};
		int diff=3;
		arithmeticTriplet(nums,diff);
		arithmeticTriplets(nums,diff);
	}
	
	
	public void arithmeticTriplet(int[] nums, int diff){
		int count=0;
		Set<Integer> list = new HashSet<>();
		for(int a : nums){
			if(list.contains(a-diff) && list.contains(a-diff*2)) count++;
			list.add(a);
		}
		System.out.println(count);
		 
	}

	public void arithmeticTriplets(int[] nums, int diff) {
		int count=0;
		Map<Integer,Integer> map=new HashMap<>();
		
		for (int num : nums) {
			int prev=num-diff;
			int secondPrev=num-(2*diff);
			
			 count+=map.getOrDefault(prev, 0)* map.getOrDefault(secondPrev, 0);
			
			map.put(num, map.getOrDefault((num), 0)+1);
			
		}
		System.out.println(count);

	}

}


