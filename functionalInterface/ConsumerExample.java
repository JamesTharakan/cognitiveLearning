package functionalInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {
	public static void main(String[] args) {
		
		//Example 1
		simpleConsumerImplClass ow = new simpleConsumerImplClass();
		ow.accept(2);
		
		//Example 2
		List<String> names = new ArrayList<>();
        names.add("Alice");        names.add("Bob");        names.add("Charlie");
        
        Consumer <String> nameProcessor = s -> System.out.println(s + " by nameProcessor");
        names.forEach(nameProcessor);

      //Example 3
        Consumer <List<String>> processor = list->{
        	for (int i = 0; i < list.size(); i++) {
                list.set(i, list.get(i) + " - Processed");
            }
        };

        // Applying the Consumer which also updates the message
        processor.accept(names);
        names.forEach(System.out::println);
        
        
        
        //Example 4
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        // create Consumer to multiply and print each number
        Consumer<Integer> multiplyAndPrint = (n) -> System.out.println(n * 2);
        
        numbers.forEach(multiplyAndPrint);
    }

}


class simpleConsumerImplClass implements Consumer <Integer>{
	public void accept(Integer n) {
		System.out.println("Otherwise : "+ n * 2);
	}
}