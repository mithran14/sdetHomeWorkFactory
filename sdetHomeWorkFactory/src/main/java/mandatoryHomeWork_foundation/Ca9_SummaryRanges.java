package mandatoryHomeWork_foundation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;


public class Ca9_SummaryRanges {

	
	/*
	 https://leetcode.com/problems/self-dividing-numbers/description/

	Summary Ranges

	You are given a sorted unique integer array nums.

	A range [a,b] is the set of all integers from a to b (inclusive).

	Return the smallest sorted list of ranges that cover all the numbers in the array exactly. That is, each element of nums is covered by exactly one of the ranges, and there is no integer x such that x is in one of the ranges but not in nums.

	Each range [a,b] in the list should be output as:

	"a->b" if a != b
	"a" if a == b

	Example 1:

	Input: nums = [0,1,2,4,5,7]
	Output: ["0->2","4->5","7"]
	Explanation: The ranges are:
	[0,2] --> "0->2"
	[4,5] --> "4->5"
	[7,7] --> "7"
	Example 2:

	Input: nums = [0,2,3,4,6,8,9]
	Output: ["0","2->4","6","8->9"]
	Explanation: The ranges are:
	[0,0] --> "0"
	[2,4] --> "2->4"
	[6,6] --> "6"
	[8,9] --> "8->9"

	#pseudocode
	----------
	Initialization:

	#Initialize an empty ArrayList called list .
	#Check if the input array nums is empty. If it is, return the empty list -> list.
	#Inside for loop, assign first element to a
	#Start an inner while loop with the condition i + 1 < nums.length and with the check nums[i + 1] - nums[i] == 1. 
		This loop finds consecutive numbers in the array.Increment i ++	
	#After the inner while loop, check if the initial value a is not equal to the current value at nums[i]. 
		This indicates a range of consecutive numbers.
	#If they are not equal, add a range to the list in the format "start->end".
	#If they are equal, it means there's a single number in the range. Add just that number to the list.
	#Return Result:

	 */
	  public List<String> summaryRanges(int[] nums) {
		     List<String> list = new ArrayList<>();
		     if(nums.length == 1) {
		         list.add(nums[0] + "");
		         return list;
		     }   
		     for(int i = 0; i < nums.length; i ++) {
		         int a = nums[i];
		         while (i + 1 < nums.length && nums[i + 1] == nums[i] + 1) {
		        	    i++;
		        	}
		         if(a != nums[i]) 
		             list.add(a + "->" + nums[i]);
		         else
		             list.add(a + "");
		     }
		     return list;
	}
	@Test
	public void summary_rangesPositive()
	{
		List<String> actual=summaryRanges(new int[] {0,2,3,4,5,6,8,9});
		List<String> expected = Arrays.asList("0","2->6","8->9");
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void summary_rangesPositive1()
	{
		List<String> actual=summaryRanges(new int[] {0,1,2,4,5,7});
		  List<String> expected = Arrays.asList("0->2", "4->5", "7");
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void summary_rangesEdge()
	{
		List<String> actual=summaryRanges(new int[] {});
		  List<String> expected = Arrays.asList();
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void summary_rangesNegative()
	{
		List<String> actual=summaryRanges(new int[] {-2,-1,0,1});
		  List<String> expected = Arrays.asList("-2->1");
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void summary_rangesNegative1()
	{
		List<String> actual=summaryRanges(new int[] {-2,-1,1});
		  List<String> expected = Arrays.asList("-2->-1","1");
		Assert.assertEquals(expected, actual);
	}
}

