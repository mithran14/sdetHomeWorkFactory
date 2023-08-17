package mandatoryHomeWork_foundation;

import java.util.Arrays;
import java.util.HashSet;

import org.junit.Assert;
import org.junit.Test;

public class Bb1_IntersectionOfTwoArrays
 {

	/*
	 https://leetcode.com/problems/intersection-of-two-arrays/description/

	Intersection of Two Arrays

	Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must be unique and you may return the result in any order.

Example 1:

	Input: nums1 = [1,2,2,1], nums2 = [2,2]
	Output: [2]
	
Example 2:

	Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
	Output: [9,4]
	Explanation: [4,9] is also accepted.

	#pseudocode
	----------
	#Create two HashSet objects, set1 and set2, to store the unique elements from nums1 and nums2 respectively.
	#Iterate through the elements of nums1 and add them to set1. HashSet ensures that only unique elements are stored, 
		so duplicates are automatically eliminated.
	#Similarly, iterate through the elements of nums2 and add them to set2.
	#Create an array nums of size Math.min(set1.size(), set2.size()) to store the intersection elements.
	#Initialize an index variable to keep track of the current position in the nums array.
	#Now, for each element val in set1, check if it is also present in set2. 
		If it is, add it to the nums array at the current index position and increment the index.
	#Once all the common elements have been added to the nums array, return a subarray containing only the valid elements. 
		This is achieved using Arrays.copyOfRange(nums, 0, index).
	 */
	     public int[] intersection(int[] nums1, int[] nums2) 
	     {
	        
	        HashSet<Integer> set1 = new HashSet<Integer>();
	        HashSet<Integer> set2 = new HashSet<Integer>();
	        for(int i=0; i<nums1.length; i++)
	        {
	            set1.add(nums1[i]);
	        }
	        for(int i=0; i<nums2.length; i++)
	        {
	            set2.add(nums2[i]);
	        }
	        int[] nums = new int[Math.min(set1.size(), set2.size())];
	        int index = 0;
	        
	        for(int val : set1)
	        {
	            if(set2.contains(val))
	            {
	                nums[index] = val;
	                index++;
	            }
	        }
	        return Arrays.copyOfRange(nums, 0, index);  
	    }

	     @Test
	 	public void intersectionPositive()
	 	{
	 		int[] actual=intersection(new int[] {9,4,9,8,4},new int[] {4,9,5} );
	 		int[] expected = {4,9};
	 		Assert.assertArrayEquals(expected, actual);
	 	}

}


