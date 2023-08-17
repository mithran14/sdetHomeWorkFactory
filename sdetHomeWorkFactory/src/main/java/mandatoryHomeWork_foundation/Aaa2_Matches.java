package mandatoryHomeWork_foundation;

import org.junit.Assert;
import org.junit.Test;

public class Aaa2_Matches 
{

	/*
	 * https://leetcode.com/problems/count-of-matches-in-tournament/description/
	Count of Matches in Tournament

	You are given an integer n, the number of teams in a tournament that has strange rules:

	If the current number of teams is even, each team gets paired with another team. 
	A total of n / 2 matches are played, and n / 2 teams advance to the next round.
	If the current number of teams is odd, one team randomly advances in the tournament, 
	and the rest gets paired. A total of (n - 1) / 2 matches are played, and (n - 1) / 2 + 1 teams 
	advance to the next round.
	Return the number of matches played in the tournament until a winner is decided.
	
	Example 1:

	Input: n = 7
	Output: 6
	Explanation: Details of the tournament: 
	- 1st Round: Teams = 7, Matches = 3, and 4 teams advance.
	- 2nd Round: Teams = 4, Matches = 2, and 2 teams advance.
	- 3rd Round: Teams = 2, Matches = 1, and 1 team is declared the winner.
	Total number of matches = 3 + 2 + 1 = 6.
	
	Example 2:

	Input: n = 14
	Output: 13
	Explanation: Details of the tournament:
	- 1st Round: Teams = 14, Matches = 7, and 7 teams advance.
	- 2nd Round: Teams = 7, Matches = 3, and 4 teams advance.
	- 3rd Round: Teams = 4, Matches = 2, and 2 teams advance.
	- 4th Round: Teams = 2, Matches = 1, and 1 team is declared the winner.
	Total number of matches = 7 + 3 + 2 + 1 = 13.

	#pseudocode
	----------
	#initialize nums,teams,match=0
	#assign the num input to teams
	#using while loop set the condition teams>1 
	#using if statement find the team size is even or not
	#if even, then find the matches played and teams for next round
	#if the current teams size will be odd then calculate and find the matches played and teams for next round
	#repeat the loop until team size is 1 
	#return the int match value

	 */
	

	public int matches(int num)
	{
		int teams=num; 
		int match=0;
		
		while (teams>1) 
		{
			if (teams%2==0) 
			{
				teams=teams/2;
				match=match+teams;
			}
			else 
			{
				match=match+(teams-1)/2;
				teams=((teams-1)/2)+1;
			}
		}
		return match;
	}

	@Test
	public void matchesPositive()
	{
		int actual=matches(14);
		int expected =13;
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void matchesPositive1()
	{
		int actual=matches(7);
		int expected =6;
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void climbing_stairsPositive2()
	{
		int actual=matches(1);
		int expected =0;
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void matchesPositive3()
	{
		int actual=matches(5);
		int expected =4;
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void matchesPositive4()
	{
		int actual=matches(9);
		int expected =8;
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void matchesEdge()
	{
		int actual=matches(0);
		int expected =0;
		Assert.assertEquals(expected, actual);
	}

}
