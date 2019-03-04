package sorting.bubble;


import sorting.strategyPattern.Sort;
import utils.JUtil;

/**
 *In each cycle the biggest element will be placed in its right position.
 *We run the outer loop n.length number of times  OR  there is atleast one swap in the inner loop 
 * @author jtharaka
 */
public class BubbleSort implements Sort {

	public void sort(int[] input) {

		boolean swapped =true;
		int n = input.length;
		for (int i = 0; i < n-1; i++)
		   {
		     swapped = false;
		     for (int j = 0; j < n-i-1; j++)	
		     {									//In each cycle the biggest element will be placed in its right position,
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
	
}
