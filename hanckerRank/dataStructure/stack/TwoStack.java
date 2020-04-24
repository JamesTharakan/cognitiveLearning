package hanckerRank.dataStructure.stack;

//https://www.hackerrank.com/challenges/game-of-two-stacks/problem
	
	public class TwoStack {

	public static void main(String[] args) {
		int []a= {4 ,2, 4, 6, 1};
		int b[]= {2 ,1, 8, 5};
		System.out.println(twoStacks(10, a, b) );
	}
	
	static int twoStacks(int x, int[] a, int[] b) {
		int count = 0;
		int sum = 0;
		int i = 0, j = 0;

		do {
			if (i == a.length && j == b.length)
				break;// return count;

			if (WorkWithA(a, b, i, j, x)) {

			} else {
				// take from b
			}
			
		} while (sum > x);
		
		return count;
	}

	private static boolean WorkWithA(int[] a, int[] b, int i, int j, int x) {
		
		if(j == b.length-1  || a[i] <= b[j]){
			return true;
		}
		
		return false;
	}

}


















//static int twoStacks(int x, int[] a, int[] b) {
//	int count = 0;long sum = 0;
//	int i = 0, j = 0;
//	boolean cont = true;
//	do{
//		if (i < a.length-1 && a[i] <= b[j]) {
//			if ((a[i] + sum) <= x) {
//				sum+=a[i];
//				count++;
//				i++;
//			}else{
//				break;
//			}
//
//		} else if (j < b.length-1) {
//			if ((b[j] + sum) <= x) {
//				sum+=b[j];
//				count++;
//				j++;
//			}else{
//				break;
//			}
//		} else {
//			cont = false;
//		}
//	}while (cont);
//
//	return count;
//
//}

