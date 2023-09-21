package mandatoryHoweWork_twoPointerAlgo;

import org.junit.Assert;
import org.junit.Test;

public class Sep20_numberOfSubstrings {

	/*
	 *https://leetcode.com/problems/number-of-substrings-containing-all-three-characters/
	 * 
	#i/p String s, o/p int totalCount
	#initialie int i=0,k=0,totalCount=0;
	#using while loop set i<=s.length-3
	#inside while loop create String builder b and create while loop and  for loop 
	#while loop set i<k+3 and add the character into the Stringbuilder b
	#for loop from int j=i;j<s.length;j++
	#using if check the String contains abc,yes then increment the totalCount
	#and using if check(j<slength()), yes then append the next character
	#outside for loop set i=k+1; k++
	#return totalCount;
	 */

	public int numberOfSubstrings(String s) {
		int i=0,k=0,totalCount=0;
		while(i<=s.length()-3) {
			StringBuilder b=new StringBuilder();
			while (i<k+3){
				b.append(s.charAt(i));
				i++;
			}
			for(int j=i;j<=s.length();j++){
				if(new String(b).contains("a")&&new String(b).contains("b")&&new String(b).contains("c"))totalCount++;
				if(j<s.length()) {
				b.append(s.charAt(j));
				}
			}
			i=k+1;
			k++;
		}
		return totalCount;  
	}


	@Test
	public void TwoPositive0() {
		int actual=numberOfSubstrings ("abcabc");
		int expected = 10;
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void TwoPositive1() {
		int actual=numberOfSubstrings ("aaacb");
		int expected = 3;
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void TwoPositive2() {
		int actual=numberOfSubstrings ("acb");
		int expected = 1;
		Assert.assertEquals(expected, actual);
	}


}
