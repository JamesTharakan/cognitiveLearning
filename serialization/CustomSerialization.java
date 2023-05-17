package serialization;

import java.io.*;

/**
 * A non Serializable super class
 */
class Company {
	String name;
	Integer year;
	

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

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

	public Emp(int age, int a, int b,String company,Integer year) {
		this.age = age;
		this.a = a;
		Emp.b = b;
		setName(company);
		setYear(year);
	}
	
	private void readObject(ObjectInputStream ois) throws ClassNotFoundException, IOException{
		ois.defaultReadObject();//This call is must, to do basic read of non-transient and non-static members
		System.out.println("readObject()");
		//the order of read and write should be same
		setName((String) ois.readObject());
		setYear((Integer) ois.readObject());
	}
	
//	Override this method if we want to serialize any custom data but must call default Write/readObject method
	private void writeObject(ObjectOutputStream oos) throws IOException{
		oos.defaultWriteObject();		//This call is must, to do basic write of non-transient and non-static members

		System.out.println("writeObject");
		//Since name is not serializable, we override the writeObject, do the defaultWriteObject, and then serialize custom data
		oos.writeObject(getName());
		oos.writeObject(getYear());
	}

	public String toString() {
		return " age = " + age + " transient a = " + a + " static b = " + Emp.b+" name: "+getName()+ " Year :"+getYear();
	}

}

public class CustomSerialization {

	public static void main(String[] args) {
		Emp serial = new Emp(32, 1, 2, "LT",1945);
		System.out.println(serial);
		try {
			SerializationUtil.serialize(serial, "fileToWhichSerial.txt");
		} catch (IOException exp) {
			System.out.println("Exception caught when Serialization:: "+exp.getClass().getName() +" Message: "+exp.getMessage());
		}
		
		serial.a=100;
		Emp.b=200;
		Emp deSerial = null;

		try {
			deSerial = (Emp)SerializationUtil.deSerialize("fileToWhichSerial.txt");
			System.out.println(deSerial);
		} catch (IOException | ClassNotFoundException exp) {
			System.out.println("Exception caught when deSerializing ::"+exp.getClass().getName()+" Message: "+exp.getMessage());
		}

	}
}
