package mandatoryHoweWork_Nov3rdWeek;


import org.junit.Test;

public class Sdet_CW_Nov18 {




	@Test
	public void data()
	{
		int[] nums1={1, 3, 4, 6, 7, 9};
		int[] nums2={2, 3, 5, 7, 8, 9};
		findCommonElements(nums1,nums2);
	}
	@Test
	public void data1()
	{
		int[] nums1={1, 3};
		int[] nums2={-2, 2};
		findCommonElements(nums1,nums2);
	}

	private void findCommonElements(int[] nums1, int[] nums2) {
		int left=0 ,right=0;
		boolean isMatch=false;
		
		while (left < nums1.length && right < nums2.length) {
			if(nums1[left]==nums2[right]) {
				isMatch=true;
				System.out.println(nums1[left]+" ");
				left++; 
				right++;
			}
			else if (nums1[left]<nums2[right]) {
				left++;
			}
			else {
				right++;
			}
		}
		
		if(!isMatch)	{
			System.out.println("No matches");
			
		}

	}

}
