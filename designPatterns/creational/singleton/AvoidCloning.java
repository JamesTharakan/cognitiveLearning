package designPatterns.creational.singleton;

public class AvoidCloning {
	
	 protected Object clone() throws CloneNotSupportedException  {
//		 Override and Just throw exception if someone tries to clone.
	        throw new CloneNotSupportedException("This is how to avoid Singleton cloning"); 
	    }
	 
	 public static void main(String[] args) throws CloneNotSupportedException, Exception {
		 AvoidCloning instanceOne = AvoidCloning.getInstance();
		 System.out.println("Single instance created" + instanceOne.hashCode());

		 instanceOne.clone();
	    }

	private static AvoidCloning getInstance() {
		return new AvoidCloning();
	}

	 
}

