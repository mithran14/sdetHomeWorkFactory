package mandatoryHoweWork_Oct4thWeek;

import org.junit.Assert;
import org.junit.Test;

public class Oct27_HW_MergeAlternate {
	public String merge(String word1, String word2) {
        int size =(word1.length()<word2.length())?word1.length():word2.length();
        int rem = word1.length()+word2.length()-size;
        StringBuilder sb = new StringBuilder();
        int i=0;
        for(i=0;i<size;i++){
            sb.append(word1.charAt(i));
            sb.append(word2.charAt(i));
        }
            if(rem==word1.length()){
              for(int j=i;j<word1.length();j++){
                  sb.append(word1.charAt(j));
              }
            }
            else{
                for(int j=i;j<word2.length();j++){
                  sb.append(word2.charAt(j));
              }
            }
        return new String(sb);
    }
 
 @Test
	public void tst1() {
		Assert.assertEquals("apbqcr", merge("abc","pqr"));
	}
	@Test
	public void tst2() {
		Assert.assertEquals("apbqrs", merge("ab","pqrs"));
	}
	@Test
	public void tst3() {
		Assert.assertEquals("apbqcd", merge("abcd","pq"));
	}

	@Test
	public void tst4() {
		Assert.assertEquals("a", merge("a",""));
	}
}