package mandatoryHomeWork_foundation;

import org.junit.Assert;
import org.junit.Test;

public class Sdet_HW_15_09_2023_minimum_additions {

	/*
	 *https://leetcode.com/problems/minimum-additions-to-make-valid-string/
	#pseudocode
	----------
	i/p String Array word, o/p int count
initialize countSections=1;
using for loop from 0 upto word.length()-1
inside forloop, using if statement check,current character is > than the next character
then increment the count

return the count*3-length of the word;

	 */
	public int String_pair(String word) {
		int count = 1;
		for(int i=0; i<word.length()-1; i++){
			if(word.charAt(i) >= word.charAt(i+1)) {
				count++;
			}
		}
		return (3*count) - word.length();
	}

	@Test
	public void String_pairPositive() {
		int actual=String_pair("ababcabaabcc");
		int expected =6;
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void String_pairPositive1() {
		int actual=String_pair("abccc");
		int expected =4;
		Assert.assertEquals(expected, actual);
	}

}
