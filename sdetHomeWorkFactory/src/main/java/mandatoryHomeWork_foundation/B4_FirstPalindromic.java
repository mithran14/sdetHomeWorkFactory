package mandatoryHomeWork_foundation;

import org.junit.Assert;
import org.junit.Test;

public class B4_FirstPalindromic 
{
	/*
	https://leetcode.com/problems/find-first-palindromic-string-in-the-array/description/
	
	First Palindromic

	Given an array of strings words, return the first palindromic string in the array. 
	If there is no such string, return an empty string "".

	A string is palindromic if it reads the same forward and backward.

Example 1:

	Input: words = ["abc","car","ada","racecar","cool"]
	Output: "ada"
	Explanation: The first string that is palindromic is "ada".
	Note that "racecar" is also palindromic, but it is not the first.
Example 2:

	Input: words = ["notapalindrome","racecar"]
	Output: "racecar"
	Explanation: The first and only string that is palindromic is "racecar".
Example 3:

	Input: words = ["def","ghi"]
	Output: ""
	Explanation: There are no palindromic strings, so the empty string is returned.

	#pseudocode
	----------
	#initialize words,str,str1,count
	#length of the word will find and stored in length
	#using for loop set the condition <length and increment i value
	#In the string array we picked up a word usig i value and change into charArray and stored in charArray
	#Find the charArray length and stored in length2
	#inside the for loop set the condition upto j< length2
	@find the charcter using j value and stored in str, and find the character using length-count value and stored in str1
	#loop ends checks the values are equal using if statement and return the string word
	#not equals reset the values of str,str1,count and continuing the next word
	#return the "" empty string value

	 */
	
	public String firstPalindromic(String[] words)
	{
		int length = words.length;
		String str="";
		String str1="";
		int count=1;

		for (int i = 0; i < length; i++) 
		{

			char[] charArray = words[i].toCharArray();
			int length2 = charArray.length;

			for (int j = 0; j < length2; j++) 
			{
				str=str+charArray[j];
				str1=str1+charArray[length2-count];
				count++;
			}
			if (str.equals(str1)) 
			{
				System.out.println(str);
				return str;
			}
			str="";
			str1="";
			count=1;
	}

	System.out.println(str);
	return "";

}

@Test
public void firstPalindromicPositive()
{
	String actual=firstPalindromic(new String[] {"abc","car","ada","racecar","cool"});
	String expected ="ada";
	Assert.assertEquals(expected, actual);
}

@Test
public void firstPalindromicPositive1()
{
	String actual=firstPalindromic(new String[] {"notapalindrome","racecar"});
	String expected ="racecar";
	Assert.assertEquals(expected, actual);
}

@Test
public void firstPalindromicPositive2()
{
	String actual=firstPalindromic(new String[] {"def","ghi"});
	String expected ="";
	Assert.assertEquals(expected, actual);
}

}


