package puzzles.hanckerRank.oneweek;

import java.util.ArrayList;
import java.util.List;

public class DiagonalDifference {

	public static void main(String[] args) {

		List<Integer> one = new ArrayList<>();	one.add(1);one.add(2);one.add(3);
		List<Integer> two = new ArrayList<>();	two.add(4);two.add(5);two.add(6);
		List<Integer> three = new ArrayList<>(); three.add(7);three.add(8);three.add(9);
		
		List<List<Integer>> lists = new ArrayList<>();
		lists.add(one);lists.add(two);lists.add(three);

		lists.forEach(System.out::println);

		System.out.println("DiagonalDifference : " + diagonalDifference(lists));
	}

	public static int diagonalDifference(List<List<Integer>> arr) {
		// Write your code here
		int left = 0;
		int right = 0;
		for (int i = 0; i < arr.size(); i++) {
			for (int j = 0; j < arr.get(i).size();) {
				left = left + arr.get(i).get(i + j);
				break;
			}

		}

		System.out.println("Left :"+left);

		for (int i = 0; i <=arr.size() - 1; i++) {
			for (int j = arr.get(i).size()-1-i; j >= 0; ) {
				right = right + arr.get(i).get(j);
				break;
			}
		}
		System.out.println("Right :"+right);
		return Math.abs(right-left);
		// to here
	}
	
	

}
