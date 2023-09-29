package mandatoryHoweWork_twoPointerAlgo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;

public class Sep28_HW_findAnagrams {

	/*
	 *
i/p String s, String p

// Create a ArrayList to store subString indices
// Create a HashMap to store character frequencies in the p
//using for each loop add the p character into HashMap
//using for loop from i=0 to i<=s.length()-p.length() and increment i by 1
//get the substring from i to i+p.length() stored in String sb
//create a HashMap to store character frequencies in the s upto p.length
//using for each loop add the sb character into HashMap
//compare both maps are equal or not, if yes the ad the i value in to list
//return the list

	#Time complexity - O[N2]

	 */

	public List<Integer> findAnagrams(String s, String p) {
		List<Integer> list=new ArrayList<Integer>();
		Map<Character,Integer> pMap=new HashMap<Character,Integer>();
		
		for(char c:p.toCharArray())
		{
			pMap.put(c,pMap.getOrDefault(c,0)+1);
		}
		for(int i=0; i<=s.length()-p.length();i++)
		{
			String sb = s.substring(i, i+p.length());
			Map<Character,Integer> sMap=new HashMap<Character,Integer>();
			for(char c:sb.toCharArray())
			{
				sMap.put(c,sMap.getOrDefault(c,0)+1);
			}
			if(pMap.equals(sMap)){
				list.add(i);
			}
		}
		return list;	
	}
	@Test
	public void findAnagramsPostive() 
	{
		List<Integer> actual=findAnagrams("cbaebabacd", "abc");
		List<Integer> expected = new ArrayList<Integer>(Arrays.asList(0,6));
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void findAnagramsPostive1() 
	{
		List<Integer> actual=findAnagrams("abab", "ab");
		List<Integer> expected = new ArrayList<Integer>(Arrays.asList(0,1,2));
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void findAnagramsPostive2() 
	{
		List<Integer> actual=findAnagrams("abab", "b");
		List<Integer> expected = new ArrayList<Integer>(Arrays.asList(1,3));
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void findAnagramsPostive3() 
	{
		List<Integer> actual=findAnagrams("cbadcabacd", "cd");
		List<Integer> expected = new ArrayList<Integer>(Arrays.asList(3,8));
		Assert.assertEquals(expected, actual);
	}
}
