package hanckerRank.dataStructure.stack;

//https://www.hackerrank.com/challenges/game-of-two-stacks/problem
//Incomplete: 9/14	
	public class TwoStack {

	public static void main(String[] args) {
		int[] a = {4 ,2, 4, 6, 1};// 
		int b[] = {  2 ,1,8, 5 };// 
		System.out.println(twoStacks(10, a, b) );
	}
	
	private static int twoStacks(int target, int[] a, int[] b) {
		int noOfDraws =0;
		int currentSum =0;

		int i=0;
		int j=0;

		while(currentSum <= target && (i < a.length  ||  j < b.length)) {
			int key=-1;
			
			if (i < a.length) {
				key = a[i];
				i++;
				if(j < b.length && b[j] < key) {
					key = b[j];
					i--;
					j++;
				}
			}else {
				if (j < b.length) {
					key = b[j];
					j++;
				}
			}

			if(key == -1) {
				break;
			}
			
			if ( (currentSum + key)  <= target) {
				currentSum = currentSum + key;
				noOfDraws++;
			} else {
				break;
			}
			
		}
		return noOfDraws;
	}
	
}