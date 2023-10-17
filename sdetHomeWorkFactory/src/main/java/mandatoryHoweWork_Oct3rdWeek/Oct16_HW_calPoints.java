package mandatoryHoweWork_Oct3rdWeek;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.testng.Assert;

public class Oct16_HW_calPoints {
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


		int totalSum = 0;
		for (int score : scoreList) {
			totalSum += score;
		}
		return totalSum;    
	}


	@Test
	public void sortPeoplePositive()
	{
		int actual=calPoints(new String[] {"5","2","C","D","+"});
		int expected =30;
		Assert.assertEquals(expected, actual);
	}

}
