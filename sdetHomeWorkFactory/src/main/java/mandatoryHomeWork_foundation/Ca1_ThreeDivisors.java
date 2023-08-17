package mandatoryHomeWork_foundation;

import org.junit.Assert;
import org.junit.Test;

public class Ca1_ThreeDivisors {

	/*
	 https://leetcode.com/problems/three-divisors/description/

	Three Divisors

Given an integer n, return true if n has exactly three positive divisors. Otherwise, return false.

An integer m is a divisor of n if there exists an integer k such that n = k * m.

Example 1:

	Input: n = 2
	Output: false
	Explantion: 2 has only two divisors: 1 and 2.
Example 2:

	Input: n = 4
	Output: true
	Explantion: 4 has three divisors: 1, 2, and 4.

	#pseudocode
	----------
	#Initialize the count as 0
	#Start a loop 
		starting from 1, ending to n value 
	#inside the loop check the number divide by i value ==0 or not. if yes the increment the count
	#outside the loop check the count value exact 3 or not
	#if 3 then return true
	 */

	public boolean threeDivisorsNumber(int n) {
		int count=0;
		for (int i = 1; i <=n; i++) {
			if(n%i==0){
				count++;
			}}
		return (count==3);
	}
	@Test
	public void threeDivisorsNumberPositive()
	{
		boolean actual=threeDivisorsNumber(9);
		boolean expected = true;
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void threeDivisorsNumberPositive1()
	{
		boolean actual=threeDivisorsNumber(4);
		boolean expected = true;
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void threeDivisorsNumberPositive2()
	{
		boolean actual=threeDivisorsNumber(25);
		boolean expected = true;
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void threeDivisorsNumberPositive3()
	{
		boolean actual=threeDivisorsNumber(49);
		boolean expected = true;
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void threeDivisorsNumbernegative()
	{
		boolean actual=threeDivisorsNumber(2);
		boolean expected = false;
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void threeDivisorsNumbernegative1()
	{
		boolean actual=threeDivisorsNumber(12);
		boolean expected = false;
		Assert.assertEquals(expected, actual);
	}
}


