package mandatoryHomeWork_foundation;

import org.junit.Assert;
import org.junit.Test;

public class Ba5_FindPivotIndex
{
	/*
	 https://leetcode.com/problems/find-pivot-index/description/

Find Pivot Index

Given an array of integers nums, calculate the pivot index of this array.

The pivot index is the index where the sum of all the numbers strictly to the left of the index is equal to the 
sum of all the numbers strictly to the index's right.

If the index is on the left edge of the array, 
then the left sum is 0 because there are no elements to the left. This also applies to the right edge of the array.

Return the leftmost pivot index. If no such index exists, return -1.

Example 1:

	Input: nums = [1,7,3,6,5,6]
	Output: 3
	Explanation:
	The pivot index is 3.
	Left sum = nums[0] + nums[1] + nums[2] = 1 + 7 + 3 = 11
	Right sum = nums[4] + nums[5] = 5 + 6 = 11
Example 2:

	Input: nums = [1,2,3]
	Output: -1
	Explanation:
	There is no index that satisfies the conditions in the problem statement.
Example 3:

	Input: nums = [2,1,-1]
	Output: 0
	Explanation:
	The pivot index is 0.
	Left sum = 0 (no elements to the left of index 0)
	Right sum = nums[1] + nums[2] = 1 + -1 = 0

	#pseudocode
	----------
	#initialize num,sum,sum1
	#using 3 for loops
	#outer for loop for picking the index
	#creating 2 inner for lops, one is for left mostt index, another is for right most index
	#check both the sum and sum1 is equal or not using if statement
	#return the i value if equal
	#else return -1 value

	 */

	public int findPivotIndex(int[] num)
	{
		for (int i = 0; i < num.length; i++) 
		{
			int sum=0;
			int sum1=0;

			for (int j = i+1; j < num.length; j++) 
			{
				sum=sum+num[j];
			}


			for (int j = i-1; j >=0; j--) 
			{
				sum1=sum1+num[j];
			}

			if (sum==sum1) 
			{
				return i;
			}
		}

		return -1;
	}
	@Test
	public void findPivotIndexPositive()
	{
		int actual=findPivotIndex(new int[] {1,7,3,6,5,6});
		int expected =3;
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void findPivotIndexPositive1()
	{
		int actual=findPivotIndex(new int[] {1,2,3});
		int expected =-1;
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void findPivotIndexPositive2()
	{
		int actual=findPivotIndex(new int[] {2,1,-1});
		int expected =0;
		Assert.assertEquals(expected, actual);
	}
}


