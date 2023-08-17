package mandatoryHomeWork_foundation;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class A3_BiggestNextNumber 
{
	/*
	1. Given a sorted character array and a target character, 
	find the next biggest character in the array. 

	Example:
	char[] arr = {‘b’, ‘d’ , ‘h’}; char k = ‘e’ 
	Output -> h

	#pseudocode
	----------
	#initialie char array {‘b’, ‘d’ , ‘h’} and k value as 'e'
	#charArray to ascii value
	#outerloop initialize with i & condition upto arr.length and increment the i value.
	#or using foreach loop compare i and k
	#compare the ascii value with k value
	#choosen minimum difference char array
	#convert the ascii value to char array
	#return value is int
					
	*/
	
	public char biggestNextNumber(char[] arr, char k)
	{
		Arrays.sort(arr);
		
		for (int i = 0; i < arr.length; i++) 
		{
			if (arr[i]>k) {
				return arr[i];
			}
		}
		return 0;
	}
	
	@Test	
	public void findOccurancePostive() 
	{
		char actual=biggestNextNumber(new char[] {'b', 'd', 'h'},'e');
		Assert.assertEquals('h', actual);
	}
	@Test	
	public void findOccurancePostive1() 
	{
		char actual = biggestNextNumber(new char[]{ 'a','b','f','x'}, 'c' );
		Assert.assertEquals('f', actual);
	}
	@Test
	public void findOccuranceNeagtive() 
	{
		char actual=biggestNextNumber(new char[] {'s', 'p', 't'},'t');
		Assert.assertEquals(0, actual);
	}
	@Test
	public void findOccuranceNeagtive1() 
	{
		char actual=biggestNextNumber(new char[] {'a', 'd', 'b'},'z');
		Assert.assertEquals(0, actual);
	}
	@Test
	public void findOccuranceEdge() 
	{
		char actual=biggestNextNumber(new char[] {},'e');
		Assert.assertEquals(0, actual);
	}

}