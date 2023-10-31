package mandatoryHoweWork_Oct4thWeek;

import org.junit.Assert;
import org.junit.Test;

public class Oct25_HW_FlowerBEd {
	 public boolean isFlowerInsertionPossible(int[] flowerbed, int n) {
	        int ins =0;
	        for(int i=0;i<flowerbed.length&&ins<n;i++){
	                if(flowerbed[i]==0){
	                    int prev = (i==0)?0:flowerbed[i-1];
	                    int next = (i==flowerbed.length-1)?0:flowerbed[i+1];
	                    if(next==0&&prev==0){
	                        ins++;
	                        flowerbed[i]=1;
	                    }
	                }
	        }
	        return ins==n;
	    }
	   
	   @Test
		public void test1() {
			Assert.assertEquals(true, isFlowerInsertionPossible(new int[] {1,0,0,0,1},1));
		}

		@Test
		public void test2() {
			Assert.assertEquals(false, isFlowerInsertionPossible(new int[] {1,0,0,0,0,1},2));
		}

		@Test
		public void test3() {
			Assert.assertEquals(true, isFlowerInsertionPossible(new int[] {0,0,1,0,1},1));
		}
		@Test
		public void test4() {
			Assert.assertEquals(true, isFlowerInsertionPossible(new int[] {0,0,0,0,0},3));
		}
		@Test
		public void test5() {
			Assert.assertEquals(true, isFlowerInsertionPossible(new int[] {1,0,1,0,0},1));
		}

}
