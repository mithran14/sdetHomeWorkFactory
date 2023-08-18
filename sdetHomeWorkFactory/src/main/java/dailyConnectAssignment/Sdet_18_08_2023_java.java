package dailyConnectAssignment;

import org.junit.Assert;
import org.junit.Test;

public class Sdet_18_08_2023_java {

	/*
	Given a positive integer num, return the number of positive integers less than or equal to num whose digit sums are even.

The digit sum of a positive integer is the sum of all its digits.

Example 1:

	Input: num = 4
	Output: 2
	Explanation:
	The only integers less than or equal to 4 whose digit sums are even are 2 and 4.    
Example 2:

	Input: num = 30
	Output: 14
	Explanation:
	The 14 integers less than or equal to 30 whose digit sums are even are
	2, 4, 6, 8, 11, 13, 15, 17, 19, 20, 22, 24, 26, and 28.

	#pseudocode
	-----------
	#The variable count,sum is initialized to 0
	#using 2 for loop, outer for loop starts from 1 equal to number, 
		inner for loop starts from j=0 upto length of the String vale of i 
		get the each element and sum it stored in sum.
	#inside the outer for loop check the sum is even or odd. if even then increment the count
	#each time entering the outer for loop reset the sum value=0
	#return count is int
	 */

	public int positiveIntegerNum(int number) 
	{
		int count = 0;
		int sum=0;
		for (int i = 1; i <=number; i++) 
		{
			sum=0;
			for (int j = 0; j<String.valueOf(i).length(); j++) 
			{
			sum+=Character.getNumericValue(String.valueOf(i).charAt(j));
			}
			if (sum%2==0) 
			{
				count++;
			}
		}
		return count;
	}

	@Test	
	public void positiveIntegerNumPostive() 
	{
		int actual=positiveIntegerNum(14);
		Assert.assertEquals(6, actual);
	}
	@Test	
	public void positiveIntegerNumPostive1() 
	{
		int actual=positiveIntegerNum(10);
		Assert.assertEquals(4, actual);
	}
	@Test
	public void positiveIntegerNumPostive2() 
	{
		int actual=positiveIntegerNum(30);
		Assert.assertEquals(14, actual);
	}
}
