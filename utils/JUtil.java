package utils;


public class JUtil {
	
	/**
	 * Prints a array of integers
	 * @param label : label
	 * @param array : array that has to be displayed
	 */
	public static void printIntArray(String label, int array[]){
		System.out.print( "[ ");
		for(int i=0;i<array.length; i++){
			System.out.print(array[i]+ " ");
		}
		System.out.println("] "+label);
	}
	
	public static void printMe(String label, Object printMe){
		System.out.print(label+ "::"+printMe);
		
	}
	
	public static void printMe(String label, Object []printMe){
		System.out.print(label+ "::[ ");
		for(int i=0;i<printMe.length; i++){
			System.out.print(printMe[i]+ " ");
		}
		System.out.println("]");
		
	}

}
