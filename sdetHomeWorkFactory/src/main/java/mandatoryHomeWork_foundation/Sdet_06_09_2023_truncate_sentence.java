package mandatoryHomeWork_foundation;

import org.junit.Assert;
import org.junit.Test;

public class Sdet_06_09_2023_truncate_sentence {
	
	/*
	 * https://leetcode.com/problems/truncate-sentence/
Truncate Sentence

A sentence is a list of words that are separated by a single space with no leading or trailing spaces. Each of the words consists of only uppercase and lowercase English letters (no punctuation).

For example, "Hello World", "HELLO", and "hello world hello world" are all sentences.
You are given a sentence s​​​​​​ and an integer k​​​​​​. You want to truncate s​​​​​​ such that it contains only the first k​​​​​​ words. Return s​​​​​​ after truncating it.

Example 1:

Input: s = "Hello how are you Contestant", k = 4
Output: "Hello how are you"
Explanation:
The words in s are ["Hello", "how" "are", "you", "Contestant"].
The first 4 words are ["Hello", "how", "are", "you"].
Hence, you should return "Hello how are you".
Example 2:

Input: s = "What is the solution to this problem", k = 4
Output: "What is the solution"
Explanation:
The words in s are ["What", "is" "the", "solution", "to", "this", "problem"].
The first 4 words are ["What", "is", "the", "solution"].
Hence, you should return "What is the solution".
Example 3:

Input: s = "chopper is not a tanuki", k = 5
Output: "chopper is not a tanuki"
	#pseudocode
	----------
	#Input: String,and int k Output: String
	#initialize String op=""
	#using split method stored all the string words into the split array
	#using for loop run the loop till the length of the arrays
	#get the words upto the k value and stored in op 
		after adding each word adding the single space also
	#finally trim the last space using trim method and stored in op
	#return String op
					
	*/
	public String truncateSentence(String words,int k) {
	
		String op="";
		String[] split = words.split(" ");
		for (int i = 0; i < k; i++) {
			 op+=split[i]+" ";
		}
		op=op.trim();
		return op;
		
	}
	
	@Test
	public void truncateSentencePositive() {
		String actual=truncateSentence("Hello how are you Contestant", 4);
		String expected ="Hello how are you";
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void truncateSentencePositive1() {
		String actual=truncateSentence("What is the solution to this problem", 4);
		String expected ="What is the solution";
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void truncateSentencePositive2() {
		String actual=truncateSentence("chopper is not a tanuki", 5);
		String expected ="chopper is not a tanuki";
		Assert.assertEquals(expected, actual);
	}
}
