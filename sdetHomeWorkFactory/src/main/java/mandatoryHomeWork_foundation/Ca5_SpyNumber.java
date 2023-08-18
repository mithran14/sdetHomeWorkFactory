package mandatoryHomeWork_foundation;

import javax.xml.stream.events.Characters;

import org.junit.Assert;
import org.junit.Test;

public class Ca5_SpyNumber
{
	/*


A number is said to be a Spy number if the sum of all the digits is equal to the product of all digits. 
Examples : 

	Input : 1412
	Output : Spy Number
	Explanation : 
	sum = (1 + 4 + 1 + 2) = 8
	product = (1 * 4 * 1 * 2) = 8
	since, sum == product == 8

	Input : 132
	Output : Spy Number
	Explanation : 
	sum = (1 + 3 + 2) = 6
	product = (1 * 3 * 2) = 6
	since, sum == product == 6

	#pseudocode
	----------
	#initialize sum,product variable1
	#using for loop and get the each element and sum it using if statment and stored in sum, product the each element and stored in product
	#check both are equal or not
	#if equal return true else false

	 */

	public boolean spyNumber(int n) //10
	{
		int sum=0;
		int product=1;
		String v = String.valueOf(n);
		for (int i = 0; i < v.length(); i++) 
		{
			int num = Character.getNumericValue(v.charAt(i));
			sum+=num;
			product*=num;
		}
		return (sum==product);
	}
	@Test
	public void spyNumberPostive() 
	{
		boolean actual=spyNumber(1142);
		Assert.assertEquals(true, actual);
	}
	@Test
	public void spyNumberPostive1() 
	{
		boolean actual=spyNumber(132);
		Assert.assertEquals(true, actual);
	}
	@Test
	public void spyNumberPostive2() 
	{
		boolean actual=spyNumber(101);
		Assert.assertEquals(false, actual);
	}
	
}


