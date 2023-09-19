package mandatoryHoweWork_twoPointerAlgo;

import org.junit.Assert;
import org.junit.Test;

public class Sep18_HW_Sort_array_by_parity {

	/*
	 * https://leetcode.com/problems/sort-array-by-parity/
	#i/p nums[] and initialize arr[nums.length]
	#initialize int i=0,j=nums.length-1, iL=0, IR=nums.length-1;
	#using while loop set condition i<num.length and j>=0
	#using if check the value is even, yes then add the value into arr[iL] and increment iL by 1
	#else increment the i by 1
	#using if check the value is odd, yes then add the value into arr[iR] and decrement iL by 1
	#else decrement the j by 1
	#return the arr
	//Time complexity -  O[N2]
	 */

	public int[] parity (int[] nums){
		int i=0,j=nums.length-1,iL=0,iR=nums.length-1;
		int[] arr=new int[nums.length];
		while(i <nums.length && j>=0){
			if(nums[i]%2==0){
				arr[iL++]=nums[i];
				i++;
			}
			else {
				i++; 
			}
			if (nums[j]%2!=0){
				arr[iR--]=nums[j];
				j--;
			}
			else{
				j--;
			}
		}
		return arr;
	}
	@Test
	public void TwoPositive0() {
		int[] actual=parity (new int[]{3,1,2,4});
		int[] expected = {2,4,3,1};
		Assert.assertArrayEquals(expected, actual);
	}
	@Test
	public void TwoPositive1() {
		int[] actual=parity (new int[]{1,2,3,4});
		int[] expected = {2,4,1,3};
		Assert.assertArrayEquals(expected, actual);
	}
	@Test
	public void TwoPositive2() {
		int[] actual=parity (new int[]{0});
		int[] expected = {0};
		Assert.assertArrayEquals(expected, actual);
	}
	@Test
	public void TwoPositive3() {
		int[] actual=parity (new int[]{3,1,7,5});
		int[] expected = {3,1,7,5};
		Assert.assertArrayEquals(expected, actual);
	}
	@Test
	public void TwoPositive4() {
		int[] actual=parity (new int[]{4,2,8,6});
		int[] expected = {4,2,8,6};
		Assert.assertArrayEquals(expected, actual);
	}


}
