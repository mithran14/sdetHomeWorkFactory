package mandatoryHoweWork_Nov3rdWeek;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;

public class Sdet_CW_Nov17 {
	
	//i/p int nums[], o/p=int
	//initialize int goodPairs=0;
	//init Map<Integer, Integer> countMap = new HashMap<>();
	//HashMap to store the count of occurrences of each number using foreach loop
	//using foreach loop get the values and use the good pair formulae
	//then add with goodPairs
	//return goodPairs

	public int numIdenticalPairs(int[] nums) {
		int goodPairs = 0;
		Map<Integer, Integer> countMap = new HashMap<>();
		for (int num : nums) {
		countMap.put(num, countMap.getOrDefault(num, 0) + 1);
		}
		for (int count:countMap.values()) {
		goodPairs+=count*(count - 1)/2;
		}
		return goodPairs;
		} 
	 
	 @Test
		public void Positive()
		{
			int actual=numIdenticalPairs(new int[] {1, 2, 3, 1, 1, 3});
			int expected =4;
			Assert.assertEquals(expected, actual);
		}
		@Test
		public void Positive1()
		{
			int actual=numIdenticalPairs(new int[] {1,2,3});
			int expected =0;
			Assert.assertEquals(expected, actual);
		}
		@Test
		public void Positive2()
		{
			int actual=numIdenticalPairs(new int[] {1,1,1,1});
			int expected =6;
			Assert.assertEquals(expected, actual);
		}
}
