package concepts.javaUpdates;

import java.util.ArrayList;
import java.util.function.Consumer;

public class ForEachIterable {
	
	static ArrayList<Integer> numList = new ArrayList<Integer>();

	public static void main(String[] args) {
		
		numList.add(1);numList.add(2);numList.add(3);numList.add(4);numList.add(5);
		
		System.out.print(" Enchanced loop ::");
		for(int num : numList) { // Enchanced loop
			System.out.print(num+" ");
		}
		
		
		System.out.print("\n forEach() taking a lambda expression::");
		numList.forEach(num -> {  System.out.print(num+" ");	});  //ForEach()
		

		System.out.print("\n Passing a consumer Object Anonmous class ::");
		Consumer<Integer> printComsumer = new Consumer<Integer>() {
			public void accept(Integer num) {
				System.out.print(num+" ");
			}
		};
		numList.forEach(num -> printComsumer.accept(num));
		
		
		System.out.print("\nEven this ");
		numList.forEach(printComsumer);
		
		
	}
}
