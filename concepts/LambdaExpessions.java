package concepts;

interface NoArgFuncInterface{
	void display();
}

interface OneArgFuncInterface{
	void display(String One);
}


interface TwoArgFuncInterface{
	void display(String two, int num);
}

public class LambdaExpessions {

	public static void main(String[] args) {
		NoArgFuncInterface no = () -> {System.out.println("No :: line one");};
		no.display();
		
		OneArgFuncInterface one =(StringParam) ->{System.out.println("One :: "+StringParam);};
		one.display("One");
		
		TwoArgFuncInterface two = (someString,num) -> {System.out.println("Two :: "+someString + " "+num);};
		two.display("Hello", 2);
		
	}

}
