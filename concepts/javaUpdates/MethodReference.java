package concepts.javaUpdates;

import java.util.ArrayList;

public class MethodReference {

	static ArrayList<Integer> numList = new ArrayList<Integer>();

	public static void main(String[] args) {
		
		numList.add(1);numList.add(2);numList.add(3);numList.add(4);numList.add(5);
		
		// Instead of
		numList.forEach(num -> { new PrinterClass(num);	});  //Construtor
		numList.forEach(num -> { PrinterClass.staticPrint(num);	});  //static method
		numList.forEach(num -> {  new PrinterClass(num).print(num);	});  //instance method
				
				
		numList.forEach(PrinterClass::new);		//methodReference ::Construtor
		numList.forEach(PrinterClass::staticPrint);		//methodReference ::static method
		
		PrinterClass my = new PrinterClass(123);
		numList.forEach(my::print);		//methodReference ::instance method
		
//		System.out.print("\n methodReference :: Type method :");
//		numList.forEach(printers::printMe);		//methodReference ::Type method
		
		
//		so basically we need object to access non-static methods

	}

}


interface printers {
	public void print(Object obj);
}

class PrinterClass implements printers {
	int i;

	PrinterClass(int i) {
		this.i = i;
	}
	
	public int getI() {
		return i;
	}

	public static void staticPrint(Object obj) {
		System.out.println(" Static method :"+obj);
	}

	public void print(Object obj) {
		System.out.println(" Instance method :"+obj);
	}
	

	public void printTwoArgs(Object obj, int i) {				//TODO: How to call this in MethodReference ?			
		System.out.println(" Instance method :"+obj);
	}


}