package puzzles.hanckerRank.oneweek;

public class CaesarCipher2 {

	public static void main(String[] args) {

		knowAsciiValues();
		
		String message1 = "abcd";
		System.out.println("\n" + message1 + " : " + CaesarCipher(message1, 3));
		
		String message2 = "XyZ";
		System.out.println("\n" + message1 + " : " + CaesarCipher(message2, 3));
	}

	private static void knowAsciiValues() {

		char testA ='A';char testZ ='Z';    char testa ='a';char testz ='z';
		System.out.println((int)testA+" "+ (int)testZ+ " "+(int)testa+" "+ (int)testz+" ");
		
		int canGetNumberLikeThis = (int)testa;
		System.out.println("canGetNumberLikeThis :"+canGetNumberLikeThis);
		System.out.println("canGetNumberLikeThis :"+(int)testa);
	}

	private static String CaesarCipher(String message1, int i) {
		String result = "";
		int shifts = i % 26;
		char newChar;

		for (int j = 0; j < message1.length(); j++) {

			char ch = message1.charAt(j);

			if (Character.isUpperCase(ch)) {
				newChar = (char) (ch + shifts);

				if (newChar > 90)
					newChar = (char) (64 + (newChar % 90));
				result = result + newChar;

			} else if (Character.isLowerCase(ch)) {
				newChar = (char) (ch + shifts);
				
				if (newChar > 122)
					newChar = (char) (96 + (newChar % 122));
				result = result + newChar;

			} else {
				result = result + ch;
			}

		}

		return result;
	}

}
