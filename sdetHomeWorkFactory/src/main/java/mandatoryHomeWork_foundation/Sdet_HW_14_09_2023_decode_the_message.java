package mandatoryHomeWork_foundation;

import org.junit.Assert;
import org.junit.Test;

public class Sdet_HW_14_09_2023_decode_the_message {

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
	#Input: String key and String mess, Output: String op
	#initialize String Builder op;
	#using replace method and remove the space in key String and Stored in KeyRep
	#using StringBuilder Remove the Duplicate Character and append in outputBuilder
	#creating empty char array size is 26
	#using for loop each outputBuilder key character to be stored in the empty Character Array
	#Initialize i=0, using while loop iterating upto < than mess.length
	#inside while loop check the character is Space or not, if yes then append the space in Op and incrementing the i value
	#If te space is having end of the character in mess string then append the op and break 
	#using another for loop iterating the mess String character and check that character is in which place of the char array
		get the j value and add 'a' character and append those with op and break
	#convert StrngBuilder into new String op 
	#return String op

	 */
	public String decode_the_message(String key,String mess) {
		//String op="";
		StringBuilder op = new StringBuilder();
		String keyRep = key.replace(" ", "");
		StringBuilder outputBuilder = new StringBuilder();
		char[] ch=new char[26];
		for (int i = 0; i < keyRep.length(); i++) {
			if (outputBuilder.indexOf(String.valueOf( keyRep.charAt(i))) == -1) {
				outputBuilder.append(keyRep.charAt(i));
				
			}
			
		}
		for (int i = 0; i < ch.length; i++) {
			ch[i]=outputBuilder.charAt(i);
		}
		int i=0;
		while (i<mess.length()) {
			if (mess.charAt(i)==' '&& i==mess.length()-1) 
			{
				//op+=" ";
				op.append(' ');
				break;
			}
			else if (mess.charAt(i)==' ') 
			{
				//op+=" ";
				op.append(' ');
				i++;
				
			}
			for (int j = 0; j < ch.length; j++) 
			{
				if (mess.charAt(i)==ch[j]) {
					//op+=(char)(j+97);
					op.append((char)(j+97));
					i++;
					break;
				}
			}
		}
		//return op;
		return new String(op);
	}

	@Test
	public void decode_the_messagePositive() {
		String actual=decode_the_message("the quick brown fox jumps over the lazy dog", "vkbs bs t suepuv");
		String expected ="this is a secret";
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void decode_the_messagePositive1() {
		String actual=decode_the_message("aowrzlqeyicbnbdyvfsmbrgkthupdfxj", "aowrz ");
		String expected ="abcde ";
		Assert.assertEquals(expected, actual);
	}
}
