package mandatoryHomeWork_foundation;

public class ArraySign {
	  public int arraySign(int[] nums) {
	        int count=0;
	        for(int i=0;i<nums.length;i++){
	            if(nums[i]==0){
	                return 0;
	            }
	            else if(nums[i]<0){
	                count++;
	            }
	        }
	        if(count%2!=0){
	            return -1;
	        }
	        return 1;
	    }
	}


	//Input: int[]
	//Output -1 or 0 or 1
	//Logic -initialize count =0
	//1. Run a for loop till last element
	//2. if any element in array has zero return 0
	//3. If array elememt is < 0 it is negative,so increment counter
	//4. Outside loop, check if count%2!=0 (means there is odd number of -ve numbers so product will be -ve) , if yes return -1
	//5. return 1 (all other scenarios will have +ve product)
