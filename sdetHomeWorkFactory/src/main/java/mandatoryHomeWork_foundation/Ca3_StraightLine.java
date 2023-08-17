package mandatoryHomeWork_foundation;

import org.junit.Assert;
import org.junit.Test;

public class Ca3_StraightLine
 {

	/*
	 https://leetcode.com/problems/check-if-it-is-a-straight-line/submissions/

	Check If It Is a Straight Line

You are given an array coordinates, coordinates[i] = [x, y], where [x, y] represents the coordinate of a point. Check if these points make a straight line in the XY plane.

Example 1:

	Input: coordinates = [[1,2],[2,3],[3,4],[4,5],[5,6],[6,7]]
	Output: true
Example 2:

	Input: coordinates = [[1,1],[2,2],[3,4],[4,5],[5,6],[7,7]]
	Output: false

	#pseudocode
	----------
	#given integer 2 dimentional array
	#find the co-ordinates of a[0][0] and a[1][0] subtract and stored in int x2.
	#Similarly, iterate through the elements and find the another co-ordinates and subtract the values and stored in y2.
	#using for loop iterate from 2 and upto a length.
	#find all the co-ordinates and subtract from the previous or first co-ordinates and stored them
	#cross multiply the values of x1*y2 and y1*x2, check both equal or not. if unequal then return false.
	#else return true
	 */
	     public boolean straightLine(int[][] a) 
	     {
	    	    int x2=a[1][0]-a[0][0];
	    	    int y2=a[1][1]-a[0][1];

	    	    for(int i=2; i<a.length;i++)
	    	    {
	    	        int x1=a[i][0]-a[0][0];
	    	        int y1=a[i][1]-a[0][1];
	    	        
	    	        if(x1*y2!=y1*x2)
		    	    {
		    	    return false;
		    	    }
	    	    }
	    	    return true;
	    }
	     @Test
	 	public void straightLinePositive()
	 	{
	 		boolean actual=straightLine(new int[][] {{1,2},{2,3},{3,4},{4,5},{5,6}} );
	 		boolean expected = true;
	 		Assert.assertEquals(expected, actual);
	 	}

}


