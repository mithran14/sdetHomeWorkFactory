package mandatoryHoweWork_Nov3rdWeek;

import java.util.Arrays;
import org.junit.Test;

public class Sdet_CW_Nov19_square {

	/*
	#pseudocode
	----------
	#initialize for loops condition is upto nums.length value
	#INSIDE loop, multiplying the num value into the same index value and stored in nums array
	#then outer loop sorting the array 
	#return integer nums array
	
	#Initialize pointers left and right.
	#create a result array with same length 
	#Calculate the absolute values of elements at positions left and right.
	#Compare the absolute values and square the larger absolute value, multiply and updating the result array.
	#if left bigger then Move the left or move right.

	 */
	@Test
	public void squaresOfSortedArrayPositive()
	{
		int[] nums=new int[] {-4,-1,0,3,10};
		// o/p ={0,1,9,16,100};
		//squaresOfSortedArray(nums);
		sortedSquares(nums);
	}

	public int[] squaresOfSortedArray(int[] nums)
	{
		for (int i = 0; i <nums.length; i++) 
		{
			nums[i]=nums[i]*nums[i];
		}
		Arrays.sort(nums);
		System.out.println(Arrays.toString(nums));
		return nums;
	}
	
	 public void sortedSquares(int[] nums) {
	        int n = nums.length;
	        int[] result = new int[n];
	        int left = 0, right = n - 1;

	        for (int i = n - 1; i >= 0; i--) {
	            int lSquare = Math.abs(nums[left]);
	            int rSquare = Math.abs(nums[right]);

	            if (lSquare > rSquare) {
	                result[i] = lSquare * lSquare;
	                left++;
	            } else {
	                result[i] = rSquare * rSquare;
	                right--;
	            }
	        }
	    	System.out.println(Arrays.toString(result));
	       
	    }
}


