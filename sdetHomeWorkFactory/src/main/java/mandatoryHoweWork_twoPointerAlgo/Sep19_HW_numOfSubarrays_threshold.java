package mandatoryHoweWork_twoPointerAlgo;

import org.junit.Assert;
import org.junit.Test;

public class Sep19_HW_numOfSubarrays_threshold {

	/*
	 * https://leetcode.com/problems/number-of-sub-arrays-of-size-k-and-average-greater-than-or-equal-to-threshold/description/
	 * 
	#i/p=int[] arr, k=3,threshold =4,  o/p int count
	#initialize int i=0, count=0;
	#creating nums[] with k length adding first 3 int from arr using while(i<k) and sum+=arr[i];
	#using another while loop set the condition i<arr.length
	#using if check (sum/k >threshold) then count++
	#deleting the num[i-k-1] from sum and add arr[i]
	#continuing the loop
	#return the count
	//Time complexity -  O[N2]
	 /*

	 */

	public int numOfSubarrays(int[] arr, int k, int threshold) {
	
		int i=0,sum=0,count=0;
		while(i<k){
			sum+=arr[i];
			i++;
		}
		while(i<=arr.length){
			if(sum/k >=threshold)count++;
			if(i<arr.length) {
			sum+=arr[i]-arr[i-k];
			}
			i++;
		}
	
	return count;
}
@Test
public void TwoPositive0() {
	int actual=numOfSubarrays (new int[] {2,2,2,2,5,5,5,8},3,4);
	int expected = 3;
	Assert.assertEquals(expected, actual);
}
@Test
public void TwoPositive1() {
	int actual=numOfSubarrays (new int[] {1,1,1,1,1},2,1);
	int expected = 4;
	Assert.assertEquals(expected, actual);
}
@Test
public void TwoPositive2() {
	int actual=numOfSubarrays (new int[] {0,0,0,0},2,0);
	int expected = 3;
	Assert.assertEquals(expected, actual);
}

}
