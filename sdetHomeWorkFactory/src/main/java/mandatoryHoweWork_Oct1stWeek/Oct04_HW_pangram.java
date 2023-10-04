package mandatoryHoweWork_Oct1stWeek;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Test;
import org.testng.Assert;

public class Oct04_HW_pangram {

	//ip: List<List<String>>
		//op : String
		//Logic : init StringBuiler a
		//1. usig for loop from 0 to String length
		//2. check that character is not present in the a using indexOf==-1, then
		//3. append the character to a
		//return true a.length==26
		//TC : O[N], SC: O[N]

public boolean checkIfPangram(String s) {
        StringBuilder a=new StringBuilder();
        
        for (int i = 0; i < s.length(); i++) {
			if(a.indexOf(String.valueOf(s.charAt(i)))==-1) {
				a.append(String.valueOf(s.charAt(i)));
			}
		}
	
	return a.length()==26;
    }
@Test
public void checkIfPangramPositive()
{
	boolean actual=checkIfPangram("thequickbrownfoxjumpsoverthelazydog");
	boolean expected =true;
	Assert.assertEquals(expected, actual);
}

}