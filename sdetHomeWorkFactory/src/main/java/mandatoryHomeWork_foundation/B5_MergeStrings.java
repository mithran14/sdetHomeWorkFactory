package mandatoryHomeWork_foundation;

import org.junit.Assert;
import org.junit.Test;

public class B5_MergeStrings {
	
	/*
	 https://leetcode.com/problems/merge-strings-alternately/editorial/
	
	We are given two strings word1 and word2.

	Our task is to merge the strings by adding letters in alternating order, starting with word1.
	If one string is longer than the other, the additional letters must be appended to the end of the merged string.

	We must return the merged string that has been formed.

	#pseudocode
	----------
	#initialize word1,word2,result 
	#find the length of the words and stored in length1,length2
	#find the maximum length and stored in maxLength
	#using for loop and set the condition upto < maxlength 
	#using if statement find the first character of word1 and stored in result, 
		another if statement find the first character of word2 and stored in result 
	#return the string result value

	 */

	public String powerOfThree(String word1,String word2)
	{

		int length1 = word1.length();
		int length2 = word2.length();
		int maxLength = (length1 > length2) ? length1 : length2;
		String result = "";

		for (int i = 0; i < maxLength; i++) 
		{
			if (i < length1) 
			{
				result += word1.charAt(i);
			}
			if (i < length2) 
			{
				result += word2.charAt(i);
			}
		}
		return result;

	}

	@Test
	public void addDigitsPositive()
	{
		String actual=powerOfThree("ab","pqrs");
		String expected ="apbqrs";
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void addDigitsPositive1()
	{
		String actual=powerOfThree("abr","pqs");
		String expected ="apbqrs";
		Assert.assertEquals(expected, actual);
	}


	public void addDigitsPositive2()
	{
		String actual=powerOfThree("ab","pqrs");
		String expected ="apbaqrs";
		Assert.assertEquals(expected, actual);
	}

}


