package dataStructure.stack;

public class MyStack {
	
	Object data [];
	static int top = -1;
	
	public MyStack(int size){
		data= new Object[size]; 
	}
	public boolean isEmpty(){
		return top == -1;
	}
	
	public int push(Object obj){
		if(top < data.length-1){
			top++;
			data[top]=obj;
			//System.out.println("Pushed :: "+obj);
		}else{
			//System.out.println("Stack over flow");
		}
		return top;
	}
	
	public Object pop(){
		Object obj= null;
		
		if(top != -1){
			obj=data[top];
			top--;
			//System.out.println("Popped ::"+obj);
		}else{
			//System.out.println("Stack under flow");
		}
		
		return obj;
	}
}
