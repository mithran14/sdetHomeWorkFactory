package dailyConnectAssignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class Sdet_CW_14_09_2023_compare_the_triplets {
	/*
https://www.hackerrank.com/challenges/compare-the-triplets/problem
	 */

	public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
		int aCount=0;
		int bCount=0;
		for (int i = 0; i < a.size(); i++){
			if(a.get(i)>b.get(i)) {
				aCount++;
			}
			else if (a.get(i)<b.get(i)){
				bCount++;
			}
		}
		return new ArrayList<>(Arrays.asList(aCount,bCount));
	}
	@Test
	public void compareTripletsPositive0()
	{
		List<Integer> actual=compareTriplets(new ArrayList<>(Arrays.asList(17, 28, 30)),new ArrayList<>(Arrays.asList(99, 16, 8)));
		List<Integer> expected = new ArrayList<>(Arrays.asList(2,1));
		Assert.assertEquals(expected, actual);
	}


}