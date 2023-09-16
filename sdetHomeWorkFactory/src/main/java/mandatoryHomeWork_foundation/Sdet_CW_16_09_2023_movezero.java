package mandatoryHomeWork_foundation;

import org.junit.Assert;
import org.junit.Test;

public class Sdet_CW_16_09_2023_movezero {
	/*
	initialize int i,temp-0; int j=1;
	using while loop and set j<num.length
	inside while using if set the condition num[i]==0 && num[j]!=0
	and swap the variables and incrementing both i & j
	under else if condition set both num[i] & num[j]==0 
	then incrementing j
	*/

	public int[] movezero(int[] num) {

		int i=0;
		int j=1;
		int temp=0;
		
		
		while(j<num.length) {
			if (num[i]==0 && num[j]!=0) {
				temp=num[i];
				num[i]=num[j];
				num[j]=temp;
				j++;
				i++;
			}
			else if (num[i]==0 && num[j]==0) {
				j++;
			}
			else if (num[i]!=0 && num[j]==0) {
				i++;
			}
			else if (num[i]!=0 && num[j]!=0) {
				i++;
				j++;
			}
			else {
				return num;
			}
		}
		return num;
	}
	@Test
	public void zeroPositive3() {
		int[] actual=movezero(new int[]{4,2,4,0,0,3,0,5,1,0});
		int[] expected = {4,2,4,3,5,1,0,0,0,0};
		Assert.assertArrayEquals(expected, actual);
	}

	//@Test
	public void zeroPositive() {
		int[] actual=movezero(new int[]{0,1,0,3,12});
		int[] expected = {1,3,12,0,0};
		Assert.assertArrayEquals(expected, actual);
	}
	//@Test
	public void zeroPositive1() {
		int[] actual=movezero(new int[]{0,0,1,12});
		int[] expected = {1,12,0,0};
		Assert.assertArrayEquals(expected, actual);
	}
	//@Test
	public void zeroPositive2() {
		int[] actual=movezero(new int[]{0,0,1,0});
		int[] expected = {1,0,0,0};
		Assert.assertArrayEquals(expected, actual);
	}

	//@Test
	public void zeroPositive4() {
		int[] actual=movezero(new int[]{1,0,1});
		int[] expected = {1,1,0};
		Assert.assertArrayEquals(expected, actual);
	}
	//@Test
	public void zeroPositive5() {
		int[] actual=movezero(new int[]{1,0});
		int[] expected = {1,0};
		Assert.assertArrayEquals(expected, actual);
	}
}
