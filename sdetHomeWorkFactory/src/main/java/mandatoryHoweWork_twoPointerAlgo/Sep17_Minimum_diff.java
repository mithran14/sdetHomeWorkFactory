package mandatoryHoweWork_twoPointerAlgo;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class Sep17_Minimum_diff {

	/*
	#initialize int min=Integer.MAX_VALUE; pointer=0;
	#sorting the array
	#using while loop set condition (i<=nums.length-k) 
	#check the minimum value like nums[pointer+k-1]-nums[pointer]
	#increment the pointer
	#return min
	 */
	//Time complexity -  O[n log n]

	public int Minimum_diff (int[] nums,int k) {
		int min=Integer.MAX_VALUE, pointer=0;
		Arrays.sort(nums);
		while(pointer<=nums.length-k){
			min=Math.min(min, nums[(pointer+k-1)]-nums[pointer]);
			pointer++;
		}
		return min;
	}
	@Test
	public void zeroPositive3() {
		int actual=Minimum_diff (new int[]{9,4,1,7},3);
		int expected = 5;
		Assert.assertEquals(expected, actual);
	}
}
