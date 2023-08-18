package dailyConnectAssignment;

import org.junit.Assert;
import org.junit.Test;

public class Sdet_17_08_2023_Selenium {

	/*
	https://leetcode.com/problems/sum-multiples/submissions/

	 Sum Multiples

	Given a positive integer n, find the sum of all integers in the range [1, n] inclusive that are divisible by 3, 5, or 7.

Return an integer denoting the sum of all numbers in the given range satisfying the constraint.

Example 1:

	Input: n = 7
	Output: 21
	Explanation: Numbers in the range [1, 7] that are divisible by 3, 5, or 7 are 3, 5, 6, 7. The sum of these numbers is 21.
Example 2:

	Input: n = 10
	Output: 40
	Explanation: Numbers in the range [1, 10] that are divisible by 3, 5, or 7 are 3, 5, 6, 7, 9, 10. The sum of these numbers is 40.
Example 3:

	Input: n = 9
	Output: 30
	Explanation: Numbers in the range [1, 9] that are divisible by 3, 5, or 7 are 3, 5, 6, 7, 9. The sum of these numbers is 30.

	#pseudocode
	-----------
	#The variable sum is initialized to 0
	#For Loop:
		A for loop is used to iterate over the numbers from 1 to n.
	#Divisibility Check:
		Inside the loop, there's an if statement to check if the current value of i is divisible by 3, 5, or 7.
	#return sum is int
	 */

	public int sumMultiples(int n) {
		int sum = 0;

		for (int i = 1; i <= n; i++) {
			if (i % 3 == 0 || i % 5 == 0 || i % 7 == 0) {
				sum += i;
			}
		}
		return sum;
	}

	@Test	
	public void sumMultiplesPostive() 
	{
		int actual=sumMultiples(7);
		Assert.assertEquals(21, actual);
	}
	@Test	
	public void findDuplicatePostive1() 
	{
		int actual=sumMultiples(10);
		Assert.assertEquals(40, actual);
	}
	@Test
	public void sumMultiplesNeagtive() 
	{
		int actual=sumMultiples(9);
		Assert.assertEquals(30, actual);
	}
}
