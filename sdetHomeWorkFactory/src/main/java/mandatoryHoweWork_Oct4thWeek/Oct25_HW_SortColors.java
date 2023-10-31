package mandatoryHoweWork_Oct4thWeek;

import org.junit.Assert;
import org.junit.Test;

public class Oct25_HW_SortColors {
	public int[] sortColors(int[] nums) {
		int left = 0, mid = 0, right = nums.length - 1;
		while (mid <= right) {
			if (nums[mid] == 0) {
				swap(nums, left, mid);
				left++;
				mid++;
			} else if (nums[mid] == 1) {
				mid++;
			} else {
				swap(nums, mid, right);
				right--;
			}
		}
		return nums;
	}

	public void swap(int[] nums, int i, int j) {
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}

	@Test
	public void test1() {
		Assert.assertArrayEquals(new int[] { 0, 0, 0, 1, 1, 2 }, sortColors(new int[] { 1, 0, 0, 0, 1, 2 }));
	}

	@Test
	public void test2() {
		Assert.assertArrayEquals(new int[] { 1,1,2,2,2 }, sortColors(new int[] { 1, 2,2, 1, 2 }));
	}

	@Test
	public void test3() {
		Assert.assertArrayEquals(new int[] { 0,1,1,2,2 }, sortColors(new int[] { 0,1,1,2,2}));
	}

}