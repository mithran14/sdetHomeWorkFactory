package mandatoryHomeWork_foundation;

import org.junit.Assert;
import org.junit.Test;

public class Sdet_HW_14_09_2023_String_pair {

	/*
	 * https://leetcode.com/problems/find-maximum-number-of-string-pairs/description/

	#pseudocode
	----------
	i/p String Array s, o/p int count

initialize int count=0; String Builder a;
using for loop from i = 0; i<s.length-1; i++
given the String[i] into StringBuilder
using for loop from j=s.length-1; j>i; j--
compare s[j].equals a.reverse.toString()
if yes increment the count by 1 
return count;

	 */
	public int String_pair(String[] s) {
		int count=0;

		for (int i = 0; i<s.length-1; i++) {
			StringBuilder a=new StringBuilder(s[i]);
			a.reverse();
			for (int j = s.length-1; j>i; j--) {
				if(s[j].equals(a.toString())){
					count++;
				}
			}

		}
		return count;

	}

	@Test
	public void String_pairPositive() {
		int actual=String_pair(new String[] {"cd","ac","dc","ca","zz"});
		int expected =2;
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void String_pairPositive1() {
		int actual=String_pair(new String[] {"aa,ab"});
		int expected =0;
		Assert.assertEquals(expected, actual);
	}

}
