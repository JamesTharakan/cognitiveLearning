package puzzles.strings;

public class Permutation {
	public static void main(String[] args) {
		String str = "abc";			//abc acb bac bca cba cab 
		new Permutation().permute(str, 0, str.length() - 1);
	}

	private void permute(String str, int left, int right) {
		if (left == right)
			System.out.print(str+" ");
		else {
			for (int i = left; i <= right; i++) {
				str = swap(str, left, i);
				permute(str, left + 1, right);
				str = swap(str, left, i);
			}
		}
	}

	public String swap(String a, int i, int j) {
		if (i == j /*|| a.charAt(j)==a.charAt(j)*/)
			return a;

		char temp;
		char[] charArray = a.toCharArray();
		temp = charArray[i];
		charArray[i] = charArray[j];
		charArray[j] = temp;
		return String.valueOf(charArray);
	}

}
