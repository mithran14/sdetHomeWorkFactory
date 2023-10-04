package mandatoryHoweWork_Oct1stWeek;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Test;
import org.testng.Assert;

public class Oct04_HW_jewels_and_stones {

	/*
	 https://leetcode.com/problems/jewels-and-stones/description/
	 
Jewels and Stones

You're given strings jewels representing the types of stones that are jewels, and stones representing the stones you have.
Each character in stones is a type of stone you have. You want to know how many of the stones you have are also jewels.

Letters are case sensitive, so "a" is considered a different type of stone from "A".


Example 1:

	Input: jewels = "aA", stones = "aAAbbbb"
	Output: 3
Example 2:

	Input: jewels = "z", stones = "ZZ"
	Output: 0

	#pseudocode
	----------
	#initialize s,n, count
	#create  for loops,  initialize i value upto < k.length	
	using if check k characters in the s string, if yes increment the count by 1
	#return count int value.

	 */
	
	public int jewels_and_stones(String s,String k)
	{
		int count=0;
		for (int i = 0; i < k.length(); i++) {
			if( s.contains(String.valueOf(k.charAt(i)))) 
			{
				count++;
			}
		}
		return count;
	}
	@Test
	public void jewels_and_stonesPositive()
	{
		int actual=jewels_and_stones("aA","aAAbbbb");
		int expected =3;
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void jewels_and_stonesPositive1()
	{
		int actual=jewels_and_stones("z","ZZ");
		int expected =0;
		Assert.assertEquals(expected, actual);
	}

}