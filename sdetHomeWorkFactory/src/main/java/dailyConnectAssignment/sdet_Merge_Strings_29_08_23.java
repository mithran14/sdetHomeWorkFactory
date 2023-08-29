package dailyConnectAssignment;

import org.junit.Assert;
import org.junit.Test;

public class sdet_Merge_Strings_29_08_23 {

	/*
	 * https://leetcode.com/problems/merge-strings-alternately/submissions/
	i/p String word1, word2
o/p String
initialize String s="";
Find the length for word1 and word2 
find the average length(word1+word2)

using for loop 0 to l
inside the for loop using 2 if statement onefor word 1 and another for word 2
incrementing the loops and stored the each character in String s

	 */

	public String reverseString(String word1,String word2) {
		String trim1 = word1.trim();
		String trim2 = word2.trim();
		String s="";
		int length1 = trim1.length();
		int length2 = trim2.length();
		int l = length1+length2;
		for (int i = 0; i < l; i++) {

			if (i < length1) 
			{

				s+=trim1.charAt(i);
			}
			if (i < length2) 
			{
				s+=trim2.charAt(i);
			}

		}
		System.out.println(s);
		return s;
	}

	@Test
	public void reverseStringPositive0() {
		String actual=reverseString("abc","pqr");
		String expected ="apbqcr";
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void reverseStringPositive1() {
		String actual=reverseString(" ","a");
		String expected ="a";
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void reverseStringPositive2() {
		String actual=reverseString("","");
		String expected ="";
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void reverseStringPositive3() {
		String actual=reverseString("","");
		String expected ="";
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void reverseStringPositive4() {
		String actual=reverseString("","");
		String expected ="";
		Assert.assertEquals(expected, actual);
	}
}
