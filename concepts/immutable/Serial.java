package concepts.immutable;

import java.io.*;

class Emp  implements Serializable{

	
	private static final long serialVersionUID = 683452581122892189L;
	private int age;
	transient int a;
	static int b = -5;

	public Emp(int age, int a, int b) {
		this.age = age;
		this.a = a;
		Emp.b = b;
	}

	public String toString() {
		return " age = " + age + " transient a = " + a + " static b = " + Emp.b;
	}

}

public class Serial {

	public static void main(String[] args) {
		Emp serial = new Emp(32, 1, 2);
		String filename = "fileName.txt";
		System.out.println("Before :: " + serial);

		try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filename))) {
			out.writeObject(serial);
		} catch (IOException exp) {
			System.out.println("Some Exception is caught :: "+exp.getClass().getName());
		}
		Emp.b=100;
		Emp deSerial = null;

		try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(filename))) {
			deSerial = (Emp) in.readObject();
			System.out.println("After :: "+deSerial);
		} catch (IOException | ClassNotFoundException exp) {
			System.out.println("Some Exception is caught ::"+exp.getClass().getName());
		}

	}
}
