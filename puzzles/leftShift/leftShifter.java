package puzzles.leftShift;

public class leftShifter {

	public static void main(String[] args) {
		int array[]=new int[]{1,2,3,4,5};

		int noOfShifts =3;
		int count =0;
		int tempArray[]=new int[noOfShifts];
		System.out.println("Number of Shifts :"+noOfShifts);
		utils.JUtil.printIntArray("Input array", array);
		//Copy first n elements of the array
		for(int i=0; i<noOfShifts; i++){
			tempArray[i]=array[i];
		}
		utils.JUtil.printIntArray("contents copied to tempArray", tempArray);
		
		for(int i=0; i<noOfShifts; i++){
			if(noOfShifts+i <array.length){
				array[i]=array[noOfShifts+i];
				count++;
			}
		}
		utils.JUtil.printIntArray("after initial shift ", array);
		
		for(int i=0;i<noOfShifts;i++){
			array[count++]=tempArray[i];
		}
		utils.JUtil.printIntArray("Final output: ", array);
	}
	
	
	

}
