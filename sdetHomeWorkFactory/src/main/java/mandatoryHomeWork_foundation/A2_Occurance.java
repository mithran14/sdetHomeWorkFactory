package mandatoryHomeWork_foundation;

import org.junit.Assert;
import org.junit.Test;

public class A2_Occurance 
{
	/*
	Given a sorted array arr[] and a number x, write a function that 
	counts the occurrences of  in arr[].            
	arr[] = {1, 1, 2, 2, 2, 2, 3,},   x = 2
	output = 4
	
	#pseudocode
	----------
	#initialize integer array arr[], x, count=0
	#outerloop initialize with i & condition upto arr.length and increment the i value.
	#or using foreach loop compare i and x
	#compare the nums[i] and x value using if.
	#increment the count value if equal and stored in the count
	#return count
	#return value is int
					
	*/

	public int countOccurance(int[] arr,int x) 
	{
		int count=0;
		/*
		 for (int i : arr) 
		 { 
		 	if (i==x) 
		 	{ 
		 		count++; 
		 	} 
		 }
		 */
		for (int i = 0; i < arr.length; i++) 
		{
			if (arr[i]==x) {
				count++;
			}
		}
		
		
		return count;
	}
	
	@Test	
	public void findOccurancePostive() 
	{
		int actual=countOccurance(new int[] {1, 1, 2, 2, 2, 2, 3},2);
		Assert.assertEquals(4, actual);
	}
	@Test	
	public void findOccurancePostive1() 
	{
		int actual=countOccurance(new int[] {1, 1, 2, 2, 2, 2, 3},1);
		Assert.assertEquals(2, actual);
	}
	@Test
	public void findOccuranceNeagtive() 
	{
		int actual=countOccurance(new int[] {1, 1, 2, -2, 2, 2, 3},2);
		Assert.assertEquals(3, actual);
	}
	@Test
	public void findOccuranceNeagtive1() 
	{
		int actual=countOccurance(new int[] {1, 1, -2, -2, 2, 2, 3},-2);
		Assert.assertEquals(2, actual);
	}
	@Test
	public void findOccuranceEdge() 
	{
		int actual=countOccurance(new int[] {},1);
		Assert.assertEquals(0, actual);
	}

}
