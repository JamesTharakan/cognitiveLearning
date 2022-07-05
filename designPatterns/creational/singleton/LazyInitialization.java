package designPatterns.creational.singleton;


public class LazyInitialization {
	private static LazyInitialization instance = null	;
	

	public static LazyInitialization getInstance() {	//create the object , when the  static method is called
		if(instance==null)
			instance = new LazyInitialization();
			
		return instance;
	}

	private LazyInitialization() {
		System.out.println("LazyInitialization");
	}

	//If Class is not loaded , object is not created
}
