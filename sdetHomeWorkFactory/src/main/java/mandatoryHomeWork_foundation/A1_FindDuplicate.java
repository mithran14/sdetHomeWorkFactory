package mandatoryHomeWork_foundation;

import org.junit.Assert;
import org.junit.Test;

public class A1_FindDuplicate 
{
	/*Contains Duplicate

	Given an integer array nums, 
	return true if any value appears at least twice in the array, 
	and return false if every element is distinct.

	Example 1:

	Input: nums = [1,2,3,1]
	Output: true

	Example 2:

	Input: nums = [1,2,3,4]
	Output: false

	#pseudocode
	-----------
	#initialize integer array nums[]
	#outerloop initialize with i & condition upto nums.length and increment the i value.
	#innerloop initialize with i+1 & condition upto nums.length and increment the j value.
	#inside loop compare the nums[i] and nums[j] value using if.
	#duplicate is find the loop, then return true else return false.
	#return value is boolean

	 */

	public boolean findDuplicate(int[] nums) 
	{
		for (int i = 0; i < nums.length; i++) 
		{
			for (int j = i+1; j < nums.length; j++) 
			{
				if (nums[i]==nums[j])
				{
					return true;
				}
			}
		}
		return false;
	}

	@Test	
	public void findDuplicatePostive() 
	{
		boolean actual=findDuplicate(new int[] {1,2,3,1});
		Assert.assertEquals(true, actual);
	}
	@Test	
	public void findDuplicatePostive1() 
	{
		boolean actual=findDuplicate(new int[] {1,2,3,2});
		Assert.assertEquals(true, actual);
	}
	@Test
	public void findDuplicateNeagtive() 
	{
		boolean actual=findDuplicate(new int[] {1,-2,3,2});
		Assert.assertEquals(false, actual);
	}
	@Test
	public void findDuplicateNeagtive1() 
	{
		boolean actual=findDuplicate(new int[] {1,2,3,4});
		Assert.assertEquals(false, actual);
	}
	@Test
	public void findDuplicateEdge() 
	{
		boolean actual=findDuplicate(new int[] {});
		Assert.assertEquals(false, actual);
	}
}
