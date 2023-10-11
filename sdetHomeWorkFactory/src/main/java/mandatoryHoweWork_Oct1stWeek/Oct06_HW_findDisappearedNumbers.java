package mandatoryHoweWork_Oct1stWeek;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.junit.Test;
import org.testng.Assert;

public class Oct06_HW_findDisappearedNumbers{

	//ip: int[]
	//op : list of int
	//Logic : init Treeset and array list
	// 1. Run a for loop to add all the nums in set
	// 2. Run another for loop starting from 1 to len of num and add to set 
	// 3. If it is possoible to add to set, add i to al
	//return al
	//TC: O[N], SC:O[N]
	public List<Integer> findDisappearedNumbers(int[] nums) {
		Set<Integer> hs = new TreeSet<>();
		List<Integer> al = new ArrayList<>();

		for(int i :nums){
			hs.add(i);
		}

		for(int i=1;i<=nums.length;i++){
			if(hs.add(i)) al.add(i);
		}
		return al;
	}

	@Test
	public void test1() {
		Assert.assertEquals(Arrays.asList(1,4), findDisappearedNumbers(new int[] {5,6,7,8,3,2,3,2}));
	}

	@Test
	public void test2() {
		Assert.assertEquals(Arrays.asList(2,3), findDisappearedNumbers(new int[] {1,1,1}));
	}

	@Test
	public void test3() {
		Assert.assertEquals(Arrays.asList(), findDisappearedNumbers(new int[] {1,2,3}));
	}
	@Test
	public void findDisappearedNumbersPositive()
	{
		List<Integer> actual=findDisappearedNumbers(new int[] {4,3,2,7,8,2,3,1});
		List<Integer> expected =new ArrayList<Integer>(Arrays.asList(5,6));
		Assert.assertEquals(expected, actual);
	}
	public void findDisappearedNumbersPositive1()
	{
		List<Integer> actual=findDisappearedNumbers(new int[] {4,3,2,7,8,2,3,1});
		List<Integer> expected =new ArrayList<Integer>(Arrays.asList(5,6));
		Assert.assertEquals(expected, actual);
	}
}