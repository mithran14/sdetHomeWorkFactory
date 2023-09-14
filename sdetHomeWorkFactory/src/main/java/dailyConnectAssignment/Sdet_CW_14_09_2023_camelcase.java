package dailyConnectAssignment;

import org.junit.Assert;
import org.junit.Test;

public class Sdet_CW_14_09_2023_camelcase {
	/*
https://www.hackerrank.com/challenges/camelcase/problem
	 */

	public static int camelcase(String s) {
		int count=1;
		for (int i = 0; i < s.length(); i++) {
			if (Character.isUpperCase(s.charAt(i))) {
				count++;
			}
		}
		return count;
	}
	@Test
	public void unique_emailPositive0()
	{

		int actual=camelcase("saveChangesInTheEditor");
		int expected = 5;
		Assert.assertEquals(expected, actual);
	}


}