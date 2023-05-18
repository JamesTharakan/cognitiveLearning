package random.simple;

public class ImmutableString {

	public static void main(String[] args) {

		String S = new String("one");
		System.out.println("1:"+ S.hashCode());
		S= S+"two";
		System.out.println("2:"+ S.hashCode());
		
		Integer test = Integer.valueOf(1);
		System.out.println("1:"+ test.hashCode());
		test =test+15;
		System.out.println("2:"+ test.hashCode());

	}

}
