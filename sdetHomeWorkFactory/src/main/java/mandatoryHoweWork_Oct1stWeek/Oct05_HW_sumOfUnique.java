package mandatoryHoweWork_Oct1stWeek;

import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;
import org.junit.Test;
import org.testng.Assert;

public class Oct05_HW_sumOfUnique{

	public int sumOfUnique(int[] nums) {
		int sum=0,sum1=0;
		Set<Integer> orgLst=new HashSet<Integer>();
		Set<Integer> dupLst=new HashSet<Integer>();
		for(int i=0;i<nums.length;i++){
			if(!orgLst.contains(nums[i])){
				orgLst.add(nums[i]);
				sum+=nums[i];
			}
			else{
				dupLst.add(nums[i]);
			}
		}
		Iterator<Integer> iterator = dupLst.iterator();
		while (iterator.hasNext()) {
			sum1+= iterator.next();
		}
		return sum-sum1;
	}
	@Test
	public void sumOfUniquePositive()
	{
		int actual=sumOfUnique(new int[] {1,2,3,2});
		int expected =4;
		Assert.assertEquals(expected, actual);
	}
	public void sumOfUniquePositive1()
	{
		int actual=sumOfUnique(new int[] {1,2,3,2,1,2});
		int expected =3;
		Assert.assertEquals(expected, actual);
	}
}