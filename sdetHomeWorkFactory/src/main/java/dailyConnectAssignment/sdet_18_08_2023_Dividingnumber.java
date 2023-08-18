package dailyConnectAssignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class sdet_18_08_2023_Dividingnumber
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
		a. Check if i is less than 10
		b. If i is a single-digit number, directly add it to the list
		c. If i is greater than two-digit proceed with further checks. 
	#Initialize variables rem, count=0, and temp=i.
	#Start a while loop to iterate through each digit of i. 
		a. Get the rightmost digit of t using rem = temp % 10.
		b. Check if rem is equal to 0. If it is, break out of the loop 
		c. If rem is not zero, check if i is divisible by rem (i.e., i % rem == 0). If it is, increment count.
		d. Divide temp by 10 to move to the next digit for the next iteration
	#Calculate the length of the number i using String.valueOf(i).length() and store it in the length variable.
	#Check if length is equal to the count.
	#If the number of times i is divisible by its digits (count) is equal to the total number of digits in i (length), 
		then i is a self-dividing number.
	#If the condition is true, add i to the list.
	#Reset the count to 0 for the next iteration.
	#Return the list
	 */

	public List<Integer> dividingnumber(int left,int right)
	{
		List<Integer> list=new ArrayList<>();

		for (int i = left; i <= right; i++) 
		{
			if(i<10) 
			{
				list.add(i);
			}
			else if(i>=10)
			{
				int temp=i;
				int rem=0;
				int count=0;
				while (temp>0)
				{
					rem=temp%10;

					if (rem==0) 
					{
						break;
					}
					else if (i%rem==0) 
					{
						count++;
					} 
					temp=temp/10;
				}
				int length=String.valueOf(i).length();
				if(length==count)
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
		List<Integer> actual=dividingnumber(9,22);
		List<Integer> expected = Arrays.asList(9,11,12,15,22);
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void dividingnumberPositive1()
	{
		List<Integer> actual=dividingnumber(99,111);
		List<Integer> expected = Arrays.asList(99,111);
		Assert.assertEquals(expected, actual);
	}
}

