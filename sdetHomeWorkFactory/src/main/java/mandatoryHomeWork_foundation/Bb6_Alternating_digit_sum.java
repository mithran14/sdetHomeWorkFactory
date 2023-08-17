package mandatoryHomeWork_foundation;

import org.junit.Assert;
import org.junit.Test;

public class Bb6_Alternating_digit_sum
{
	/*
	 https://leetcode.com/problems/alternating-digit-sum/submissions/

	Alternating Digit Sum

You are given a positive integer n. Each digit of n has a sign according to the following rules:

The most significant digit is assigned a positive sign.
Each other digit has an opposite sign to its adjacent digits.
Return the sum of all digits with their corresponding sign.

Example 1:

	Input: n = 521
	Output: 4
	Explanation: (+5) + (-2) + (+1) = 4.
Example 2:

	Input: n = 111
	Output: 1
	Explanation: (+1) + (-1) + (+1) = 1.
Example 3:

	Input: n = 886996
	Output: 0
	Explanation: (+8) + (-8) + (+6) + (-9) + (+9) + (-6) = 0.

	#pseudocode
	----------
	#given int n
	#int into String and stored in s
	#String into charArray and stored in charArray
	#using for loops, starts from 0 and upto <charArray.length and incrementing i 
	#using if statement, i value is even number that charArray value into integer and multiply by 1
		and stored in value.
	#else condition i value is odd number that charArray value into integer and multiply by -1
		and stored in value.
	#end of the loop return int value.

	 */

	public int alternating_digit_sum(int n)
	{

		String s= String.valueOf(n);
		char[] charArray = s.toCharArray();
		int value=0;
		
		
		for (int i = 0; i < charArray.length; i++) 
		{
			if (i%2==0) 
			{
				value=value+((Character.getNumericValue(charArray[i]))*1);
			}
			else 
			{
				value=value+((Character.getNumericValue(charArray[i]))*-1);
			}
		}
				return value;
	}
	@Test
	public void alternating_digit_sumPositive()
	{
		int actual=alternating_digit_sum(521);
		int expected = 4;
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void alternating_digit_sumPositive1()
	{
		int actual=alternating_digit_sum(111);
		int expected = 1;
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void alternating_digit_sumPositive2()
	{
		int actual=alternating_digit_sum(886996);
		int expected = 0;
		Assert.assertEquals(expected, actual);
	}


}

