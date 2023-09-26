package mandatoryHoweWork_twoPointerAlgo;

import org.junit.Assert;
import org.junit.Test;

public class Sep25_CW_minimumRecolors {

	/*
	 * https://leetcode.com/problems/minimum-recolors-to-get-k-consecutive-black-blocks/

	#initialize int left=0,right=k,count=0,minCount=Integer.MAX_VALUE;
	#using while loop condition left<k
	#using if condition check the character if 'B' then increase the count & left by 1
	#using another while loop right<=s.length()
	#check the k-count & minCount and get the min value;
	#then check charAt(right-left) character is 'B' then count decrement by 1 
	#using another if condition check charAt(right) character is 'B' then count & right increment by 1 
	#else if increment the right by 1. 
	#return the minCount

	//Time complexity - O[N]
	 */



	public int consecutive_ones (String s,int k){

		int left=0,right=k,count=0,minCount=Integer.MAX_VALUE;

		while(left<k){
			if(s.charAt(left)=='B') count++;
			left++;
		}
		while(right<=s.length()){
			minCount=Math.min(minCount,k-count);
			if (count >= k){
				return 0;
			}
			if ( right>=s.length()) break;
			if(s.charAt(right-left)=='B'){
				count--;
			}
			if(s.charAt(right)=='B'){
				count++;
				right++;
			}
			else{
				right++;
			}
		}
		return minCount;
	}

	@Test
	public void TwoPositive0() {
		int actual=consecutive_ones("WBBWWBBWBW",7);
		int expected = 3;
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void TwoPositive1() {
		int actual=consecutive_ones("WBWBBBW",2);
		int expected = 0;
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void TwoPositive2() {
		int actual=consecutive_ones("WBBWWBBWBW",4);
		int expected = 1;
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void TwoPositive3() {
		int actual=consecutive_ones("WBBWWBBWBW",3);
		int expected = 1;
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void TwoPositive4() {
		int actual=consecutive_ones("WBBWWBBWBW",1);
		int expected = 0;
		Assert.assertEquals(expected, actual);
	}
}
