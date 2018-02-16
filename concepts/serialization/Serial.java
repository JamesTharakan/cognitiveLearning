package concepts.serialization;

import java.io.*;

class Company {
	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}

class Emp extends Company implements Serializable{

	
	private static final long serialVersionUID = 683452581122892189L;
	private int age;
	transient int a;
	static int b = -5;

	public Emp(int age, int a, int b,String company) {
		this.age = age;
		this.a = a;
		Emp.b = b;
		setName(company);
	}
	
	private void readObject(ObjectInputStream ois) throws ClassNotFoundException, IOException{
		ois.defaultReadObject();
		System.out.println("Emp.readObject()");
		//notice the order of read and write should be same
		setName((String) ois.readObject());	
	}
	
	private void writeObject(ObjectOutputStream oos) throws IOException{
		oos.defaultWriteObject();
		System.out.println("Emp.writeObject()");
		oos.writeObject(getName());
	}

	public String toString() {
		return " age = " + age + " transient a = " + a + " static b = " + Emp.b+" name: "+getName();
	}

}

public class Serial {

	public static void main(String[] args) {
		Emp serial = new Emp(32, 1, 2, "LT");
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
