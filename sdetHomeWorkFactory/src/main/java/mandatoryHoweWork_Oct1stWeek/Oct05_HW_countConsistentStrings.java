package mandatoryHoweWork_Oct1stWeek;

import java.util.HashSet;

import org.junit.Test;
import org.testng.Assert;

public class Oct05_HW_countConsistentStrings{

	public int countConsistentStrings(String allowed, String[] words) {
		int count=0,totCount=0;
		HashSet<Character> all=new HashSet<Character>();
		for (char c : allowed.toCharArray()) {
			all.add(c);
		}
		for (String s : words) {
			for (int i = 0; i < s.length(); i++) {
				if (all.contains(s.charAt(i))) {
					count++;
				}
			}
			if (count==s.length()) {
				totCount++;
			}
			count=0;
		}
		return totCount;
	}
	@Test
	public void countConsistentStringsPositive()
	{
		int actual=countConsistentStrings("ab",new String[] {"ad","bd","aaab","baa","badab"});
		int expected =2;
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void countConsistentStringsPositive1()
	{
		int actual=countConsistentStrings("abc",new String[] {"a","b","c","ab","ac","bc","abc"});
		int expected =7;
		Assert.assertEquals(expected, actual);
	}
}