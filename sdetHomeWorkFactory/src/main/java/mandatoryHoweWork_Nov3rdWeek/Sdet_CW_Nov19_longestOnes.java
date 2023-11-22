package mandatoryHoweWork_Nov3rdWeek;

import org.junit.Test;

public class Sdet_CW_Nov19_longestOnes {

	/*
	#pseudocode
	----------

	// Two pointers: left and right
	// Maximum length of consecutive ones
 	// Count of zeros within the window
 	// Increment zeroCount when encountering a zero
 	//if zeroCount exceeds k
  	// Decrement zeroCount when moving the left pointer
  	// Update the maximum length

	 */
	@Test
	public void longestOnesPositive()
	{
		int[] nums=new int[] {1,1,1,0,0,0,1,1,1,1,0}; 
		int k=2;
		longestOnes(nums,k);
	}
	@Test
	public void longestOnesPositive1()
	{
		int[] nums=new int[] {0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1}; 
		int k=3;
		longestOnes(nums,k);
	}

	public static void longestOnes (int[] nums,int k) {

		int left = 0, right = 0; 
		int maxLen = 0; 
		int zeroCount = 0; 

		while (right < nums.length) {
			if (nums[right] == 0) {
				zeroCount++; 
			}

			while (zeroCount > k) {
				if (nums[left] == 0) {
					zeroCount--; 
				}
				left++; 
			}

			maxLen = Math.max(maxLen, right - left + 1);
			right++;
		}
		System.out.println(maxLen);
	}
	
}


