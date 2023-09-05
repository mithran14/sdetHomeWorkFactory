package dailyConnectAssignment;

import org.junit.Assert;
import org.junit.Test;

public class Sdet_05_09_2023_rotate_array {

	/*
	 * https://www.codingninjas.com/studio/problems/rotate-array_1230543
	 * 
	i/p int[] arr, int s
	o/p int[]

	initialize index=0

	creating the empty int array called arr1 with same length of arr 
	using for loop start from s to arr.length and iterating the element and stored in the arr1

	using another for loop starts from 0 to s
	iterating the element and stored the arr1 remaining empty array using index++
	 */

	public int[] rotate_array(int[] arr, int s) {
		int index=0;
		int[] arr1=new int[arr.length];	
		for (int i = s; i < arr.length; i++) {
			arr1[index++]=arr[i];
		}

		for (int i = 0; i <s; i++) {
			arr1[index++]=arr[i];
		}

		return arr1;
	}
	@Test
	public void rotate_arrayPositive() {
		int[] actual=rotate_array(new int[]{7 ,5 ,2 ,11 ,2 ,43 ,1 ,1}, 2);
		int[] expected = {2, 11, 2 ,43, 1 ,1 ,7 ,5};
		Assert.assertArrayEquals(expected, actual);
	}
	@Test
	public void rotate_arrayPositive1() {
		int[] actual=rotate_array(new int[]{1,2,3,4,5}, 3);
		int[] expected = {4,5,1,2,3};
		Assert.assertArrayEquals(expected, actual);
	}
	@Test
	public void rotate_arrayPositive2() {
		int[] actual=rotate_array(new int[]{5, 6, 7 ,8}, 3);
		int[] expected = {8, 5 ,6, 7};
		Assert.assertArrayEquals(expected, actual);
	}
}
