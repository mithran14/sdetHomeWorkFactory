package mandatoryHomeWork_foundation;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class Aa8_Distribute_candy 
{
	/*https://leetcode.com/problems/distribute-candies/submissions/
	Distribute Candies

	Alice has n candies, where the ith candy is of type candyType[i]. 
	Alice noticed that she started to gain weight, so she visited a doctor.

	The doctor advised Alice to only eat n / 2 of the candies she has (n is always even).
	 Alice likes her candies very much, and she wants to eat the maximum 
	 number of different types of candies while still following the doctor's advice.

	Given the integer array candyType of length n, 
	return the maximum number of different types of candies she can eat 
	if she only eats n / 2 of them.

	Example 1:

	Input: candyType = [1,1,2,2,3,3]
	Output: 3
	Explanation: Alice can only eat 6 / 2 = 3 candies. 
	Since there are only 3 types, she can eat one of each type.

	Example 2:

	Input: candyType = [1,1,2,3]
	Output: 2
	Explanation: Alice can only eat 4 / 2 = 2 candies. 
	Whether she eats types [1,2], [1,3], or [2,3], she still can only eat 2 different types.

	Example 3:

	Input: candyType = [6,6,6,6]
	Output: 1
	Explanation: Alice can only eat 4 / 2 = 2 candies. 
	Even though she can eat 2 candies, she only has 1 type.

		#pseudocode
		----------
		#initialize nums,count=1,n, k
		#calculate the array length and stored in n variable
		#doctor advice,she has to eat n/2 candies n/2 value is stored in the k variable
		#Iterate through every elements 
		#outer loop starts from i=0 to i < length.Array-1 
		#using if statement compare [i],[i+1] , then increase the count 
		#there are some conditions,
			i)count>k && count==n return =1
			ii)count>k && count<n return n-count+1
			iii)count==k && count<n || count<k && count<n return k;
		#return the int  value

		 */
		
		public int singleNumber(int[] num)
		{
			Arrays.sort(num);//4,5,6,6,7,7,7,7,7,8
			int count=1;//6

			int n = num.length;//10
			int k=n/2;//5
			for (int i = 0; i < n-1; i++) 
			{

				if(num[i]==num[i+1]) 
				{
					count++;
				}


			}
			if (count>k && count==n)
			{
				return 	1;
			}

			else if (count>k && count<n) 
			{
				return n-count+1;
			}
			
			//else if (count==k && count<n || count<k && count<n) 
			//{
			//	return k;
			//}
			
			return k;
		}

		@Test
		public void singleNumberPositive()
		{
			int actual=singleNumber(new int[] {1,1,1,1,1,1});
			int expected =1;

			Assert.assertEquals(expected, actual);
		}
		@Test
		public void singleNumberPositive1()
		{
			int actual=singleNumber(new int[] {1,1,1,1,1,5});
			int expected =2;
			Assert.assertEquals(expected, actual);
		}
		@Test
		public void singleNumberNegative()
		{
			int actual=singleNumber(new int[] {1,1,1,4,5,6});
			int expected =3;
			Assert.assertEquals(expected, actual);
		}
		@Test
		public void singleNumberNegative1()
		{
			int actual=singleNumber(new int[] {1,2,3,4,5,5});
			int expected =3;
			Assert.assertEquals(expected, actual);
		}
		@Test
		public void singleNumberNegative2()
		{
			int actual=singleNumber(new int[] {6,6,6,6});
			int expected =1;
			Assert.assertEquals(expected, actual);
		}
		@Test
		public void singleNumberEdge()
		{
			int actual=singleNumber(new int[] {1});
			int expected =1;
			Assert.assertEquals(expected, actual);
		}
		@Test
		public void singleNumberEdge1()
		{
			int actual=singleNumber(new int[] {1,2,3,4,5,6});
			int expected =3;
			Assert.assertEquals(expected, actual);
		}
		@Test
		public void singleNumberEdge2()
		{
			int actual=singleNumber(new int[] {1,5,5,-5,4,3});
			int expected =3;
			Assert.assertEquals(expected, actual);
		}
		@Test
		public void singleNumberEdge3()
		{
			int actual=singleNumber(new int[] {7,8,7,5,7,4,7,7});
			int expected =4;
			Assert.assertEquals(expected, actual);
		}
		@Test
		public void singleNumberEdge4()
		{
			int actual=singleNumber(new int[] {7,8,7,5,7,4,7,7,6,6});
			int expected =5;
			Assert.assertEquals(expected, actual);
		}
		@Test
		public void singleNumberEdge5()
		{
			int actual=singleNumber(new int[] {1,2,3,4,4,4,4,4,5,7,7,7,9,9});
			int expected =7;
			Assert.assertEquals(expected, actual);
		}
}
