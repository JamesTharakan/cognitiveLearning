package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamReduce {

	public static void main(String[] args) {


		int[] inputArray = {5,8,1,3,7,5,1,5};
		System.out.println("Simple API total:"+Arrays.stream(inputArray).sum());
		
		List<Integer> total = Arrays.asList(1,2,3,4);
		Optional<Integer> Optionaltotal = total.stream().reduce((a,b)-> a+b);
		System.out.println("Optional total : "+Optionaltotal.get());
		
		System.out.println("Directly print Total : "+total.stream().reduce((a,b)-> a+b));
		
		int initialValue =50;
		System.out.println("total with initial Value: "+total.stream().reduce(initialValue,(a,b)-> a+b));

	}

}
