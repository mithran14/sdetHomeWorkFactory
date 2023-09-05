package dailyConnectAssignment;

import org.junit.Assert;
import org.junit.Test;

public class Sdet_05_09_2023_largest_element {

	/*
	 * https://www.codingninjas.com/studio/problems/largest-element-in-the-array-largest-element-in-the-array_5026279
	 * 
	i/p int[] arr
	o/p int

	initialize i=0 and large=0

	using for loop j=arr.length-1 upto j>i decrementing j
	using if condition arr[i]>arr[j] && arr[i]>large  and arr[i] stored in the large and incrementing i++ 
	using if else condition arr[j]>large  and arr[j] stored in the large and incrementing i++ 
	returning the output large
	 */

	public int rotate_array(int[] arr) {
		int i=0;
		int large=0;
		for (int j = arr.length-1; j>i; j--) {
			if (arr[i]>arr[j] && arr[i]>large) {
				large=arr[i];
				i++;
			}
			else if (arr[j]>large) {
				large=arr[j];
				i++;
			}
		}
		return large;
	}
	@Test
	public void rotate_arrayPositive() {
		int actual=rotate_array(new int[]{7 ,5 ,2 ,11 ,2 ,43 ,1 ,1});
		int expected = 43;
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void rotate_arrayPositive1() {
		int actual=rotate_array(new int[]{4, 7 ,8 ,6 ,7 ,6});
		int expected = 8;
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void rotate_arrayPositive2() {
		int actual=rotate_array(new int[]{5, 9, 3, 4, 8 ,4, 3 ,10});
		int expected = 10;
		Assert.assertEquals(expected, actual);
	}
}
