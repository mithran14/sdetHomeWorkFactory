package mandatoryHomeWork_foundation;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class Sdet_HW_14_09_2023_Equal_digit_count {

	/*
	 * https://leetcode.com/problems/check-if-number-has-equal-digit-count-and-digit-value/description/
	#pseudocode
	----------
	i/p String Array s, o/p int count

i/p String num, o/p boolean
initialize int i=0; returnCount=0;
using another for loop from i=0, upto num.length
inside loop create another for loop from j=0, upto num.length
and check using if condition the i value is equal to (chat to int)j then increment the count
outside loop using checks (chat to int)num[i]==count if yes then returnCount increment by 1,and reset the count=0
ouside the loop checks returnCount==num.length then return true

	 */
	public boolean digit_count(String num) {
		int count=0;
		int returnCount=0;

		for (int i = 0; i < num.length(); i++) {
			for(int j= 0; j < num.length(); j++){ 
				if(i==Character.getNumericValue(num.charAt(j))){
					count++;
				}
			}
			if (Character.getNumericValue(num.charAt(i))==count) {
				returnCount++;
				count=0;
			}
		}
		return (returnCount==num.length());
	}

	@Test
	public void digit_countPositive() {
		boolean actual=digit_count("1210");
		boolean expected =true;
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void digit_countPositive1() {
		boolean actual=digit_count("030");
		boolean expected =false;
		Assert.assertEquals(expected, actual);
	}
}
