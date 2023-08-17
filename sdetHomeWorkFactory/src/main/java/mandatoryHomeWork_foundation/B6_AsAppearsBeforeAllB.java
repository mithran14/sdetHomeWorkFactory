package mandatoryHomeWork_foundation;

import org.junit.Assert;
import org.junit.Test;

public class B6_AsAppearsBeforeAllB {
	
	/*

	https://leetcode.com/problems/check-if-all-as-appears-before-all-bs/description/
	Shuffle String

	Given a string s consisting of only the characters 'a' and 'b', return true if every 'a' appears before every 'b' in the string. 
	Otherwise, return false.

Example 1:

	Input: s = "aaabbb"
	Output: true
	Explanation:
	The 'a's are at indices 0, 1, and 2, while the 'b's are at indices 3, 4, and 5.
	Hence, every 'a' appears before every 'b' and we return true.
Example 2:

	Input: s = "abab"
	Output: false
	Explanation:
	There is an 'a' at index 2 and a 'b' at index 1.
	Hence, not every 'a' appears before every 'b' and we return false.
Example 3:

	Input: s = "bbb"
	Output: true
	Explanation:
	There are no 'a's, hence, every 'a' appears before every 'b' and we return true.

	#pseudocode
	----------
	#initialize String S
	#using if condition check the ba is contains in the given word
	#if yes return true
	#return the boolean false

	 */

	public boolean asAppearsBeforeAllB(String s)
	{
		return (!s.contains("ba"));
	}
	
	@Test
	public void asAppearsBeforeAllBPositive()
	{
		boolean actual=asAppearsBeforeAllB("aaabbb");
		boolean expected =true;
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void asAppearsBeforeAllBPositive1()
	{
		boolean actual=asAppearsBeforeAllB("abab");
		boolean expected =false;
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void asAppearsBeforeAllBPositive2()
	{
		boolean actual=asAppearsBeforeAllB("bbb");
		boolean expected =true;
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void asAppearsBeforeAllBPositive3()
	{
		boolean actual=asAppearsBeforeAllB("a");
		boolean expected =true;
		Assert.assertEquals(expected, actual);
	}

}


