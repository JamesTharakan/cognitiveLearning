package puzzles.anagram;

public class Anagram {

	public static void main(String[] args) {
		numberNeeded("def","abca") ;
	}
	
	public static int numberNeeded(String first, String second) {
		int[] lettercounts = new int[26];
		for(char c : first.toCharArray()){
			lettercounts[c-'a']++;
		}
		
		for (int i = 0; i < lettercounts.length; i++) {
			System.out.print(lettercounts[i]+" ");
		}
		System.out.println("");
		for(char c : second.toCharArray()){
			lettercounts[c-'a']--;
		}
		for (int i = 0; i < lettercounts.length; i++) {
			System.out.print(lettercounts[i]+" ");
		}
		System.out.println("");
		int result = 0;
		for(int i : lettercounts){
			result += Math.abs(i);
		}
		
		System.out.println("Anagram.numberNeeded(): " +result);
		return result;
	      
    }

}
