package mandatoryHoweWork_twoPointerAlgo;

import org.junit.Assert;
import org.junit.Test;

public class Sep22_HW_K_beauty_of_a_number {

	/*
	 * https://leetcode.com/problems/sort-array-by-parity/
	#i/p int num, k o/p int count
#initialize int i=0,count=0; StringBuilder d;
#convert int to String String.valueOf(num);
#using while set i<k and get the String element and append to d,then i++
#using another while set i<=s.length()
#convert to integer using parseInt (StringBuilder to String) stored in p
#using if p not equal to 0 then entering into the if condition,
	inside  if, check num divisible by p, yes then increment the count++
	else,
#outside if check i<num.length, then remove the deleteCharAt(0) value from d and add append(s.charAt(i)), i++
#return count
	//Time complexity -  O[N2]
	 */

	public int divisorSubstrings(int num, int k) {
		int i=0,count=0;
		String s=String.valueOf(num);
		StringBuilder d = new StringBuilder();
		while(i<k){
			d.append(s.charAt(i));
			i++;
		}
		while(i<=s.length()){
			int p = Integer.parseInt(new String(d));
			if(p!=0){
				if(num%p==0){
					count++;
				}
			}
			if(i<s.length()){
				d.deleteCharAt(0);
				d.append(s.charAt(i));
			}
			i++;
		}
		return count;
	}
	@Test
	public void TwoPositive0() {
		int actual=divisorSubstrings (240,2);
		int expected = 2;
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void TwoPositive1() {
		int actual=divisorSubstrings (430043,2);
		int expected = 2;
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void TwoPositive2() {
		int actual=divisorSubstrings (5000,2);
		int expected =1;
		Assert.assertEquals(expected, actual);
	}
}
