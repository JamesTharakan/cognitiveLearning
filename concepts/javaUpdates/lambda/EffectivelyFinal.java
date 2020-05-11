package concepts.javaUpdates.lambda;

public class EffectivelyFinal {

	public static void main(String[] args) {
		String finalVariable = "final local variable";
		
//		finalVariable = "Can I change non-final variable before anonymous class";
       
		Runnable runnable = () -> {
                System.out.println("Using final local variable inside Lambda expression");
                System.out.println("Value of final variable is : " + finalVariable);

//                finalVariable = "Can I change non-final variable inside anonymous class";
        };
       
//        finalVariable = "Can I change non-final variable after anonymous class";
        
}

}
