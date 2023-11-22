package mandatoryHoweWork_Nov3rdWeek;

import java.util.Arrays;
import org.junit.Test;

public class Sdet_CW_Nov19_LongestIncreasingSubsequence {

	/*
	#pseudocode
	----------

	#Initialize pointers: left = 0, right = 0
 		maxLen = 1, currentLen = 1
	#While right is less than the length of the array - 1:
    	If nums[right] < nums[right + 1]:
        	Increment currentLen
        	Move the right pointer forward
        	Update maxLen if currentLen is greater
   		Else:
        	Set left = right + 1
        	Move both pointers forward to the same position
        	Reset currentLen to 1
	#Return maxLen

	 */
	@Test
	public void LongestIncreasingSubsequencePositive()
	{
		int[] nums=new int[] {7, 4, 6, 12, 14, 14, 3}; //4
		LongestIncreasingSubsequence(nums);
	}
	@Test
	public void LongestIncreasingSubsequencePositive1()
	{
		int[] nums=new int[] {7, 5, 6, 7, 14, 15, 3}; //5
		LongestIncreasingSubsequence(nums);
	}

	public static void LongestIncreasingSubsequence (int[] nums) {

		int left = 0, right = 0;
		int maxLen = 1;
		int currentLen = 1;

		while(right<nums.length-1) {
			if (nums[right] < nums[right + 1]) {
				currentLen++;
				right++;
				maxLen = Math.max(maxLen, currentLen);
			} else {
				left = right + 1;
				right = right + 1;
				currentLen = 1;
			}
		}
		System.out.println(maxLen);
	}
}


