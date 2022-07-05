package designPatterns.creational.singleton;


/**
 * Examples of singleton :
 * Runtime - Java runtime
 * dataBase managers
 * Loggers

 * Check These cases:
 * understand what is reflection and how it is effecting the singleton
 * what if cloning is done before/after the actual object
 * 
 * Can we substitute the double lock mechanism by creating the object while loading the class?
 * Yes, depends on the requirement
 * 
 */

public class EarlyInitialization {
	private static EarlyInitialization instance = new EarlyInitialization(); //Create early , when the class is loaded
	

	public static EarlyInitialization Instance() {
		return instance;
	}

	private EarlyInitialization() {
		System.out.println("EarlyInitialization");
	}

	//If Class is not loaded , object is not created
}
