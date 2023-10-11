package mandatoryHoweWork_Oct2nWeek;

import org.junit.Assert;
import org.junit.Test;

public class SeniorCitizens
 {
	/*
	#pseudocode
	----------
	#initialize String s,count=0
	#using for loop set the condition <s.length
	#find the ages in each array using substring, it will return the string
	#change the string into integer and checks the int value is greater than 60 
	#and count the how many passengers are greater than 60
	#return the int count value

	 */

	public int seniorCitizens(String[] s)
	{
		int count=0;
		for (int j = 0; j < s.length; j++) {
			String sz =s[j].substring(11,13);
			if (Integer.parseInt(sz)>60) 
			{
				count++;
			}
		}
		return count;
	}
	@Test
	public void seniorCitizensPositive()
	{
		int actual=seniorCitizens(new String[]{"7868190130M7522","5303914400F9211","9273338290F4010"});
		int expected =2;
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void seniorCitizensPositive1()
	{
		int actual=seniorCitizens(new String[]{"7868190130M6022","5303914400F5911","9273338290F6110"});
		int expected =1;
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void seniorCitizensPositive2()
	{
		int actual=seniorCitizens(new String[]{"7868190130M1522","5303914400F1211","9273338290F4010"});
		int expected =0;
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void seniorCitizensPositive3()
	{
		int actual=seniorCitizens(new String[]{"7868190130M6022","5303914400F6011","9273338290F6010"});
		int expected =0;
		Assert.assertEquals(expected, actual);
	}
}


