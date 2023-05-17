package puzzles.strings;

public class ReverseSentence {

	public static void main(String[] args) {

		String test = "  a good   example  ";
		StringBuffer output = new StringBuffer();
		
		
		String strArr [] = test.split("\\s");
		
		
		for (int i = strArr.length-1; i >=0 ; i--) {
			
			if(!strArr[i].isBlank()) 
				output.append(strArr[i]+" ");
		}

		System.out.println(output.toString().trim());

	}

}
