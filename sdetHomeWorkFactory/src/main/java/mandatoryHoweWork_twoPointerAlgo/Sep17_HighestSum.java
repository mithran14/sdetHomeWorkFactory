package mandatoryHoweWork_twoPointerAlgo;

import org.junit.Assert;
import org.junit.Test;

public class Sep17_HighestSum {

	/*
	#initialize int i=0; int max=Integer.MIN_VALUE; currentSum=0;
	using while loop set condition (i<k) add num[i++] values in currentSum
	#using while loop set condition (i<nums.length) 
	#check the max values using Math.max[currenrtSum, max]
	#adding the nums[i]-nums[i-k] values added in the currentSum
	#then return Math.max
	 */
	//Time complexity -  O[N]

	public int HighestSum (int[] nums,int k) {
		int max=Integer.MIN_VALUE;
		int i=0,currentSum = 0;
		  while(i < k)
              currentSum += nums[i++];
		  while( i < nums.length)
          {
              max = Math.max(currentSum, max);
              currentSum += nums[i] - nums[i-k];
              i++;
          }
          return Math.max(currentSum, max);
	}
	
	@Test
	public void zeroPositive1() {
		int actual=HighestSum (new int[]{1,5,9,2,6,9},3);
		int expected = 17;
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void zeroPositive2() {
		int actual=HighestSum (new int[]{-1,-1,-2,1},3);
		int expected = -2;
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void zeroPositive4() {
		int actual=HighestSum (new int[]{1,-1,10,-3,-4,10},3);
		int expected = 10;
		Assert.assertEquals(expected, actual);
	}


}
