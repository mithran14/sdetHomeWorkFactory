package dailyConnectAssignment;

import org.junit.Assert;
import org.junit.Test;

public class Sdet_CW_14_09_2023_sumOfSquares {
	/*
https://leetcode.com/problems/sum-of-squares-of-special-elements/
	 */

	 public int sumOfSquares(int[] nums) {
	     int sum=0;   
		 int n=nums.length;
	     for (int i = 1; i <=n; i++) {
			if (n%i==0) {
				sum+=nums[i-1]*nums[i-1];
			}
		}
		 return sum;
	    }
	@Test
	public void compareTripletsPositive0()
	{
		int actual=sumOfSquares(new int[] {2,7,1,19,18,3});
		int expected = 63;
		Assert.assertEquals(expected, actual);
	}


}