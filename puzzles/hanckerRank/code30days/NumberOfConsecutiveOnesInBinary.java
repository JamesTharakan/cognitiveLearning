package puzzles.hanckerRank.code30days;

import java.util.Scanner;
import java.util.Stack;

/*Given a base-10 integer,n , convert it to binary (base-2). 
 * Then find and print the base-10 integer denoting the maximum number of consecutive 1's 
 * in the binary representation.
*/
public class NumberOfConsecutiveOnesInBinary {

	public static void main(String[] args) {
		Stack stack = new Stack();
		int n = 15;

		while (n > 0) {
			stack.push(n % 2);
			n = n / 2;
		}

		int count = 0;
		int high = 0;

		while (!stack.isEmpty()) {

			if ((Integer) stack.pop() == 1) {
				if (++count > high)
					high = count;
			} else {
				count = 0;
			}
		}
		System.out.println(high);
	}

}
