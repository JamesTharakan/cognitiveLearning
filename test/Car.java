package test;

public class Car {
	
	final String model;
	
	public int hashCode() {
		return 31; //Just like that
	}

	public boolean equals(Object obj) {
		if(obj == this) 
			return true;
		
		if(! (obj instanceof Car))
			return false;
		
		return ((Car)obj).model == this.model;
	}

	public Car(String model) {
		this.model = model;
	}

	public String getModel() {
		return model;
	} 
	
//	record Car(String model) {}			//  Java 17 

}

