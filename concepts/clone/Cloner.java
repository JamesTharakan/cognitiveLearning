package concepts.clone;

public class Cloner {

	public static void main(String[] args) {
		
		NonCloneable nc = new NonCloneable();
		
		try {
			
			nc.clone();
			nc.notify();
		} catch (CloneNotSupportedException e) {
			System.out.println("exception from NonCloneable");
			e.printStackTrace();
		}
		
		
		Clone c = new Clone();
		try {
			c.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			System.out.println("exception from Clone");
			e.printStackTrace();
		}

	}
	
	
	

}
