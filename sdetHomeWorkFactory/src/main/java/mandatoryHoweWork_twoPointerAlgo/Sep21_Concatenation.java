package mandatoryHoweWork_twoPointerAlgo;

import org.junit.Assert;
import org.junit.Test;

public class Sep21_Concatenation {

	/*
	 *https://leetcode.com/problems/find-the-array-concatenation-value/description/ 
	 * 
	#i/p String s, o/p int ConcVal
	#initialize int  i=0,j=nums.length-1; String s="";
	#using while loop set i<=j
	#inside while loop concatenate both i and j and stored in s
	#Change s into integer and add with ConcVal then i++;j--;
	#using if check the nums.length is odd, yes then divide the length/2 and nums[nums.length/2]
	 add the value with ConcVal
	#return ConcVal;
	 */

	public long findTheArrayConcVal(int[] nums) {
		int i=0,j=nums.length-1;
		String s="";
		long ConcVal=0;
		while(i<j) {
			s=String.valueOf(nums[i])+String.valueOf(nums[j]);
			ConcVal+=Integer.parseInt(s);
			i++;j--;
		}
		if(nums.length%2!=0)
		{
			ConcVal+=nums[nums.length/2];
		}
		return ConcVal;  
	}
	@Test
	public void TwoPositive0() {
		long actual=findTheArrayConcVal (new int[] {7,52,2,4});
		long expected = 596;
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void TwoPositive1() {
		long actual=findTheArrayConcVal (new int[] {5,14,13,8,12});
		long expected = 673;
		Assert.assertEquals(expected, actual);
	}


}
