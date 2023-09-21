package mandatoryHoweWork_twoPointerAlgo;

import java.util.HashSet;
import java.util.Set;

import org.junit.Assert;
import org.junit.Test;

public class Sep20_arithmeticTriplets {

	/*
	 *https://leetcode.com/problems/number-of-substrings-containing-all-three-characters/
	 * 
	#i/p int[] nums,int diff o/p int Count
	#creating empty Se<Integer> list
	#using for each loop 
	#using if check the list contains a-diff and a-diff *2,yes then increment the count
	#else add the element to the list
	#return count;
	 */

	public int arithmeticTriplets(int[] nums, int diff){
		int count=0;
		Set<Integer> list = new HashSet<>();
		for(int a : nums){
			if(list.contains(a-diff) && list.contains(a-diff*2)) count++;
			list.add(a);
		}
		return count;  
	}

	@Test
	public void TwoPositive0() {
		int actual=arithmeticTriplets(new int[] {0,1,4,6,7,10}, 3);
		int expected = 2;
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void TwoPositive1() {
		int actual=arithmeticTriplets(new int[] {4,5,6,7,8,9}, 2);
		int expected = 2;
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void TwoPositive2() {
		int actual=arithmeticTriplets(new int[] {0,2,4}, 2);
		int expected = 1;
		Assert.assertEquals(expected, actual);
	}
}