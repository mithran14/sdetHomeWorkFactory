package mandatoryHoweWork_Nov3rdWeek;


import java.util.Arrays;

import org.junit.Test;

public class Sdet_CW_Nov18_Movezeros {

	//initialize n=nums.length and index=0; 
	//using for each get the each value and check that value is non zero or not
	// if not then add the value in nums[index++]
	//using while loop check nonZeroInex is less the nums.length
	//then fill the remaining values with '0'

	@Test
	public void data()
	{
		int[] nums={0,1,0,3,12};
		movezeros(nums);
		System.out.println(Arrays.toString(nums));
	}
	@Test
	public void data1()
	{
		int[] nums={0};
		movezeros(nums);
		System.out.println(Arrays.toString(nums));
	}

	private void movezeros(int[] nums) {
		int n=nums.length;
		int index=0;

		for (int i = 0; i < n; i++) {
			if (nums[i]!=0) {
				nums[index++]=nums[i];
			}
		}
		while (index<n) {
			nums[index++]=0;
		}
	}
}


