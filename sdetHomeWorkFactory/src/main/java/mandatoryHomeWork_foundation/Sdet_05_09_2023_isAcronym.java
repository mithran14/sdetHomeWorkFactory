package mandatoryHomeWork_foundation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class Sdet_05_09_2023_isAcronym {
	
	public boolean isAcronym(List<String> words, String s) {
		
		int size = words.size();
		String output="";
		for (int i = 0; i < size; i++) {
			output+= words.get(i).charAt(0);
		}
		return s.equals(output);	
	}
	
	@Test
	public void isAcronymPositive() {
		boolean actual=isAcronym(new ArrayList<String>(Arrays.asList("alice","bob","charlie")), "abc");
		boolean expected =true;
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void isAcronymPositive2() {
		boolean actual=isAcronym(new ArrayList<String>(Arrays.asList("never","gonna","give","up","on","you")), "ngguoy");
		boolean expected =true;
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void isAcronymNegative() {
		boolean actual=isAcronym(new ArrayList<String>(Arrays.asList("an","apple")), "a");
		boolean expected =false;
		Assert.assertEquals(expected, actual);
	}
}
