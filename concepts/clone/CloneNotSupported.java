package concepts.clone;

class CNSException {
	int primitiveVal;

	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	public String toString() {
		return "" + primitiveVal;
	}

}

public class CloneNotSupported {

	public static void main(String[] args) {
		CNSException cnse = new CNSException();

		try {

			cnse.clone(); //exception because CNSException does not implement

		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}

		System.out.println("Done");

	}

}
