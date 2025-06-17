package streams.operations;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CreateStreams {

	public static void main(String[] args) {

		
		IntStream.rangeClosed(1, 5).forEach(num  -> System.out.print(num+" "));			
		System.out.println();
		//DoubleStream, LongStream
		/*  */
		
		int test[]= IntStream.rangeClosed(1, 5).toArray();
		IntStream.of(test).forEach(num  -> System.out.print(num+" "));
		System.out.println();
		
		int evenSum = IntStream.of(test).filter(x->x%2==0).reduce(100,(preAnswer,currentval)-> preAnswer+currentval);
		System.out.println(evenSum);
		
		
		
		Stream<String> strStream = Stream.of(new String("One"), new String("Two"), new String("Three"));
		strStream.map(s0 -> s0+".").collect(Collectors.toList()).forEach(System.out::println);
		
//Example 
		
		//If array is already created : Arrays.stream(myArray); this will return IntStream
		int myArray[] = new int[] {1,2,3,4,5};
		
		Arrays.stream(myArray).forEach(System.out::println);

	}

}
