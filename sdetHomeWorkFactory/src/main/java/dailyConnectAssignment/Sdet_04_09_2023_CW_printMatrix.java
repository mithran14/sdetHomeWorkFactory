package dailyConnectAssignment;

import org.junit.Assert;
import org.junit.Test;

public class Sdet_04_09_2023_CW_printMatrix
{
	static int[] printMatrix(int mat[][],int n){
		  int[] arr = new int[n*(n+1)];
	        int index = 0;

	        for (int i = 1; i <= n; i++) {
	            int length = mat[i - 1].length;

	            if (i % 2 == 0) {
	                for (int j = length - 1; j >= 0; j--) {
	                    arr[index++] = mat[i - 1][j];
	                }
	            } else {
	                for (int j = 0; j < length; j++) {
	                    arr[index++] = mat[i - 1][j];
	                }
	            }
	        }
	        return arr;
	    }

	@Test
	public void printMatrixPositive0() {
		
		int[] actual=printMatrix(new int[][] {{1,2,3},{4,5,6}},2);
		int[] expected ={1,2,3,6,5,4};
		Assert.assertArrayEquals(expected, actual);
	}

}
