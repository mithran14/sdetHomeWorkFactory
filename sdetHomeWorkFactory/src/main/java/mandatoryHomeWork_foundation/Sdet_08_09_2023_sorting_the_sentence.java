package mandatoryHomeWork_foundation;

import org.junit.Assert;
import org.junit.Test;

public class Sdet_08_09_2023_sorting_the_sentence {

	/*
	 * https://leetcode.com/problems/decode-the-message/
Decode the Message

You are given the strings key and message, which represent a cipher key and a secret message, respectively. The steps to decode message are as follows:

Use the first appearance of all 26 lowercase English letters in key as the order of the substitution table.
Align the substitution table with the regular English alphabet.
Each letter in message is then substituted using the table.
Spaces ' ' are transformed to themselves.
For example, given key = "happy boy" (actual key would have at least one instance of each letter in the alphabet), we have the partial substitution table of ('h' -> 'a', 'a' -> 'b', 'p' -> 'c', 'y' -> 'd', 'b' -> 'e', 'o' -> 'f').
Return the decoded message.

Example 1:

Input: key = "the quick brown fox jumps over the lazy dog", message = "vkbs bs t suepuv"
Output: "this is a secret"
Explanation: The diagram above shows the substitution table.
It is obtained by taking the first appearance of each letter in "the quick brown fox jumps over the lazy dog".
Example 2:

Input: key = "eljuxhpwnyrdgtqkviszcfmabo", message = "zwx hnfx lqantp mnoeius ycgk vcnjrdb"
Output: "the five boxing wizards jump quickly"
Explanation: The diagram above shows the substitution table.
It is obtained by taking the first appearance of each letter in "eljuxhpwnyrdgtqkviszcfmabo".

	#pseudocode
	----------
	#Input: String s Output: String trim
	#using split method (" ") and stored in split array
	#initialize String op empty array split.length size
	#creating a StringBuilder 
	#using for loop start from 0 to split.length
	#initialize int count=1;
	#using while loop condition count<=split.length
	#inside while check the split word contains the count number if yes then that word stored in empty array with count index, ie op[count]
	#reset the count and break it
	#else condition increase the count variable
	using for each loop op array words get and replace the numbers into " ". 
	#finally string builder into string then using trim method trim that  
	#return String trim

	 */
	public String decode_the_message(String s) {
		
		String[] split = s.split(" ");
		String[] op=new String[split.length];
		StringBuilder a=new StringBuilder();
		for(int i=0; i<split.length;i++)
		{
			int count=1;
			while (count<=split.length) 
			{
				if(split[i].contains((String.valueOf(count)))){
					op[count-1]=split[i];
					count=1;
					break;
				}
				else {
					count++;
				}
			}
		}
		for (String string : op) {
			a.append(string.replaceAll("\\d", " "));
		}
		String trim = a.toString().trim();
		return trim;
	}

	@Test
	public void decode_the_messagePositive() {
		String actual=decode_the_message("is2 sentence4 This1 a3");
		String expected ="This is a sentence";
		Assert.assertEquals(expected, actual);
	}

}
