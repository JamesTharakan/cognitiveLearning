package collection.arrayList;

import java.util.ArrayList;
import java.util.List;

public class CopyConstructor {

	public static void main(String[] args) {
		CopyConstructor caller = new CopyConstructor();
		
		caller.copyConstrutors();

	}

	/**
	 * Passing a list to another list constructor will only copy the reference
	 * Where as using AddAll, will create a duplicate.
	 */
	private void copyConstrutors() {
		List <Integer> base = new <Integer>ArrayList(10);
		base.add(1);
		System.out.println("Base :"+base );
		
		List<Integer> copy = new ArrayList<>(base); 	//Even though a new operator is used 
		
		System.out.println("base : "+ base.hashCode());
		System.out.println("copy : "+ copy.hashCode());
		
		copy.add(2);
		System.out.println("\nBase" +base);
		System.out.println("Copy" +copy);
		
		System.out.println("Hascode of base after insert to copy : "+ base.hashCode());
		System.out.println("Hascode of copy after insert to copy : "+ copy.hashCode());
		
		List<Integer> addAll= new ArrayList<>();
		addAll.addAll(copy);
		System.out.println("Hashcode of addAll : "+ addAll.hashCode());
		
		
		System.out.println("\nBase" +copy);
		System.out.println("Copy" +copy);
		System.out.println("addAll" +addAll);
		
		addAll.add(3);
		
		System.out.println("\nBase" +copy);
		System.out.println("Copy" +copy);
		System.out.println("addAll" +addAll);
	}
}


