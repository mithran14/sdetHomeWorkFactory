package dailyConnectAssignment;

import org.junit.Assert;
import org.junit.Test;

public class Sdet_Reverse_prefix_29_08_23 {
	
	/*
	 * https://leetcode.com/problems/reverse-prefix-of-word/description/
	 * 
	i/p String word and char ch
	o/p String

	String into substring
	
	substring1 from 0 to ch
	substring2 from (ch+1, word.length())

	Reverse the Substring1 Using StringBuilder 
	add the reverse String and substring2
	
	*/

	public String reverseString(String word,char ch) {

		String s="";
		String substring1 = word.substring(0, word.indexOf(ch)+1);
		String substring2 = word.substring(word.indexOf(ch)+1, word.length());
		StringBuilder builder=new StringBuilder(substring1);
		s+=builder.reverse()+substring2;
		return s;
	}
	
	@Test
	public void reverseStringPositive0() {
		String actual=reverseString("abcdefd",'d');
		String expected ="dcbaefd";
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void reverseStringPositive() {
		String actual=reverseString("aaaaabbbbb",'b');
		String expected ="baaaaabbbb";
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void reverseStringPositive1() {
		String actual=reverseString("xyxzxe",'z');
		String expected ="zxyxxe";
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void reverseStringPositive2() {
		String actual=reverseString("zbcd",'z');
		String expected ="zbcd";
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void reverseStringNegative1() {
		String actual=reverseString("abcd",'z');
		String expected ="abcd";
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void reverseStringEdge1() {
		String actual=reverseString("y",'y');
		String expected ="y";
		Assert.assertEquals(expected, actual);
	}	
	@Test
	public void reverseStringEdge2() {
		String actual=reverseString("",'z');
		String expected ="";
		Assert.assertEquals(expected, actual);
	}	
	
	
}
