package puzzles.pallindrome;

public class pallindrome {

	public static void main(String[] args) {

		System.out.println("abzza"+" : "+isPallindrome("abzza"));
		System.out.println("a"+" : "+isPallindrome("a"));
		System.out.println("ab"+" : "+isPallindrome("ab"));
		System.out.println("aba"+" : "+isPallindrome("aba"));

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
