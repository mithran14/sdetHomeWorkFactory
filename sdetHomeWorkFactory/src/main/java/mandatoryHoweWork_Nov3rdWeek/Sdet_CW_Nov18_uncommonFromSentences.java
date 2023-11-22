package mandatoryHoweWork_Nov3rdWeek;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.junit.Test;

public class Sdet_CW_Nov18_uncommonFromSentences {

	//initialize Hashmap<String,Integer>
	//split the String s1,s2 into words1,words2
	//using for loop set the condition i<words1.length && j<words2.length
	//using put an getOrDefault method add the words
	//initialize ArrayList<String>
	//get the values from hashmap, check the value==1 then a the key into list(result)
	//convert list into String array


	@Test
	public void data()
	{
		String s1="this apple is sweet"; 
		String s2="this apple is sour";
		uncommonFromSentences(s1, s2);
		
	}

	private String[] uncommonFromSentences(String s1, String s2) {

	    Map<String, Integer> map = new HashMap<>();
	    
	    String[] words1 = s1.split("\\s+");
	    String[] words2 = s2.split("\\s+");

	    for (int i=0;i< words1.length; i++) {
	    	 map.put(words1[i], map.getOrDefault(words1[i], 0) + 1);
		}
	    
	    for (int j=0;j< words1.length; j++) {
	    	 map.put(words2[j], map.getOrDefault(words2[j], 0) + 1);
		}

	    List<String> result = new ArrayList<>();

	    for (Map.Entry<String, Integer> entry : map.entrySet()) {
	        if (entry.getValue() == 1) {
	            result.add(entry.getKey());
	        }
	    }

	    String[] resultArray = result.toArray(new String[0]);

	    return resultArray;
	}
}


