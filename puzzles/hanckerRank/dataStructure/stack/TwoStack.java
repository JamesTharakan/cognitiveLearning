package puzzles.hanckerRank.dataStructure.stack;

//https://www.hackerrank.com/challenges/game-of-two-stacks/problem
//Incomplete: 9/14	testcases failed
	public class TwoStack {

	public static void main(String[] args) {
		int[] a = {19,9,8,13,1,7,18,0,19,19,10,5,15,19,0,0,16,12,5,10};// 
		int b[] = {11,17,1,18,14,12,9,18,14,3,4,13,4,12,6,5,12,16,5,11,16,8,16,3,7,8,3,3,0,1,13,4,10,7,14};// 
		System.out.println(twoStacks(67, a, b) );  //Expected output :6
	}
	
	private static int twoStacks(long target, int[] a, int[] b) {
		int noOfDraws =0;
		long currentSum =0;

		int i=0;
		int j=0;

		while(currentSum <= target && (i < a.length  ||  j < b.length)) {
			long smallestNumber=-1;
			
			if (i < a.length) {
				smallestNumber = a[i];
				i++;
				if(j < b.length && b[j] < smallestNumber) {
					smallestNumber = b[j];
					i--;
					j++;
				}
			}else {
				if (j < b.length) {
					smallestNumber = b[j];
					j++;
				}
			}
						
			if ( (currentSum + smallestNumber)  <= target) {
				currentSum = currentSum + smallestNumber;
				noOfDraws++;
			} else {
				break;
			}
			
		}
		return noOfDraws;
	}
	
}