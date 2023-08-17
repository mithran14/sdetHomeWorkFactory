package mandatoryHomeWork_foundation;

import org.junit.Assert;
import org.junit.Test;

public class Aa1_IsPowerOfTwo 
{
	/*
	https://leetcode.com/problems/power-of-two/description/
	Given an integer n, return true if it is a power of two. Otherwise, return false.

	An integer n is a power of two, if there exists an integer x such that n == 2x.



	Example 1:

	Input: n = 1
	Output: true
	Explanation: 2 POWER 0 = 1

	Example 2:

	Input: n = 16
	Output: true
	Explanation: 2 POWER 4 = 16

	#pseudocode
	----------
	#initialize n
	#using if statement, set the condition for value 0
	#initialize while loops condition is n is not equal to 1 entering into that
	#INSIDE loop, using if statement set the condition is n%2!=0 and return false
	#then set the n value divide by 2 and stored in n, and keep continuing the loop
	#n value is not equal to 1 then return true
	#return boolean

	 */

	public boolean powerOfTwo(int n)
	{
		if (n == 0)
			return false;

		while (n != 1) 
		{
			if (n % 2 != 0) 
			{
				return false;
			}
			n = n / 2;
		}
		return true;
	}

	@Test
	public void powerOfTwoPositive()
	{
		boolean actual=powerOfTwo(1);
		boolean expected =true;
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void powerOfTwoPositive1()
	{
		boolean actual=powerOfTwo(4);
		boolean expected =true;
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void powerOfTwoPositive2()
	{
		boolean actual=powerOfTwo(64);
		boolean expected =true;
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void powerOfTwoNegative()
	{
		boolean actual=powerOfTwo(5);
		boolean expected =false;
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void powerOfTwoNegative1()
	{
		boolean actual=powerOfTwo(-8);
		boolean expected =false;
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void powerOfTwoNegative2()
	{
		boolean actual=powerOfTwo(10);
		boolean expected =false;
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void powerOfTwoEdge()
	{
		boolean actual=powerOfTwo(0);
		boolean expected =false;
		Assert.assertEquals(expected, actual);
	}
}
