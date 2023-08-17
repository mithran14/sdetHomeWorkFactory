package mandatoryHomeWork_foundation;

import org.junit.Assert;
import org.junit.Test;

public class Aa7_IntegerArrayHowMany 
{
	
	/*
	4. Given an integer array arr, count how many elements x there are, 
   such that x + 1 is also in arr. 
   If there are duplicates in arr, count them separately.
   
   example 1: input = [1, 2, 3]
			  output = 2
			explanation: when x is 1, we see x+1 (2) is present in input
						 when x is 2, we see x+1 (3) is present in input
						 when x is 3, we see x+1 (4) is not present in input
						so no of presence of x+1 is 2
   example 2: input = [1, 1, 3, 3, 5, 5, 7, 7]
			  output = 0
			  explanation: no occurence of x+1 for x
			  
   example 3: input = [1, 1, 2]
			  output = 2
			  explanation: when x is 1, we see x+1 (2) is present in input
						   when x is 1, we see x+1 (2) is present in input
						   when x is 2, we see x+1 (3) is not present in input

	#pseudocode
	----------
	#initialize nums,count
	#calculate the array length and stored in n variable
	#Iterate through every elements 
	#outer loop starts from i=0 to i < length.Array and  inner loop Inner loop starts from j=0 j<length. array
	#increment value to [i],[j]+1 , then compare with other values
	#Increment count
	#return the int  

	 */

	public int powerOfThree(int[] nums)
	{
		int n=nums.length;
		int count=0;
	
	
		for (int i = 0; i <n; i++) 
		{
			for (int j = 0; j <n; j++) 
			{
				if (nums[i]==nums[j]+1) 
				{
					count++;
				}
			}
		}
	
		return count;
	}

	@Test
	public void addDigitsPositive()
	{
		int actual=powerOfThree(new int[] {1, 2, 3});
		int expected =2;
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void addDigitsPositive1()
	{
		int actual=powerOfThree(new int[] {1, 2, 2, 3, 0 });
		int expected =5;
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void addDigitsNegative()
	{
		int actual=powerOfThree(new int[] {1, -1, 0, -2});
		int expected =3;
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void addDigitsNegative1()
	{
		int actual=powerOfThree(new int[] {1, 1, 3, 3, 5, 5, 7, 7});
		int expected =0;
		Assert.assertEquals(expected, actual);
	}
	
	public void addDigitsEdge()
	{
		int actual=powerOfThree(new int[] {0});
		int expected =0;
		Assert.assertEquals(expected, actual);
	}
	
}
