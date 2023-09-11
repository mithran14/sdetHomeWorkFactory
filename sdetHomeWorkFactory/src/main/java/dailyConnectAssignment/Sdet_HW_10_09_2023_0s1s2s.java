package dailyConnectAssignment;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class Sdet_HW_10_09_2023_0s1s2s {
	/*
	 * 	 
	#initialize count1=0, count2=0;
	#using for loop check how many 1s and 2s are in the array, if 1s in increment the count1++
	#if 2s in then increment count2++
	#clear the array.
	#using for loop from i=s.length()-count1-count2 upto s.length-count2 incrementing i++, s[i]=1;
	#using for loop from i=s.length()-count2 upto i+count1 incrementing i++, s[i]=2;
	#return the array s

	Time complexity // O(n)

	 */

	public int[] s1s2s(int[] s) {
		int count1=0; 
		int count2=0;
		for(int i=0; i<s.length;i++)
		{
			if(s[i]==1)
			{
				count1++;
			}
			else if(s[i]==2)
			{
				count2++;
			}
		}
		Arrays.fill(s, 0);
		for(int i=s.length-count1-count2; i<s.length-count2;i++)
		{
			s[i]=1;
		}
		for(int i=s.length-count2; i<s.length;i++)
		{
			s[i]=2;
		}
		return s;
	}

	@Test
	public void faulty_0s1s2sPositive0()
	{
		int[] actual=s1s2s(new int[]{0,2,1,0,0,2,1,1,2,0});
		int[] expected = {0,0,0,0,1,1,1,2,2,2};
		Assert.assertArrayEquals(expected, actual);
	}

}