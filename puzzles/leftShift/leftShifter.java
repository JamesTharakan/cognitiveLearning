package puzzles.leftShift;

import java.util.Arrays;
import java.util.stream.IntStream;

public class leftShifter {

	public static void main(String[] args) {
		int array[]=IntStream.range(1, 6).toArray();
		
		int noOfShifts =3;
		int count =0;
		int tempArray[]=new int[noOfShifts];
		
		System.out.println("Number of Shifts :"+noOfShifts);
		
		
		Arrays.stream(array).forEach(num -> System.out.print(num +" "));
		
		//Copy first n elements of the array
		for(int i=0; i<noOfShifts; i++){
			tempArray[i]=array[i];
		}
		System.out.print("\nContents of temp array :");
		Arrays.stream(tempArray).forEach(num -> System.out.print(num +" "));
		
		for(int i=0; i<noOfShifts; i++){
			if(noOfShifts+i <array.length){
				array[i]=array[noOfShifts+i];
				count++;
			}
		}
		System.out.print("\nafter initial shift :");
		Arrays.stream(array).forEach(num -> System.out.print(num +" "));
		
		for(int i=0;i<noOfShifts;i++){
			array[count++]=tempArray[i];
		}
		System.out.print("\nFinal :");
		Arrays.stream(array).forEach(num -> System.out.print(num +" "));
	}
	
	
	

}
