package mandatoryHomeWork_foundation;

import org.junit.Assert;
import org.junit.Test;

public class B1_Valid_palindrome 
{

	/*
	 https://leetcode.com/problems/valid-palindrome/description/
	 
	Valid Palindrome

	A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.

	Given a string s, return true if it is a palindrome, or false otherwise.

Example 1:

	Input: s = "A man, a plan, a canal: Panama"
	Output: true
	Explanation: "amanaplanacanalpanama" is a palindrome.
Example 2:

	Input: s = "race a car"
	Output: false
	Explanation: "raceacar" is not a palindrome.
Example 3:

	Input: s = " "
	Output: true
	Explanation: s is an empty string "" after removing non-alphanumeric characters.
	Since an empty string reads the same forward and backward, it is a palindrome.

	#pseudocode
	----------
	#initialize Strig S,String str, str1
	#replace except alphanumeric
	#stored the Actual string in str
	#using for loop and reverse the string and stored in str1
	#compare the str and str1 
	#return the boolean

	 */

	public boolean valid_palindrome(String S)
	{
		//Arrays.sort(nums);

		String replaceAll2 = S.replace(" ", "");
		String replace = replaceAll2.replace(",", "");
		String replace2 = replace.replace(":", "");
		String str = replace2.toLowerCase();
		int length = str.length();
		System.out.println(str);
		String str1 = "";
		char[] charArray = str.toCharArray();

		for (int i = length-1; i >=0; i--) 
		{
			str1 = str1+charArray[i];

		}
		return str.equals(str1);

	}

	@Test
	public void valid_palindromePositive()
	{
		boolean actual=valid_palindrome("A man, a plan, a canal: Panama");
		boolean expected =true;
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void valid_palindromePositive1()
	{
		boolean actual=valid_palindrome("Ma d Am");
		boolean expected =true;
		Assert.assertEquals(expected, actual);
	}


}
