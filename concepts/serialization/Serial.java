package concepts.serialization;

import java.io.*;

class Company implements Serializable{
	String name;
	Company(String name){this.name=name;}
}

class Emp  implements Serializable{

	
	private static final long serialVersionUID = 683452581122892189L;
	private int age;
	transient int a;
	static int b = -5;
	Company c ;

	public Emp(int age, int a, int b,Company company) {
		this.age = age;
		this.a = a;
		Emp.b = b;
		this.c=company;
	}

	public String toString() {
		return " age = " + age + " transient a = " + a + " static b = " + Emp.b+" name: "+c.name;
	}

}

public class Serial {

	public static void main(String[] args) {
		Emp serial = new Emp(32, 1, 2, new Company("LT"));
		System.out.println("Before :: " + serial);

		try {
			SerializationUtil.serialize(serial, "fileName.txt");
		} catch (IOException exp) {
			System.out.println("Exception caught when Serialization:: "+exp.getClass().getName());
		}
		
		
		Emp.b=100;
		Emp deSerial = null;

		try {
			deSerial = (Emp)SerializationUtil.deSerialize("fileName.txt");
			System.out.println("After :: "+deSerial);
		} catch (IOException | ClassNotFoundException exp) {
			System.out.println("Exception caught when deSerializing ::"+exp.getClass().getName());
		}

	}
}
