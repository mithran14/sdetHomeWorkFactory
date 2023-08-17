package mandatoryHomeWork_foundation;

import org.junit.Assert;
import org.junit.Test;

public class A5_Palindrome {
	
	/*
	Given an integer x, return true if x is a palindrome, and false otherwise.
	Input: x = 121
	Output: true
	Explanation: 121 reads as 121 from left to right and from right to left.

	#pseudocode
	----------
	#initialie int x, sum, rem, temp variables
	#x value will be stored in temp for the future comparison
	#using while loop x is greater than 1 for entering the loop condition
	#rem=x%10; sum=sum*10+rem; x=x/10; upto reminder 0 the conditions will apply
	#compare the temp and sum variables, return true
	#else return false
	#return value is boolean

	 */

	public boolean palindromeProgram(int x)
	{
		int temp=x;
		int rem=0;
		int sum=0;
		
		if (x==0) 
		{
			return false;
		}
		while (x>0) 
		{
			rem=x%10;//1
			sum=sum*10+rem;//101
			x=x/10;//1
		}
		return temp==sum;
	}

	@Test
	public void palindromePositive()
	{
		boolean actual=palindromeProgram(101);
		Assert.assertEquals(true, actual);
	}
	@Test
	public void palindromePositive1()
	{
		boolean actual=palindromeProgram(99);
		Assert.assertEquals(true, actual);
	}
	@Test
	public void palindromePositive2()
	{
		boolean actual=palindromeProgram(1);
		Assert.assertEquals(true, actual);
	}
	@Test
	public void palindromeNegative()
	{
		boolean actual=palindromeProgram(100);
		Assert.assertEquals(false, actual);
	}
	@Test
	public void palindromeNegative1()
	{
		boolean actual=palindromeProgram(-111);
		Assert.assertEquals(false, actual);
	}

	@Test
	public void palindromeEdge()
	{
		boolean actual=palindromeProgram(0);
		Assert.assertEquals(false, actual);
	}
}
