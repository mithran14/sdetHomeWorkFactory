package mandatoryHomeWork_foundation;

import org.junit.Assert;
import org.junit.Test;

public class Ca2_DayOfYear {
	/*
	https://leetcode.com/problems/day-of-the-year/

	Day of the Year

Given a string date representing a Gregorian calendar date formatted as YYYY-MM-DD, return the day number of the year.

Example 1:

	Input: date = "2019-01-09"
	Output: 9
	Explanation: Given date is the 9th day of the year in 2019.
Example 2:

	Input: date = "2019-02-10"
	Output: 41

	#pseudocode
	----------
	#find the Date,month, year using substring and converted into int variable
	#initialize the int array for number of days in month
	#find the year is leap or not, if the year is leap then change the feb month or int[2] into 29
	#initialie the dayOfYear=0;
	#using for loop starts from 1, and the values in the array stored in dayOfYear
	#Add the days with dayOfYear, return dayOfYear.
	 */

	public int dayOfYear(String date) {

		int year = Integer.parseInt(date.substring(0, 4));
		int mm = Integer.parseInt(date.substring(5, 7));
		int dd = Integer.parseInt(date.substring(date.lastIndexOf("-")+1, date.length()));

		int[] daysInMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

		if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
			daysInMonth[2] = 29;
		}

		int dayOfYear = 0;
		for (int i = 1; i < mm; i++) {
			dayOfYear += daysInMonth[i];
		}
		dayOfYear += dd;

		return dayOfYear;
	}

	@Test
	public void dayOfYearPositive()
	{
		int actual=dayOfYear("2019-01-09");
		int expected = 9;
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void dayOfYearPositive1()
	{
		int actual=dayOfYear("1904-03-01");
		int expected = 61;
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void dayOfYearPositive2()
	{
		int actual=dayOfYear("1904-02-29");
		int expected = 60;
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void dayOfYearPositive3()
	{
		int actual=dayOfYear("2023-08-09");
		int expected = 221;
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void dayOfYearPositive4()
	{
		int actual=dayOfYear("2023-01-01");
		int expected = 1;
		Assert.assertEquals(expected, actual);
	}
}
