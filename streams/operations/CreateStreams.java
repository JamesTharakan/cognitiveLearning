package streams.operations;

import java.util.stream.IntStream;

public class CreateStreams {

	public static void main(String[] args) {

		
		IntStream.range(1, 10).forEach(num  -> System.out.print(num+" "));			
		System.out.println();
		//DoubleStream, LongStream
		/*  */
		
		int test[]= IntStream.range(1, 5).toArray();
		IntStream.of(test).forEach(num  -> System.out.print(num+" "));
		System.out.println();
		
		int even = IntStream.of(test).filter(x->x%2==0).reduce(100,(ans,i)-> ans+i);
		System.out.println(even);
		
		
		//If array is already created : Arrays.stream(myArray); this will return IntStream

	}

}
