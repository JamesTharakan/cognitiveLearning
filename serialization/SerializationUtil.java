package serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationUtil {
	
	
	public static ObjectOutputStream serialize(Object object, String fileName) throws FileNotFoundException, IOException{
		
		FileOutputStream fos = new FileOutputStream(fileName);
		ObjectOutputStream out = new ObjectOutputStream(fos);
		out.writeObject(object);
		
		fos.close();
		out.close();
		
		return out;
		
	}
	
	public static Object deSerialize(String fileName) throws FileNotFoundException, IOException, ClassNotFoundException {
		
		FileInputStream fis =  new FileInputStream(fileName);
		ObjectInputStream in = new ObjectInputStream(fis);
		
		fis.close();
		in.close();
		
		return  in.readObject();
	}

}
