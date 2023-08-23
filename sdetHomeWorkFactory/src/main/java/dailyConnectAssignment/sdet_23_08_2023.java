package dailyConnectAssignment;

import org.junit.Assert;
import org.junit.Test;

public class sdet_23_08_2023 {

	/*
	 * pseudocode
	 * ----------
	 * initialize int shake=0;
	 * using for loop iterate upto n value
	 * calculate n-i value and stored in shake and return that
	 * 
	 */
	public static int handshake(int n) 
	{
		int shake=0;
		for (int i = 1; i <=n; i++) {
			shake+=n-i;
		}
		return shake;
	}

	@Test
	public void handshakePositive()
	{
		int actual=handshake(4);
		int expected =6;
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void handshakePositive1()
	{
		int actual=handshake(3);
		int expected =3;
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void handshakePositive2()
	{
		int actual=handshake(1);
		int expected =0;
		Assert.assertEquals(expected, actual);
	}
}
