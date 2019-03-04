package concepts.immutable;

public class NonImmutableSubclass {

	public static void main(String[] args) {
		
	}
}


 class Immutable{
	 private final int i;
	 
	 Immutable(int i){
		 this.i=i;
	 }
	 
	 Immutable set(int i){
		return  new Immutable(i); 
	 }
	 
	 
}