package mandatoryHomeWork_foundation;

import java.util.Arrays;
import org.junit.Assert;
import org.junit.Test;

public class Da1_findContentChildren
{
	/*
	Assign Cookies

	Assume you are an awesome parent and want to give your children some cookies. 
		But, you should give each child at most one cookie.

	Each child i has a greed factor g[i], 
	which is the minimum size of a cookie that the child will be content with; 
	and each cookie j has a size s[j]. If s[j] >= g[i], 
	we can assign the cookie j to the child i, and the child i will be content. 
	Your goal is to maximize the number of your content children and output the maximum number.

Example 1:

	Input: g = [1,2,3], s = [1,1]
	Output: 1
	Explanation: You have 3 children and 2 cookies. The greed factors of 3 children are 1, 2, 3. 
	And even though you have 2 cookies, since their size is both 1, 
	you could only make the child whose greed factor is 1 content.
	You need to output 1.
Example 2:

	Input: g = [1,2], s = [1,2,3]
	Output: 2
	Explanation: You have 2 children and 3 cookies. The greed factors of 2 children are 1, 2. 
	You have 3 cookies and their sizes are big enough to gratify all of the children, 
	You need to output 2.

	#pseudocode
	----------
	#Input: int[] , int[], Output: int
	#Sort the given arrays
	#Initialize variable to store complete, index for greedy int[]
	#using for loop run the loop till the length of both the arrays 
	#find if the available cookie size is >= to greed of the g in place
	#if yes, increment the complete and increment the i counter by 1
	#convert the ascii value to char array
	#return complete is int
					
	*/
	public int assignCookies(int[] g, int[] s) {
		int i=0;
		int complete=0;

		Arrays.sort(g);
		Arrays.sort(s);

		if (g.length == 0 || s.length == 0) {
			return complete;
		}
		for (int j = 0; i < g.length&& j < s.length; j++) 
		{
			if(s[j]>=g[i]) {
				complete++;
				i++;
			}
		}
		return complete;
	}
	@Test
	public void assignCookiesPositive() {
		int actual=assignCookies(new int[] {1,2,3},new int[] {1,1});
		int expected =1;
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void assignCookiesPositive1() {
		int actual=assignCookies(new int[] {1,2},new int[] {1,2,3});
		int expected =2;
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void assignCookiesEdge() {
		int actual=assignCookies(new int[] {1,2,3},new int[] {});
		int expected =0;
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void assignCookiesPositive2() {
		int actual=assignCookies(new int[] {1,2,3},new int[] {3});
		int expected =1;
		Assert.assertEquals(expected, actual);
	}

}