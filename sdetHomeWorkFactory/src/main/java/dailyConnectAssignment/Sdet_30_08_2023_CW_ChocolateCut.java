package dailyConnectAssignment;

import org.junit.Assert;
import org.junit.Test;

public class Sdet_30_08_2023_CW_ChocolateCut {

	public int chocolateCut(int k) {

		int o=(k-(k/2))*(k/2);
		return o;
	}
	@Test
	public void chocolateCutPositive()
	{
		int actual=chocolateCut(5);
		int expected =6;
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void chocolateCutPositive1()
	{
		int actual=chocolateCut(6);
		int expected =9;
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void chocolateCutPositive2()
	{
		int actual=chocolateCut(7);
		int expected =12;
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void chocolateCutPositive3()
	{
		int actual=chocolateCut(8);
		int expected =16;
		Assert.assertEquals(expected, actual);
	}
}
