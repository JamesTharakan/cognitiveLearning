package puzzles;

import dataStructure.stack.MyStack;

public class GenerateBinary {

	public static void main(String[] args) {
		
		int decimalNumber = 2;
		
		MyStack stack = new MyStack(10);
		String binary = "";

		while (decimalNumber > 0) {
			stack.push(decimalNumber % 2);
			decimalNumber = decimalNumber / 2;
		}

		while (!stack.isEmpty()) {
			binary += stack.pop();
		}

		System.out.println("Binary :"+binary);

	}

}
