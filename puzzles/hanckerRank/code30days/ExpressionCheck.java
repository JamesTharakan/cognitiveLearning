package puzzles.hanckerRank.code30days;

import dataStructure.stack.MyStack;

public class ExpressionCheck {
    
    public static boolean isBalanced(String expression) {
        boolean isBalanced= true;
        MyStack stack = new MyStack(expression.length());
        for(int i=0;i<expression.length();i++){
            char n= expression.charAt(i);
            
            switch (n) {
			case '(':
					stack.push(')');
				break;
			case '{':
					stack.push('}');
				break;
			case '[':
				stack.push(']');
				break;

			default:
				if(stack.isEmpty() || ((char)(stack.pop())!= n)){
					return false;
				}
				break;
			}
        }
        
       return isBalanced; 
    }
  
    public static void main(String[] args) {
    	String expression = "{[(])}";
           System.out.println(isBalanced(expression));
        }
    
}
