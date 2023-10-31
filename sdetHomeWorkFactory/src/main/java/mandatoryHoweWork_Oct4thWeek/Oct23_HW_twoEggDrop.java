package mandatoryHoweWork_Oct4thWeek;

import org.junit.Test;
import org.testng.Assert;

public class Oct23_HW_twoEggDrop {
	 public int twoEggDrop(int n) {
	        int count=0;
	        int x=1;
	        while(n>0)
	        {
	            count++;
	            n=n-x;
	            x++;
	        }
	        return count;
	    }

	 @Test
	 public void test()
	 {
		Assert.assertEquals(2, twoEggDrop(2));
	 }
	 @Test
	 public void test1()
	 {
		 Assert.assertEquals(14, twoEggDrop(100));
	 }
	 @Test
	 public void test3()
	 {
		 Assert.assertEquals(1, twoEggDrop(1));
	 }
}