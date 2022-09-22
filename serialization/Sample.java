package serialization;

import java.io.ByteArrayOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Sample1 implements Serializable {
	public void display() {
		System.out.println("This is a sample class");
	}
}

public class Sample {
	public static void main(String args[]) throws Exception {
		Sample1 obj = new Sample1();
		
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		ObjectOutputStream oos = new ObjectOutputStream(bos);
		
		oos.writeObject(obj);
		oos.flush();
		byte[] data = bos.toByteArray();
	}
}