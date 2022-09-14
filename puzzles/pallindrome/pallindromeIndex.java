package puzzles.pallindrome;

//	https://www.hackerrank.com/challenges/palindrome-index/problem
public class pallindromeIndex {

	public static void main(String[] args) {

		System.out.println("abzza" + " : " + PallindromeIndex("azba"));

	}

	private static int PallindromeIndex(String string) {
		int index = -1;
		int left = 0;
		int right = string.length() - 1;

		while (left < right) {
			if (string.charAt(left) != string.charAt(right)) {
				if (isPalindrome(left + 1, right, string)) {
					index = left;
				} else {
					index = right;
				}
				break;
			} else {
				left++;
				right--;
			}

		}

		return index;
	}

	private static boolean isPalindrome(int left, int right, String string) {
		boolean isPallindrome = true;

		while (left < right) {
			if (string.charAt(left) != string.charAt(right)) {
				isPallindrome = false;
				break;
			}
			left++;
			right--;
		}

		return isPallindrome;
	}

}
