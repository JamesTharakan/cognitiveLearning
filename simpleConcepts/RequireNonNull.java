package simpleConcepts;

import java.util.Objects;

public class RequireNonNull {

	public static void main(String[] args) {

		System.out.print("Step 1 ");
		whatif(new TestRequireNonNull("One"));
		
		
		System.out.print("\nStep 2 :");
		try{
			whatif(null);
			
		}catch(NullPointerException np) {
			System.out.print(" Caught null pointer:: "+np.getMessage());
		}
		
		
		System.out.print("\nStep 3 :");
		whatif(null);
		System.out.print("\nCompleted");
	}

	private static void whatif(TestRequireNonNull thisObject) {
		
		TestRequireNonNull gotHere=  Objects.requireNonNull(thisObject, "Dont send null");
		
		System.out.println(gotHere);
		
	}
	
	

}

 class TestRequireNonNull{
	 String name ;
	 TestRequireNonNull(String name){
		 this.name = name;
	 }
	
	 public String toString() {
		 return name;
	 }
}
