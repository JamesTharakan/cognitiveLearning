package concepts.clone;

/**
CloneNotSupportedException is thrown to show that the clone method of Object class has been called to clone an object,
but the object’s class does not implement the Cloneable interface.
Example use case: 
	method is overridden but it does not implement Cloneable interface.
	If the method is also not overridden in the class, then we will get compilation error 
	because the clone method is Protected and is not visible in our class.

 * @author jtharakan
 *
 */
public class SimpleClone {
	public static void main(String args[]) {

		Mutable mutable = new Mutable();
//		I can't call clone() , because the clone() is protected in the Object class
//		So we should override clone method in the current package or with public access 

//		mutable.clone(); 

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
