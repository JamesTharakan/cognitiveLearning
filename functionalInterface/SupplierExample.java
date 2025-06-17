package functionalInterface;

import java.util.Random;
import java.util.function.Supplier;

public class SupplierExample {

	public static void main(String[] args) {
		Supplier <Integer> ran = ()-> new Random().nextInt(1000);
		System.out.println("Supplier sent info: "+ran.get());

	}
	
    

}

 