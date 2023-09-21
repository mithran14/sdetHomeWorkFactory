package mandatoryHoweWork_twoPointerAlgo;

import org.junit.Assert;
import org.junit.Test;

public class Sep19_HW_smallest_palindrome {

	/*
	 * https://leetcode.com/problems/lexicographically-smallest-palindrome/description/
	 * 
	#initialize int i=0; j=s.length()-1;
	#using while loop set condition (i<j)
	#using if check (s.charAt(i)==s.charAt(j)), yes then increment i++,j--
	#else, then using if check s.charAt(i)>s.charAt(j), yes then ch[i]=s.charAt(i);
	#else ch[j]=s.charAt(j);
	#outside while loop  String output="";
	#using for each loop add each character from ch to output
	#return output
	//Time complexity -  O[N2]
	 */
	public String smallest_palindrome(String s){
		int i=0,j=s.length()-1;
		char[] ch = s.toCharArray();
		while (i<j){
			if(s.charAt(i)==s.charAt(j)){ 
				i++;j--;
			}
			else if(s.charAt(i)<s.charAt(j)){
				ch[j]=s.charAt(i);
				i++;j--;
			}
			else{
				ch[i]=s.charAt(j);
				i++;j--;
			}
		}
		String output = new String(ch);
		return output;
	}

	@Test
	public void TwoPositive0() {
		String actual=smallest_palindrome ("egcfe");
		String expected = "efcfe";
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void TwoPositive1() {
		String actual=smallest_palindrome ("efcge");
		String expected = "efcfe";
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void TwoPositive2() {
		String actual=smallest_palindrome ("abcd");
		String expected = "abba";
		Assert.assertEquals(expected, actual);
	}
}
