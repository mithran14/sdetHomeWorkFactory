package mandatoryHoweWork_Nov4thWeek;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

import org.junit.Test;

public class Sdet_CW_Nov20_maxSubArray {

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
		int[] arr=new int[] {-2,1,-3,4,-1,2,1,-5,4};
		maxSubArray(arr);
	}

	public void maxSubArray(int[] nums) {
		int currentSum = nums[0];
		int maxSum = nums[0];

		for (int i = 1; i < nums.length; i++) {

			currentSum = Math.max(nums[i], currentSum + nums[i]);

			maxSum = Math.max(maxSum, currentSum);
		}

		System.out.println(maxSum);
	}

}


