package mandatoryHomeWork_foundation;

import org.junit.Assert;
import org.junit.Test;

public class B9_FindtheDifference
 {

	/*
	 https://leetcode.com/problems/valid-palindrome/description/
	 https://leetcode.com/problems/shuffle-string/description/
	 https://leetcode.com/problems/determine-if-string-halves-are-alike/description/
	 //madam, level, noon
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
	#initialize s,t
	#create the new integer array using English characters 26
	#using foreach loop Count the occurrences of each letter in string s
	#Subtract the occurrences of each letter in string t
	#Find the added letter by checking the count array
	#If the loop completes without finding a mismatch, return a default character or handle the case as needed
	#return the char value

	 */

	public char findtheDifference(String s, String t)
	{
		
		int[] arr = new int[26];

		// Count the occurrences of each letter in string s
		for (char c : s.toCharArray()) 
		{
			arr[c - 'a']++;
		}

		// Subtract the occurrences of each letter in string t
		for (char c : t.toCharArray()) 
		{
			arr[c - 'a']--;
		}

		// Find the added letter by checking the count array
		for (int i = 0; i < 26; i++) 
		{
			if (arr[i] != 0) 
			{
				char g=(char) ('a' + i);
				return g;
			}
		}

		// If the loop completes without finding a mismatch, return a default character or handle the case as needed
		return ' ';
	}

	@Test
	public void findtheDifferencePositive()
	{
		char actual=findtheDifference("abcd","cbade");
		char expected ='e';
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void findtheDifferencePositive1()
	{ 
		char actual=findtheDifference("abbd","cbabd");
		char expected ='c';
		Assert.assertEquals(expected, actual);
	}

}

