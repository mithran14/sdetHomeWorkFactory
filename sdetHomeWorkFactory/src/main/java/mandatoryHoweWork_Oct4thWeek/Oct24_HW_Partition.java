package mandatoryHoweWork_Oct4thWeek;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.testng.Assert;

public class Oct24_HW_Partition {
	
	//https://leetcode.com/problems/partition-labels/
	 public List<Integer> partitionLabels(String s) {
	        int find = 0;
	        int shift = 0;
	        List<Integer> al = new ArrayList<>();
	    for(int i = 0; i<s.length(); i++){
	        if(s.lastIndexOf(s.charAt(i)) > find){
	            find = s.lastIndexOf(s.charAt(i));
	        } if(i == find){
	            al.add(find+1-shift);
	            shift=find+1;
	            find=i;
	        }
	    }
	    return al;
	    }
	   
	   @Test
		 public void test()
		 {
			Assert.assertEquals(Arrays.asList(9,7,8), partitionLabels( "ababcbacadefegdehijhklij"));
		 }
		 @Test
		 public void test1()
		 {
			 Assert.assertEquals(Arrays.asList(10), partitionLabels("eccbbbbdec"));
		 }
}