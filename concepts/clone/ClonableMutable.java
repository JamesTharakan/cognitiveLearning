package concepts.clone;

public class ClonableMutable  implements Cloneable {
	
	int primitiveVal ;
	
	public Object clone () throws CloneNotSupportedException{

		return super.clone();
	}
	
	public String toString() {
		return ""+primitiveVal;
	}

}
