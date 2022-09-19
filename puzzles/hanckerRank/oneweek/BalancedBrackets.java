package puzzles.hanckerRank.oneweek;

import java.io.IOException;
import java.util.Stack;

public class BalancedBrackets {
	public static void main(String[] args) throws IOException {
		System.out.println(isBalanced("[()][{}["));
	}

	public static String isBalanced(String s) {
		// Write your code here
		Stack<String> stack = new Stack<String>();

		String returnVal = "YES";

		final String os = "[";
		final String ob = "{";
		final String op = "(";

		final String cs = "]";
		final String cb = "}";
		final String cp = ")";

		for (int i = 0; i < s.length(); i++) {

			String temp = Character.toString(s.charAt(i));
			
			switch (temp) {
			case os:
			case op:
			case ob:
				stack.push(temp);
				break;
			case cs:
				if (stack.isEmpty() || !stack.pop().equals(os)  ) 
					return "NO";
				break;
			case cp:
				if (stack.isEmpty() || !stack.pop().equals(op)) 
					return "NO";
				break;
			case cb:
				if (stack.isEmpty() || !stack.pop().equals(ob)) 
					return "NO";
				break;
			}

		}
		if(!stack.isEmpty())
			return "NO";
		
		return returnVal;

	}

}
