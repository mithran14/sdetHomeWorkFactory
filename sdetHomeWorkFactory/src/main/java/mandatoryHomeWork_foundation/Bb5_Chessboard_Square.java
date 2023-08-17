package mandatoryHomeWork_foundation;

import org.junit.Assert;
import org.junit.Test;

public class Bb5_Chessboard_Square
{
	/*
	 https://leetcode.com/problems/determine-color-of-a-chessboard-square/submissions/

Determine Color of a Chessboard Square

The coordinate will always represent a valid chessboard square. The coordinate will always have the letter first, and the number second.

Example 1:

	Input: coordinates = "a1"
	Output: false
	Explanation: From the chessboard above, the square with coordinates "a1" is black, so return false.
	
Example 2:

	Input: coordinates = "h3"
	Output: true
	Explanation: From the chessboard above, the square with coordinates "h3" is white, so return true.
	
Example 3:

	Input: coordinates = "c7"
	Output: false

	#pseudocode
	----------
	#Input String value
	#initialize int val=0;
	#using the for loop
	#For loop number i in the range:
			Starts i=0; upto String length-1, incrementing i value
	#Find the character ascii value using charAt index stored in NumericValue
		using if statement the NumericValue is >96 then subtract that numericValue -96 and stored in val=NumericValue-96,
		else statement the NumericValue is >48 <96 then subtract that numericValue -48 and stored in val=val+(NumericValue-48),
	#Check if val modulas by 2==0 return false, else return true

	 */

	public boolean chessboard_Square(String co)
	{
		int val=0;
		for (int i = 0; i < co.length(); i++) 
		{
			int numericValue = co.charAt(i);
			if (numericValue>96) 
			{
				val=numericValue-96;
			}
			else 
			{
				val=val+(numericValue-48);
			}
		}
		return !(val%2==0);
	}

	@Test
	public void chessboard_SquarePositive()
	{
		boolean actual=chessboard_Square("h3");
		boolean expected = true;
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void chessboard_SquarePositive1()
	{
		boolean actual=chessboard_Square("c7");
		boolean expected = false;
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void chessboard_SquarePositive2()
	{
		boolean actual=chessboard_Square("a1");
		boolean expected = false;
		Assert.assertEquals(expected, actual);
	}
}

