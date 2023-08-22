package dailyConnectAssignment;

import org.junit.Assert;
import org.junit.Test;

public class sdet_22_08_2024{
	
	public boolean anagram(String a, String b) 
	{
		if (a.length()!=b.length()) {
			return false;
		}
		
		String a1=a.toLowerCase();
		String b1=b.toLowerCase();

		int count=0;
		for (int i = 0; i < a1.length(); i++) 
		{
			char c = a1.charAt(i);
			if (b1.contains(String.valueOf(c))) {
				b1 = b1.replaceFirst(String.valueOf(c), "");
				count++;
			}
		}
		return (a.length()==b.length() && a1.length()==count) ;
		
	}

	@Test
	public void reversingAnIntegerPositive()
	{
		boolean actual=anagram("anagram","margana");
		boolean expected =true;
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void reversingAnIntegerPositive1()
	{ 
		boolean actual=anagram("anagramm","marganaa");
		boolean expected =false;
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void reversingAnIntegerPositive2()
	{ 
		boolean actual=anagram("Aabb","AAbba");
		boolean expected =false;
		Assert.assertEquals(expected, actual);
	}
}


