package hanckerRank.random;

public class secondLargest {
	public static void main(String[] args) {
		int array[]=new int[]{1,3,2,4};
		int largest,secondlargest;

		if(array.length >1){
			secondlargest= array[0];
			if(secondlargest >array[1]){
				largest=secondlargest;
				secondlargest=array[1];
			}else{
				largest=array[1];
			}
			
			for(int i=2;i<array.length;i++){
				if(array[i]< largest && array[i] > secondlargest)
					secondlargest= array[i];
				else if (array[i]> largest){
					secondlargest= largest;
					largest= array[i];
				}
			}
			System.out.println("secondLargest number is "+ secondlargest);
			
		}else{
			System.out.println("There is no second largest number");
		}
		
	}

}
