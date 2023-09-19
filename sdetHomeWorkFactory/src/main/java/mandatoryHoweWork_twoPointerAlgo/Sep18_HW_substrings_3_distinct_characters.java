package mandatoryHoweWork_twoPointerAlgo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Assert;
import org.junit.Test;

public class Sep18_HW_substrings_3_distinct_characters {

	/*
	 * https://leetcode.com/problems/substrings-of-size-three-with-distinct-characters/description/
	 * 
	#int i=0, count=0;
	#while set i<k then add String character into list
	#inside while loop set the condition i<=s.length
	#Create Set<String> set=new HashSet<String>();
	#check the set size is equal to 3, yes then count++
	#from list 1st String character remove and add a new String character from s
	#using if check the i value is not equal to s.length()
	#incrementing i++
	//Time complexity -  O[N2]
	 */
	public int countGoodSubstrings(String s) {
		int count=0;
		for(int i=0;i<=s.length()-3;i++){
			if((s.charAt(i)!=s.charAt(i+1))&&(s.charAt(i)!=s.charAt(i+2))&&(s.charAt(i+2)!=s.charAt(i+1))){
				count++;
			}
		}
		return count;
	}
	public int distinct_characters (String s){
		int i=0,k=3, count=0;
		List<String> list=new ArrayList<String>();
		if (s.length()<3) {
			return 0;
		}
		while(i<k){
			list.add(String.valueOf(s.charAt(i)));
			i++;
		}
		while(i<=s.length()){
			Set<String> set=new HashSet<String>(list);
			if(set.size()==3) count++;
			list.remove(String.valueOf(s.charAt(i-k)));
			if(i!=s.length()) { 
			list.add(String.valueOf(s.charAt(i)));
			}
			i++;
		}
		return count;
	}
	@Test
	public void TwoPositive0() {
		int actual=distinct_characters ("xyzzaz");
		int expected = 1;
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void TwoPositive1() {
		int actual=distinct_characters ("aababcabc");
		int expected = 4;
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void TwoPositive2() {
		int actual=distinct_characters ("a");
		int expected = 0;
		Assert.assertEquals(expected, actual);
	}

}
