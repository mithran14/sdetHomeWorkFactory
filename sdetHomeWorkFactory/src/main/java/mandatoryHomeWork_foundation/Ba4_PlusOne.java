package mandatoryHomeWork_foundation;

import org.junit.Assert;
import org.junit.Test;

public class Ba4_PlusOne {
	
	/*
	 https://leetcode.com/problems/plus-one/description/
	 
	Plus One

You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer.
 The digits are ordered from most significant to least significant in left-to-right order. 
 The large integer does not contain any leading 0's.

Increment the large integer by one and return the resulting array of digits.

Example 1:

	Input: digits = [1,2,3]
	Output: [1,2,4]
	Explanation: The array represents the integer 123.
	Incrementing by one gives 123 + 1 = 124.
	Thus, the result should be [1,2,4].
Example 2:

	Input: digits = [4,3,2,1]
	Output: [4,3,2,2]
	Explanation: The array represents the integer 4321.
	Incrementing by one gives 4321 + 1 = 4322.
	Thus, the result should be [4,3,2,2].
Example 3:

	Input: digits = [9]
	Output: [1,0]
	Explanation: The array represents the integer 9.
	Incrementing by one gives 9 + 1 = 10.
	Thus, the result should be [1,0].

	#pseudocode
	----------
	#initialize s,digits,a,count=0, index=0
	#find the length and stored in n variable
	#convert the int array into int value and stored in digits
	#using for loop, set the conditions starts from n-1 upto i>=1 decrementing i value
	#using if statement last element of s is 9 or not, if yes
	#find the reminder of s, and stored in a, and subtract the a value from digits and stored in digits, incrementing count value
	#multiply *10 in count value and add digits value and stored in digits and break the loop
	#outside of the loop check last element of the s is not equal to 9 then add +1 in digits and stored in digits.
	#convert the digits ito string, the create the new int array using string length
	#the convert the string into char and using for each loop get the value and stored in array
	#return the int[] value

	 */

	public int[] plusOne(int[] s)
	{
			int n = s.length;
			int digits=0;
			int a,count=0;

			for (int num : s) 
			{
				digits = digits * 10 + num;
			}

			for (int i = n-1; i>=0; i--) 
			{
				if (s[n-1]==9) 
				{
					a=s[i]%10;
					digits=digits-a;
					count++;
					digits=digits+count*10;
					break;
				}
				
			}
			if (s[n-1]!=9) 
			{
				digits=digits+1;
			}
			
			int index=0;
			String value = Integer.toString(digits);
			int[] result=new int[value.length()];

			for (char k : value.toCharArray()) 
			{
				result[index] = Character.getNumericValue(k);
				index++;
			}
			return result;

		}
		
		public void plusOnePositive()
		{
			int[] actual=plusOne(new int[] {4,3,2,1});
			int[] expected = {4,3,2,2};
			Assert.assertArrayEquals(expected, actual);
		}
		
		public void plusOnePositive1()
		{
			int[] actual=plusOne(new int[] {1,9});
			int[] expected = {2,0};
			Assert.assertArrayEquals(expected, actual);
		}
		public void plusOnePositive2()
		{
			int[] actual=plusOne(new int[] {1,2,3});
			int[] expected = {1,2,4};
			Assert.assertArrayEquals(expected, actual);
		}
		
		public void plusOnePositive3()
		{
			int[] actual=plusOne(new int[] {9});
			int[] expected = {1,0};
			Assert.assertArrayEquals(expected, actual);
		}
		@Test
		public void plusOnePositive4()
		{
			int[] actual=plusOne(new int[] {9,9,9});
			int[] expected = {1,0,0,0};
			Assert.assertArrayEquals(expected, actual);
		}

}


