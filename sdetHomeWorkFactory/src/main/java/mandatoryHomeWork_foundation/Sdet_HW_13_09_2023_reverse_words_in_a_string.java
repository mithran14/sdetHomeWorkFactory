package mandatoryHomeWork_foundation;

import org.junit.Assert;
import org.junit.Test;

public class Sdet_HW_13_09_2023_reverse_words_in_a_string {
	/*
	 * https://leetcode.com/problems/reverse-words-in-a-string-iii/description/
	 * 
#i/p String s, o/p String s
#using split method (" ") and stored in split String array
#using for each loop get the first word 
#inside that using for loop from that word length-1 upto >=0 i--
#get the each character and stored in String s.

	Time complexity // O(n))

	 */

	public String reverse_words(String s){
		String[] split=s.split(" ");
		 StringBuilder result = new StringBuilder();
		
		for(String word : split)
		{
			for(int i=word.length()-1; i>=0;i--)
			{
				result.append(word.charAt(i));
			}
			result.append(" ");
		}
		
		return result.toString().trim();
	}

	@Test
	public void reverse_wordsPositive0()
	{
		String actual=reverse_words("Let's take LeetCode contest");
		String expected = "s'teL ekat edoCteeL tsetnoc";
		Assert.assertEquals(expected, actual);
	}


}