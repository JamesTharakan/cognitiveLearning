package hanckerRank.dataStructure.queue;

import java.util.Scanner;
import java.util.Stack;

//https://www.hackerrank.com/challenges/queue-using-two-stacks/problem
//	Queue with 2 Stacks
//Status : Completed
public class QueueWithTwoStack {

	public static void main(String[] args) {
		Stack<Integer> aa = new Stack<Integer>();
		Stack<Integer> bb = new Stack<Integer>();
		
		Scanner in = new Scanner(System.in);
		int sizeOfInputs = in.nextInt();
		
		for (int i = 0; i < sizeOfInputs; i++) {
			int input = in.nextInt();
			switch (input) {
			case 1://Enqueue 
				aa.push(in.nextInt());
				break;
			case 2://Dequeue 
				if(!bb.isEmpty()){
					bb.pop();
				}else{
					while(!aa.isEmpty()){
						bb.push(aa.pop());
					}
					bb.pop();
				}
				break;
			case 3://print
				if(!bb.isEmpty()){
					System.out.println(bb.peek());
				}else if(!aa.isEmpty()){
					while(!aa.isEmpty()){
						bb.push(aa.pop());
					}
					System.out.println(bb.peek());
				}
			}
		}
		
		System.out.println("Completed");
		in.close();
	}

}
