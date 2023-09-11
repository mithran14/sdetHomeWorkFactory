package mandatoryHomeWork_foundation;

import org.junit.Assert;
import org.junit.Test;

public class Sdet_HW_10_09_2023_faulty_keyboard {
	/*
	 * https://leetcode.com/problems/faulty-keyboard/submissions/
	 * 
	#using while loop set the condition s.comtains("i")
	#inside the while loop get the Substring1 and Substring2
	#Substring1 from 0 to first i value
	#using String Buffer reverse the Substring1, Substring2 get the remaining characters from s
	#add the both reversed StringBuffer and Substring2 again the loop continues
	#return the String s
	
	Time complexity // O(n*m)

	 */
	public String faulty_keyboard(String s) {
	
		while(s.contains("i"))
		{
		String Substring1=s.substring(0,s.indexOf("i"));
		StringBuffer sb=new StringBuffer(Substring1);
		sb.reverse();
		String Substring2=s.substring(s.indexOf("i")+1,s.length());
		s=sb.toString()+Substring2;
		}
		return s;
	}

	@Test
	public void faulty_keyboardPositive0()
	{
		String actual=faulty_keyboard ("string" );
		String expected = "rtsng";
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void faulty_keyboardPositive1()
	{
		String actual=faulty_keyboard ("poiinter" );
		String expected = "ponter";
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void faulty_keyboardPositive2()
	{
		String actual=faulty_keyboard ("marivigneshi");
		String expected = "hsengramv";
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void faulty_keyboardPositive3()
	{
		String actual=faulty_keyboard ("khali");
		String expected = "lahk";
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void faulty_keyboardPositive4()
	{
		String actual=faulty_keyboard ("oiio");
		String expected = "oo";
		Assert.assertEquals(expected, actual);
	}

}