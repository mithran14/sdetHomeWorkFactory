package mandatoryHomeWork_foundation;

import org.junit.Assert;
import org.junit.Test;

public class B7_SeniorCitizens
 {
	/*
	 https://leetcode.com/problems/length-of-last-word/
	 Senior Citizens

	You are given a 0-indexed array of strings details. 
	Each element of details provides information about a given passenger compressed into a string of length 15. 
	The system is such that:

	The first ten characters consist of the phone number of passengers.
	The next character denotes the gender of the person.
	The following two characters are used to indicate the age of the person.
	The last two characters determine the seat allotted to that person.
	Return the number of passengers who are strictly more than 60 years old.

 

Example 1:

	Input: details = ["7868190130M7522","5303914400F9211","9273338290F4010"]
	Output: 2
	Explanation: The passengers at indices 0, 1, and 2 have ages 75, 92, and 40. Thus, there are 2 people who are over 60 years old.
Example 2:

	Input: details = ["1313579440F2036","2921522980M5644"]
	Output: 0
	Explanation: None of the passengers are older than 60.

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


