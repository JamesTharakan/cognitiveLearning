package puzzles.random;

import java.util.Scanner;

public class evenOddSplit {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); 
		int num = Integer.parseInt(scan.nextLine());
		scan.close();
        String []input= new String[num];
        
        for (int i = 0; i < num; i++) {
			input[i]=scan.nextLine();
		}
        
      //  one(input, num);
        two(input, num);
        
        
		 

	}

	 static void one(String[] input, int num) {
		for (int i = 0; i < input.length; i++) {
        	for(int j=0; j<=(input[i].length()-1) ;j++){
        		if(j%2==0){
        			System.out.print(input[i].charAt(j));
        		}
        	}
        	System.out.print(" ");
        	for(int j=0; j<=(input[i].length()-1) ;j++){
        		if(j%2!=0){
        			System.out.print(input[i].charAt(j));
        		}
        	}
        	System.out.println("");
			
		}
		
	}

	private static void two(String[] input, int num) {
		String append =" ";
		for (int i = 0; i < input.length; i++) {
        	for(int j=0; j<=(input[i].length()-1) ;j++){
        		if(j%2==0){
        			System.out.print(input[i].charAt(j));
        		}else{
        			append+=input[i].charAt(j);
        		}
        	}
        	System.out.print(append);
        	System.out.println("");
        	append=" ";
			
		}
		
	}

}
