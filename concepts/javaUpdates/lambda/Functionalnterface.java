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

public class Functionalnterface {

	public static void main(String[] args) {
		
		NoArgFuncInterface no = () -> {System.out.println("No :: No argument");};
		no.display();
		
		OneArgFuncInterface one = stringVar -> {System.out.println("One :: "+stringVar);};
		one.display("One");
		
		TwoArgFuncInterface two = (stringVar,numVar) -> {System.out.println("Two :: "+stringVar + " "+numVar);};
		two.display("Hello", 2);
		
		ReturningFuncInterface returning = () -> {System.out.println("I return something !!"); return 123;};
		System.out.println("The value returned is ::"+returning.display());
		
	}

}
