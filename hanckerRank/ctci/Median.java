package hanckerRank.ctci;

import java.util.Scanner;

public class Median {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int input[]= new int[n];
		for (int i = 0; i < n; i++) {
			
			input[i]=in.nextInt();
			int size=(i+1);
		
			for (int j = (size/2)-1; j >= 0; j--) {    
				buildHeap(input, size, j);
			}	
				for (int k = size-1; k >= 0; k--) {
					int temp = input[0];
					input[0] = input[k];
					input[k] = temp;
					
					// Heapify root element
					buildHeap(input, k, 0);
				}
			
			System.out.println(getMedianValue(input,0,i));
			
		}
		in.close();
	}
	public static float getMedianValue(int input[],int start,int size) {
		float median=0;
		size++;
		if(size%2  == 0){
			median = (float) ((input[size/2]+input[size/2-1])/2.0);
		}else{
			median = (float) (input[size/2]);
		}
	//	System.out.print("size : "+start+" end :" +size+"-> "+median);JUtil.printIntArray("-------------------", input);//odd this this-1
		return median;
	}
	
	public static void buildHeap(int arr[], int arraySize, int currentRootIndex) {	// Find largest among root, left child and right child
		int largest = currentRootIndex; //current root
		int leftChildIndex = 2 * currentRootIndex + 1;
		int rightChildIndex = 2 * currentRootIndex + 2;

		if (leftChildIndex < arraySize && arr[leftChildIndex] > arr[largest])
			largest = leftChildIndex;

		if (rightChildIndex < arraySize && arr[rightChildIndex] > arr[largest])
			largest = rightChildIndex;

		// Swap and continue heapifying if root is not largest
		if (largest != currentRootIndex) {
			int swap = arr[currentRootIndex];
			arr[currentRootIndex] = arr[largest];
			arr[largest] = swap;
			buildHeap(arr, arraySize, largest);
		}
	}

	
}