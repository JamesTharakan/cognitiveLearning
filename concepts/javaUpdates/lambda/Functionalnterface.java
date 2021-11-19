package concepts.javaUpdates.lambda;

@FunctionalInterface
interface NoArgFuncInterface{
	void display();
}

@FunctionalInterface
interface OneArgFuncInterface{
	void display(String One);
}

@FunctionalInterface
interface TwoArgFuncInterface{
	void display(String two, int num);
}

@FunctionalInterface
interface ReturningFuncInterface{
	int display();
}

@FunctionalInterface
interface isAnnotationNeeded{
	void display();
}

@FunctionalInterface
interface canHaveOtherMethods {
	void display();		//Only one abstract method

	default void defaultMethod() {			//the default is not access specifier, it means default implementation
		System.out.println("It can have default methods");
	}

	static void staticMethod() {
		System.out.println("Static methods");
	}

}

public class Functionalnterface {

	public static void main(String[] args) {
		
		NoArgFuncInterface no = () -> {System.out.println("No :: No argument");};
		no.display();
		
		OneArgFuncInterface one = (stringVar) -> {System.out.println("One :: "+stringVar);};
		one.display("One");
		
		TwoArgFuncInterface two = (stringVar,numVar) -> {System.out.println("Two :: "+stringVar + " "+numVar);};
		two.display("Hello", 2);
		
		ReturningFuncInterface returning = () -> {System.out.println("I return something !!"); return 123;};
		System.out.println("The value returned is ::"+returning.display());
		
		
		Runnable runnable = () -> {System.out.println("I am a implementation of a FuntionalInterface which does not have any arguments");};
		runnable.run();// Threads should be stared by calling start()

		isAnnotationNeeded annotationNeeded = () -> {System.out.println("No need of annotaion");};
		annotationNeeded.display();
		
		
		canHaveOtherMethods otherMethods = () -> {System.out.println("canHaveOtherMethods");};
		otherMethods.defaultMethod();
		canHaveOtherMethods.staticMethod();
		
	}

}


