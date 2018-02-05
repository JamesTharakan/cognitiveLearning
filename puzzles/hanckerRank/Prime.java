package puzzles.hanckerRank;

public class Prime {

	/**
	 * FIND a solution with root n complexity
	 * @param args
	 */
    public static void main(String[] args) {

        for(int a0 = 0; a0 < input.length; a0++){
            int n = input[a0];
            	System.out.println(n + " " +(checkPrime(n)? "Prime":"Not prime"));
        }
    }

	private static boolean checkPrime(int num) {
		if(num <2){
			return false;
		}else if(num == 2){
			return true;
		}else if(num %2 == 0){
			return false;
		}
		
		boolean isPrime= true;
		for (int i = num-1; i >= 2; i--) {
			if((num % i)==0){
				isPrime = false;
				break;
			}
		}
		return isPrime;
	}
	
	static int input []= {1000000000,
			1000000001,
			1000000002,
			1000000003,
			1000000004,
			1000000005,
			1000000006,
			1000000007,
			1000000008,
			1000000009};
}

