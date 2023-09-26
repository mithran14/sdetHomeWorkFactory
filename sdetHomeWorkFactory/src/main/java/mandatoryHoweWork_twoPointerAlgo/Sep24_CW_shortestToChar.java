package mandatoryHoweWork_twoPointerAlgo;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class Sep24_CW_shortestToChar {

	/*
	 * https://leetcode.com/problems/shortest-distance-to-a-character/description/
	#i/p String S, char C and o/p int[] arr
	#initialize int left=S.length(), right=S.length();
	#using for loop set from 0;i<S.length()-1, i++
	#using if check character == C then left=0, and stored the left value in arr, increment left by 1
	#using another for loop set from i<S.length()-1 to i>=0,i--
	#using if check character == C then right=0, and stored the minimum value of arr[i],right value in arr, increment right by 1
	#retrun the arr
	//Time complexity -  O[N]
	 */

	public int[] shortestToChar (String S, char C){
		int[] arr=new int[S.length()];
		int left=S.length(), right=S.length(); 

		for(int i=0;i<S.length();i++){ //pass 1, determine distance to nearest C on the left 
			if(S.charAt(i)==C) left=0;
			arr[i]=left;
			left++;
		}
		for(int i=S.length()-1;i>=0;i--){ //pass 2, determine distance to nearest C on the right, compare with previous pass and take minimum 
			if(S.charAt(i)==C) right=0;
			arr[i]=Math.min(arr[i],right);
			right++;
		}
		System.out.println(Arrays.toString(arr));
		return arr;
	}

	@Test
	public void TwoPositive0() {
		int[] actual=shortestToChar("loveleetcode",'e');
		int[] expected = new int[] {3,2,1,0,1,0,0,1,2,2,1,0};
		Assert.assertArrayEquals(expected, actual);
	}
	@Test
	public void TwoPositive1() {
		int[] actual=shortestToChar("estimate",'e');
		int[] expected = new int[] {0,1,2,3,3,2,1,0};
		Assert.assertArrayEquals(expected, actual);
	}
	@Test
	public void TwoPositive2() {
		int[] actual=shortestToChar("stimate",'e');
		int[] expected = new int[] {6,5,4,3,2,1,0};
		Assert.assertArrayEquals(expected, actual);
	}
	@Test
	public void TwoPositive3() {
		int[] actual=shortestToChar("elolelolelole",'e');
		int[] expected = new int[] {0,1,2,1,0,1,2,1,0,1,2,1,0};
		Assert.assertArrayEquals(expected, actual);
	}
	@Test
	public void TwoPositive4() {
		int[] actual=shortestToChar("aaba",'b');
		int[] expected = new int[] {2,1,0,1};
		Assert.assertArrayEquals(expected, actual);
	}
}
