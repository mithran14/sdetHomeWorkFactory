package mandatoryHoweWork_Oct2nWeek;

import org.junit.Test;
import org.testng.Assert;

public class SortNamesByHeight {
	
	/*
	 * Create two arrays: names for names and heights for corresponding heights.
	 * Compare adjacent elements in the heights array. If an element is taller than
	 * the next, swap both the height and the name. Repeat this process until the
	 * list is sorted by height.
	 * 
	 * Print the sorted names, and you'll have names sorted by height.
	 */	
	
	
	public String[] sortPeople(String[] names, int[] heights) {
       
        for (int i = 0; i < heights.length - 1; i++) {
            for (int j = 1; j < heights.length-1; j++) {
                if (heights[i] < heights[j]) {
                   
                    int tempHeight = heights[j];
                    heights[j] = heights[i];
                    heights[i] = tempHeight;

                    String tempName = names[j];
                    names[j] = names[i];
                    names[i] = tempName;
                }
            }
        }

		return names;
    }
	
	@Test
	public void sortPeoplePositive()
	{
		String[] actual=sortPeople(new String[] {"Mary", "John", "Emma", "Vicky", "Mari"},new int[] {170, 165, 180, 162, 163});
		String[] expected =new String[] {"Emma","Mary","John","Mari","vicky"};
		Assert.assertEquals(expected, actual);
	}
	
}
