package puzzles;

import dataStructure.stack.MyStack;

public class GenerateBinary {

	public static void main(String[] args) {
		
		int decimal = 2;
		
		MyStack stack = new MyStack(10);
		String binary = "";

		while (decimal > 0) {
			stack.push(decimal % 2);
			decimal = decimal / 2;
		}

		while (!stack.isEmpty()) {
			binary += stack.pop();
		}

		System.out.println("Binary :"+binary);

	}

}
