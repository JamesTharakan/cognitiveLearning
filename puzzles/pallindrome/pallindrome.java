package puzzles.pallindrome;

import java.util.Arrays;

public class pallindrome {

	public static void main(String[] args) {

		String pallins[] = {"aa","abzza","a","ab","aba"};
		
		Arrays.stream(pallins).forEach(str -> System.out.println(str +":"+ isPallindrome(str)));

	}

	private static boolean isPallindrome(String s1) {
	
		boolean isPallindrome = true;
		
		int startIndex =0;
		int endIndex =s1.length()-1;
		
		while(startIndex < endIndex) {
			if(s1.charAt(startIndex) != s1.charAt(endIndex)) {
				isPallindrome =false;
				break;
			}
			startIndex++;
			endIndex--;
			
		}
		return isPallindrome;
	}

}
