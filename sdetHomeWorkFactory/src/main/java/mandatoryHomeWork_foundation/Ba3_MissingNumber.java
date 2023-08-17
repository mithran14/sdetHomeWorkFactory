package mandatoryHomeWork_foundation;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class Ba3_MissingNumber

{

	/*
	 https://leetcode.com/problems/missing-number/description/
	 
	Missing Number

	Given an array nums containing n distinct numbers in the range [0, n], 
	return the only number in the range that is missing from the array.

Example 1:

	Input: nums = [3,0,1]
	Output: 2
	Explanation: n = 3 since there are 3 numbers, so all numbers are in the range [0,3]. 
	2 is the missing number in the range since it does not appear in nums.
Example 2:

	Input: nums = [0,1]
	Output: 2
	Explanation: n = 2 since there are 2 numbers, so all numbers are in the range [0,2]. 
	2 is the missing number in the range since it does not appear in nums.
Example 3:

	Input: nums = [9,6,4,2,3,5,7,0,1]
	Output: 8
	Explanation: n = 9 since there are 9 numbers, so all numbers are in the range [0,9]. 
	8 is the missing number in the range since it does not appear in nums.

	#pseudocode
	----------
	#initialize s
	#find the array length and stored in num variable
	#check the first element in the array is 0 or not, if not 0 return 0, bcz {1,2} means the range is {0,1,2}, bcz the n=2
	#create 2 for loops, using outer for loop initialize i value upto < s.length
	#using inner for loop starts from 0 and upto <s.length and incrementing j 
	#check the first element and stored in a and check the 2nd element nd stored in b, compare a and b values 
		using if statement, if not equal to then return the b value
	#end of the loop return length int value.

	 */

	public int missingNumber(int[] s)
	{
		int num=s.length;
		Arrays.sort(s);

		if (s[0]!=0) 
		{
			return 0;
		}
		for (int i = 0; i < s.length;) 
		{
			for (int j = 0; j < s.length; j++) 
			{
				int a=s[i+j];
				int b=s[i]+j;
				if (a!=b) 
				{	
					return b;
				}
			}
			return num;
		}
		return num;
	}

	@Test
	public void missingNumberPositive()
	{
		int actual=missingNumber(new int[] {0,1});
		int expected =2;
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void missingNumberPositive1()
	{
		int actual=missingNumber(new int[] {9,6,4,2,3,5,7,0,1});
		int expected =8;
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void missingNumberPositive3()
	{
		int actual=missingNumber(new int[] {3,0,1});
		int expected =2;
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void missingNumbernegative1()
	{
		int actual=missingNumber(new int[] {3,2,1});
		int expected =0;
		Assert.assertEquals(expected, actual);
	}
}

