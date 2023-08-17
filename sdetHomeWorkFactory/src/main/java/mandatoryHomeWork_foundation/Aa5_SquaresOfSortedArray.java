package mandatoryHomeWork_foundation;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class Aa5_SquaresOfSortedArray 
{

	/*
	https://leetcode.com/problems/squares-of-a-sorted-array/
	Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.

	Example 1:

	Input: nums = [-4,-1,0,3,10]
	Output: [0,1,9,16,100]
	Explanation: After squaring, the array becomes [16,1,0,9,100].
	After sorting, it becomes [0,1,9,16,100].

	#pseudocode
	----------
	#initialize nums, n
	#calculate the array length and stored in n variable
	#creating the new array using the given array length
	#initialize for loops condition is upto n(arrray length) value
	#INSIDE loop, multiplying the num value into the same index value and stored in result array
	#then outer loop sortng rhe array 
	#return integer result array

	 */

	public int[] squaresOfSortedArray(int[] nums)
	{
		int n=nums.length;
		
		int[] result=new int[n];
		
		for (int i = 0; i <n; i++) 
		{
			result[i]=nums[i]*nums[i];
		}
		
		Arrays.sort(result);
		return result;
	}

	@Test
	public void squaresOfSortedArrayPositive()
	{
		int[] actual=squaresOfSortedArray(new int[] {-4,-1,0,3,10});
		int[] expected ={0,1,9,16,100};
		Assert.assertArrayEquals(expected, actual);
	}
	@Test
	public void squaresOfSortedArrayPositive1()
	{
		int[] actual=squaresOfSortedArray(new int[] {-7,-3,2,3,11});
		int[] expected ={4,9,9,49,121};
		Assert.assertArrayEquals(expected, actual);
	}
	@Test
	public void squaresOfSortedArrayNegative()
	{
		int[] actual=squaresOfSortedArray(new int[] {-2,-3,-3,2,3,1});
		int[] expected ={1,4,4,9,9,9};
		Assert.assertArrayEquals(expected, actual);
	}
	@Test
	public void squaresOfSortedArrayNegative1()
	{
		int[] actual=squaresOfSortedArray(new int[] {-1,-1,0,0,-12});
		int[] expected ={0,0,1,1,144};
		Assert.assertArrayEquals(expected, actual);
	}
	@Test
	public void squaresOfSortedArrayEdge()
	{
		int[] actual=squaresOfSortedArray(new int[] {});
		int[] expected ={};
		Assert.assertArrayEquals(expected, actual);
	}
	
	
}
