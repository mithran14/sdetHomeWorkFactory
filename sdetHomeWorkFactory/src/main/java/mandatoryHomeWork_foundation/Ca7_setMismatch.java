package mandatoryHomeWork_foundation;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class Ca7_setMismatch {

	/*
	 https://leetcode.com/problems/set-mismatch/description/

	Set Mismatch

You have a set of integers s, which originally contains all the numbers from 1 to n. Unfortunately, due to some error, one of the numbers in s got duplicated to another number in the set, which results in repetition of one number and loss of another number.

You are given an integer array nums representing the data status of this set after the error.

Find the number that occurs twice and the number that is missing and return them in the form of an array.



Example 1:

Input: nums = [1,2,2,4]
Output: [2,3]
Example 2:

Input: nums = [1,1]
Output: [1,2]

	#pseudocode
	----------
	#Output: boolean


	#Input: int[]
	#Outpur: int[]
	#Sorting the array
	#initialize dup, miss=0
	#Find the duplicate values and stored in dup
	#find the missing value stored in miss
	#return the dup and miss as array
	 */

	public int[] findErrorNums(int[] nums) 
	{
		Arrays.sort(nums);
		int dup=0;
		int miss= nums.length;
		for (int i = 0; i < nums.length; i++) 
		{
			if (nums[i]==nums[i+1]) 
			{
				dup=nums[i];
				break;
			}
		}
		for (int i = nums.length-1; i >=0; i--) 
		{
			if (nums[i]== miss) {
				miss--;
			}
		}
		return new int[]{dup,miss};
	}

	@Test
	public void findErrorNumsPositive()
	{
		int[] actual=findErrorNums(new int[] {1,2,2,4});
		int[] expected = new int[] {2,3};
		Assert.assertArrayEquals(expected, actual);
	}
	@Test
	public void findErrorNumsPositive1()
	{
		int[] actual=findErrorNums(new int[] {3,2,3,4});
		int[] expected = new int[] {3,1};
		Assert.assertArrayEquals(expected, actual);
	}
	@Test
	public void findErrorNumsPositive2()
	{
		int[] actual=findErrorNums(new int[] {2,2,3,4});
		int[] expected = new int[] {2,1};
		Assert.assertArrayEquals(expected, actual);
	}

}
