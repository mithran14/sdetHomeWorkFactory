package mandatoryHoweWork_twoPointerAlgo;

import org.apache.groovy.parser.antlr4.GroovyParser.IfElseStatementContext;
import org.junit.Assert;
import org.junit.Test;

public class Sep26_HW_Bowling_Game {

	/*
	 * https://leetcode.com/problems/minimum-recolors-to-get-k-consecutive-black-blocks/

	#initialize int sum1=0,sum2=0;
	#using for loop set (i<p1.length)
	#using if check (i is equal to 1 and p1[i-1] value =10) or (i>1 and  p1[i-1] or p1[i-2] value =10)
 		then current value is multiply by 2 and added into the sum1
 			else direct value added in sum1

	#using another if check (i is equal to 1 and p2[i-1] value =10) or (i>1 and  p2[i-1] or p2[i-2]  value =10)
 		then current value is multiply by 2 and added into the sum2
 			else direct value added in sum2
	#outside for loop check sum1>sum2 then return 1, or sum1=sum2 then return 0, else return 2
		
	#Time complexity - O[N]
	
	 */

	public int isWinner(int[] p1, int[] p2) {
		int sum1=0,sum2=0;
		for (int i=0;i<p1.length;i++){
			if((i==1&&(p1[i-1]==10))||i>=2&&(p1[i-1]==10||p1[i-2]==10)){
				sum1+=2*p1[i];
			}
			else{
				sum1+=p1[i];
			}
			if((i==1&& (p2[i-1]==10))||i>=2&&(p2[i-1]==10||p2[i-2]==10)){
				sum2+=2*p2[i];
			} 
			else{
				sum2+=p2[i];
			}
		}
		return sum1>sum2?1:sum1==sum2?0:2;
	}
	@Test
	public void TwoPositive0() {
		int actual=isWinner(new int[] {4,10,7,9}, new int[] {6,5,2,3});
		int expected = 1;
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void TwoPositive1() {
		int actual=isWinner(new int[] {3,5,7,6}, new int[] {8,10,10,2});
		int expected = 2;
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void TwoPositive2() {
		int actual=isWinner(new int[] {2,3}, new int[] {4,1});
		int expected = 0;
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void TwoPositive3() {
		int actual=isWinner(new int[] {4,10,9,5}, new int[] {4,7,10,10});
		int expected = 1;
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void TwoPositive4() {
		int actual=isWinner(new int[] {9,1,9,10}, new int[] {10,2,3,10});
		int expected = 2;
		Assert.assertEquals(expected, actual);
	}
}
