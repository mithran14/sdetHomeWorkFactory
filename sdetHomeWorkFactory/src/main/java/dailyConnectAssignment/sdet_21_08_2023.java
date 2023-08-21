package dailyConnectAssignment;

import org.junit.Assert;
import org.junit.Test;

public class sdet_21_08_2023{
	public boolean reversingAnInteger(int num)
	{
		String num1="";
		String valueOf = String.valueOf(num);
			for (int j = valueOf.length()-1; j >=0; j--) 
			{
				num1+=valueOf.charAt(j)-'0';
			}
		int parseInt = Integer.parseInt(num1);
		String output = Integer.toString(parseInt);
		num1="";
		for (int j = output.length()-1; j >=0; j--) 
		{
			num1+=output.charAt(j)-'0';
		}

		if (num==Integer.parseInt(num1)) {
			return true;
		}
		else {
			return false;
		}
		
	}
	@Test
	public void reversingAnIntegerPositive()
	{
		boolean actual=reversingAnInteger(202100);
		boolean expected =false;
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void reversingAnIntegerPositive1()
	{ 
		boolean actual=reversingAnInteger(2021);
		boolean expected =true;
		Assert.assertEquals(expected, actual);
	}

}

