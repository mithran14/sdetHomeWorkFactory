package mandatoryHomeWork_foundation;

import org.junit.Assert;
import org.junit.Test;

public class Sdet_HW_12_09_2023_number_of_lines {
	/*
	 * https://leetcode.com/problems/height-checker/submissions/
	 * 
	#initialize count =0;
	#Arrays.copy of new array and Stored in NewArr
	#using Arrays.sort[newArr]
	#using for loop check the indices of both array if not match increment the count 
	#return the count

	Time complexity // O(n * log(n))

	 */

	public int[] numberOfLines(int[] widths, String s){
		int sum=0;
		int count=1;
		for (int i=0;i<s.length();i++){
			int c= s.charAt(i)-97;
			sum+=widths[c];
			if(sum==100&&i!=s.length()-1){
				sum=0;
				count++;
			}
			else if(sum>100){
				sum=widths[c];
				count++;
			}
		}
		return new int[] {count,sum};
	}

	@Test
	public void numberOfLinesPositive0()
	{
		int[] actual=numberOfLines(new int[]{4,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10}, "bbbcccdddaaa");
		int[] expected = {2,4};
		Assert.assertArrayEquals(expected, actual);
	}
	@Test
	public void numberOfLinesPositive1()
	{
		int[] actual=numberOfLines(new int[]{10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10}, "abcdefghijklmnopqrstuvwxyz");
		int[] expected = {3,60};
		Assert.assertArrayEquals(expected, actual);
	}
	@Test
	public void numberOfLinesPositive2()
	{
		int[] actual=numberOfLines(new int[]{4,10,10,10,1,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10}, "bbbcccdddaaeea");
		int[] expected = {2,4};
		Assert.assertArrayEquals(expected, actual);
	}
	@Test
	public void numberOfLinesPositive3()
	{
		int[] actual=numberOfLines(new int[]{3,4,10,4,8,7,3,3,4,9,8,2,9,6,2,8,4,9,9,10,2,4,9,10,8,2}, "mqblbtpvicqhbrejb");
		int[] expected = {1,100};
		Assert.assertArrayEquals(expected, actual);
	}

}