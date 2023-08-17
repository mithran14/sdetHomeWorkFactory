package mandatoryHomeWork_foundation;

import org.junit.Assert;
import org.junit.Test;

public class Aa6_MoveZeroes 
{

	/*
	https://leetcode.com/problems/move-zeroes/description/
	Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

	Note that you must do this in-place without making a copy of the array.

	Example 1:

	Input: nums = [0,1,0,3,12]
	Output: [1,3,12,0,0]
	Example 2:

	Input: nums = [0]
	Output: [0]

	#pseudocode
	----------
	#initialize nums, value,count, index, outputIndex
	#calculate the array length and stored in n variable
	#sorting the given array
	#creating the 2 new array, one array is will be non zero array and another one will create using the given array length  
	#using the given array, wil count the non zero values, and create new array using the count
	#using for each iteration will add the values into another final array
		(given length so remaining indexes filled with zero automatically)
	#return the final int array 


	 */

	public int[] powerOfThree(int[] nums,int value)
	{
		//Arrays.sort(nums);
		
		int[] output=new int[nums.length];  //5
		int outputIndex=0;
	
		for (int i = 0; i <nums.length; i++) 
		{
			if (nums[i]!=value) // 1,3,12
			{
				output[outputIndex]=nums[i]; //output[0] output[1] output[2], output[3], output[4]
				outputIndex++;				 //   1		,  	3	,	12,			0		,	0
			}
		}
		return output;
	}

	@Test
	public void addDigitsPositive()
	{
		int[] actual=powerOfThree(new int[] {0,0,1,3,12},0);
		int[] expected ={1,3,12,0,0};
		Assert.assertArrayEquals(expected, actual);
	}
	@Test
	public void addDigitsPositive1()
	{
		int[] actual=powerOfThree(new int[] {0,8,1,2,12},0);
		int[] expected ={8,1,2,12,0};
		Assert.assertArrayEquals(expected, actual);
	}
	@Test
	public void addDigitsNegative()
	{
		int[] actual=powerOfThree(new int[] {-8,-7,0,-1,2,1},0);
		int[] expected ={-8,-7,-1,2,1,0};
		Assert.assertArrayEquals(expected, actual);
	}
	@Test
	public void addDigitsNegative1()
	{
		int[] actual=powerOfThree(new int[] {-1,-1,0,-3,-12},0);
		int[] expected ={-1,-1,-3,-12,0};
		Assert.assertArrayEquals(expected, actual);
	}
	@Test
	public void addDigitsEdge()
	{
		int[] actual=powerOfThree(new int[] {0},0);
		int[] expected ={0};
		Assert.assertArrayEquals(expected, actual);
	}
	
	
}
