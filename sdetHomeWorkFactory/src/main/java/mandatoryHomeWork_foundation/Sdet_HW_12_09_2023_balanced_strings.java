package mandatoryHomeWork_foundation;

import org.junit.Assert;
import org.junit.Test;

public class Sdet_HW_12_09_2023_balanced_strings {
	/*
	 * https://leetcode.com/problems/split-a-string-in-balanced-strings/description/
	 * 
	#initialize int right=0, int left=0, count=0;
	#using for loop from 0 to s.length(), i++
	#get the first character and check if R then increment right++ else left++
	#another if condition set right==left then count++;
	#return count
	
	Time complexity // O(n))

	 */

	public int balanced_strings(String s){
		int right=0;
		int left=0;
		int count=0;

		for(int i=0; i<s.length(); i++){
			if(s.charAt(i)=='R'){
				right++;
			}
			else{
				left++;
			}
			if(right==left){
				count++;
			}
		}
		return count;
	}

	@Test
	public void balanced_stringsPositive()
	{
		int actual=balanced_strings("RLRRLLRLRL");
		int expected = 4;
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void balanced_stringsPositive1()
	{
		int actual=balanced_strings("RLRRRLLRLL");
		int expected = 2;
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void balanced_stringsPositive2()
	{
		int actual=balanced_strings("LLLLRRRR");
		int expected = 1;
		Assert.assertEquals(expected, actual);
	}
}