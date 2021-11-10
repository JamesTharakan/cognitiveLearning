package collection.arrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMethods {

	public static void main(String[] args) {
		ArrayListMethods caller = new ArrayListMethods();
		
		caller.copyConstrutors();
		

	}

	/**
	 * Passing a list to another list construtor will only copy the reference
	 * Where by using AddAll , will create a duplicate.
	 */
	private void copyConstrutors() {
		List <Integer> base = new <Integer>ArrayList(10);
		base.add(1);
		System.out.println("Base :"+base );
		
		List<Integer> copy = new ArrayList<>(base);
		copy.add(2);
		System.out.println("\nBase" +base);
		System.out.println("Copy" +copy);
		
		
		List<Integer> addAll = new ArrayList<>();
		addAll.addAll(copy);
		System.out.println("\nBase" +copy);
		System.out.println("Copy" +copy);
		System.out.println("addAll" +addAll);
		
		addAll.add(3);
		
		System.out.println("\nBase" +copy);
		System.out.println("Copy" +copy);
		System.out.println("addAll" +addAll);
	}
	
	

}

class Customer {

	private int id;
	private String name;

	public String getName() {
		return name;
	}
	Customer(String n){
		name = n;
	}
	
	public String toString() {
		return name;
	}

}
