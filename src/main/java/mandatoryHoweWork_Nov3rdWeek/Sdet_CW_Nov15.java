package mandatoryHoweWork_Nov3rdWeek;

import org.junit.Assert;
import org.junit.Test;

public class Sdet_CW_Nov15 {
	
	// maximum number of consecutive ones
	// index to be replaced to get the maximum sequence
	// current consecutive ones count
	// index of the previous zero encountered

	 public static int findIndexToReplace(int[] arr) {
	        int n = arr.length;
	        int maxCount = 0; 
	        int maxIndex = -1; 

	        int count = 0; 
	        int prevZeroIndex = -1; 

	        for (int i = 0; i < n; i++) {
	            if (arr[i] == 1) {
	                count++;
	            } else {
	                count = i - prevZeroIndex;
	                prevZeroIndex = i;
	            }

	            if (count > maxCount) {
	                maxCount = count;
	                maxIndex = prevZeroIndex;
	            }
	        }

	        return maxIndex;
	    }
	 
	 @Test
		public void Positive()
		{
			int actual=findIndexToReplace(new int[] {0, 0, 1, 0, 1, 1, 1, 0, 1, 1});
			int expected =7;
			Assert.assertEquals(expected, actual);
		}
		@Test
		public void Positive1()
		{
			int actual=findIndexToReplace(new int[] {1, 1, 1, 1, 1});
			int expected =-1;
			Assert.assertEquals(expected, actual);
		}
}
