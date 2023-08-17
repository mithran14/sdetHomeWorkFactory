package mandatoryHomeWork_foundation;

import org.junit.Assert;
import org.junit.Test;

public class Aa9_Cimbing_stairs 
{

	/*
	 https://leetcode.com/problems/climbing-stairs/
	Climbing Stairs

	You are climbing a staircase. It takes n steps to reach the top.

	Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?

	Example 1:

	Input: n = 2
	Output: 2
	Explanation: There are two ways to climb to the top.
	1. 1 step + 1 step
	2. 2 steps
	
	Example 2:

	Input: n = 3
	Output: 3
	Explanation: There are three ways to climb to the top.
	1. 1 step + 1 step + 1 step
	2. 1 step + 2 steps
	3. 2 steps + 1 step
	
				   Steps 1, 2, 3, 5, 8, 13, 21, 34
	like Fibonacci 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, ...

	#pseudocode
	----------
	#initialize nums,a=0,b=1,temp,count,sum
	#using for loop set the condition count<num input
	#add the a and b value and stored in temp variable
	#swap the values b=a, temp=b, and stored the temp value in sum variable also,bcz return is sum integer
	#then increase the count 
	#loop continues till count <num input (ex; input 5 means 4<5 )
	#return the int sum value

	 */

	public int climbing_stairs(int num)
	{
		int a=0; int b=1;
		int temp=0;
		int count=0;
		int sum=0;
		while (count<num) 
		{
			temp=a+b;
			a=b;
			b=temp;
			sum=temp;
			count++;
		}
		return sum;
	}

	@Test
	public void climbing_stairsPositive()
	{
		int actual=climbing_stairs(1);
		int expected =1;
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void singleNumberPositive1()
	{
		int actual=climbing_stairs(2);
		int expected =2;
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void climbing_stairsPositive2()
	{
		int actual=climbing_stairs(33);
		int expected =5702887;
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void climbing_stairsNegative()
	{
		int actual=climbing_stairs(45);
		int expected =1836311903;
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void climbing_stairsNegative1()
	{
		int actual=climbing_stairs(19);
		int expected =6765;
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void climbing_stairsEdge()
	{
		int actual=climbing_stairs(0);
		int expected =0;
		Assert.assertEquals(expected, actual);
	}
	
}
