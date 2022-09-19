package concepts.clone;

public class SimpleClone {
	public static void main(String args[]) {

//		I can't call clone() , because the clone() is protected in the Object class
//		So we should override clone method in the current package or with public access 
		
		Mutable mutable = new Mutable();
//		System.out.println("Mutable : "+mutable.clone()); 

		ClonableMutable cloneMutable = new ClonableMutable();
		cloneMutable.primitiveVal = 1;
		try {
			
			ClonableMutable cloned = (ClonableMutable) cloneMutable.clone();
			cloned.primitiveVal = 2;
			System.out.println(cloneMutable.primitiveVal + " : " + cloned.primitiveVal);
			
		} catch (CloneNotSupportedException Ex) {
			System.out.println("CloneMutable does not support cloneable");
		}

	}

}
