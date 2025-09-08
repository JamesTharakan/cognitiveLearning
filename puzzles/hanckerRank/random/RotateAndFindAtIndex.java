package puzzles.hanckerRank.random;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/circular-array-rotation/problem
 * @author jtharakan
 *
 */
public class RotateAndFindAtIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List input = new ArrayList<>(List.of(3,4,5));
		List queries = new ArrayList<>(List.of(0,1));
		List result = circularArrayRotation(input, 2, queries);
		System.out.println(result);//4,5
	}

	public static List<Integer> circularArrayRotation(List<Integer> a, int k, List<Integer> queries) {
		Integer[] result = new Integer[queries.size()];

		int n= a.size();
		int actualRotation = k % n;
		int nMr = n-actualRotation;
		
		//(n-r+i)%n     derived  this by observing/trailError 
		
		for (int i = 0; i < result.length; i++) {
			result[i] = a.get(((nMr+queries.get(i))%n));
		}

		return Arrays.asList(result);

	}
	
	public static void mmmain(String[] args) {//this is others good solution
	    Scanner in = new Scanner(System.in);
	    int arraySize = in.nextInt();
	    int rotations = in.nextInt();	//Number of rotations
	    int query = in.nextInt();
	    int rot = rotations % arraySize;
	    int[] arr = new int[arraySize];
	    for (int i = 0; i < arraySize; i++)
	        arr[i] = in.nextInt();
	  
	    for (int i = 0; i < query; i++) {
	        int idx = in.nextInt();
	        if (idx - rot >= 0)
	            System.out.println(arr[idx - rot]);
	        else
	            System.out.println(arr[idx - rot + arr.length]);
			}
		}

}
