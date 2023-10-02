package mandatoryHoweWork_twoPointerAlgo;

import org.junit.Test;
import org.testng.Assert;

public class Sep21_longestNiceSubstring {

	//ip : Stri g
	//op : String
	//Logic init  empty string ans
	//1. Run two for loops, from i=0 & j=i+1 till length of string, take subString using i and j (j+1)
	//2. Check if the sub isNice and len of sub >len of ans, if yes assign the sub to ans
	//3. Return ans

	//IsNice
	//Run a for each by converting the passed substring to char[]
	//if char is upper convert to lower and vice versa - store in char
	// if the converted char is not present in the substring passed, return false
	//return true in all other cases

	//Time complexity - O[N3]

	public String longestNiceSubstring(String s) {

		String ans = "";

		for (int i = 0; i < s.length(); i++) {
			for (int j = i + 1; j < s.length(); j++) {
				String sub = s.substring(i, j + 1);
				if (isNice(sub) && sub.length() > ans.length()) {
					ans = sub;
				}
			}
		}

		return ans;
	}

	public static boolean isNice(String s) {
		for (char c : s.toCharArray()) {
			char op = Character.isUpperCase(c) ? Character.toLowerCase(c) : Character.toUpperCase(c);
			if (s.indexOf(op) == -1) {
				return false;
			}
		}
		return true;
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
