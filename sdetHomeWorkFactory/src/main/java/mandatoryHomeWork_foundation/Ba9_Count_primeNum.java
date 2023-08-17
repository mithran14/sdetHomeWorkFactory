package mandatoryHomeWork_foundation;

import org.junit.Assert;
import org.junit.Test;

public class Ba9_Count_primeNum 
{
	/*
	 https://leetcode.com/problems/count-primes/submissions/

Count Primes

Given an integer n, return the number of prime numbers that are strictly less than n.

Example 1:

	Input: n = 10
	Output: 4
	Explanation: There are 4 prime numbers less than 10, they are 2, 3, 5, 7.
	
Example 2:

	Input: n = 0
	Output: 0
	
Example 3:

	Input: n = 1
	Output: 0

	#pseudocode
	----------
	#initialize boolean array using n length
	#Create a boolean array isprime of size n. By default, all elements in the boolean array are initialized to false. 
		The index of this array represents the number, and the value at each index will indicate if that number is prime (false) or not (true).
	#Start with the first prime number, which is 2. Mark all the multiples of 2 as non-prime numbers in the isprime array. 
		For example, for n = 10, isprime[4], isprime[6], and isprime[8] will be marked as true because they are multiples of 2 
			and hence not prime.
	#Repeat the process for the next prime number, which is 3. Mark all the multiples of 3 as non-prime numbers in the isprime array.
	#Continue this process for each subsequent prime number up to the square root of n. 
		Since multiples of numbers greater than the square root of n would have been marked as non-prime by this point, 
		there is no need to check them.
	#After marking all the multiples, count the number of false entries in the isprime array. 
		Each false entry indicates that the corresponding index (number) is a prime number.
	#Return the count of prime numbers.

	 */

	public int count_primeNum(int n) //10
	{

		boolean[] isprime = new boolean[n];
		int count = 0;

		for(int i = 2; i*i<=n; i++)
		{
			if(isprime[i]!=true)
			{
				for(int j = i*2; j<n; j+=i)
				{
					isprime[j] = true;
				}
			}
		}
		for(int i=2;i<n;i++)
		{
			if(isprime[i]!=true)
			{
				count++;
			}
		}
		System.out.println(count);
		return count;
	}


		
	public void count_primeNumPostive() 
	{
		int actual=count_primeNum(10);
		Assert.assertEquals(4, actual);
	}
	@Test	
	public void primeNumPostive1() 
	{
		int actual=count_primeNum(4000);
		Assert.assertEquals(550, actual);
	}

}


