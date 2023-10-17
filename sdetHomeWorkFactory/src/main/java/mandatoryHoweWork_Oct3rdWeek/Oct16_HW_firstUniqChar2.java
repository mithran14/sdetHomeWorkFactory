package mandatoryHoweWork_Oct3rdWeek;


import java.util.LinkedHashMap;
import java.util.Map;

import org.junit.Test;
import org.testng.Assert;

public class Oct16_HW_firstUniqChar2 {
	//Method 1 
		public int firstUniqChar1(String s) {
			for(char ch : s.toCharArray()){
				if(s.indexOf(ch)==s.lastIndexOf(ch)) return s.indexOf(ch);
			}
			return -1;
		}
	
	public int firstUniqChar(String s) {
		Map<Character,Integer> hm = new LinkedHashMap<>();
		for(int i=0;i<s.length();i++) {
			hm.put(s.charAt(i), hm.getOrDefault(s.charAt(i), 0)+1);
		}
		char c=' ';
		for (Map.Entry<Character, Integer> entry : hm.entrySet()) {
			if(entry.getValue()==1){
				c = entry.getKey();
				break;
			} 
		}
		return (c!=' ')?s.indexOf(c):-1;
	}
	@Test
	public void test() {
		Assert.assertEquals(0, firstUniqChar("baaapu"));
	}
	@Test
	public void test1() {
		Assert.assertEquals(4, firstUniqChar("aappkiimaan"));
	}
}
