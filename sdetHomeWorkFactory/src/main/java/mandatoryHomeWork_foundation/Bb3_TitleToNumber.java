package mandatoryHomeWork_foundation;

import org.junit.Assert;
import org.junit.Test;

public class Bb3_TitleToNumber {

	/*
	 https://leetcode.com/problems/excel-sheet-column-number/submissions/

	Excel Sheet Column Number

	Given a string columnTitle that represents the column title as appears in an Excel sheet, return its corresponding column number.

	For example:

	A -> 1
	B -> 2
	C -> 3
	...
	Z -> 26
	AA -> 27
	AB -> 28 
	...
 
Example 1:

	Input: columnTitle = "A"
	Output: 1
Example 2:

	Input: columnTitle = "AB"
	Output: 28
Example 3:

	Input: columnTitle = "ZY"
	Output: 701
	
	#pseudocode
	----------
	#Get the length of the input string n using n.length() and store it in the variable length. 
	This will be used to iterate through the characters of the string in reverse order.
	#Initialize variables s and index to 0. s will store the result (column number) and 
		index will be used to calculate the power of 26 for each character position.
	#Start a loop to iterate through the characters of the input string n in reverse order, 
		starting from the last character (i.e., n.charAt(length-1)) to the first character (i.e., n.charAt(0)).
	#For each character at index i, calculate the power of 26 raised to the index using Math.pow(26, index) 
		and store it in the variable cool.
	#Convert the character at index i into its ASCII value by casting it to an integer using (int) (n.charAt(i)). 
		In Excel, column letters start from 'A', so 'A' will have the value of 1, 'B' will have the value of 2, and so on.
	#Subtract the ASCII value of '@' from the integer value of the character. '@' has the ASCII value of 64, 
		so this operation will give us the column number for the character. 
			For example, if n.charAt(i) is 'A', the result will be 1; if it is 'B', the result will be 2, and so on.
	#Multiply the column number obtained from step 6 by the power of 26 obtained from step 4 
		(i.e., s = s + cool * ((int) (n.charAt(i))-'@')).
	#Increment the index to move to the next character position.
	#Repeat steps 4 to 8 for all characters in the input string n.
	#After the loop finishes, the variable s will contain the final column number, which is the result.

	 */

	public int titleToNumber(String n)
	{
		int length = n.length();
		int s=0;
		int index=0;
		for (int i = length-1; i >=0; i--) 
		{
			int cool=(int) (Math.pow(26, index));
			s = s + cool * ((int) (n.charAt(i))-'@');
			index++;
		}
		return s;
	}

	@Test
	public void titleToNumberPositive()
	{
		int actual=titleToNumber("AB");
		int expected = 28;
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void titleToNumberPositive1()
	{
		int actual=titleToNumber("ZY");
		int expected = 701;
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void titleToNumberPositive2()
	{
		int actual=titleToNumber("A");
		int expected = 1;
		Assert.assertEquals(expected, actual);
	}

}


