package dataStructure.linkedList;

public class TestMyDoubleLinkedList {

	public static void main(String[] args) {

		MyDLL head =null;
		for (int i = 1; i <= 10; i++) {
			MyDLL newNode = new MyDLL(null,i,null);
			
			if(head == null){
				head = newNode;
			}else{
				head.add(newNode);
			}
		}
		
		printMyDDL(head);System.out.println("");
		
		
		//Change the head position if trying to delete the first node
//		head.delete(findNode(head, 5));
		
		
		findNode(head, 5).addToLeft(new MyDLL(null,0,null));
		findNode(head, 5).addToRight(new MyDLL(null,50,null));
		printMyDDL(head);
	}

	
	private static MyDLL findNode(MyDLL head,int key) {
		MyDLL resultNode=null;
		
		if(head == null){
			System.out.println("List is Empty");
		}else{
			
			MyDLL temp= head;
			
			while(temp !=null){
				if(temp.data == key){
					break;
				}else{
					temp=temp.rightNode;
				}
			}
			
			resultNode = temp;
		}
		return resultNode;
	}
	private static void printMyDDL(MyDLL head) {
		
		if(head == null){
			System.out.println("List is Empty");
		}else{
			
			MyDLL temp= head;
			
			while(temp !=null){
				System.out.print(temp.data+ " ");
				temp=temp.rightNode;
			}
		}
	}

}
