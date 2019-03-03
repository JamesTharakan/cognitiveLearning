package concepts.immutable;

public class FinalMutable {
	String name;

	FinalMutable(String name) {
		this.name = name;
	}

	public static void main(String[] args) {

		// Final variable holding Immutable Object
		String shifter = new String("One");
		final String test2 = shifter;

		shifter = shifter + "Append";

		System.out.println("Final variable will still refer the old string, since Strings are immutable: " + test2);

		// Final variable holding mutable Object
		FinalMutable r1 = new FinalMutable("One");
		FinalMutable r2 = new FinalMutable("Two");

		final FinalMutable r = r1;
		System.out.println("Initially final variable has :" + r);

		r1.name = "newName";
		System.out.println("when r1 name is changed to :" + r1 + " final variable has :" + r);

		r1 = r2;
		System.out.println("If I point r1 to r2 , the my final variable points to:" + r +" and r1 points to "+r1);

		// Final variable just hold only one object even if the object is
		// immutable

	}

	public String toString() {
		return this.name;
	}

}
