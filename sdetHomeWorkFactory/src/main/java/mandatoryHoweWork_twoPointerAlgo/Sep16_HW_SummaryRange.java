package mandatoryHoweWork_twoPointerAlgo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class Sep16_HW_SummaryRange {
	/*
	initialize int i=0;
	using while loop and set i<num.length
	get the first element and stored in a;
	using another while loop and set nums[i + 1] == nums[i] + 1
	if yes hen increment i by 1
	if not match step out the while
	using if check the a is not equal to num[i] then add (a -> nums[i])
	if equal then add a ""
	return list
	 */

	public List<String> summaryRanges(int[] nums) {
		int i=0;
		List<String> list=new ArrayList<String>();
		while (i< nums.length ) {
	         int a = nums[i];
	         while (i + 1 < nums.length && nums[i + 1] == nums[i] + 1) {
	        	    i++;
	        	}
	         if(a != nums[i]) {
	             list.add(a + "->" + nums[i]);
	         }
	         else {
	             list.add(String.valueOf(a));
	         }
	         i++;
	     }
		System.out.println(list);
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
