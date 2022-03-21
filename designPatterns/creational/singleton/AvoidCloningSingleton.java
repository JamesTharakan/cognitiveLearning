package designPatterns.creational.singleton;

public class AvoidCloningSingleton {

	public static void main(String[] args) {

		cannotCloneMe instanceOne = cannotCloneMe.getInstance();

		try {
			instanceOne.clone();
		} catch (CloneNotSupportedException e) {
			System.out.println(e.getMessage());
		}
	}

}

/**
 * Singleton class avoiding clone
 *
 */
class cannotCloneMe {

	private static cannotCloneMe instance = null;
	
	private cannotCloneMe() {
		System.out.println("Created a single cannotCloneMe Object : " + this.hashCode());
	}

	public static cannotCloneMe getInstance() {
		if (instance == null) {
			instance = new cannotCloneMe();
		}
		return instance;
	}

	/*
	 * Override and Just throw exception if someone tries to clone.
	 */
	protected Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException("I am a singleton class, you cannot clone me ");
	}
}