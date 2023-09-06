package mandatoryHomeWork_foundation;

import org.junit.Assert;
import org.junit.Test;

public class Sdet_06_09_2023_mostWordsFound {
	
	/*
	 * https://leetcode.com/problems/maximum-number-of-words-found-in-sentences/description/
	Maximum Number of Words Found in Sentences

A sentence is a list of words that are separated by a single space with no leading or trailing spaces.

You are given an array of strings sentences, where each sentences[i] represents a single sentence.

Return the maximum number of words that appear in a single sentence.

Example 1:

Input: sentences = ["alice and bob love leetcode", "i think so too", "this is great thanks very much"]
Output: 6
Explanation: 
- The first sentence, "alice and bob love leetcode", has 5 words in total.
- The second sentence, "i think so too", has 4 words in total.
- The third sentence, "this is great thanks very much", has 6 words in total.
Thus, the maximum number of words in a single sentence comes from the third sentence, which has 6 words.
Example 2:

Input: sentences = ["please wait", "continue to fight", "continue to win"]
Output: 3
Explanation: It is possible that multiple sentences contain the same number of words. 
In this example, the second and third sentences (underlined) have the same number of words.

	#pseudocode
	----------
	#Input: String[], Output: int
	#initialize max=0
	#using for loop run the loop till the length of the arrays
	#get the first index of the element and find the words length using split method 
		and store in size variable
	#using if statement check the size is greater than max value,
	 	if yes then size value stored in max
	#return complete is int
					
	*/
	public int mostWordsFound(String[] words) {
		int max=0;
		for (int i = 0; i < words.length; i++) {
			int size = words[i].split(" ").length;
			 if (size>max) {
				max=size;
			}
		}
		return max;
	}
	
	@Test
	public void mostWordsFoundPositive() {
		int actual=mostWordsFound(new String[] {"alice and bob love leetcode", "i think so too", "this is great thanks very much"});
		int expected =6;
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void mostWordsFoundPositive1() {
		int actual=mostWordsFound(new String[] {"please wait", "continue to fight", "continue to win"});
		int expected =3;
		Assert.assertEquals(expected, actual);
	}
}
