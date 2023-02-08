package serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SimpleSerialization  implements Serializable{

	private static final long serialVersionUID = 1L;

	public static void main(String[] args) throws IOException {
		
		String fileName =  "C:\\MyDrive\\GitHub\\cognitiveLearning\\Files\\OutPut\\SimpleSerialization.txt";
		
		FileOutputStream fos = new FileOutputStream(fileName);
		ObjectOutputStream out = new ObjectOutputStream(fos);
		
		
		out.writeObject(new SimpleSerialization());  

		fos.close();
		out.close();

	}

}
