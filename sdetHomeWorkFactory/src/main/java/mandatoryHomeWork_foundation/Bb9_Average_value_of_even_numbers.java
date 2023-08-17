package mandatoryHomeWork_foundation;

import org.junit.Assert;
import org.junit.Test;

public class Bb9_Average_value_of_even_numbers
{
	/*
	 https://leetcode.com/problems/average-value-of-even-numbers-that-are-divisible-by-three/description/

Average Value of Even Numbers That Are Divisible by Three

Given an integer array nums of positive integers, 
return the average value of all even integers that are divisible by 3.

Note that the average of n elements is the sum of the n elements divided by n 
and rounded down to the nearest integer.

Example 1:

	Input: nums = [1,3,6,10,12,15]
	Output: 9
	Explanation: 6 and 12 are even numbers that are divisible by 3. (6 + 12) / 2 = 9.
Example 2:

	Input: nums = [1,2,4,7,10]
	Output: 0
	Explanation: There is no single number that satisfies the requirement, so return 0.
	
	#pseudocode
	----------
	#Initialize Variables:
		value,count is initialized to 0. 
	#Loop Initialization:
		The for loop iterates from i = 1 to i < nums.
	#Inner Loop :
		check the 0 element inside the array is not equal to 0 or not and divisible 3 or not and divisibe by 3 or not
		if all the conditions meet then element will be stored in value, increment the count 
	#outside loop
		using if, check the value==0, if yes return 0 else return value/count
	
	 */

	public int average_value_of_even_numbers(int[] nums)
	{
		int value=0;
        int count=0;
        for(int i=0; i<nums.length;i++){
            if(nums[i]%2==0 && nums[i]%3==0 && nums[i]!=0)
            {
                value+=nums[i];
                count++;
            }
        }
        if(value==0){
             return 0;
        }
        value=value/count;
        return value;
	}
	@Test
	public void average_value_of_even_numbersPositive4()
	{
		int actual=average_value_of_even_numbers(new int[] {1,3,6,10,12,15});
		int expected =9;
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void average_value_of_even_numbersPositive()
	{
		int actual=average_value_of_even_numbers(new int[] {1,2,4,7,10});
		int expected = 0;
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void average_value_of_even_numbersPositive1()
	{
		int actual=average_value_of_even_numbers(new int[] {9,24,21,18,0});
		int expected =21;
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void average_value_of_even_numbersPositive2()
	{
		int actual=average_value_of_even_numbers(new int[] {12,18,9,2,10,8,6});
		int expected =12;
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void average_value_of_even_numbersPositive3()
	{
		int actual=average_value_of_even_numbers(new int[] {15,10,30,27,13,33,30,60});
		int expected =40;
		Assert.assertEquals(expected, actual);
	}	
}

