package mandatoryHoweWork_twoPointerAlgo;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class Sep18_CW_distinct {

	/*
	i/p nums[] and arr[]
find the length int l=Math.min(nums.length,arr.length)
intialie count =0;
using for loop from i=0 upto l or using while loop set the condition i<l for two pointer
inside for loop from j=0 upto l
check the nums[i]==arr[j] then increment the count by 1
	 */
	//Time complexity -  O[N2]

	public int bruitforce (int[] nums,int[] arr) {
		int count=0;
		int l=Math.min(nums.length,arr.length);
		for(int i=0;i<l;i++){
			for(int j=0;j<l;j++){
				if(nums[i]==arr[j]) count++;
			}
		}
		return count;
	}
	public int twopointer (int[] nums,int[] arr) {
		int i=0, count=0;
		Arrays.sort(arr);
		Arrays.sort(nums);
		int l=Math.min(nums.length,arr.length);
		while(i<l){
				if(nums[i]==arr[i]) count++;
		
			i++;
		}
		return count;
	}
	@Test
	public void Positive() {
		int actual=bruitforce (new int[]{1,2,3,4},new int[]{1,2,3,5});
		int expected = 3;
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void Positive1() {
		int actual=twopointer (new int[]{1,2,3,4},new int[]{1,2,3,5});
		int expected = 3;
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void Positive2() {
		int actual=bruitforce (new int[]{-1,2},new int[]{2,1});
		int expected = 1;
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void Positive3() {
		int actual=twopointer (new int[]{-1,2},new int[]{2,1});
		int expected = 1;
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void Positive4() {
		int actual=bruitforce (new int[]{-1,2},new int[]{3,4});
		int expected = 0;
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void Positive5() {
		int actual=twopointer (new int[]{-1,2},new int[]{3,4});
		int expected = 0;
		Assert.assertEquals(expected, actual);
	}
}
