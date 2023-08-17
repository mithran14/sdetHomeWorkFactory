package mandatoryHomeWork_foundation;

import org.junit.Assert;
import org.junit.Test;

public class Aa4_PowerOfThree {
	/*
	https://leetcode.com/problems/single-number/description/
	Given an integer n, return true if it is a power of three. Otherwise, return false.

An integer n is a power of three, if there exists an integer x such that n == 3x.

	Example 1:

	Input: n = 27
	Output: true
	Explanation: 2 POWER 7 = 33
	Example 2:

	Input: n = 0
	Output: false
	Explanation: There is no x where 3x = 0.

	#pseudocode
	----------
	#initialize n
	#using if statement, set the condition for value 0
	#initialize while loops condition is n is not equal to 1 entering into that
	#INSIDE loop, using if statement set the condition is n%3!=0 and return false
	#then set the n value divide by 3 and stored in n, and keep continuing the loop
	#n value is not equal to 1 then return true
	#return boolean

	 */

	public boolean powerOfThree(int n)
	{
		if (n==0) 
		{
			return false;
		}
		while (n!=1) 
		{
			if (n%3!=0) 
			{
				return false;
			}
			n=n/3;
		}
		return true;
	}

	@Test
	public void addDigitsPositive()
	{
		boolean actual=powerOfThree(81);
		boolean expected =true;
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void addDigitsPositive1()
	{
		boolean actual=powerOfThree(3);
		boolean expected =true;
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void addDigitsNegative()
	{
		boolean actual=powerOfThree(24);
		boolean expected =false;
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void addDigitsNegative1()
	{
		boolean actual=powerOfThree(-3);
		boolean expected =false;
		Assert.assertEquals(expected, actual);
	}

	public void addDigitsNegative2()
	{
		boolean actual=powerOfThree(33);
		boolean expected =false;
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void addDigitsEdge()
	{
		boolean actual=powerOfThree(0);
		boolean expected =false;
		Assert.assertEquals(expected, actual);
	}
	
}
