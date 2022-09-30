package streams.collectors;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;

public class StreamReduce {

	public static void main(String[] args) {

		int[] inputArray = {2,8,1,3};
		System.out.println("Simple API total:"+IntStream.of(inputArray).sum());
		
		List<Integer> total = Arrays.asList(1,2,3,4);
		System.out.println("Directly print Total : "+total.stream().reduce((a,b)-> a+b));

		int initialValue =50;
		System.out.println("total with initial Value: "+total.stream().reduce(initialValue,(a,b)-> a+b));
		
		Optional<Integer> Optionaltotal = total.stream().reduce((a,b)-> a+b);
		System.out.println("Optional total : "+Optionaltotal.get());
		
	}

}
