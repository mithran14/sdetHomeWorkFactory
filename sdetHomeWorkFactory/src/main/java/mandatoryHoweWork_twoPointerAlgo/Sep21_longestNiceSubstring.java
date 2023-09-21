package mandatoryHoweWork_twoPointerAlgo;

import java.util.HashSet;
import java.util.Set;
import org.junit.Assert;
import org.junit.Test;

public class Sep21_longestNiceSubstring {

	/*
	 *https://leetcode.com/problems/number-of-substrings-containing-all-three-characters/
	 * 
	#i/p String s, o/p int totalCount
	#length of the input string s is less than 2,  returns an empty string "".
	# initializes a HashSet called set to store unique characters 
	#using for each loop input string s and adds it to the set. 
	#using for loop check, For each character at index i, it checks if both the uppercase and lowercase 
	#if yes then continue, else calls the longestNiceSubstring function
		s.substring(0, i): the substring of s from the 0 to index i
		s.substring(i + 1): substring of s from index i + 1 to the end.
	#lengths of the two substrings obtained  and returns the longer of the two (str1 or str2).
	#keep dividing the string into smaller substrings, searching for the longest "Nice" substring.
	#If no further division returns the original string s.
	 */

	 public String longestNiceSubstring(String s) {
	        if (s.length() < 2)
	            return "";
	        Set<Character> set = new HashSet<>();
	        for (char ch : s.toCharArray())
	            set.add(ch);
	        for (int i=0; i<s.length(); i++) {
	            char current = s.charAt(i);
	            if (set.contains(Character.toUpperCase(current)) && set.contains(Character.toLowerCase(current)))
	                continue;
	            String str1 = longestNiceSubstring(s.substring(0, i));
	            String str2 = longestNiceSubstring(s.substring(i + 1));
	            return str1.length() >= str2.length() ? str1 : str2;
	        }
	        return s;
	    }
	    
	@Test
	public void TwoPositive0() {
		String actual=longestNiceSubstring("abABB");
		String expected = "abABB";
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void TwoPositive1() {
		String actual=longestNiceSubstring("YazaAay");
		String expected = "aAa";
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void TwoPositive2() {
		String actual=longestNiceSubstring("Bb");
		String expected = "Bb";
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void TwoPositive3() {
		String actual=longestNiceSubstring("c");
		String expected = "";
		Assert.assertEquals(expected, actual);
	}
}
