package mandatoryHomeWork_foundation;

import org.junit.Assert;
import org.junit.Test;

public class Ba1_Jewels_and_stones 
{
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
	#to change the charArray and stored in charArray1,charArray
	#create 2 for loops, using outer for loop initialize i value upto < charArray.length
	#using inner for loop starts from 0 and upto <charArray1.length and incrementing j 
	#check the elements in 1 is equal to j elements increment the count variable
	#end of the loop return count int value.

	 */
	
	public int jewels_and_stones(String s,String n)
	{
		char[] charArray = s.toCharArray();
		char[] charArray1 = n.toCharArray();
		int count=0;
		for (int i = 0; i < charArray.length; i++) 
		{
			for (int j = 0; j < charArray1.length; j++) 
			{
				if (charArray[i]==charArray1[j]) 
				{
					count++;
				}
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


