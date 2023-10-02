package mandatoryHoweWork_twoPointerAlgo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class Sep28_HW_findAnagrams {
	//https://leetcode.com/problems/find-all-anagrams-in-a-string/description/
	//ip: String, String
		//op : List
		//Logic: init list
		//1. If string len is gte of s string, return list directly 
		//2. Init two char[]  to store char value of s and p
		//3. Run a for loop till last element of p and store the frequency in sChar & pCha
		//If the arrays are equal add the index 0 to list
		//4. Start one more for loop from the len of p till last index of s and increment the frequency of the sChar at next index and reduce the frequency of pChar at first index
		// if the arrays are eqaul add the index to list
		//return list
		//TC: O[n], SC: O[n]
		   public List<Integer> findAnagrams(String s, String p) {
		        List<Integer> ans = new ArrayList<>();      
		        System.out.println(ans.toString());
		        if(p.length() > s.length()) return ans;

		        int sChar[] = new int[26];
		        int pChar[] = new int[26];
		        for(int i = 0; i < p.length(); i++){
		            sChar[s.charAt(i) - 'a']++;
		            pChar[p.charAt(i) - 'a']++;
		        }
		        if(Arrays.equals(sChar,pChar)){
		            ans.add(0);
		        }
		        for(int i = p.length(); i < s.length(); i++){ 
		            sChar[s.charAt(i) - 'a']++;
		            sChar[s.charAt(i-p.length()) - 'a']--;
		            if(Arrays.equals(sChar,pChar)){
		                ans.add(i-p.length()+1);
		            }
		        }
		        return ans;
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
