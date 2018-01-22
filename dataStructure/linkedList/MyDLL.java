package dataStructure.linkedList;

public class MyDLL {
	
	MyDLL leftNode=null;
	int data=-1;
	MyDLL rightNode=null;
	

	MyDLL(MyDLL left ,int o, MyDLL right){
		leftNode = left;
		data =o;
		rightNode=right;
	}
	
	public void add(MyDLL node){
		
		MyDLL temp = this;
		
		while(temp.rightNode !=null){
			temp=temp.rightNode;
		}
		
		temp.rightNode = node;
		node.leftNode = temp;
	}
	
	
	public void addToRight(MyDLL newNode){
		newNode.rightNode = this.rightNode;
		newNode.leftNode = this;
		
		if(this.rightNode !=null)
			this.rightNode.leftNode=newNode;
		this.rightNode =newNode;
	}
	
	public void addToLeft( MyDLL newNode){
		newNode.leftNode = this.leftNode;
		newNode.rightNode = this;
		
		if(this.leftNode !=null)
			this.leftNode.rightNode = newNode; 
		this.leftNode = newNode;
	}
	
	public void delete(int key){
		delete(new MyDLL(null,key,null));
	}
	
	public void delete(MyDLL deleteNode){
		if(null == deleteNode){
			System.out.println("MyDLL.delete():: Noting to delete in this double link list");
		}
		else{
			System.out.println("MyDLL.delete():: Deleting :"+deleteNode);
			if(deleteNode.rightNode !=null ){
				deleteNode.rightNode.leftNode = deleteNode.leftNode;
			}
			if(deleteNode.leftNode!= null ){
				deleteNode.leftNode.rightNode=deleteNode.rightNode;
			}
		}
	}
	
	
	public MyDLL findNode(int key) {
		MyDLL resultNode=null;
		
		 MyDLL temp= this;
		 
			while(temp !=null){
				if(temp.data == key){
					break;
				}else{
					temp=temp.rightNode;
				}
			}
			
		resultNode = temp;
		return resultNode;
	}
	
	public String toString(){
		return "Data :"+this.data; 
		}
}


