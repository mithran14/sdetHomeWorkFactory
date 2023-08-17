package mandatoryHomeWork_foundation;

import org.junit.Assert;
import org.junit.Test;

public class A6_RemoveEleArray 
{
	/*
	Remove the target element in the array

	example 1: input = [2, 3, 3, 4, 5], target=3
			   output = [2, 4, 5]
			   explanation: when 3 is removed from input array, 
							output is [2, 4, 5]


	#pseudocode
	----------
	#Initialize integer[] input, target, count=0, index=0 variables
	#using for loop for iteration, compare the input[i] and target is not equal, then increment the count value
	#initialize the new integer array using count.
	#again using for loop for iteration, compare the input[i] and target is not equal, then stored to the new array
	#increment the index variable
	#return value is integer[]

	 */

	public int[] removeTargetElement(int[] input, int target)
	{
		int count=0;
		for (int num : input) 
		{
			if (num != target) 
			{
				count++;
			}
		}

		int[] output = new int[count];
		int index = 0;

		for (int num : input) 
		{
			if (num != target) 
			{
				output[index] = num;
				index++;
			}
		}
		return output;
	}


	@Test
	public void removeTargetElementPositive()
	{
		int[] actual=removeTargetElement(new int[] {2, 3, 3, 4, 5}, 3);
		int[] expected = {2, 4, 5};
		Assert.assertArrayEquals(expected, actual);
	}
	@Test
	public void removeTargetElementPositive1()
	{
		int[] actual=removeTargetElement(new int[] {2, 1, 2, -2, 5}, 2);
		int[] expected = {1, -2, 5};
		Assert.assertArrayEquals(expected, actual);
	}
	@Test
	public void removeTargetElementPositive2()
	{
		int[] actual=removeTargetElement(new int[] {5, 5, 1, -5, 5}, 5);
		int[] expected = {1,-5};
		Assert.assertArrayEquals(expected, actual);
	}
	@Test
	public void removeTargetElementNegative()
	{
		int[] actual=removeTargetElement(new int[] {2, 13, 3, -3, 4}, 3);
		int[] expected = {2,13,-3,4};
		Assert.assertArrayEquals(expected, actual);
	}
	@Test
	public void removeTargetElementNegative1()
	{
		int[] actual=removeTargetElement(new int[] {2, -3, -3, 4, 4}, -3);
		int[] expected = {2,4,4};
		Assert.assertArrayEquals(expected, actual);
	}
	@Test
	public void removeTargetElementEdge()
	{
		int[] actual=removeTargetElement(new int[] {}, 0);
		int[] expected = {};
		Assert.assertArrayEquals(expected, actual);
	}

}
