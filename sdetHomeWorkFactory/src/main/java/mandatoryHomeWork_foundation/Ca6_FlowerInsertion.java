package mandatoryHomeWork_foundation;

import org.junit.Assert;
import org.junit.Test;

public class Ca6_FlowerInsertion {

	/*
	 https://leetcode.com/problems/can-place-flowers/

	Can Place Flowers

You have a long flowerbed in which some of the plots are planted, and some are not. However, flowers cannot be planted in adjacent plots.

Given an integer array flowerbed containing 0's and 1's, where 0 means empty and 1 means not empty, and an integer n, return true if n new flowers can be planted in the flowerbed without violating the no-adjacent-flowers rule and false otherwise.

Example 1:

	Input: flowerbed = [1,0,0,0,1], n = 1
	Output: true
Example 2:

	Input: flowerbed = [1,0,0,0,1], n = 2
	Output: false

	#pseudocode
	----------
	#Output: boolean

		#Iterate the array till last element
		#Check if the element is zero
		#If yes take the n-1 element in previous and n+1 element in next
		# to include last and first element(they don't have next and previous element respectively so, assuming them to be zero is fine)
		#use ternary operator to set 0 to the previous element of 1st & next element of last 
		#Check if previous and next equals to 0
		#if yes, plant 1 in the index and increment count
		#return count==n
	
	 */

	public boolean flower(int[] a, int n)
	{
		int count=0;

		for (int i = 0; i < a.length&& count < n; i++) 
		{
			if(a[i]==0) 
			{
				int next = (i==a.length-1)?0:a[i+1];
				int previous = (i==0)?0:a[i-1];
				if(previous==0&&next==0) 
				{
					a[i]=1;
					count++;
				}
			}
		}
		return count==n;
	}
	@Test
	public void flowerPositive()
	{
		boolean actual=flower(new int[] {1,0,0,0,0,0,1}, 2);
		boolean expected = true;
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void flowerPositive1()
	{
		boolean actual=flower(new int[] {1,0,0,0,1}, 2);
		boolean expected = false;
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void flowerPositive2()
	{
		boolean actual=flower(new int[] {0,0,1,1,1}, 1);
		boolean expected = true;
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void flowerPositive3()
	{
		boolean actual=flower(new int[] {0,0,0,0,0}, 3);
		boolean expected = true;
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void flowerPositive4()
	{
		boolean actual=flower(new int[] {0,0,1,0,1},1);
		boolean expected = true;
		Assert.assertEquals(expected, actual);
	}
}
