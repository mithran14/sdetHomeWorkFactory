package mandatoryHoweWork_Nov3rdWeek;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.junit.Test;

public class Sdet_CW_Nov18_arrayStringsAreEqual {

	//initialize two String as a and b
	//using for loop iterate through the String array and stored with a and b
	//return true if a equals b
	
	//Time-O[N]
	//Space-O[1]

	@Test
	public void data()
	{
		String[] word1 = {"ab", "c"};
		String[]  word2 = {"a", "bc"};
		arrayStringsAreEqual(word1, word2);
		
	}

	private boolean arrayStringsAreEqual(String[] word1, String[] word2) {

	    String a="",b="";
	   

	    for (int i=0;i< word1.length; i++) {
	    	a+=word1[i];
		}
	    
	    for (int j=0;j< word2.length; j++) {
	    	b+=word2[j];
		}

	    return a.equals(b);
	}
}


