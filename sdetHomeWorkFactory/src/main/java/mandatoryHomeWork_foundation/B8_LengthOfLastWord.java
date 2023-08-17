package mandatoryHomeWork_foundation;

import org.junit.Assert;
import org.junit.Test;

public class B8_LengthOfLastWord {
	
	/*
	 https://leetcode.com/problems/length-of-last-word/
	 Length of Last Word

	Given a string s consisting of words and spaces, return the length of the last word in the string.

	A word is a maximal 
	substring
 	consisting of non-space characters only.

Example 1:

	Input: s = "Hello World"
	Output: 5
	Explanation: The last word is "World" with length 5.
Example 2:

	Input: s = "   fly me   to   the moon  "
	Output: 4
	Explanation: The last word is "moon" with length 4.
Example 3:

	Input: s = "luffy is still joyboy"
	Output: 6
	Explanation: The last word is "joyboy" with length 6.

	#pseudocode
	----------
	#initialize String s
	#trim the front and back spaces in the sentence and stored in sub
	#using the sub sentence and and find the last word using last index of the space +1.
	#and find the length of the word and stored in length
	#return the int length value

	 */

	public int lengthOfLastWord(String s)
	{

		String sub = s.trim();
		String sz = sub.substring(sub.lastIndexOf(" ")+1, sub.length());
		int length = sz.length();
		System.out.println(sz);
		System.out.println(length);
		return length;
		
	}

	@Test
	public void LengthOfLastWordPositive()
	{
		int actual=lengthOfLastWord("   fly me   to   the moon  ");
		int expected =4;
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void LengthOfLastWordPositive1()
	{
		int actual=lengthOfLastWord("luffy is still joyboy");
		int expected =6;
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void LengthOfLastWordPositive2()
	{
		int actual=lengthOfLastWord("Hello World");
		int expected =5;
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void LengthOfLastWordPositive3()
	{
		int actual=lengthOfLastWord("Hello W");
		int expected =1;
		Assert.assertEquals(expected, actual);
	}
}


