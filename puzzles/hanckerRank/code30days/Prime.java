package puzzles.hanckerRank.code30days;

public class Prime {
	static int input[] = { 1000000000};
    public static void main(String[] args) {
        for(int a0 = 0; a0 < input.length; a0++){
            int n = input[a0];
            	System.out.println(n + " " +(checkPrime(n)? "Prime":"Not prime"));
        }
    }

	private static boolean checkPrime(int num) {//to many logics, just to reduce runtime in hacker rank 
		if(num <2){
			return false;
		}else if(num == 2){
			return true;
		}else if(num %2 == 0){//PointA
			return false;
		}
		
		boolean isPrime= true;
		//Just loop through Odd numbers because even number would be verified at PointA
		for (int i = num-1; i >= 2; i--) {
			if((num % i)==0){
				isPrime = false;
				break;
			}
		}
		return isPrime;
	}
	
	
	private static boolean isSimple(int num) {
		boolean flag = true;
		for (int i = 2; i <= num / 2; ++i) {
			// condition for nonprime number
			if (num % i == 0) {
				flag = false;
				break;
			}
		}
		return flag;

	}
	
	
}

