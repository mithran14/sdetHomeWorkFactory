package mandatoryHoweWork_Oct4thWeek;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

import org.junit.Test;
import org.testng.Assert;

public class Oct21_CW_bubbleSort {

	 public static void bubbleSort(int[] arr) {
	        int n = arr.length;
	        boolean swapped;
	        
	        for (int i = 0; i < n - 1; i++) {
	            swapped = false;
	            
	            for (int j = 0; j < n - i - 1; j++) {
	                if (arr[j] > arr[j + 1]) {
	                    // Swap arr[j] and arr[j+1]
	                    int temp = arr[j];
	                    arr[j] = arr[j + 1];
	                    arr[j + 1] = temp;
	                    swapped = true;
	                }
	            }
	            
	            // If no two elements were swapped in the inner loop, the array is already sorted
	            if (!swapped) {
	                break;
	            }
	        }
	    }

	    public static void main(String[] args) {
	        int[] arr = {64, 34, 25, 12, 22, 11, 90};

	        System.out.println("Original Array:");
	        for (int num : arr) {
	            System.out.print(num + " ");
	        }

	        bubbleSort(arr);

	        System.out.println("\nSorted Array:");
	        for (int num : arr) {
	            System.out.print(num + " ");
	        }
	    }
	}