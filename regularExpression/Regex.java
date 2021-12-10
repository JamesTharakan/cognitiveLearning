package regularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Regex {

	public static void main(String args[]) {

		int count = 0;
		String input = "abc123ABC456";
		String regExp = "\\d\\d\\d";
//		String regExp = "[a-z]*[A-Z]*\\d+";

		Pattern pattern = Pattern.compile(regExp);
		Matcher m = pattern.matcher(input);

		//System.out.println("Found :: " + m.find());

		while (m.find()) {
			count ++;
//			for (int i = 1; i <= m.groupCount(); i++) {
//				System.out.println("Found value: " + m.group(i));
//			}
			System.out.println("Match "+count+ "-> Start : "+m.start() + " End :"+m.end());
			
		}
		
		System.out.println("Replaced as :"
				+ m.replaceAll("done")/* + " but the actual string is :"+input + ". As String are immutable" */);
		
	}
}
