package mandatoryHomeWork_foundation;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class Sdet_HW_11_09_2023_height_checker {
	/*
	 * https://leetcode.com/problems/height-checker/submissions/
	 * 
	#initialize count =0;
	#Arrays.copy of new array and Stored in NewArr
	#using Arrays.sort[newArr]
	#using for loop check the indices of both array if not match increment the count 
	#return the count
	
	Time complexity // O(n * log(n))

	 */

	public int height_checker(int[] height) {

		int count=0;
		int[] NewArr=Arrays.copyOf(height, height.length); //O(n)
		Arrays.sort(NewArr); // O(n * log(n))
		for(int i=0; i<height.length;i++)  //O(n)
		{
			if(height[i]!=NewArr[i])
			{
				count++;
			}
		}
		return count;
	}

	@Test
	public void faulty_height_checkerPositive0()
	{
		int actual=height_checker(new int[]{5,1,2,3,4});
		int expected = 5;
		Assert.assertEquals(expected, actual);
	}

}