package puzzles;

public class NagativeLeft {

	public static void main(String[] args) {
		int [] input = {5, -4, 3, -2, 6, -11, 12, -8, 9};
		
		int lastPosPosition=-1;
		
		for (int i = input.length-1; i >=0; i--) {
			if(input[i] >= 0 && lastPosPosition ==-1) {
				lastPosPosition =i;
			}else if(input[i] <0 && lastPosPosition >=0 ){
				swap(i, lastPosPosition, input);
				lastPosPosition =i;
			}
			for (int ii = 0; ii < input.length; ii++) {
				System.out.print(" "+input[ii]);
			}
			System.out.println();
		}
		

	}

	private static void swap(int i, int j,int input[]) {
		int temp = input[i];
		input[i]=input[j];
		input[j]=temp;
		
	}

}
