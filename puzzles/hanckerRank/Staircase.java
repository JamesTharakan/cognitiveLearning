package puzzles.hanckerRank;

import java.util.Scanner;

public class Staircase {

    static void staircase(int n) {
    	
        for(int i = 1; i<=n; i++){
        	int length = n;
        	for( int j = 1; j <= length-i; j++){
        		System.out.print("*");
        	}

        	
        	for(int k= 1; k <= i; k++){
        		System.out.print("#");
        	}
        	System.out.println("");
        }
        
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        staircase(n);
        in.close();
    }
}
