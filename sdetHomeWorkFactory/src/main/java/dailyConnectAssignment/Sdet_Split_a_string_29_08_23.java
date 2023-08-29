package dailyConnectAssignment;

import org.junit.Assert;
import org.junit.Test;

public class Sdet_Split_a_string_29_08_23 {

	/*
	 * https://leetcode.com/problems/split-a-string-in-balanced-strings/
	 * 
	i/p String 
	o/p int
initialize int countR,countL, count variables=0

	iterate using for loop
	inside for loop using if else condition and oner more if condition
	first if condition check the element is then increment the countR by 1, else increment the countL by 1
	another if check the countR is equal to countL then increment the count by 1
	return the int count 
	 */

	public int reverseString(String s) {
		int countR = 0,countL = 0,count=0;
		for (int i = 0; i < s.length(); i++) {
			char charAt = s.charAt(i);
			if (charAt=='R') {
				countR++;
			} else {
				countL++;
			}
			if (countR==countL) {
				count++;
			}
		}	
		return count;
	}

	@Test
	public void reverseStringPositive0() {
		int actual=reverseString("RLRRLLRLRL");
		int expected =4;
		Assert.assertEquals(expected, actual);
	}
	


}
