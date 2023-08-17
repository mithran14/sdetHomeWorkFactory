package mandatoryHomeWork_foundation;

import org.junit.Assert;
import org.junit.Test;

public class Ca4_yearOfWeek
{
	/*
	 https://leetcode.com/problems/day-of-the-week/description/

Day of the Week

Given a date, return the corresponding day of the week for that date.

The input is given as three integers representing the day, month and year respectively.

Return the answer as one of the following values {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"}.

Example 1:

	Input: day = 31, month = 8, year = 2019
	Output: "Saturday"
Example 2:

	Input: day = 18, month = 7, year = 1999
	Output: "Sunday"
Example 3:

	Input: day = 15, month = 8, year = 1993
	Output: "Sunday"

	#pseudocode
	----------
	#initialize count variable=0
	#find the leap years count from 1971 to previous of given year
	#count the whole days from 1971 to previous of given year and multiply with 365 and add count
	#check this year will be leap or not, if leap then change the feb into 29 and add the daysInMonth then add the days
	#finally count %7 and return the value -1 

	 */

	public String yearOfWeek(int day, int month, int year) //10
	{
		int count=0;
		for (int i =1971 ; i < year; i++) 
		{
			if (i % 4 == 0 && (i % 100 != 0 || i % 400 == 0)) {
                count++;
            }
		}
		count=(year-1971)*365+count;
		
		int[] daysInMonth={0,31,28,31,30,31,30,31,31,30,31,30,31};
		String[] days={"Friday","Saturday","Sunday","Monday","Tuesday","Wednesday","Thursday"};

		if(year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)){
			daysInMonth[2]=29;
		}
		for(int i=1;i<month; i++){
			count+=daysInMonth[i];
		}
		//count+=day;
		return days[((count+=day)-1)%7];
	}
	@Test
	public void yearOfWeekPostive5() 
	{
		String actual=yearOfWeek(30, 9 ,2100);
		Assert.assertEquals("Thursday", actual);
	}
	
	@Test
	public void yearOfWeekPostive() 
	{
		String actual=yearOfWeek(13, 8 ,2023);
		Assert.assertEquals("Sunday", actual);
	}
	@Test
	public void yearOfWeekPostive1() 
	{
		String actual=yearOfWeek(18, 7 ,1999);
		Assert.assertEquals("Sunday", actual);
	}	
	@Test
	public void yearOfWeekPostive2() 
	{
		String actual=yearOfWeek(15, 8 ,1993);
		Assert.assertEquals("Sunday", actual);
	}
	@Test
	public void yearOfWeekPostive3() 
	{
		String actual=yearOfWeek(31, 8 ,2019);
		Assert.assertEquals("Saturday", actual);
	}
	@Test
	public void yearOfWeekPostive4() 
	{
		String actual=yearOfWeek(15, 8 ,2021);
		Assert.assertEquals("Sunday", actual);
	}
	
}


