package mandatoryHomeWork_foundation;

import org.junit.Assert;
import org.junit.Test;

public class Aa2_AddDigits 
{

	/*
	https://leetcode.com/problems/add-digits/description/ 
	Given an integer num, repeatedly add all its digits until the result has only one digit, and return it.

 

	Example 1:

	Input: num = 38
	Output: 2
	Explanation: The process is
	38 --> 3 + 8 --> 11
	11 --> 1 + 1 --> 2 
	Since 2 has only one digit, return it.
	Example 2:

	Input: num = 0
	Output: 0

	#pseudocode
	----------
	#initialize n,temp,a,b
	#stored the n vaiable into temp
	#using if statement, set the condition for value 0 to 9, return n
	#while loop set the condition for temp>9
	#reminder value stored in a
	#quotient value stored in b
	#add a and b and stored in temp
	#return int temp 

	 */

	public int addDigits(int n)
	{

		int temp=n;
		int a=0;
		int b=0;

		if (n==0 &&  n<=9) 
		{
			return n;	
		}
	
		while (temp>9) 
		{
			a=temp%10;
			b=temp/10;
			temp=a+b;

		}
		return temp;
	}

	@Test
	public void addDigitsPositive()
	{
		int actual=addDigits(29);
		int expected =2;
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void addDigitsPositive1()
	{
		int actual=addDigits(119);
		int expected =2;
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void addDigitsNegative()
	{
		int actual=addDigits(0);
		int expected =0;
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void addDigitsNegative1()
	{
		int actual=addDigits(8);
		int expected =8;
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void addDigitsEdge()
	{
		int actual=addDigits(0);
		int expected =0;
		Assert.assertEquals(expected, actual);
	}
	
	
}
