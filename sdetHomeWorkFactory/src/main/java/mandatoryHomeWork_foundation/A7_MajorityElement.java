package mandatoryHomeWork_foundation;


import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class A7_MajorityElement 
{

	/*
	https://leetcode.com/problems/majority-element/description/
	Given an array nums of size n, return the majority element.

	The majority element is the element that appears more than ⌊n / 2⌋ times. 
	You may assume that the majority element always exists in the array.

	Example 1:

	Input: nums = [3,2,3]
	Output: 3

	Example 2:

	Input: nums = [2,2,1,1,1,2,2]
	Output: 2

	#pseudocode
	----------
	#Initialize integer[] nums, count, k variables
	#the value of length divide by 2 will be stored in k.
	#initialize inner and outerloop for loops
	#outerloop for iteration,starts with 0 then increment the i value
	#innerloop for iteration,starts with i+1 then increment the j value
	#inside the inner loop compare the nums[i] and nums[j] is equal
	#if true then increment the count value
	#once done the increment outerloop check the count value is greater than the 
	(k value or mid of the index value)
	#if greater the the k value then the current nums[i] will be returned.
	#else return 0
	#return integer

	 */

	public int majorityElement(int[] nums)
	{
		Arrays.sort(nums);
		int count=0;
		int k=nums.length/2;
		for (int i = 0; i < nums.length; i++) 
		{
			for (int j = i+1; j < nums.length; j++) 
			{
				if (nums[i]==nums[j]) 
				{
					count++;
				}
			}
			if (count>k) 
			{

				return nums[i];
			}
		}

		return 0;
	}
	@Test
	public void majorityElementPositive()
	{
		int actual=majorityElement(new int[] {2, 3, 3, 3, 5});
		int expected = 3;
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void majorityElementPositive1()
	{
		int actual=majorityElement(new int[] {1, 2, 2, 2, 1});
		int expected =2;
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void majorityElementPositive2()
	{
		int actual=majorityElement(new int[] {2, 2, 1, 2, 1, 1, 2});
		int expected = 2;
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void majorityElementNegative()
	{
		int actual=majorityElement(new int[] {2, -3, -3, -4, -3});
		int expected = -3;
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void majorityElementNegative1()
	{
		int actual=majorityElement(new int[] {0, 3, 0});
		int expected = 0;
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void majorityElementEdge()
	{
		int actual=majorityElement(new int[] {});
		int expected = 0;
		Assert.assertEquals(expected, actual);
	}
}



