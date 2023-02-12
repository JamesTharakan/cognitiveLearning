package execptions;

import java.io.FileOutputStream;
import java.io.IOException;

public class TryWithResource {

	public static void main(String[] args) throws IOException {

		String filePath = "C:\\MyDrive\\GitHub\\cognitiveLearning\\Resources\\OutPut\\TryWithResource.txt";

		try (FileOutputStream fileOutputStream = new FileOutputStream(filePath)) {
			
			String msg = "Writing into a file";
			byte byteArray[] = msg.getBytes(); // Converting string into byte array
			fileOutputStream.write(byteArray); // Writing data into file
			System.out.println("Completed");
			
		} catch (IOException e) {

			e.printStackTrace();
		}
		
		
		
	}
	
	
	

}
