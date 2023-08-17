package mandatoryHomeWork_foundation;

import org.junit.Assert;
import org.junit.Test;

public class Bb8_SignOftheProduct
{
	/*
	 https://leetcode.com/problems/sign-of-the-product-of-an-array/submissions/

Sign of the Product of an Array

There is a function signFunc(x) that returns:

1 if x is positive.
-1 if x is negative.
0 if x is equal to 0.
You are given an integer array nums. Let product be the product of all values in the array nums.

Return signFunc(product).

Example 1:

	Input: nums = [-1,-2,-3,-4,3,2,1]
	Output: 1
	Explanation: The product of all values in the array is 144, and signFunc(144) = 1
Example 2:

	Input: nums = [1,5,0,2,-3]
	Output: 0
	Explanation: The product of all values in the array is 0, and signFunc(0) = 0
Example 3:

	Input: nums = [-1,1,-1,1,-1]
	Output: -1
	Explanation: The product of all values in the array is -1, and signFunc(-1) = -1
	
	#pseudocode
	----------
	#Initialize Variables:
		count is initialized to 0. 
	#Loop Initialization:
		The for loop iterates from i = 1 to i < num.
	#Inner Loop :
		check the 0 element inside the array or not , if yes return 0
		else if check the array element <0 then increment the count variable
	#outside loop
		using if, check the count%2==0, if yes return 1 else return -1
	#Adding Numbers:
		The final else block is executed when neither of the above conditions is satisfied.
		The value of i is added to the val variable.
		count and count1 are incremented by 1.
	#Loop Continues:
		The loop continues to iterate, and the above steps are repeated until the conditions are met for breaking or grouping.
	#Return Result:
		Once the loop finishes, the function returns the value of val, which represents the sum of the selected numbers based on the given conditions.

	 */

	public int signOfProduct(int[] num){
		int count=0;

		for(int i=0; i<num.length;i++){
			if (num[i]==0){
				return 0;
			}
			else if (num[i]<0){
				count ++;
			}
		}
		if (count%2==0){
			return 1;
		}
		return -1;
	}
	@Test
	public void signOfProductPositive4()
	{
		int actual=signOfProduct(new int[] {9,72,34,29,-49,-22,-77,-17,-66,-75,-44,-30,-24});
		int expected =-1;
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void signOfProductPositive()
	{
		int actual=signOfProduct(new int[] {51,38,73,21,27,55,18,15,79,29,13,45,8,-73,-92,-20,-50,-60,-70});
		int expected = 1;
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void signOfProductPositive1()
	{
		int actual=signOfProduct(new int[] {1,5,0,2,-3});
		int expected =0;
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void signOfProductPositive2()
	{
		int actual=signOfProduct(new int[] {-1,1,-1,1,-1});
		int expected =-1;
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void signOfProductPositive3()
	{
		int actual=signOfProduct(new int[] {41,65,14,80,20,10,55,58,24,56,28,86,96,10,3,84,4,41,13,32,42,43,83,78,82,70,15,-41});
		int expected =-1;
		Assert.assertEquals(expected, actual);
	}	
}

