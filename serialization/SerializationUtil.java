package serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import io.ByteArrayOutputStream;

public class SerializationUtil {
	
	
	public static ObjectOutputStream serialize(Object object, String fileName) throws FileNotFoundException, IOException{
		
		
		FileOutputStream fos = new FileOutputStream(fileName);
		ObjectOutputStream out = new ObjectOutputStream(fos);
		
		System.out.println("SerializationUtil.serialize(): Writing to "+fileName);
		
		out.writeObject(object); //If Custom writeObject is defined, it will call that 

		fos.close();
		out.close();
		return out;
		
	}
	
	public static Object deSerialize(String fileName) throws FileNotFoundException, IOException, ClassNotFoundException {
		
		FileInputStream fis =  new FileInputStream(fileName);
		ObjectInputStream in = new ObjectInputStream(fis);
		
		System.out.println("SerializationUtil.deSerialize() : Reading from "+fileName);
		
		Object  obj = in.readObject(); //If Custom readObject is defined, it will call that
		
		fis.close();
		in.close();
		
		return  obj;
	}


}
