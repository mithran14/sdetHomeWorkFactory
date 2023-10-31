package mandatoryHoweWork_Oct4thWeek;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class Oct24_HW_MajorityElement {
	public int majorityElement(int[] nums) {
		int tempMax=0;
		int count =0;
		for(int i=0;i<nums.length;i++){
			if(count==0){
				tempMax=nums[i];
			}
			if(tempMax==nums[i]){
				count++;
			}
			else{
				count--;
			}
		}
		return tempMax;
	}

	@Test
	public void test()
	{
		Assert.assertEquals(1, majorityElement( new int[]{0,0,0,1,1,1,1,1}));
	}
	@Test
	public void test1()
	{
		Assert.assertEquals(-5, majorityElement( new int[]{-5,-5,-4,-4}));
	}
	@Test
	public void test3()
	{
		Assert.assertEquals(1, majorityElement( new int[]{0,1,1}));

	}
}
