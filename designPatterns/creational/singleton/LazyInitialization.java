package designPatterns.creational.singleton;


public class LazyInitialization {
	private static LazyInitialization instance = null	;
	

	public static LazyInitialization getInstance() {
		if(instance==null)
			instance = new LazyInitialization();
			
		return instance;
	}

	private LazyInitialization() {
		System.out.println("LazyInitialization");
	}

	//If Class is not loaded , object is not created
}
