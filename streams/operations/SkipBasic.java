package streams.operations;

import java.util.Arrays;
import java.util.stream.IntStream;

public class SkipBasic {

	public static void main(String[] args) {

		int[] myArray = IntStream.rangeClosed(1, 10).toArray();

		System.out.print("intStream: ");
		Arrays.stream(myArray).skip(5).forEach(num -> System.out.print(num + " "));

		System.out.print("\nMore Skips: ");
		Arrays.stream(myArray).skip(20).forEach(num -> System.out.print(num + " "));

		System.out.print("\nNegative Skips: ");
		Arrays.stream(myArray).skip(-1).forEach(num -> System.out.print(num + " "));

	}

}
