package dataStructure.Array;

import java.util.ArrayList;

public class ArrayStoreExcep {
	public static void main(String[] args) {

		ArrayList al = new ArrayList<cat>();	
		al.add(new dog());
		
		Animal [] a = new cat[1];
		a[0]= new dog();
			

	}
}

class Animal{}
class cat extends Animal{}
class dog extends Animal{}