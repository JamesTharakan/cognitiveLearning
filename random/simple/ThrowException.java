package random.simple;

public class ThrowException {

	public static void main(String[] args) {

		System.out.println("We dont catch or declare, as it throws a UNchecked exception ");
		try {
			 throw new NullPointerException();
		} catch (Exception e) {
			System.out.println("Caught the exception");
		}
		 throw new NullPointerException();
		 
//		 System.out.println("UnReachable Code");

	}

}
