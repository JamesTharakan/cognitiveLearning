package sorting.strategyPattern;

public interface Sort {
	
	int MERGE_SORT = 1;
	int HEAP_SORT = 2;
	int QUICK_SORT = 3;
	int BUBBLE_SORT = 4;
	
	public void sort(int input[]) ;

}
