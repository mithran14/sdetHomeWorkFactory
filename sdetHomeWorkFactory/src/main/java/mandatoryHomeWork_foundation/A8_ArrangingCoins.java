package mandatoryHomeWork_foundation;

import org.junit.Assert;
import org.junit.Test;

public class A8_ArrangingCoins {

	/*
	https://leetcode.com/problems/arranging-coins/description/

	You have n coins and you want to build a staircase with these coins. 
	The staircase consists of k rows where the i th row has exactly i coins. 
	The last row of the staircase may be incomplete.

	Given the integer n, return the number of complete rows of the staircase you will build.

	Example 1:

	Input: n = 5
	Output: 2
	Explanation: Because the 3rd row is incomplete, we return 2.

	#pseudocode
	----------
	#Initialize integer coins, count, variables
	# loop for iteration,starts with 1 then coditions less than and equal to n then increment the i value
	#every iteration count will increase and coins would subtract with the count
	#return int count value
	#return integer

	 */

	public int arrangingCoins(int coins)
	{
		int count=0;
		while (count<coins) 
		{
			count++;
			coins=coins-count;
		}
		System.out.println(count);
		return count;
	}

	@Test
	public void ArrangingCoinsPositive()
	{
		int actual=arrangingCoins(5);
		int expected = 2;
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void ArrangingCoinsPositive1()
	{
		int actual=arrangingCoins(8);
		int expected = 3;
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void ArrangingCoinsPositive2()
	{
		int actual=arrangingCoins(3);
		int expected = 2;
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void ArrangingCoinsPositive3()
	{
		int actual=arrangingCoins(6);
		int expected = 3;
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void ArrangingCoinsNegative()
	{
		int actual=arrangingCoins(2);
		int expected = 1;
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void ArrangingCoinsNegative1()
	{
		int actual=arrangingCoins(1);
		int expected = 1;
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void ArrangingCoinsEdge()
	{
		int actual=arrangingCoins(0);
		int expected = 0;
		Assert.assertEquals(expected, actual);
	}


}
