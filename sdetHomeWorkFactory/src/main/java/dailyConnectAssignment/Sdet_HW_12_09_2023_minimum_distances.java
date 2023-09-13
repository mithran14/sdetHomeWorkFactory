package dailyConnectAssignment;

import java.util.Arrays;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class Sdet_HW_12_09_2023_minimum_distances {
	/*
https://www.hackerrank.com/challenges/minimum-distances/problem
	 */

	public static int minimumDistances(List<Integer> a) {
		// Write your code here
		
		int min=-1;
		int minVal=0;
		int count=0;
	
		for (int i = 0; i < a.size()-1; i++) {
			for (int j = i+1; j < a.size(); j++) {
				if (a.get(i)==a.get(j)) 
				{
					minVal=j-i;
					min=minVal;
					
				}
				if (min>minVal && count>=1) {
					min=minVal;
				}
			}
			
		}
		return min;
	}
	@Test
	public void unique_emailPositive0()
	{
		List<Integer> inputList = Arrays.asList(2, 1, 3, 4, 1, 7);
		int actual=minimumDistances(inputList);
		int expected = 3;
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void unique_emailPositive1()
	{
		List<Integer> inputList = Arrays.asList(7, 1, 3, 4, 1, 7);
		int actual=minimumDistances(inputList);
		int expected = 3;
		Assert.assertEquals(expected, actual);
	}
	

}