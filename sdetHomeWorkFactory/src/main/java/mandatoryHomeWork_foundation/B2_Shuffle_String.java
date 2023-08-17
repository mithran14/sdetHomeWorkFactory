package mandatoryHomeWork_foundation;

import org.junit.Assert;
import org.junit.Test;

public class B2_Shuffle_String {
	
	/*

	 https://leetcode.com/problems/shuffle-string/description/
	 
	Shuffle String

	You are given a string s and an integer array indices of the same length. 
	The string s will be shuffled such that the character at the ith position moves to indices[i] in the shuffled string.

	Return the shuffled string.

	#pseudocode
	----------
	#initialize Strig S,int num[]
	#calculate the length and stored in length
	#initialize the new charArray
	#using for loop iterate from 0, find the strig character using charAt index, stored in new charArray
	using num index indices
	#convert the new charArray into string using foreach
	#return the String str value

	 */

	public String shuffle_String(String S, int[] num)
	{
		int length = S.length();
		char[] charArray1 =new char[length];
		String str="";
		
		for (int i = 0; i < length; i++) 
		{
			charArray1[num[i]]=S.charAt(i);
		}
		
		for (char c : charArray1) {
			str=str+c;
		}
		
		return str;
	}
	@Test
	public void shuffle_StringPositive()
	{
		String actual=shuffle_String("codeleet",new int[] {4,5,6,7,0,2,1,3});
		 String expected ="leetcode";
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void shuffle_StringPositive1()
	{
		String actual=shuffle_String("abc",new int[] {0,1,2});
		 String expected ="abc";
		Assert.assertEquals(expected, actual);
	}

}


