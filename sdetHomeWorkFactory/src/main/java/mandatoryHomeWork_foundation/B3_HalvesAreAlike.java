package mandatoryHomeWork_foundation;

import org.junit.Assert;
import org.junit.Test;

public class B3_HalvesAreAlike {
	
	/*
	Determine if String Halves Are Alike
	
	You are given a string s of even length. Split this string into two halves of equal lengths, 
	and let a be the first half and b be the second half.

	Two strings are alike if they have the same number of vowels ('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'). 
	Notice that s contains uppercase and lowercase letters.

	Return true if a and b are alike. Otherwise, return false.

	Example 1:

	Input: s = "book"
	Output: true
	Explanation: a = "bo" and b = "ok". a has 1 vowel and b has 1 vowel. Therefore, they are alike.
	Example 2:

	Input: s = "textbook"
	Output: false
	Explanation: a = "text" and b = "book". a has 1 vowel whereas b has 2. Therefore, they are not alike.
	Notice that the vowel o is counted twice.
	
	#pseudocode
	----------
	#initialize str,count,count1
	#initialize vowels AEIOUaeiou in vowels String
	#find the word length and stored in length
	#find the halflength of the word and stored in halfLength
	#find the substrings using half of the word length. and stored in substring, substring1
	#using 2 for loops, outer for loop set the condition upto <halflength
	#using if condition find the vowels count in the first substring usig contains keyword and increment the count value
	# inner for loop set the condition upto <halflength
	#using if condition find the vowels count in the second substring usig contains keyword and increment the count1 value
	#return the bbolean value, if count==count1 
	
	*/

	public boolean halvesAreAlike(String str)
	{
		int count=0;
		int count1=0;
		String vowels = "AEIOUaeiou";
		int length = str.length();
	    int halfLength = length / 2;
	    
	    //String substrings = new String[2];
	    String substrings = str.substring(0, halfLength); 
	    String substrings1= str.substring(halfLength);
	    
	    System.out.println(String.valueOf(substrings));
	    System.out.println(String.valueOf(substrings1));
		
	    for (int i = 0; i < halfLength; i++) 
	    {
	        if (vowels.contains(String.valueOf(substrings.charAt(i)))) 
	        {
	            count++;
	        }
	   
	        if (vowels.contains(String.valueOf( substrings1.charAt(i)))) 
	        {
	            count1++;
	        }
	    }

	    return (count==count1);
		}
	    
	@Test
	public void halvesAreAlikePositive()
	{
		boolean actual=halvesAreAlike("book");
		boolean expected =true;
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void halvesAreAlikePositive1()
	{
		boolean actual=halvesAreAlike("textbook");
		boolean expected =false;
		Assert.assertEquals(expected, actual);
	}

}


