package sorting.bubble;


import sorting.strategyPattern.Sort;
import utils.JUtil;

/**
 *
 *The main logic is inside the inner for loop. 
 *1. The logic is , compare the current element with its next element.
 *	 If it is greater, then swap. So by the end of first cycle the largest element has reached its final/correct position.
 *2. Since in every cycle the nth largest element will reach its position, 
 *		i.e In 1st cycle first largest element will reach its place
 *			In 2nd cycle second largest element will reach its place
 *			and so on
 *3.So we use an outer loop and make sure that the inner loop does not compare again with the already settled elements. 
 *
 *Improvement to this Algo : If there are no swaps during any cycle, it means the array is sorted and we can break out.
 *
 */
public class BubbleSort implements Sort {

	public void sort(int[] input) {

		boolean swapped =true;
		int n = input.length;
		for (int i = 0; i < n-1; i++)		// this i used reduce the outer length for inner loop 
		   {
		     swapped = false;		//this is used as a improvement to reduce time
		     for (int j = 0; j < (n-1)-i; j++)	
		     {									//In each cycle the biggest element will be pushed to the right side,
		        if (input[j] > input[j+1])		// so "i" is used to avoid further comparisons on that element	
		        {
		           swap(input, j, j+1);
		           swapped = true;
		           JUtil.printIntArray(" "+i+"."+j, input);
		        }else{
		        	System.out.println(" "+i+"."+j+" BubbleSort.sort()::No swap needed");
		        }
		     }
		     // IF no two elements were swapped by inner loop, then break
		     if (swapped == false)
		    	 break;
		   }
	}
	private static void swap(int[] input, int i, int j) {
		if (i == j)
			return;
		int temp = input[i];
		input[i] = input[j];
		input[j] = temp;
	}
	
	public void bruteForce(int[] input) {//BruteForce Sorting

		int n = input.length;
		
		for (int i = 0; i < n-1; i++)
		   {
		     for (int j = 0; j < n-1-i; j++)	
		     {									
		        if (input[j] > input[j+1])			
		           swap(input, j, j+1);
		     }
		   }
	}
	
}
