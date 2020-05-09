package random;

public interface TestInterface {
	public void abstractmethodOne();
	
	public void abstractmethodTwo();
	
	public default void defaultMethod() {
		System.out.println("I am a default method in a interface.I should be ");
	}
	
	public default void defaultMethod(int a ) {
		System.out.println("I am a default method in a interface.I should be "+a);
	}

}

 
