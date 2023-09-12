package dailyConnectAssignment;

import java.util.Arrays;
import java.util.TreeSet;

import org.junit.Assert;
import org.junit.Test;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Sdet_CW_12_09_2023_unique_email {
	/*
	 * 	 https://leetcode.com/problems/unique-email-addresses/description/
	#Creating empty TreeSet
	#Creating StringBuilder sub;
	#using for each loop get the first String element
	#using substring from 0th char to before @ char and Stored in sub
	#using substring from @ char to last char and Stored in String Last
	#if the sub contains any . then using replace and stored in sub
	#if the sub contains any + then using substring and remove the character after the + symbol (including +)
	 and add the Last String added those in TreeSet
	#return the Set size

	Time complexity // O(n)

	 */

	public int unique_email(String[] so) {
		
		TreeSet<String> set1=new TreeSet<>();
		StringBuilder sub=new StringBuilder();
		for (String s : so) {
			sub=new StringBuilder(s.substring(0, s.indexOf("@")));
			String last=s.substring(s.indexOf("@"),s.length());
			if (new String(sub).contains("+")) {
				sub=new StringBuilder(new String(sub).replace(".", ""));
			}
			if (new String(sub).contains("+")) {
				set1.add(sub.substring(0, sub.indexOf("+"))+last);
			}
			else {
				set1.add(sub.toString()+last);
			}			
		}
		return set1.size();	
	}

	@Test
	public void unique_emailPositive0()
	{
		int actual=unique_email(new String[]{"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"});
		int expected = 2;
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void unique_emailPositive1()
	{
		int actual=unique_email(new String[]{"a@leetcode.com","b@leetcode.com","c@leetcode.com"});
		int expected = 3;
		Assert.assertEquals(expected, actual);
	}

}