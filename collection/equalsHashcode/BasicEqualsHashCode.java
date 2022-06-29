package collection.equalsHashcode;

import utils.Customer;

public class BasicEqualsHashCode {
	
	String type;
	
	public BasicEqualsHashCode(String type) {
		this.type = type;
	}

	public final int hashcode() { 
		return type.length();
	}
	
	public boolean equals(Object obj) {			//Three checks are needed and return in all cases
		
		if(obj == this) 
			return true;
		
		if(! (obj instanceof BasicEqualsHashCode))
			return false;
		
		return ((BasicEqualsHashCode)obj).type == this.type;
		
	}
	
	public static void main(String arg[]){
		BasicEqualsHashCode one = new BasicEqualsHashCode("box");
		
		BasicEqualsHashCode two = new BasicEqualsHashCode("box");
		
		BasicEqualsHashCode three = new BasicEqualsHashCode("fox");
		
		System.out.println(one.equals(two));
		System.out.println(one.equals(three));
		
		System.out.println(one.equals(new Customer()));
		
	}

}
