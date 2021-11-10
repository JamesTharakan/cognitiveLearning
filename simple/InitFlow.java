package simple;

public class InitFlow {
	public static void main(String[] args) {
		System.out.println("Main");
		Flow.TryingToLoadClass = 1;
		System.out.println("Accessed the variable , so that class will be loaded");
		new Flow(1);
	}
}


 class Flow{
	 static int TryingToLoadClass =0;
	 
	 	static{
			System.out.println("Static block");
		}
		
	 	{
			System.out.println("Initailazation block");
		}
		
		Flow(){
			System.out.println("Default constructor");
		}
		
		Flow(int x){
			System.out.println("parameter constructor");
		}
 }