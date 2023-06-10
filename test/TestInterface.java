package test;

public interface TestInterface {
	public void abstractmethodOne();

	public void abstractmethodTwo();

	public default void defaultMethod() {
		System.out.println("I am a default method in a interface.I should be ");
	}

	public default void defaultMethod(int arg0) {
		System.out.println("I am a default method in a interface.I should be " + arg0);
	}

}
