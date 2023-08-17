package mandatoryHomeWork_foundation;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class Ba2_Second_largest {
	
	/*
	 https://leetcode.com/problems/second-largest-digit-in-a-string/description/
	 
	Second Largest Digit in a String

	Given an alphanumeric string s, return the second largest numerical digit that appears in s, or -1 if it does not exist.

	An alphanumeric string is a string consisting of lowercase English letters and digits.

Example 1:

	Input: s = "dfa12321afd"
	Output: 2
	Explanation: The digits that appear in s are [1, 2, 3]. The second largest digit is 2.
Example 2:

	Input: s = "abc1111"
	Output: -1
	Explanation: The digits that appear in s are [1]. There is no second largest digit. 

	#pseudocode
	----------
	#initialize s
	#replace the othrs and store only numeric digits in digitonly
	#to change the charArray and stored in charArray
	#find the array length and stored compare the length<2 or not, if yes return -1
	#using for loop every element in charArray to stored in numArray
	#sorting the numArray
	#find the last element in numArray and stored in largest variable and initialize secondlargest=-1
	#using for loop starts from numArray.length-2 upto>=0 decrementing the i value
	#to check is the previous element is equal to largest or not, if not  stored he elemet in secondlargest and break condition 
	and return the secondlargest
	#if yes decrementing the i value and check remaining and find the 2nd largest 
	#end of the loop return length int value.

	 */

	public int second_largest(String s)
	{
		
		    String digitsOnly = s.replaceAll("[^0-9]", "");
		    char[] charArray = digitsOnly.toCharArray();

		    if (charArray.length < 2) {
		        return -1; // No second-largest digit exists
		    }

		    int[] numArray = new int[charArray.length];

		    for (int i = 0; i < charArray.length; i++) 
		    {
		        numArray[i] = Character.getNumericValue(charArray[i]);
		    }

		    Arrays.sort(numArray);

		    int largest = numArray[numArray.length - 1];
		    int secondLargest = -1;

		    for (int i = numArray.length - 2; i >= 0; i--) 
		    {
		        if (numArray[i] != largest) {
		            secondLargest = numArray[i];
		            break;
		        }
		    }

		    return secondLargest;
		}

	
	@Test
	public void second_largestPositive()
	{
		int actual=second_largest("dfa12321afd");
		int expected =2;
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void second_largestPositive1()
	{
		int actual=second_largest("abc1111");
		int expected =-1;
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void second_largestPositive2()
	{
		int actual=second_largest("abc1213244");
		int expected =3;
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void second_largestPositive3()
	{
		int actual=second_largest("abc1");
		int expected =-1;
		Assert.assertEquals(expected, actual);
	}
	
}


