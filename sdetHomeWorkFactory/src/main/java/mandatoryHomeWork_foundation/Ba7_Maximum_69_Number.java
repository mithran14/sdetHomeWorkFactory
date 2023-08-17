package mandatoryHomeWork_foundation;

import org.junit.Assert;
import org.junit.Test;

public class Ba7_Maximum_69_Number
 {

	/*
	 https://leetcode.com/problems/maximum-69-number/description/

	Maximum 69 Number

You are given a positive integer num consisting only of digits 6 and 9.

Return the maximum number you can get by changing at most one digit (6 becomes 9, and 9 becomes 6).

Example 1:

	Input: num = 9669
	Output: 9969
	Explanation: 
	Changing the first digit results in 6669.
	Changing the second digit results in 9969.
	Changing the third digit results in 9699.
	Changing the fourth digit results in 9666.
	The maximum number is 9969.
Example 2:

	Input: num = 9996
	Output: 9999
	Explanation: Changing the last digit 6 to 9 results in the maximum number.
Example 3:

	Input: num = 9999
	Output: 9999
	Explanation: It is better not to apply any change.

	#pseudocode
	----------
	#initialize num
	#num into String conversion
	#String into charArray conversion
	#using for loop set condition from 0 and upto < length
	#using if statement check the charArray dynamic element is 6 or not, if 6 then will change into 9
	#break the condition
	#change the char into string and change into integer
	#return the Integer

	 */

	public int maximum_69_Number(int num)
	{
		String valueOf = String.valueOf(num);
		char[] charArray = valueOf.toCharArray();

		for (int i = 0; i < valueOf.length(); i++) 
		{
			if (charArray[i]=='6') 
			{
				charArray[i]='9';
				break;
			}
		}
		System.out.println(Integer.parseInt(String.valueOf(charArray)));
		return Integer.parseInt(String.valueOf(charArray));
	}

	@Test
	public void maximum_69_NumberPositive()
	{
		int actual=maximum_69_Number(9669);
		int expected =9969;
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void maximum_69_NumberPositive1()
	{
		int actual=maximum_69_Number(9666);
		int expected =9966;
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void maximum_69_NumberPositive2()
	{
		int actual=maximum_69_Number(6666);
		int expected =9666;
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void maximum_69_NumberPositive3()
	{
		int actual=maximum_69_Number(9999);
		int expected =9999;
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void maximum_69_NumberPositive4()
	{
		int actual=maximum_69_Number(69);
		int expected =99;
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void maximum_69_NumberPositive5()
	{
		int actual=maximum_69_Number(9);
		int expected =9;
		Assert.assertEquals(expected, actual);
	}
}


