package puzzles.strings;

public class FindSubstring {

	public static void main(String[] args) {
		String main ="abccbabceaabc";
		String find="abc";
		
		int count =0;
		
		for (int tempIndex =0; tempIndex<=main.length(); ) {
			tempIndex = main.indexOf(find, tempIndex);
			if(tempIndex ==-1) {
				System.out.println("FindSubstring.main():: Count :"+count);
				break;
			}else {
				count++;
				System.out.println("FindSubstring.main():: "+tempIndex);
				tempIndex = tempIndex+find.length();
			}
		}
		
		
		System.out.println("FindSubstring.main()"+main.matches(".*abc.*"));
	}
	
	

}