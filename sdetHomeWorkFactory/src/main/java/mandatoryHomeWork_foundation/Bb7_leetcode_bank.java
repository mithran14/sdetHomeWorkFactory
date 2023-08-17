package mandatoryHomeWork_foundation;

import org.junit.Assert;
import org.junit.Test;

public class Bb7_leetcode_bank
{
	/*
	 https://leetcode.com/problems/calculate-money-in-leetcode-bank/description/

Example 1:

	Input: n = 4
	Output: 10
	Explanation: After the 4th day, the total is 1 + 2 + 3 + 4 = 10.
Example 2:

	Input: n = 10
	Output: 37
	Explanation: After the 10th day, the total is (1 + 2 + 3 + 4 + 5 + 6 + 7) + (2 + 3 + 4) = 37. Notice that on the 2nd Monday, Hercy only puts in $2.
Example 3:

	Input: n = 20
	Output: 96
	Explanation: After the 20th day, the total is (1 + 2 + 3 + 4 + 5 + 6 + 7) + (2 + 3 + 4 + 5 + 6 + 7 + 8) + (3 + 4 + 5 + 6 + 7 + 8) = 96.

	#pseudocode
	----------
	#Initialize Variables:
		val, count, count1, and j are initialized to 0. 
		val will store the final result, count will keep track of how many numbers are added in each group, 
		count1 will keep track of the total numbers added,and j will be used for resetting the loop counter i.
	#Loop Initialization:
		The for loop iterates from i = 1 to i <= n.
	#Outer Loop:
		The outer if condition checks if count1 is equal to n. 
		If true, it breaks out of the loop, as the required count of numbers has been added.
	#Inner Loop (Grouping):
		The first else if condition checks if count is equal to 7. 
		This is used to group every 7 numbers.
	#When count reaches 7, j is incremented by 1, and the loop counter i is updated to the value of j. 
		This effectively starts a new group of numbers.
		count is reset to 0 to start counting again for the new group.
	#Adding Numbers:
		The final else block is executed when neither of the above conditions is satisfied.
		The value of i is added to the val variable.
		count and count1 are incremented by 1.
	#Loop Continues:
		The loop continues to iterate, and the above steps are repeated until the conditions are met for breaking or grouping.
	#Return Result:
		Once the loop finishes, the function returns the value of val, which represents the sum of the selected numbers based on the given conditions.

	 */

	public int alternating_digit_sum(int n)
	{

		int val=0;
		int count=0;
		int count1=0;
		int j=0;
		for (int i = 1; i <=n; i++) 
		{
			
			if (count1==n) 
			{
				break;
			}
			else if (count==7) 
			{
				j=j+1;
				i=j;
				count=0;
			}
			else 
			{
				val=val+i;
				count++;
				count1++;
			}
		}
		return val;
	}
	@Test
	public void alternating_digit_sumPositive()
	{
		int actual=alternating_digit_sum(4);
		int expected = 10;
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void alternating_digit_sumPositive1()
	{
		int actual=alternating_digit_sum(10);
		int expected = 37;
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void alternating_digit_sumPositive2()
	{
		int actual=alternating_digit_sum(20);
		int expected = 96;
		Assert.assertEquals(expected, actual);
	}

}

