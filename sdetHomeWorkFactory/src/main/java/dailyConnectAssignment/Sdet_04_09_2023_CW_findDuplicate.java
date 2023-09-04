package dailyConnectAssignment;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class Sdet_04_09_2023_CW_findDuplicate
{
	public static int findDuplicate(ArrayList<Integer> arr, int n)
	{
		for(int i=0; i<n; i++){

			for(int j=i+1; j<n; j++){

				if(arr.get(i) == arr.get(j)){

					return arr.get(i);
				}
			}
		}
		return -1;
	}


	@Test
	public void findDuplicatePositive0() {
		int actual=findDuplicate(new ArrayList<>(Arrays.asList(1, 3, 4, 2, 2)),5);
		int expected =2;
		Assert.assertEquals(expected, actual);
	}

}
