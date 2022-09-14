package puzzles.hanckerRank.oneweek;

import java.util.Arrays;
import java.util.List;

public class GridChallenge {

	public static void main(String[] args) {
//		List<String> grid = Arrays.asList("ebacd", "fghij", "olmkn", "trpqs", "xywuv");
//		List<String> grid = Arrays.asList("abc", "lmp", "qrt");
//		List<String> grid = Arrays.asList("mpxz", "abcd", "wlmf");
		List<String> grid = Arrays.asList("abc","hjk","mpq","rtv");
		System.out.println(gridChallenge(grid));
	}

	public static String gridChallenge(List<String> grid) {
		String result = "YES";
		int[][] arr = new int[grid.size()][grid.get(0).length()];

		for (int i = 0; i <= grid.size() - 1; i++) {
			String str = grid.get(i);
			for (int j = 0; j <= str.length() - 1; j++) {
				arr[i][j] = (int) str.charAt(j);
			}
			Arrays.sort(arr[i]);
		}
		
		/* print matix
		for (int row = 0; row < arr.length; row++) {
			
			for (int col = 0; col < arr[row].length; col++) {
				System.out.print( arr[row][col]+" ");
			}
			System.out.println("");
		}
		System.out.println("--------");
		*/
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.println(arr[i][j]+ " : "+arr[i+1][j]);
				if(arr[i][j] > arr[i+1][j]) {
					return "NO";
				}
			}
			System.out.println();
		}
		return result;

	}
}
