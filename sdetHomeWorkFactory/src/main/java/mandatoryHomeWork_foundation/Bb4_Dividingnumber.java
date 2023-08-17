package mandatoryHomeWork_foundation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class Bb4_Dividingnumber
{
	/*
	 https://leetcode.com/problems/self-dividing-numbers/description/

	Self Dividing Numbers

	A self-dividing number is a number that is divisible by every digit it contains.

	For example, 128 is a self-dividing number because 128 % 1 == 0, 128 % 2 == 0, and 128 % 8 == 0.
	A self-dividing number is not allowed to contain the digit zero.

	Given two integers left and right, return a list of all the self-dividing numbers in the range [left, right].

Example 1:

	Input: left = 1, right = 22
	Output: [1,2,3,4,5,6,7,8,9,11,12,15,22]
	
Example 2:

	Input: left = 47, right = 85
	Output: [48,55,66,77]

	#pseudocode
	----------
	#Initialize the list variable as an empty ArrayList to store the self-dividing numbers.
	#Start a loop that iterates from left to right.
	#For each number i in the range:
		a. Check if i is less than or equal to 9 (i.e., single-digit number).
		b. If i is a single-digit number, directly add it to the list, as all 
			single-digit numbers are self-dividing.
		c. If i is a two-digit or higher number, proceed with further checks. 
	#Initialize variables d, count, and t.
		d: To store the individual digits of the number during iteration.
	count: To keep track of how many times i is divisible by its digits.
		t: A temporary variable to store the value of i for iteration.
	#Start a while loop to iterate through each digit of i. 
		In the loop:
		a. Get the rightmost digit of t using d = t % 10.
		b. Check if d is equal to 0. If it is, break out of the loop 
			because i is not self-dividing (as it contains a zero).
		c. If d is not zero, check if i is divisible by d (i.e., i % d == 0). If it is, increment count.
		d. Divide t by 10 to move to the next digit for the next iteration
	#Calculate the length of the number i using String.valueOf(i).length() and store it in the length variable.
	#Check if length is equal to the count.
	#If the number of times i is divisible by its digits (count) is equal to the total number of digits in i (length), 
		then i is a self-dividing number.
	#If the condition is true, add i to the list.
	#Reset the count to 0 for the next iteration.
	#Continue the loop until all numbers in the range have been checked.
	#Return the list containing all the self-dividing numbers in the specified range.

	 */

	public List<Integer>  dividingnumber(int left,int right)
	{
		List<Integer> list =new ArrayList<Integer>();

		for (int i = left; i <=right;i++) 
		{
			if (i<=9) 
			{
				list.add(i);
			}

			else if (i>9) 
			{
				int d=0;
				int count=0;
				int t=i;
				while(t>0)
				{
					d=t%10;
					if(d==0)
					{
						break;
					}
					else if(i%d==0)
					{
						count++;
					}
					t=t/10;
				}

				int length = String.valueOf(i).length();
				
				if (length==count) 
				{
					list.add(i);
				}
				count=0;
			}
		}
		return list;
	}

	@Test
	public void dividingnumberPositive()
	{
		List<Integer> actual=dividingnumber(9, 22);
		List<Integer> expected = Arrays.asList(9,11,12,15,22);
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void dividingnumberPositive1()
	{
		List<Integer> actual=dividingnumber(66, 708);
		List<Integer> expected = Arrays.asList(66, 77, 88, 99, 111, 112, 115, 122, 124, 126, 128, 132, 135, 144, 155, 162, 168, 175, 184, 212, 216, 222, 224, 244, 248, 264, 288, 312, 315, 324, 333, 336, 366, 384, 396, 412, 424, 432, 444, 448, 488, 515, 555, 612, 624, 636, 648, 666, 672);
		Assert.assertEquals(expected, actual);
	}
}

