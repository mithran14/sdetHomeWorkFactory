package dailyConnectAssignment;

import java.util.ArrayList;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class Sdet_30_08_2023_CW_FillingJars {

	public int solve(int n, List<List<Integer>> operations) {

		int[] arr=new int[n];
		int sum=0;
		for (int i = 0; i < operations.size(); i++) {
	        List<Integer> op = operations.get(i);
	     
			int a  = op.get(0);
			int b  = op.get(1);
			int k  = op.get(2);
		
			for (int j = a-1;j <=b-1; j++) 
			{
				arr[j]+=k;
			}
		}
		for (int i : arr) {
			sum+=i;
		}
		return sum/n;
}

@Test
public void solvePost() {
	List<List<Integer>> expected = new ArrayList<List<Integer>>();

	List<Integer> operation1 = new ArrayList<Integer>();
	operation1.add(1); operation1.add(2); operation1.add(100);
	expected.add(operation1);

	List<Integer> operation2 = new ArrayList<Integer>();
	operation2.add(2); operation2.add(5); operation2.add(100);
	expected.add(operation2);

	List<Integer> operation3 = new ArrayList<Integer>();
	operation3.add(3); operation3.add(4); operation3.add(100);
	expected.add(operation3);

	int actual = solve(5, expected);
	int expected1 = 160;

	Assert.assertEquals(expected1, actual);
}


}
