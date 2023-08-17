package mandatoryHomeWork_foundation;

import org.junit.Assert;
import org.junit.Test;

public class A9_TwoSum {

	/*
	https://leetcode.com/problems/two-sum/description/
	Given an array of integers nums and an integer target, 
	return indices of the two numbers such that they add up to target.

	You may assume that each input would have exactly one solution, 
	and you may not use the same element twice.
	You can return the answer in any order.
	Example 1:

	Input: nums = [2,7,11,15], target = 9
	Output: [0,1]
	Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
	
	Example 2:

	Input: nums = [3,2,4], target = 6
	Output: [1,2]
	Example 3:

	Input: nums = [3,3], target = 6
	Output: [0,1]

	#pseudocode
	----------
	
for loop i and j=i+1 initialize
add the two for loops and compare with target(==)
reurn the values num[i] and num[j]
	
	#initialize nums [], target 
	#initialize inner and outerloop for loops
	#outerloop for iteration,starts with 0 then increment the i value
	#innerloop for iteration,starts with i+1 then increment the j value
	#INSIDE THE innerloop compare the sum of [i] + [j] with target(==) value
	#return the [i][j] values
	#return integer[]

	 */

	public int[] twoSum(int[] nums, int target)
	{
		for (int i = 0; i < nums.length; i++) 
		{
			for (int j = i+1; j < nums.length; j++) 
			{
				if (nums[i]+nums[j]==target) 
				{
					return new int[] {i,j};
				}
			}
		}
		return new int[] {-1,-1};
	}

	@Test
	public void twoSumPositive()
	{
		int[] actual=twoSum(new int[] {2,7,11,15},9);
		int[] expected ={0,1};
		Assert.assertArrayEquals(expected, actual);
	}
	@Test
	public void twoSumPositive1()
	{
		int[] actual=twoSum(new int[] {3,2,4},6);
		int[] expected = {1,2};
		Assert.assertArrayEquals(expected, actual);
	}
	@Test
	public void twoSumNegative()
	{
		int[] actual=twoSum(new int[] {3,-3},0);
		int[] expected = {0,1};
		Assert.assertArrayEquals(expected, actual);
	}
	@Test
	public void twoSumNegative1()
	{
		int[] actual=twoSum(new int[] {1,-2,-2,4},-4);
		int[] expected = {1,2};
		Assert.assertArrayEquals(expected, actual);
	}
	@Test
	public void twoSumEdge()
	{
		int[] actual=twoSum(new int[] {1,1,1,1},2);
		int[] expected = {0,1};
		Assert.assertArrayEquals(expected, actual);
	}

}
