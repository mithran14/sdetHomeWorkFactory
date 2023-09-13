package dailyConnectAssignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class Sdet_CW_13_09_2023_baseball {
	/*
https://leetcode.com/problems/baseball-game/description/
	 */

	public int calPoints(String[] operations) {

		List<Integer> scoreList = new ArrayList<>();

		for (String op : operations) {
			int n = scoreList.size();
			if (op.equals("C")) {
				if (n > 0) {
					scoreList.remove(n - 1);
				}
			} else if (op.equals("D")) {
				if (n > 0) {
					int lastValidScore = scoreList.get(n - 1);
					scoreList.add(2 * lastValidScore);
				}
			} else if (op.equals("+")) {
				if (n >= 2) {
					int lastScore = scoreList.get(n - 1);
					int secondLastScore = scoreList.get(n - 2);
					int newScore = lastScore + secondLastScore;
					scoreList.add(newScore);
				}
			} else {
				scoreList.add(Integer.parseInt(op));
			}
		}

System.out.println(scoreList);
		int totalSum = 0;
		for (int score : scoreList) {
			totalSum += score;
		}
		return totalSum;

	}
	@Test
	public void unique_emailPositive0()
	{

		int actual=calPoints(new String[] {"5","-2","4","C","D","9","+","+"});
		int expected = 27;
		Assert.assertEquals(expected, actual);
	}


}