package concepts.clone;

public class NonCloneable {
	
//	protected Object clone() throws CloneNotSupportedException {
//		System.out.println("NonCloneable.clone()");
//        return super.clone();
//    }

	Object test(){
		try {
			this.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}
}
