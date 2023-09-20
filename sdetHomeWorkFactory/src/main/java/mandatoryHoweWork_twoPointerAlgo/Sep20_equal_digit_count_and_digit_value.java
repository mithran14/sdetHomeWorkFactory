package mandatoryHoweWork_twoPointerAlgo;

import org.junit.Assert;
import org.junit.Test;

public class Sep20_equal_digit_count_and_digit_value {

	/*
	 *https://www.codechef.com/problems/NAME2
	 * 
	i/p String num , o/p boolean
	initialize count=0, totalCount=0;
	using for loop from i=0;i<num.length i++
	inside for loop using another for loop from j=0; j<num.length;j++
	using if check(i==Character.getNumericValue(num.charAt(j)))count++;
	outside the for check (Character.getNumericValue(num.charAt(i))==count)
	if yes then totalCount increment by 1, then reset the count=0
	outside the for loop check totalCount==num.length return true

	 */

	public boolean name(String num) {
		int count=0, totalCount=0;
		for (int i = 0; i < num.length(); i++) {
			for (int j = 0; j < num.length(); j++) {
				if(i==Character.getNumericValue(num.charAt(j))) count++;
			}
			if(Character.getNumericValue(num.charAt(i))==count) {
				totalCount++; count=0;
			}
		}
		return (totalCount==num.length());
	}

	@Test
	public void TwoPositive0() {
		boolean actual=name ("1210");
		boolean expected = true;
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void TwoPositive3() {
		boolean actual=name ("030");
		boolean expected = false;
		Assert.assertEquals(expected, actual);
	}


}
