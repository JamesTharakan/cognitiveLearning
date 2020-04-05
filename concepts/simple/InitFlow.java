package concepts.simple;

public class InitFlow {
	{
		System.out.println("Initailazation block");
	}
	
	static{
		System.out.println("Static block");
	}
	
	
	
	
	InitFlow(){
		System.out.println("Deafult constructor");
	}
	
	InitFlow(int x){
		System.out.println("parameter constructor");
	}
	
	public static void main(String[] args) {
		System.out.println("Main");
		new InitFlow(1);
	}
}
