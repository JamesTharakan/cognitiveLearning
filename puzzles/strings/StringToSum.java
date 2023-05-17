package puzzles.strings;

public class StringToSum {

	public static void main(String[] args) {

		System.out.println(findSum("$10abc$2,00yz$05"));

	}

	static int findSum(String str) {
		String temp = "";
		int sum = 0;

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			if (Character.isDigit(ch)) {
				temp += ch;
			}
			else {
				if(ch == ',' && temp.length() != 0) {
					continue;
				} else if(temp.length() != 0){
					sum += Integer.parseInt(temp);
					temp = "";
				}
			} 
		}

		return sum + Integer.parseInt(temp);
	}

}
