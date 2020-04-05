package utils;

import dataStructure.stack.MyStack;

public class JUtil {

	public static void printIntArray(String label, int array[]) {
		System.out.print(label + "[ ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println("] ");
	}

	public static void printMe(String label, Object printMe) {
		System.out.print(label + "::" + printMe);

	}
	
	public static String generateBinary(int decimal) {
		MyStack stack = new MyStack(10);
		String binary = "";

		while (decimal > 0) {
			stack.push(decimal % 2);
			decimal = decimal / 2;
		}

		while (!stack.isEmpty()) {
			binary += stack.pop();
		}

		return binary;
	}
}
