package mandatoryHomeWork_foundation;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class Bb2_Anagram
{
	/*
	 https://leetcode.com/problems/valid-anagram/submissions/

	Valid Anagram

	Given two strings s and t, return true if t is an anagram of s, and false otherwise.

	An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, 
	typically using all the original letters exactly once.

Example 1:

	Input: s = "anagram", t = "nagaram"
	Output: true
	
Example 2:

	Input: s = "rat", t = "car"
	Output: false

	#pseudocode
	----------
	#Convert the input strings s and t into character arrays charArray and charArray1 respectively. 
	This is done using the toCharArray() method, which converts a string into an array of characters.
	#Sort both charArray and charArray1 in ascending order using Arrays.sort(). 
		Sorting the characters makes it easier to compare them later.
	#Check if the lengths of charArray and charArray1 are equal. 
		If they are not equal, it means the two strings cannot be anagrams since they have different numbers of characters. 
			In this case, return false.
	#If the lengths of the two character arrays are equal, proceed to compare each character at corresponding positions.
	#Use a loop to iterate through each character in charArray and compare it with the character at the same index in charArray1.
	#If any characters at the same index in the two arrays are different, it means the strings are not anagrams. 
		In this case, return false.
	#If the loop finishes without finding any mismatched characters, it means the strings are anagrams. Return true.

	 */

	public boolean isAnagram(String s,String t)
	{
		char[] charArray = s.toCharArray();
		char[] charArray1 = t.toCharArray();

		Arrays.sort(charArray);
		Arrays.sort(charArray1);
		
		if(charArray.length!=charArray1.length)
		{
			return false;
		}
		for (int i = 0; i < charArray.length; i++) 
		{			

			if (charArray[i]!=charArray1[i]) 
			{
				return false;
			}
		}
		return true;
	}

	@Test
	public void isAnagramPositive()
	{
		boolean actual=isAnagram("anagram","nagaram");
		boolean expected =true;
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void isAnagramPositive1()
	{
		boolean actual=isAnagram("rat","car");
		boolean expected =false;
		Assert.assertEquals(expected, actual);
	}
	public void isAnagramPositive2()
	{
		boolean actual=isAnagram("listen","silent");
		boolean expected =true;
		Assert.assertEquals(expected, actual);
	}
}

