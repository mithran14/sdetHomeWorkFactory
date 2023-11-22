package mandatoryHoweWork_Nov3rdWeek;

import org.junit.Test;

public class Sdet_CW_Nov18_maxProduct {

	//initialize max=0 & sMax=0; 
	//using for loop find the max an sMax
	//return max-1 * sMax-1


	@Test
	public void data()
	{
		int[] nums={3,4,5,2};
		maxProduct(nums);
	}
	@Test
	public void data1()
	{
		int[] nums={1,5,4,5};
		maxProduct(nums);

	}
	@Test
	public void data2()
	{
		int[] nums={10,2,5,2};
		maxProduct(nums);

	}
	

	private void maxProduct(int[] nums) {
		int max=0,sMax=0;
		for (int i = 0; i < nums.length; i++) {
			if(nums[i]>max && max==0) {
				max=nums[i];
			}	
			else if(nums[i]>=max && max>=1) {
				sMax=max;
				max=nums[i];
			}
			else {
				sMax=Math.max(nums[i], sMax);
			}
		}
		System.out.println((max-1)*( sMax-1));
	}
}


