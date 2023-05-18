package streams.operations;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Count {

	public static void main(String[] args) {
		
		Stream<String> stringStream = Stream.of("Ava", "Aneri", "Alberto");
		System.out.println("Size :  "+stringStream.count());
//		System.out.println("UnLike Iterators, Streams cannot be reused: "+stringStream.count());   //can be reused
		
		List list =new ArrayList(2); ; 
		System.out.println("Empty source returns empty stream : "+list.stream().count());
		
	}

}
