package puzzles.hanckerRank.interviewPreparationKit;

import java.util.ArrayList;
import java.util.List;

public class GetFractionDigits {

	public static void plusMinus(List<Integer> arr) {
		long positive=0;
		long negative=0;
		long zero=0;
		for(Integer i : arr) {
			if(i==0) {
				 zero++;
			}else if(i>0){
				positive++;
			}else {
				negative++;
			}
		}	

		double size = arr.size();
		
		System.out.printf("%.6f\n%.6f\n%.6f",positive/size,negative/size,zero/size);

	}

	public static void main(String[] args) {
		
		int [] array = new int[]{-4, 3, -9, 0, 4, 1};
		List<Integer> arr = new ArrayList<Integer>();
		
		for (int i : array) 
			arr.add(i);

		plusMinus(arr);

	}
}
