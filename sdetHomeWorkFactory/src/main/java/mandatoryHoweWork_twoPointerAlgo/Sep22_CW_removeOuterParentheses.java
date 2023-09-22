package mandatoryHoweWork_twoPointerAlgo;

import org.junit.Assert;
import org.junit.Test;

public class Sep22_CW_removeOuterParentheses {

	/*
	 * https://leetcode.com/problems/remove-outermost-parentheses/description/
	#i/p String S, O/P String s and initialize int a=0, StringBuilder s
	#using for each loop convert String S into charArray
	 	from charArray elements 
	#using if check the value is "(", and the a++ > 0 then append the char value into s.
	#again using another if check the value is ")", and the a-- > 1 then append the char value into s.
	#return the s.toString()
	//Time complexity -  O[N]
	 */

	public String removeOuterParentheses(String S) {
        StringBuilder s = new StringBuilder();
        int a = 0;
        for (char c : S.toCharArray()) {
            if (c == '(' && a++ > 0) {
            	s.append(c);
            	}
            if (c == ')' && a-- > 1){
            	s.append(c);
            	}
        }
        return s.toString();
    }
	@Test
	public void TwoPositive0() {
		String actual=removeOuterParentheses ("(()())(())");
		String expected = "()()()";
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void TwoPositive1() {
		String actual=removeOuterParentheses ("(()())(())(()(()))");
		String expected = "()()()()(())";
		Assert.assertEquals(expected, actual);
	}

}
