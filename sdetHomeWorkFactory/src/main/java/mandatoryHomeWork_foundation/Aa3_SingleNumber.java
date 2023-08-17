package mandatoryHomeWork_foundation;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class Aa3_SingleNumber {


	/*
	https://leetcode.com/problems/single-number/description/
	Given a non-empty array of integers nums, every element appears twice except for one. 
	Find that single one.

	You must implement a solution with a linear runtime complexity and use only constant extra space.

	Example 1:

	Input: nums = [2,2,1]
	Output: 1
	Example 2:

	Input: nums = [4,1,2,1,2]
	Output: 4

	#pseudocode
	----------
	#initialize num,s
	#find the array length and stored in s variable
	#using for loop, initialize from 0, upto array length -1, and increment by 2, 
		because already sorted the value, and given condition only one odd number in the array
	#inside the loop, using if statement and 
		compare the non equal values of num[i] and nums[i+1] and return the num[i]	
	#else return the nums[array.length -1] value ex:4,2,1,2,1 sorting 1,1,2,2,4 or 3,1,1

	 */

	public int singleNumber(int[] num)
	{
		Arrays.sort(num);
		
		int s = num.length;

		for (int i = 0; i < s-1; i+=2) 
		{
			if (num[i]!=num[i+1]) 
			{
				return num[i];
			}
		}
		return num[s-1];
	}

	@Test
	public void singleNumberPositive()
	{
		int actual=singleNumber(new int[] {2,1,1});
		int expected =2;

		Assert.assertEquals(expected, actual);
	}
	@Test
	public void singleNumberPositive1()
	{
		int actual=singleNumber(new int[] {3,0,0});
		int expected =3;
		Assert.assertEquals(expected, actual);
	}

	public void singleNumberNegative()
	{
		int actual=singleNumber(new int[] {-2,-2,1});
		int expected =1;
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void singleNumberNegative1()
	{
		int actual=singleNumber(new int[] {-2,2,-1,2,-2});
		int expected =-1;
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void singleNumberNegative2()
	{
		int actual=singleNumber(new int[] {-2,2,0,2,-2});
		int expected =0;
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void singleNumberEdge()
	{
		int actual=singleNumber(new int[] {1});
		int expected =1;
		Assert.assertEquals(expected, actual);
	}
}
