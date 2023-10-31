package mandatoryHoweWork_Oct4thWeek;

import org.junit.Test;
import org.testng.Assert;

public class Oct31_CW_removePalindromeSub {

	//leetcode.com/problems/remove-palindromic-subsequences/description/
	
	// If the string is already empty, return 0.
	// If the string is a palindrome, return 1.
	// In other cases, we can remove 'a's (left) and then 'b's (right) or vice versa.

	public int removePalindromeSub(String s) {
	    if (s.isEmpty()) {
	        return 0;
	    }
	    
	    if (isPalindrome(s)) {
	        return 1; 
	    }

	    return 2;
	}

	public boolean isPalindrome(String s) {
	    int left = 0;
	    int right = s.length() - 1;

	    while (left < right) {
	        if (s.charAt(left) != s.charAt(right)) {
	            return false;
	        }
	        left++;
	        right--;
	    }

	    return true;
	}

	@Test
	public void Positive()
	{
		int actual=removePalindromeSub("ababa");
		int expected =1;
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void Positive1()
	{
		int actual=removePalindromeSub("abb");
		int expected =2;
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void Positive2()
	{
		int actual=removePalindromeSub("baabb");
		int expected =2;
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void Positive3()
	{
		int actual=removePalindromeSub("ab");
		int expected =2;
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void Positive4()
	{
		int actual=removePalindromeSub("aaaaa");
		int expected =1;
		Assert.assertEquals(expected, actual);
	}
}
