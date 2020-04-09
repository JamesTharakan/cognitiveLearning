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
 */

public class singletonPattern {
	private singletonPattern() {
		System.out.println("singletonPattern.singletonPattern()");
	}

	public static singletonPattern Instance() {
		return instance;
	}

	private static singletonPattern instance = new singletonPattern();
	
	//If Class is not loaded , object is not created
//	public static void main(String[] args){}
}


class Singleton					
{
 private static final Singleton instance = new Singleton();	//Can we substitute the double lock mechanism 
																//By creating the object while loading the class
	private Singleton() {
		if (instance != null)
			throw new IllegalStateException("Trying to create second instance of this class.No Reflection please");
	}
 public static Singleton getInstance() {
   return instance;
 }
}