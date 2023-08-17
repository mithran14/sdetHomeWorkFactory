package mandatoryHomeWork_foundation;

import org.junit.Assert;
import org.junit.Test;

public class A4_PrimeNumber {

	/*
	4. Check if the given number is prime or not 
	(Hint: A number is prime if it divisible only by 1 and itself)
	Example1: input = 5
			output = true
	Example2: input = 6
			output = false

	#pseudocode
	----------
	#initialie input
	#greater than 0 value enter the loop else return false using while loop
	#value less than 2 (1) is not a prime number using if, return false
	#using value is 2 is a prime number return true 
	#using elseif %==0 means is not a prime number return false
	#else return true
	#return value is boolean

	 */

	public boolean primeNum(int input) 
	{
		if (input <= 1) 
		{
			return false;
		}
		for (int i = 2; i <input; i++) 
		{   	
			if (input % i == 0) 
			{
				return false;
			}
		}
		return true;
	}

	@Test	
	public void primeNumPostive() 
	{
		boolean actual=primeNum(2);
		Assert.assertEquals(true, actual);
	}
	@Test	
	public void primeNumPostive1() 
	{
		boolean actual=primeNum(5);
		Assert.assertEquals(true, actual);
	}
	@Test
	public void primeNumNeagtive() 
	{
		boolean actual=primeNum(0);
		Assert.assertEquals(false, actual);
	}
	@Test
	public void primeNumNeagtive1() 
	{
		boolean actual=primeNum(9);
		Assert.assertEquals(false, actual);
	}
	@Test
	public void primeNumNeagtive2() 
	{
		boolean actual=primeNum(49);
		Assert.assertEquals(false, actual);
	}
	@Test
	public void primeNumEdge() 
	{
		boolean actual=primeNum(1);
		Assert.assertEquals(false, actual);
	}

	@Test
	public void primeNumEdge1() 
	{
		boolean actual=primeNum(7);
		Assert.assertEquals(true, actual);
	}

	@Test
	public void primeNumEdge2() 
	{
		boolean actual=primeNum(9);
		Assert.assertEquals(false, actual);
	}

	@Test
	public void primeNumEdge3() 
	{
		boolean actual=primeNum(6);
		Assert.assertEquals(false, actual);
	}

	@Test
	public void primeNumEdge4() 
	{
		boolean actual=primeNum(19);
		Assert.assertEquals(true, actual);
	}

}
