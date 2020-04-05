package dataStructure.linkedList;

/**
 * A micro version of HashTable :)
 * Input range 0 to 99
 * 
 */
public class myHashTable {

	public static void main(String[] args) {
		
		MyDLL[] index = new MyDLL[10];
		
		int[] inputNumbers = {4,55,2,83,88,85,6,-1,35,34,36};
		
		for (int i = 0; i < inputNumbers.length; i++) {
			if(inputNumbers[i] >99 || inputNumbers[i]< 0){
				System.out.println("Input range is 0-99 , hence ign    oring "+inputNumbers[i]);
			}else{
				putInTable(inputNumbers[i], index);
			}
		}
		System.out.println("Table Contents : ");
		for(int i=0; i<=9;i++){
			System.out.print("Coloum "+ i+" ::");
			printMyDDL(index[i]);
			System.out.println(" ");
		}
		
		removeFromTable(83, index); 
		
		for(int i=0; i<=9;i++){
			System.out.print("Coloum "+ i+" ::");
			printMyDDL(index[i]);
			System.out.println(" ");
		}
	}

	private static void removeFromTable(int i,MyDLL[] index) {
		int rowNumber= i/10;
		
		MyDLL nodeToDelete  = index[rowNumber].findNode(i);
		MyDLL temp= nodeToDelete;
		
		index[rowNumber].delete(nodeToDelete);
		
		if(index[rowNumber] ==nodeToDelete){
			index[rowNumber] =temp.rightNode;
		}
	}

	private static void putInTable(int i ,MyDLL[] index) {
		int rowNumber= i/10;
//		System.out.println("Adding the value "+i +" into the row : "+rowNumber);
		MyDLL newNode =new MyDLL(null,i,null);
		if(index[rowNumber]==null){
			index[rowNumber]= newNode;
		}else{
			addToThisCol(index[rowNumber],newNode);
			index[rowNumber] =fixTheHead(index[rowNumber]);
		}
		
	}


	private static MyDLL fixTheHead(MyDLL currentHead) {
		MyDLL temp= currentHead;
		while(temp.leftNode !=null){
			temp=temp.leftNode;
		}
		return temp;
	}


	private static void addToThisCol(MyDLL rootNode, MyDLL newNode) {
		MyDLL temp= rootNode;
		while(temp.rightNode !=null && temp.data<= newNode.data){
			temp=temp.rightNode;
		}
		
		if(temp.data>newNode.data){
			temp.addToLeft(newNode);
		}else{
			temp.addToRight(newNode);
		}
		
	}
	
	private static void printMyDDL(MyDLL head) {
		
		if(head == null){
//			System.out.println("List is Empty");
		}else{
			
			MyDLL temp= head;
			
			while(temp !=null){
				System.out.print(temp.data+ " ");
				temp=temp.rightNode;
			}
//			System.out.println("");
		}
	}

}
