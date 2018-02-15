package sorting;

public class TestSorting {

	public static void main(String[] args) {
		int inputs[][]={	
							{8,4,5},
							{4,0,3,55,22,77,-1,12,4,5,8,7},
							{0,0,0}
					  };

		/*for(int i=0; i<inputs.length;i++){
			for(int j=0;j<inputs[i].length;j++){
				System.out.print(inputs[i][j]+ " ");
			} 
			System.out.print(" :::: ");
			MergeSort.mergeSort(inputs[i]);
			for(int j=0;j<inputs[i].length;j++){
				System.out.print(inputs[i][j]+ " ");
			} 
			System.out.println();
		}
*/
		
		for(int i=0; i<inputs.length;i++){
			for(int j=0;j<inputs[i].length;j++){
				System.out.print(inputs[i][j]+ " ");
			} 
			System.out.print(" ****** ");
		}
		
		for(int i=0; i<inputs.length;i++){
			for(int j=0;j<inputs[i].length;j++){
				//Insert the sort call Here
				MergeSort.mergeSort(inputs[i]);
			} 
		}
		System.out.println();
		for(int i=0; i<inputs.length;i++){
			for(int j=0;j<inputs[i].length;j++){
				System.out.print(inputs[i][j]+ " ");
			} 
			System.out.print(" ****** ");
		}

	}

}
