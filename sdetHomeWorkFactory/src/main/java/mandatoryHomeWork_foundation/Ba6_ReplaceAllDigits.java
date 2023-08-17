package mandatoryHomeWork_foundation;

import org.junit.Assert;
import org.junit.Test;


public class Ba6_ReplaceAllDigits {

	/*
	https://leetcode.com/problems/replace-all-digits-with-characters/description/?source=submission-noac

	Replace All Digits with Characters

	You are given a 0-indexed string s that has lowercase English letters in its even indices and digits in its odd indices.

	There is a function shift(c, x), where c is a character and x is a digit, that returns the xth character after c.

	For example, shift('a', 5) = 'f' and shift('x', 0) = 'x'.
		For every odd index i, you want to replace the digit s[i] with shift(s[i-1], s[i]).

	Return s after replacing all digits. It is guaranteed that shift(s[i-1], s[i]) will never exceed 'z'.

 

Example 1:

	Input: s = "a1c1e1"
	Output: "abcdef"
	Explanation: The digits are replaced as follows:
	- s[1] -> shift('a',1) = 'b'
	- s[3] -> shift('c',1) = 'd'
	- s[5] -> shift('e',1) = 'f'
Example 2:

	Input: s = "a1b2c3d4e"
	Output: "abbdcfdhe"
	Explanation: The digits are replaced as follows:
	- s[1] -> shift('a',1) = 'b'
	- s[3] -> shift('b',2) = 'd'
	- s[5] -> shift('c',3) = 'f'
	- s[7] -> shift('d',4) = 'h'

	#pseudocode
	----------
	#initialize number,value,valueAdd,result
	#find the length and stored in length variable
	#String into charArray conversion and stored in CharArray
	#First element of charArrayis stored in Result variable
	#using for loop starts from 1 upto < length
	#finding the digits and convert into integer and stored in Value
	#finding the character values and convert into integer and stored in value
	#finding the charcter from the digit values and convert into integer and stored in ValueAdd
	#Adding the value and ValueAdd and conver into char and stored in ch.
	#convert char into string and stored in str
	#using concat adding those values and return the result

	 */

	public String replaceAllDigits(String number)
	{
		int length = number.length();
		char[] charArray = number.toCharArray();
		String result = Character.toString(charArray[0]);
		//String result="a";
	
		for (int i = 1; i < length; i++) 
		{
			int value=0;
			int valueAdd=0;
			
				if(Character.isDigit(number.charAt(i)))
				{
					value=(int)number.charAt(i)-'0';
				}
				if(!Character.isDigit(number.charAt(i)))
				{
					value=(int)number.charAt(i);
					//System.out.println(value);
				}
				if(Character.isDigit(number.charAt(i)))
				{
					valueAdd=(int)number.charAt(i-1);
					//System.out.println(value);
				}
				
				char ch = (char) (valueAdd+value);
				String str2 = String.valueOf(ch);
				result = result.concat("").concat(str2);
		}

		return result;
	}

	@Test
	public void replaceAllDigitsPositive()
	{
		String actual=replaceAllDigits("a1c1e1");
		String expected = "abcdef";
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void replaceAllDigitsPositive1()
	{
		String actual=replaceAllDigits("a1b2c3d4e");
		String expected = "abbdcfdhe";
		Assert.assertEquals(expected, actual);
	}

}


