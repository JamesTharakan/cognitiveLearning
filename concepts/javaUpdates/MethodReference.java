package concepts.javaUpdates;

import java.util.ArrayList;

public class MethodReference {

	static ArrayList<Integer> numList = new ArrayList<Integer>();

	public static void main(String[] args) {
		
		numList.add(1);numList.add(2);numList.add(3);numList.add(4);numList.add(5);
		
		System.out.print("\n methodReference :: Construtor :");
		numList.forEach(myPrinter::new);		//methodReference ::Construtor
		
		
		System.out.print("\n methodReference :: static method :");
		numList.forEach(myPrinter::staticPrintMe);		//methodReference ::static method
		
		System.out.print("\n methodReference :: instance method :");
		myPrinter my = new myPrinter(123);
		numList.forEach(my::printMe);		//methodReference ::instance method
		
		
//		System.out.print("\n methodReference :: Type method :");
//		numList.forEach(printers::printMe);		//methodReference ::Type method

	}

}



interface printers {
	public void printMe(Object obj);
}

class myPrinter implements printers {
	int i;

	myPrinter(int i) {
		this.i = i;
	}

	public void printMe(Object obj) {
		System.out.print(obj);
	}

	public static void staticPrintMe(Object obj) {
		System.out.print(obj);
	}

}