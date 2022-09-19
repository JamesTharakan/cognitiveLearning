package concepts.clone;

public class ClonableMutable  implements Cloneable {
	
	int primitiveVal =10;
	
	public Object clone () throws CloneNotSupportedException{
		
		return super.clone();
	}

}
