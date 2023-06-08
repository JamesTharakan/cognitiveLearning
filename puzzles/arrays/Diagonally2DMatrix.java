package puzzles.arrays;

public class Diagonally2DMatrix {

	public static void main(String[] args) {
		
		int arr[][] = { { 01, 02, 03, 04},	//00;	01,10; 02,11,20  ; 03,12,21,30
						{ 06, 07,  8,  9},	//13,22,31;	
						{ 11, 12, 13, 14},
						{ 16, 17, 18, 19},
			  };
		
		for (int i = 0; i <= arr[0].length-1; i++) {
				int x= 0;
				int y = x+i;
				
				while( y>=0 && x<=arr.length-1 ) {
					System.out.print(arr[x][y]+" ");
					 x++; y--;
				}
				
			System.out.println();
		}
		
		for(int i = 1; i<=arr.length-1; i++) {
			int x= i;
			int y = arr[0].length-1;
			
			while (y>=0 && x<=arr.length-1) {
				System.out.print(arr[x][y]+" ");
				y--;	x++;
			}
			System.out.println();
		}
			
	}	
}
