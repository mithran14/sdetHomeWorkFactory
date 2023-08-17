package mandatoryHomeWork_foundation;
import java.util.Arrays;
import org.junit.Assert;
import org.junit.Test;

public class Ba8_UniqueNumberOfOccurrences {

	/*
	 https://leetcode.com/problems/unique-number-of-occurrences/description/

	Unique Number of Occurrences

Given an array of integers arr, return true if the number of occurrences of each value in the array is unique or false otherwise.

Example 1:

	Input: arr = [1,2,2,1,1,3]
	Output: true
	Explanation: The value 1 has 3 occurrences, 2 has 2 and 3 has 1. No two values have the same number of occurrences.
Example 2:

	Input: arr = [1,2]
	Output: false
Example 3:

	Input: arr = [-3,0,1,-3,1,1,1,-3,10,0]
	Output: true
	
	#pseudocode
	----------
	#initialize number,j=0,count=1
	#find the length and stored in length variable
	#sorting the array
	#created the new integer array arr with same length of the input number
	#using for loop starts from 1 upto < length
	#using if condition check the 1st index of element and previous index of element is equal or not  
	#if yes, incrementing the count value
	#if not or finish the counting then adding the count value in arr[] integer using j value like arr[j++]
	#reset thecount value, and again the loop continuing, array of last element will find and come out the loop and store in arr[].
	#using one more for loop, to check the arr array element 1st index of element and previous index of element is equal or not 
	#if yes return false
	#if not return boolean true.

	 */

	public boolean uniqueNumberOfOccurrences(int[] number)
	{
		int length = number.length;
		Arrays.sort(number);
		int j=0;
		int count=1;
		int[] arr=new int[length];
		
		for (int i = 1; i <number.length; i++) 
		{
			if (number[i]==number[i-1]) 
			{
				count++;
			}
			else 
			{
				arr[j++]=count;
				count=1;
			}
		}
		arr[j]=count;
		for (int i = 1; i <= j; i++) 
		{
			if (arr[i]==arr[i-1]) 
			{
				return false;
			}
		}
		return true;
	}

	@Test
	public void uniqueNumberOfOccurrencesPositive()
	{
		boolean actual=uniqueNumberOfOccurrences(new int[] {1,2,2,1,1,3});
		boolean expected = true;
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void uniqueNumberOfOccurrencesPositive1()
	{
		boolean actual=uniqueNumberOfOccurrences(new int[] {-3,0,1,-3,1,1,1,-3,10,0});
		boolean expected = true;
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void uniqueNumberOfOccurrencesPositive2()
	{
		boolean actual=uniqueNumberOfOccurrences(new int[] {1,2});
		boolean expected = false;
		Assert.assertEquals(expected, actual);
	}
}


