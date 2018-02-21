package puzzles.hanckerRank.ctci;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/*
5
1 2 3 4 5
1 1 1 1 1

both

5
1 2 3 4 8
1 1 1 1 1
none

26
23 55 94 129 179 250 399 494 573 578 645 648 678 705 773 779 793 822 824 843 866 869 926 935 978 992
4 248 66 301 384 268 8 16 118 278 134 171 122 104 269 407 522 239 80 640 285 745 26 92 310 759
RIGHT
*/

public class FallingRacks {

	public static String checkAll(int n, int[] height, int[] position) {
		String status = "NONE";
		boolean left = false;
		boolean right = false;

		int x = 0;
		for (int i = 0; i < position.length - 1; i++) {
			if ((position[i] + height[i]) >= x) {
				x = position[i] + height[i];
			}
		}
		if (x >= position[position.length - 1]) {
			left = true;
		}

		int y = position[position.length - 1];
		for (int j = position.length - 1; j >= 0; j--) {
			if (y > position[j]) {
				break;
			}
			if (position[j] - height[j] <= y) {
				y = position[j] - height[j];
			}
			if (y <= 0)
				break;
		}

		if (y <= 1) {
			right = true;
		}

		if (left && right) {
			status = "BOTH";
		} else if (left) {
			status = "LEFT";
		} else if (right) {
			status = "RIGHT";
		}
		return status;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] position = new int[n];
		for (int position_i = 0; position_i < n; position_i++) {
			position[position_i] = in.nextInt();
		}
		int[] height = new int[n];
		for (int height_i = 0; height_i < n; height_i++) {
			height[height_i] = in.nextInt();
		}
		String ret = checkAll(n, height, position);
		System.out.println(ret);
		in.close();
	}
}